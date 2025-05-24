package com.punchen.morecolorblocks.colors;


import com.punchen.morecolorblocks.utils.Utils;
import net.minecraft.block.MapColor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class BlockColorUtils {

    public static final MapColor[] COPY_COLORS = new MapColor[64];

    public static void remapMapColor() {
        // 修改minecraft地图渲染色，添加自定义颜色
        try {
            Class<?> clazz = net.minecraft.block.MapColor.class;
            Constructor<?> constructor = clazz.getDeclaredConstructor(int.class, int.class);
            constructor.setAccessible(true);
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                Utils.LOGGER.warn("remapMapColor filed name:{}", field.getName());
                Object object = field.get(clazz);
                if (object instanceof MapColor[] orgColors) {
                    // copy color
                    for (int i = 0; i < orgColors.length; ++i) {
                        setMapColor(COPY_COLORS, orgColors[i], i, true);
                    }
                    // add new color
                    int addNum = 0;
                    int rIndex = COPY_COLORS.length - 1;
                    for (ConfigColor addColor : ConfigColor.values()) {
                        MapColor mapColor = (MapColor) constructor.newInstance(rIndex, Utils.toHexColor(addColor));
                        if (setMapColor(COPY_COLORS, mapColor, rIndex, false)) {
                            ++addNum;
                        }
                        --rIndex;
                    }

                    Method getDeclaredFields0 = Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                    getDeclaredFields0.setAccessible(true);
                    Field[] fieldFields = (Field[]) getDeclaredFields0.invoke(Field.class, false);

                    for (Field each : fieldFields) {
                        if ("modifiers".equals(each.getName())) {
                            Field modifiers = each;
                            modifiers.setAccessible(true);
                            modifiers.setInt(field, field.getModifiers() & ~Modifier.FINAL);
                            field.set(clazz, COPY_COLORS);
                            Utils.LOGGER.warn("remapMapColor set modifiers");
                            break;
                        }
                    }
                    Utils.LOGGER.warn("remapMapColor original size:{}, add number:{}", orgColors.length, addNum);
                }
            }
        } catch (Exception e) {
            Utils.LOGGER.error("remapMapColor ", e);
        }
    }

    private static boolean setMapColor(MapColor[] tgtColors, MapColor color, int index, boolean overwrite) {
        if (tgtColors == null || index < 0 || index >= tgtColors.length) {
            return false;
        }
        if (overwrite || tgtColors[index] == null) {
            tgtColors[index] = color;
            return true;
        }
        return false;
    }

    public static MapColor getMapColorByConfigColor(ConfigColor color) {
        int index = COPY_COLORS.length - color.id;
        if (index < COPY_COLORS.length && index >= 0 && COPY_COLORS[index] != null) {
            return COPY_COLORS[index];
        }
        return MapColor.WHITE;
    }
}