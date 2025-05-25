package com.punchen.morecolorblocks.items;

import com.punchen.morecolorblocks.block.ColorBlocks;
import com.punchen.morecolorblocks.colors.ConfigColor;
import com.punchen.morecolorblocks.utils.Reference;
import com.punchen.morecolorblocks.utils.Utils;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public final class ColorItems {

    private ColorItems() {
    }

    // 使用Items.register进行物品注册，绑定block和item
//    public static final Item BASE_COLOR_ITEM = Items.register(ColorBlocks.BASE_COLOR_BLOCK);
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

    public static final Item RED_1_POWDER = Items.register(ColorBlocks.RED_1_POWDER);
    public static final Item RED_2_POWDER = Items.register(ColorBlocks.RED_2_POWDER);
    public static final Item RED_3_POWDER = Items.register(ColorBlocks.RED_3_POWDER);
    public static final Item RED_PURPLE_1_POWDER = Items.register(ColorBlocks.RED_PURPLE_1_POWDER);
    public static final Item RED_PURPLE_2_POWDER = Items.register(ColorBlocks.RED_PURPLE_2_POWDER);
    public static final Item RED_PURPLE_3_POWDER = Items.register(ColorBlocks.RED_PURPLE_3_POWDER);
    public static final Item PURPLE_1_POWDER = Items.register(ColorBlocks.PURPLE_1_POWDER);
    public static final Item PURPLE_2_POWDER = Items.register(ColorBlocks.PURPLE_2_POWDER);
    public static final Item PURPLE_3_POWDER = Items.register(ColorBlocks.PURPLE_3_POWDER);
    public static final Item PURPLE_BLUE_1_POWDER = Items.register(ColorBlocks.PURPLE_BLUE_1_POWDER);
    public static final Item PURPLE_BLUE_2_POWDER = Items.register(ColorBlocks.PURPLE_BLUE_2_POWDER);
    public static final Item PURPLE_BLUE_3_POWDER = Items.register(ColorBlocks.PURPLE_BLUE_3_POWDER);
    public static final Item BLUE_1_POWDER = Items.register(ColorBlocks.BLUE_1_POWDER);
    public static final Item BLUE_2_POWDER = Items.register(ColorBlocks.BLUE_2_POWDER);
    public static final Item BLUE_3_POWDER = Items.register(ColorBlocks.BLUE_3_POWDER);
    public static final Item BLUE_GREEN_1_POWDER = Items.register(ColorBlocks.BLUE_GREEN_1_POWDER);
    public static final Item BLUE_GREEN_2_POWDER = Items.register(ColorBlocks.BLUE_GREEN_2_POWDER);
    public static final Item BLUE_GREEN_3_POWDER = Items.register(ColorBlocks.BLUE_GREEN_3_POWDER);
    public static final Item GREEN_1_POWDER = Items.register(ColorBlocks.GREEN_1_POWDER);
    public static final Item GREEN_2_POWDER = Items.register(ColorBlocks.GREEN_2_POWDER);
    public static final Item GREEN_3_POWDER = Items.register(ColorBlocks.GREEN_3_POWDER);
    public static final Item YELLOW_GREEN_1_POWDER = Items.register(ColorBlocks.YELLOW_GREEN_1_POWDER);
    public static final Item YELLOW_GREEN_2_POWDER = Items.register(ColorBlocks.YELLOW_GREEN_2_POWDER);
    public static final Item YELLOW_GREEN_3_POWDER = Items.register(ColorBlocks.YELLOW_GREEN_3_POWDER);
    public static final Item YELLOW_1_POWDER = Items.register(ColorBlocks.YELLOW_1_POWDER);
    public static final Item YELLOW_2_POWDER = Items.register(ColorBlocks.YELLOW_2_POWDER);
    public static final Item YELLOW_3_POWDER = Items.register(ColorBlocks.YELLOW_3_POWDER);
    public static final Item ORANGE_YELLOW_1_POWDER = Items.register(ColorBlocks.ORANGE_YELLOW_1_POWDER);
    public static final Item ORANGE_YELLOW_2_POWDER = Items.register(ColorBlocks.ORANGE_YELLOW_2_POWDER);
    public static final Item ORANGE_YELLOW_3_POWDER = Items.register(ColorBlocks.ORANGE_YELLOW_3_POWDER);
    public static final Item ORANGE_1_POWDER = Items.register(ColorBlocks.ORANGE_1_POWDER);
    public static final Item ORANGE_2_POWDER = Items.register(ColorBlocks.ORANGE_2_POWDER);
    public static final Item ORANGE_3_POWDER = Items.register(ColorBlocks.ORANGE_3_POWDER);
    public static final Item ORANGE_RED_1_POWDER = Items.register(ColorBlocks.ORANGE_RED_1_POWDER);
    public static final Item ORANGE_RED_2_POWDER = Items.register(ColorBlocks.ORANGE_RED_2_POWDER);
    public static final Item ORANGE_RED_3_POWDER = Items.register(ColorBlocks.ORANGE_RED_3_POWDER);

    public static final Item RED_1_DYE = register(ConfigColor.RED_1.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item RED_2_DYE = register(ConfigColor.RED_2.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item RED_3_DYE = register(ConfigColor.RED_3.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item RED_PURPLE_1_DYE = register(ConfigColor.RED_PURPLE_1.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item RED_PURPLE_2_DYE = register(ConfigColor.RED_PURPLE_2.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item RED_PURPLE_3_DYE = register(ConfigColor.RED_PURPLE_3.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item PURPLE_1_DYE = register(ConfigColor.PURPLE_1.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item PURPLE_2_DYE = register(ConfigColor.PURPLE_2.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item PURPLE_3_DYE = register(ConfigColor.PURPLE_3.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item PURPLE_BLUE_1_DYE = register(ConfigColor.PURPLE_BLUE_1.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item PURPLE_BLUE_2_DYE = register(ConfigColor.PURPLE_BLUE_2.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item PURPLE_BLUE_3_DYE = register(ConfigColor.PURPLE_BLUE_3.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item BLUE_1_DYE = register(ConfigColor.BLUE_1.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item BLUE_2_DYE = register(ConfigColor.BLUE_2.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item BLUE_3_DYE = register(ConfigColor.BLUE_3.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item BLUE_GREEN_1_DYE = register(ConfigColor.BLUE_GREEN_1.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item BLUE_GREEN_2_DYE = register(ConfigColor.BLUE_GREEN_2.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item BLUE_GREEN_3_DYE = register(ConfigColor.BLUE_GREEN_3.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item GREEN_1_DYE = register(ConfigColor.GREEN_1.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item GREEN_2_DYE = register(ConfigColor.GREEN_2.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item GREEN_3_DYE = register(ConfigColor.GREEN_3.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item YELLOW_GREEN_1_DYE = register(ConfigColor.YELLOW_GREEN_1.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item YELLOW_GREEN_2_DYE = register(ConfigColor.YELLOW_GREEN_2.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item YELLOW_GREEN_3_DYE = register(ConfigColor.YELLOW_GREEN_3.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item YELLOW_1_DYE = register(ConfigColor.YELLOW_1.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item YELLOW_2_DYE = register(ConfigColor.YELLOW_2.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item YELLOW_3_DYE = register(ConfigColor.YELLOW_3.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item ORANGE_YELLOW_1_DYE = register(ConfigColor.ORANGE_YELLOW_1.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item ORANGE_YELLOW_2_DYE = register(ConfigColor.ORANGE_YELLOW_2.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item ORANGE_YELLOW_3_DYE = register(ConfigColor.ORANGE_YELLOW_3.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item ORANGE_1_DYE = register(ConfigColor.ORANGE_1.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item ORANGE_2_DYE = register(ConfigColor.ORANGE_2.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item ORANGE_3_DYE = register(ConfigColor.ORANGE_3.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item ORANGE_RED_1_DYE = register(ConfigColor.ORANGE_RED_1.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item ORANGE_RED_2_DYE = register(ConfigColor.ORANGE_RED_2.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));
    public static final Item ORANGE_RED_3_DYE = register(ConfigColor.ORANGE_RED_3.name().toLowerCase() + "_dye", new DyeItem(DyeColor.WHITE,new Item.Settings()));

    public static final Map<ConfigColor, Item> colorItemMap = new HashMap<>();
    public static final Map<ConfigColor, Item> colorPowderItemMap = new HashMap<>();
    public static final Map<ConfigColor, Item> colorDyeItemMap = new HashMap<>();

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

        colorPowderItemMap.put(ConfigColor.RED_1, RED_1_POWDER);
        colorPowderItemMap.put(ConfigColor.RED_2, RED_2_POWDER);
        colorPowderItemMap.put(ConfigColor.RED_3, RED_3_POWDER);
        colorPowderItemMap.put(ConfigColor.RED_PURPLE_1, RED_PURPLE_1_POWDER);
        colorPowderItemMap.put(ConfigColor.RED_PURPLE_2, RED_PURPLE_2_POWDER);
        colorPowderItemMap.put(ConfigColor.RED_PURPLE_3, RED_PURPLE_3_POWDER);
        colorPowderItemMap.put(ConfigColor.PURPLE_1, PURPLE_1_POWDER);
        colorPowderItemMap.put(ConfigColor.PURPLE_2, PURPLE_2_POWDER);
        colorPowderItemMap.put(ConfigColor.PURPLE_3, PURPLE_3_POWDER);
        colorPowderItemMap.put(ConfigColor.PURPLE_BLUE_1, PURPLE_BLUE_1_POWDER);
        colorPowderItemMap.put(ConfigColor.PURPLE_BLUE_2, PURPLE_BLUE_2_POWDER);
        colorPowderItemMap.put(ConfigColor.PURPLE_BLUE_3, PURPLE_BLUE_3_POWDER);
        colorPowderItemMap.put(ConfigColor.BLUE_1, BLUE_1_POWDER);
        colorPowderItemMap.put(ConfigColor.BLUE_2, BLUE_2_POWDER);
        colorPowderItemMap.put(ConfigColor.BLUE_3, BLUE_3_POWDER);
        colorPowderItemMap.put(ConfigColor.BLUE_GREEN_1, BLUE_GREEN_1_POWDER);
        colorPowderItemMap.put(ConfigColor.BLUE_GREEN_2, BLUE_GREEN_2_POWDER);
        colorPowderItemMap.put(ConfigColor.BLUE_GREEN_3, BLUE_GREEN_3_POWDER);
        colorPowderItemMap.put(ConfigColor.GREEN_1, GREEN_1_POWDER);
        colorPowderItemMap.put(ConfigColor.GREEN_2, GREEN_2_POWDER);
        colorPowderItemMap.put(ConfigColor.GREEN_3, GREEN_3_POWDER);
        colorPowderItemMap.put(ConfigColor.YELLOW_GREEN_1, YELLOW_GREEN_1_POWDER);
        colorPowderItemMap.put(ConfigColor.YELLOW_GREEN_2, YELLOW_GREEN_2_POWDER);
        colorPowderItemMap.put(ConfigColor.YELLOW_GREEN_3, YELLOW_GREEN_3_POWDER);
        colorPowderItemMap.put(ConfigColor.YELLOW_1, YELLOW_1_POWDER);
        colorPowderItemMap.put(ConfigColor.YELLOW_2, YELLOW_2_POWDER);
        colorPowderItemMap.put(ConfigColor.YELLOW_3, YELLOW_3_POWDER);
        colorPowderItemMap.put(ConfigColor.ORANGE_YELLOW_1, ORANGE_YELLOW_1_POWDER);
        colorPowderItemMap.put(ConfigColor.ORANGE_YELLOW_2, ORANGE_YELLOW_2_POWDER);
        colorPowderItemMap.put(ConfigColor.ORANGE_YELLOW_3, ORANGE_YELLOW_3_POWDER);
        colorPowderItemMap.put(ConfigColor.ORANGE_1, ORANGE_1_POWDER);
        colorPowderItemMap.put(ConfigColor.ORANGE_2, ORANGE_2_POWDER);
        colorPowderItemMap.put(ConfigColor.ORANGE_3, ORANGE_3_POWDER);
        colorPowderItemMap.put(ConfigColor.ORANGE_RED_1, ORANGE_RED_1_POWDER);
        colorPowderItemMap.put(ConfigColor.ORANGE_RED_2, ORANGE_RED_2_POWDER);
        colorPowderItemMap.put(ConfigColor.ORANGE_RED_3, ORANGE_RED_3_POWDER);

        colorDyeItemMap.put(ConfigColor.RED_1, RED_1_DYE);
        colorDyeItemMap.put(ConfigColor.RED_2, RED_2_DYE);
        colorDyeItemMap.put(ConfigColor.RED_3, RED_3_DYE);
        colorDyeItemMap.put(ConfigColor.RED_PURPLE_1, RED_PURPLE_1_DYE);
        colorDyeItemMap.put(ConfigColor.RED_PURPLE_2, RED_PURPLE_2_DYE);
        colorDyeItemMap.put(ConfigColor.RED_PURPLE_3, RED_PURPLE_3_DYE);
        colorDyeItemMap.put(ConfigColor.PURPLE_1, PURPLE_1_DYE);
        colorDyeItemMap.put(ConfigColor.PURPLE_2, PURPLE_2_DYE);
        colorDyeItemMap.put(ConfigColor.PURPLE_3, PURPLE_3_DYE);
        colorDyeItemMap.put(ConfigColor.PURPLE_BLUE_1, PURPLE_BLUE_1_DYE);
        colorDyeItemMap.put(ConfigColor.PURPLE_BLUE_2, PURPLE_BLUE_2_DYE);
        colorDyeItemMap.put(ConfigColor.PURPLE_BLUE_3, PURPLE_BLUE_3_DYE);
        colorDyeItemMap.put(ConfigColor.BLUE_1, BLUE_1_DYE);
        colorDyeItemMap.put(ConfigColor.BLUE_2, BLUE_2_DYE);
        colorDyeItemMap.put(ConfigColor.BLUE_3, BLUE_3_DYE);
        colorDyeItemMap.put(ConfigColor.BLUE_GREEN_1, BLUE_GREEN_1_DYE);
        colorDyeItemMap.put(ConfigColor.BLUE_GREEN_2, BLUE_GREEN_2_DYE);
        colorDyeItemMap.put(ConfigColor.BLUE_GREEN_3, BLUE_GREEN_3_DYE);
        colorDyeItemMap.put(ConfigColor.GREEN_1, GREEN_1_DYE);
        colorDyeItemMap.put(ConfigColor.GREEN_2, GREEN_2_DYE);
        colorDyeItemMap.put(ConfigColor.GREEN_3, GREEN_3_DYE);
        colorDyeItemMap.put(ConfigColor.YELLOW_GREEN_1, YELLOW_GREEN_1_DYE);
        colorDyeItemMap.put(ConfigColor.YELLOW_GREEN_2, YELLOW_GREEN_2_DYE);
        colorDyeItemMap.put(ConfigColor.YELLOW_GREEN_3, YELLOW_GREEN_3_DYE);
        colorDyeItemMap.put(ConfigColor.YELLOW_1, YELLOW_1_DYE);
        colorDyeItemMap.put(ConfigColor.YELLOW_2, YELLOW_2_DYE);
        colorDyeItemMap.put(ConfigColor.YELLOW_3, YELLOW_3_DYE);
        colorDyeItemMap.put(ConfigColor.ORANGE_YELLOW_1, ORANGE_YELLOW_1_DYE);
        colorDyeItemMap.put(ConfigColor.ORANGE_YELLOW_2, ORANGE_YELLOW_2_DYE);
        colorDyeItemMap.put(ConfigColor.ORANGE_YELLOW_3, ORANGE_YELLOW_3_DYE);
        colorDyeItemMap.put(ConfigColor.ORANGE_1, ORANGE_1_DYE);
        colorDyeItemMap.put(ConfigColor.ORANGE_2, ORANGE_2_DYE);
        colorDyeItemMap.put(ConfigColor.ORANGE_3, ORANGE_3_DYE);
        colorDyeItemMap.put(ConfigColor.ORANGE_RED_1, ORANGE_RED_1_DYE);
        colorDyeItemMap.put(ConfigColor.ORANGE_RED_2, ORANGE_RED_2_DYE);
        colorDyeItemMap.put(ConfigColor.ORANGE_RED_3, ORANGE_RED_3_DYE);

    }

    public static <T extends Item> T register(String path, T item) {
        // 对于 1.21 之前的版本，请将 ''Identifier.of'' 替换为 ''new Identifier''
        return Registry.register(Registries.ITEM, Identifier.of(Reference.MOD_ID, path), item);
    }

    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ColorItems.RED_1))
            .displayName(Text.translatable(Reference.MOD_NAME))
            .build();

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY =
            RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Reference.MOD_ID, "item_group"));

    public static void initialize() {
        Utils.LOGGER.warn("ColorItems initialize");
        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);
        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register((itemGroup) -> {
//            itemGroup.add(ColorBlocks.BASE_COLOR_BLOCK.asItem());

            for (ConfigColor color : ConfigColor.values()) {
                itemGroup.add(colorItemMap.get(color));
            }

            for (ConfigColor color : ConfigColor.values()) {
                itemGroup.add(colorPowderItemMap.get(color));
            }

            for (ConfigColor color : ConfigColor.values()) {
                itemGroup.add(colorDyeItemMap.get(color));
            }

        });
    }
}