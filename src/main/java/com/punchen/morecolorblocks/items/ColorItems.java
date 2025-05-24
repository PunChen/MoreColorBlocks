package com.punchen.morecolorblocks.items;

import com.punchen.morecolorblocks.block.ColorBlocks;
import com.punchen.morecolorblocks.colors.ConfigColor;
import com.punchen.morecolorblocks.utils.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public final class ColorItems {

    private ColorItems() {
    }

    // 使用Items.register进行物品注册，绑定block和item
    public static final Item BASE_COLOR_ITEM = Items.register(ColorBlocks.BASE_COLOR_BLOCK);
    public static final Item RED_1 = Items.register(ColorBlocks.RED_1);
    public static final Item RED_2 = Items.register(ColorBlocks.RED_2);
    public static final Item RED_3 = Items.register(ColorBlocks.RED_3);
    public static final Item RED_PURPLE_1 = Items.register(ColorBlocks.RED_PURPLE_1);
    public static final Item RED_PURPLE_2 = Items.register(ColorBlocks.RED_PURPLE_2);
    public static final Item RED_PURPLE_3 = Items.register(ColorBlocks.RED_PURPLE_3);
    public static final Item PURPLE_1 = Items.register(ColorBlocks.PURPLE_1);
    public static final Item PURPLE_2 = Items.register(ColorBlocks.PURPLE_2);
    public static final Item PURPLE_3 = Items.register(ColorBlocks.PURPLE_3);
    public static final Item PURPLE_BLUE_1 = Items.register(ColorBlocks.PURPLE_BLUE_1);
    public static final Item PURPLE_BLUE_2 = Items.register(ColorBlocks.PURPLE_BLUE_2);
    public static final Item PURPLE_BLUE_3 = Items.register(ColorBlocks.PURPLE_BLUE_3);
    public static final Item BLUE_1 = Items.register(ColorBlocks.BLUE_1);
    public static final Item BLUE_2 = Items.register(ColorBlocks.BLUE_2);
    public static final Item BLUE_3 = Items.register(ColorBlocks.BLUE_3);
    public static final Item BLUE_GREEN_1 = Items.register(ColorBlocks.BLUE_GREEN_1);
    public static final Item BLUE_GREEN_2 = Items.register(ColorBlocks.BLUE_GREEN_2);
    public static final Item BLUE_GREEN_3 = Items.register(ColorBlocks.BLUE_GREEN_3);
    public static final Item GREEN_1 = Items.register(ColorBlocks.GREEN_1);
    public static final Item GREEN_2 = Items.register(ColorBlocks.GREEN_2);
    public static final Item GREEN_3 = Items.register(ColorBlocks.GREEN_3);
    public static final Item YELLOW_GREEN_1 = Items.register(ColorBlocks.YELLOW_GREEN_1);
    public static final Item YELLOW_GREEN_2 = Items.register(ColorBlocks.YELLOW_GREEN_2);
    public static final Item YELLOW_GREEN_3 = Items.register(ColorBlocks.YELLOW_GREEN_3);
    public static final Item YELLOW_1 = Items.register(ColorBlocks.YELLOW_1);
    public static final Item YELLOW_2 = Items.register(ColorBlocks.YELLOW_2);
    public static final Item YELLOW_3 = Items.register(ColorBlocks.YELLOW_3);
    public static final Item ORANGE_YELLOW_1 = Items.register(ColorBlocks.ORANGE_YELLOW_1);
    public static final Item ORANGE_YELLOW_2 = Items.register(ColorBlocks.ORANGE_YELLOW_2);
    public static final Item ORANGE_YELLOW_3 = Items.register(ColorBlocks.ORANGE_YELLOW_3);
    public static final Item ORANGE_1 = Items.register(ColorBlocks.ORANGE_1);
    public static final Item ORANGE_2 = Items.register(ColorBlocks.ORANGE_2);
    public static final Item ORANGE_3 = Items.register(ColorBlocks.ORANGE_3);
    public static final Item ORANGE_RED_1 = Items.register(ColorBlocks.ORANGE_RED_1);
    public static final Item ORANGE_RED_2 = Items.register(ColorBlocks.ORANGE_RED_2);
    public static final Item ORANGE_RED_3 = Items.register(ColorBlocks.ORANGE_RED_3);

//    public static final Item RED_1 = register(ConfigColor.RED_1.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item RED_2 = register(ConfigColor.RED_2.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item RED_3 = register(ConfigColor.RED_3.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item RED_PURPLE_1 = register(ConfigColor.RED_PURPLE_1.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item RED_PURPLE_2 = register(ConfigColor.RED_PURPLE_2.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item RED_PURPLE_3 = register(ConfigColor.RED_PURPLE_3.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item PURPLE_1 = register(ConfigColor.PURPLE_1.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item PURPLE_2 = register(ConfigColor.PURPLE_2.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item PURPLE_3 = register(ConfigColor.PURPLE_3.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item PURPLE_BLUE_1 = register(ConfigColor.PURPLE_BLUE_1.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item PURPLE_BLUE_2 = register(ConfigColor.PURPLE_BLUE_2.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item PURPLE_BLUE_3 = register(ConfigColor.PURPLE_BLUE_3.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item BLUE_1 = register(ConfigColor.BLUE_1.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item BLUE_2 = register(ConfigColor.BLUE_2.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item BLUE_3 = register(ConfigColor.BLUE_3.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item BLUE_GREEN_1 = register(ConfigColor.BLUE_GREEN_1.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item BLUE_GREEN_2 = register(ConfigColor.BLUE_GREEN_2.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item BLUE_GREEN_3 = register(ConfigColor.BLUE_GREEN_3.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item GREEN_1 = register(ConfigColor.GREEN_1.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item GREEN_2 = register(ConfigColor.GREEN_2.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item GREEN_3 = register(ConfigColor.GREEN_3.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item YELLOW_GREEN_1 = register(ConfigColor.YELLOW_GREEN_1.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item YELLOW_GREEN_2 = register(ConfigColor.YELLOW_GREEN_2.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item YELLOW_GREEN_3 = register(ConfigColor.YELLOW_GREEN_3.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item YELLOW_1 = register(ConfigColor.YELLOW_1.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item YELLOW_2 = register(ConfigColor.YELLOW_2.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item YELLOW_3 = register(ConfigColor.YELLOW_3.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item ORANGE_YELLOW_1 = register(ConfigColor.ORANGE_YELLOW_1.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item ORANGE_YELLOW_2 = register(ConfigColor.ORANGE_YELLOW_2.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item ORANGE_YELLOW_3 = register(ConfigColor.ORANGE_YELLOW_3.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item ORANGE_1 = register(ConfigColor.ORANGE_1.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item ORANGE_2 = register(ConfigColor.ORANGE_2.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item ORANGE_3 = register(ConfigColor.ORANGE_3.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item ORANGE_RED_1 = register(ConfigColor.ORANGE_RED_1.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item ORANGE_RED_2 = register(ConfigColor.ORANGE_RED_2.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));
//    public static final Item ORANGE_RED_3 = register(ConfigColor.ORANGE_RED_3.name().toLowerCase(), new BaseItem(new BaseItem.Settings()));

    public static final Map<ConfigColor, Item> colorItemMap = new HashMap<>();

    static {
        colorItemMap.put(ConfigColor.RED_1, RED_1);
        colorItemMap.put(ConfigColor.RED_2, RED_2);
        colorItemMap.put(ConfigColor.RED_3, RED_3);
        colorItemMap.put(ConfigColor.RED_PURPLE_1, RED_PURPLE_1);
        colorItemMap.put(ConfigColor.RED_PURPLE_2, RED_PURPLE_2);
        colorItemMap.put(ConfigColor.RED_PURPLE_3, RED_PURPLE_3);
        colorItemMap.put(ConfigColor.PURPLE_1, PURPLE_1);
        colorItemMap.put(ConfigColor.PURPLE_2, PURPLE_2);
        colorItemMap.put(ConfigColor.PURPLE_3, PURPLE_3);
        colorItemMap.put(ConfigColor.PURPLE_BLUE_1, PURPLE_BLUE_1);
        colorItemMap.put(ConfigColor.PURPLE_BLUE_2, PURPLE_BLUE_2);
        colorItemMap.put(ConfigColor.PURPLE_BLUE_3, PURPLE_BLUE_3);
        colorItemMap.put(ConfigColor.BLUE_1, BLUE_1);
        colorItemMap.put(ConfigColor.BLUE_2, BLUE_2);
        colorItemMap.put(ConfigColor.BLUE_3, BLUE_3);
        colorItemMap.put(ConfigColor.BLUE_GREEN_1, BLUE_GREEN_1);
        colorItemMap.put(ConfigColor.BLUE_GREEN_2, BLUE_GREEN_2);
        colorItemMap.put(ConfigColor.BLUE_GREEN_3, BLUE_GREEN_3);
        colorItemMap.put(ConfigColor.GREEN_1, GREEN_1);
        colorItemMap.put(ConfigColor.GREEN_2, GREEN_2);
        colorItemMap.put(ConfigColor.GREEN_3, GREEN_3);
        colorItemMap.put(ConfigColor.YELLOW_GREEN_1, YELLOW_GREEN_1);
        colorItemMap.put(ConfigColor.YELLOW_GREEN_2, YELLOW_GREEN_2);
        colorItemMap.put(ConfigColor.YELLOW_GREEN_3, YELLOW_GREEN_3);
        colorItemMap.put(ConfigColor.YELLOW_1, YELLOW_1);
        colorItemMap.put(ConfigColor.YELLOW_2, YELLOW_2);
        colorItemMap.put(ConfigColor.YELLOW_3, YELLOW_3);
        colorItemMap.put(ConfigColor.ORANGE_YELLOW_1, ORANGE_YELLOW_1);
        colorItemMap.put(ConfigColor.ORANGE_YELLOW_2, ORANGE_YELLOW_2);
        colorItemMap.put(ConfigColor.ORANGE_YELLOW_3, ORANGE_YELLOW_3);
        colorItemMap.put(ConfigColor.ORANGE_1, ORANGE_1);
        colorItemMap.put(ConfigColor.ORANGE_2, ORANGE_2);
        colorItemMap.put(ConfigColor.ORANGE_3, ORANGE_3);
        colorItemMap.put(ConfigColor.ORANGE_RED_1, ORANGE_RED_1);
        colorItemMap.put(ConfigColor.ORANGE_RED_2, ORANGE_RED_2);
        colorItemMap.put(ConfigColor.ORANGE_RED_3, ORANGE_RED_3);
    }

    public static <T extends Item> T register(String path, T item) {
        // 对于 1.21 之前的版本，请将 ''Identifier.of'' 替换为 ''new Identifier''
        return Registry.register(Registries.ITEM, Identifier.of(Reference.MOD_ID, path), item);
    }

    public static void initialize() {
    }
}