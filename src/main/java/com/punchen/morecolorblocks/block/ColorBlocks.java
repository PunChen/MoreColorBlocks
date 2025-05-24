package com.punchen.morecolorblocks.block;


import com.punchen.morecolorblocks.colors.ConfigColor;
import com.punchen.morecolorblocks.utils.Reference;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;


public class ColorBlocks {
    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        // Register the block and its item.
        Identifier id = Identifier.of(Reference.MOD_ID, name);
        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        return Registry.register(Registries.BLOCK, id, block);
    }

//    public static final Block CONDENSED_DIRT = register(
//            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS).requiresTool().strength(1.8F)),
//            "condensed_dirt",
//            true
//    );

//    public static final Block BASE_COLOR_BLOCK = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), "base_color_block", true);

    public static final Block RED_1 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.RED_1.name().toLowerCase(), true);
    public static final Block RED_2 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.RED_2.name().toLowerCase(), true);
    public static final Block RED_3 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.RED_3.name().toLowerCase(), true);
    public static final Block RED_PURPLE_1 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.RED_PURPLE_1.name().toLowerCase(), true);
    public static final Block RED_PURPLE_2 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.RED_PURPLE_2.name().toLowerCase(), true);
    public static final Block RED_PURPLE_3 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.RED_PURPLE_3.name().toLowerCase(), true);
    public static final Block PURPLE_1 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.PURPLE_1.name().toLowerCase(), true);
    public static final Block PURPLE_2 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.PURPLE_2.name().toLowerCase(), true);
    public static final Block PURPLE_3 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.PURPLE_3.name().toLowerCase(), true);
    public static final Block PURPLE_BLUE_1 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.PURPLE_BLUE_1.name().toLowerCase(), true);
    public static final Block PURPLE_BLUE_2 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.PURPLE_BLUE_2.name().toLowerCase(), true);
    public static final Block PURPLE_BLUE_3 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.PURPLE_BLUE_3.name().toLowerCase(), true);
    public static final Block BLUE_1 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.BLUE_1.name().toLowerCase(), true);
    public static final Block BLUE_2 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.BLUE_2.name().toLowerCase(), true);
    public static final Block BLUE_3 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.BLUE_3.name().toLowerCase(), true);
    public static final Block BLUE_GREEN_1 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.BLUE_GREEN_1.name().toLowerCase(), true);
    public static final Block BLUE_GREEN_2 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.BLUE_GREEN_2.name().toLowerCase(), true);
    public static final Block BLUE_GREEN_3 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.BLUE_GREEN_3.name().toLowerCase(), true);
    public static final Block GREEN_1 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.GREEN_1.name().toLowerCase(), true);
    public static final Block GREEN_2 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.GREEN_2.name().toLowerCase(), true);
    public static final Block GREEN_3 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.GREEN_3.name().toLowerCase(), true);
    public static final Block YELLOW_GREEN_1 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.YELLOW_GREEN_1.name().toLowerCase(), true);
    public static final Block YELLOW_GREEN_2 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.YELLOW_GREEN_2.name().toLowerCase(), true);
    public static final Block YELLOW_GREEN_3 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.YELLOW_GREEN_3.name().toLowerCase(), true);
    public static final Block YELLOW_1 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.YELLOW_1.name().toLowerCase(), true);
    public static final Block YELLOW_2 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.YELLOW_2.name().toLowerCase(), true);
    public static final Block YELLOW_3 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.YELLOW_3.name().toLowerCase(), true);
    public static final Block ORANGE_YELLOW_1 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_YELLOW_1.name().toLowerCase(), true);
    public static final Block ORANGE_YELLOW_2 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_YELLOW_2.name().toLowerCase(), true);
    public static final Block ORANGE_YELLOW_3 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_YELLOW_3.name().toLowerCase(), true);
    public static final Block ORANGE_1 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_1.name().toLowerCase(), true);
    public static final Block ORANGE_2 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_2.name().toLowerCase(), true);
    public static final Block ORANGE_3 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_3.name().toLowerCase(), true);
    public static final Block ORANGE_RED_1 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_RED_1.name().toLowerCase(), true);
    public static final Block ORANGE_RED_2 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_RED_2.name().toLowerCase(), true);
    public static final Block ORANGE_RED_3 = register(new BaseBlock(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_RED_3.name().toLowerCase(), true);

    public static final Map<ConfigColor, Block> colorBlockMap = new HashMap<>();

    static {
        colorBlockMap.put(ConfigColor.RED_1, RED_1);
        colorBlockMap.put(ConfigColor.RED_2, RED_2);
        colorBlockMap.put(ConfigColor.RED_3, RED_3);
        colorBlockMap.put(ConfigColor.RED_PURPLE_1, RED_PURPLE_1);
        colorBlockMap.put(ConfigColor.RED_PURPLE_2, RED_PURPLE_2);
        colorBlockMap.put(ConfigColor.RED_PURPLE_3, RED_PURPLE_3);
        colorBlockMap.put(ConfigColor.PURPLE_1, PURPLE_1);
        colorBlockMap.put(ConfigColor.PURPLE_2, PURPLE_2);
        colorBlockMap.put(ConfigColor.PURPLE_3, PURPLE_3);
        colorBlockMap.put(ConfigColor.PURPLE_BLUE_1, PURPLE_BLUE_1);
        colorBlockMap.put(ConfigColor.PURPLE_BLUE_2, PURPLE_BLUE_2);
        colorBlockMap.put(ConfigColor.PURPLE_BLUE_3, PURPLE_BLUE_3);
        colorBlockMap.put(ConfigColor.BLUE_1, BLUE_1);
        colorBlockMap.put(ConfigColor.BLUE_2, BLUE_2);
        colorBlockMap.put(ConfigColor.BLUE_3, BLUE_3);
        colorBlockMap.put(ConfigColor.BLUE_GREEN_1, BLUE_GREEN_1);
        colorBlockMap.put(ConfigColor.BLUE_GREEN_2, BLUE_GREEN_2);
        colorBlockMap.put(ConfigColor.BLUE_GREEN_3, BLUE_GREEN_3);
        colorBlockMap.put(ConfigColor.GREEN_1, GREEN_1);
        colorBlockMap.put(ConfigColor.GREEN_2, GREEN_2);
        colorBlockMap.put(ConfigColor.GREEN_3, GREEN_3);
        colorBlockMap.put(ConfigColor.YELLOW_GREEN_1, YELLOW_GREEN_1);
        colorBlockMap.put(ConfigColor.YELLOW_GREEN_2, YELLOW_GREEN_2);
        colorBlockMap.put(ConfigColor.YELLOW_GREEN_3, YELLOW_GREEN_3);
        colorBlockMap.put(ConfigColor.YELLOW_1, YELLOW_1);
        colorBlockMap.put(ConfigColor.YELLOW_2, YELLOW_2);
        colorBlockMap.put(ConfigColor.YELLOW_3, YELLOW_3);
        colorBlockMap.put(ConfigColor.ORANGE_YELLOW_1, ORANGE_YELLOW_1);
        colorBlockMap.put(ConfigColor.ORANGE_YELLOW_2, ORANGE_YELLOW_2);
        colorBlockMap.put(ConfigColor.ORANGE_YELLOW_3, ORANGE_YELLOW_3);
        colorBlockMap.put(ConfigColor.ORANGE_1, ORANGE_1);
        colorBlockMap.put(ConfigColor.ORANGE_2, ORANGE_2);
        colorBlockMap.put(ConfigColor.ORANGE_3, ORANGE_3);
        colorBlockMap.put(ConfigColor.ORANGE_RED_1, ORANGE_RED_1);
        colorBlockMap.put(ConfigColor.ORANGE_RED_2, ORANGE_RED_2);
        colorBlockMap.put(ConfigColor.ORANGE_RED_3, ORANGE_RED_3);
    }

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY =
            RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Reference.MOD_ID, "item_group"));

    public static void initialize() {

        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register((itemGroup) -> {
//            itemGroup.add(ColorBlocks.CONDENSED_DIRT.asItem());
//            itemGroup.add(ColorBlocks.BASE_COLOR_BLOCK.asItem());

            for (Block block:colorBlockMap.values()) {
                itemGroup.add(block);
            }

        });

    }

}