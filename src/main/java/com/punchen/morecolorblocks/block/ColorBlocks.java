package com.punchen.morecolorblocks.block;


import com.punchen.morecolorblocks.colors.BlockColorUtils;
import com.punchen.morecolorblocks.colors.ConfigColor;
import com.punchen.morecolorblocks.utils.Reference;
import com.punchen.morecolorblocks.utils.Utils;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ConcretePowderBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;


public class ColorBlocks {
    public static Block register(Block block, String name) {
        Identifier id = Identifier.of(Reference.MOD_ID, name);
        return Registry.register(Registries.BLOCK, id, block);
    }

    public static final String BASE_COLOR_BLOCK_NAME_EN = "base_color_block";
    public static final String BASE_COLOR_BLOCK_NAME_CN = "基色方块";

//    public static final Block BASE_COLOR_BLOCK = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(MapColor.WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), BASE_COLOR_BLOCK_NAME_EN);

    public static final Block RED_1 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.RED_1)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.RED_1.name().toLowerCase());
    public static final Block RED_2 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.RED_2)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.RED_2.name().toLowerCase());
    public static final Block RED_3 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.RED_3)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.RED_3.name().toLowerCase());
    public static final Block RED_PURPLE_1 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.RED_PURPLE_1)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.RED_PURPLE_1.name().toLowerCase());
    public static final Block RED_PURPLE_2 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.RED_PURPLE_2)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.RED_PURPLE_2.name().toLowerCase());
    public static final Block RED_PURPLE_3 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.RED_PURPLE_3)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.RED_PURPLE_3.name().toLowerCase());
    public static final Block PURPLE_1 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.PURPLE_1)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.PURPLE_1.name().toLowerCase());
    public static final Block PURPLE_2 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.PURPLE_2)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.PURPLE_2.name().toLowerCase());
    public static final Block PURPLE_3 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.PURPLE_3)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.PURPLE_3.name().toLowerCase());
    public static final Block PURPLE_BLUE_1 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.PURPLE_BLUE_1)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.PURPLE_BLUE_1.name().toLowerCase());
    public static final Block PURPLE_BLUE_2 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.PURPLE_BLUE_2)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.PURPLE_BLUE_2.name().toLowerCase());
    public static final Block PURPLE_BLUE_3 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.PURPLE_BLUE_3)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.PURPLE_BLUE_3.name().toLowerCase());
    public static final Block BLUE_1 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.BLUE_1)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.BLUE_1.name().toLowerCase());
    public static final Block BLUE_2 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.BLUE_2)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.BLUE_2.name().toLowerCase());
    public static final Block BLUE_3 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.BLUE_3)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.BLUE_3.name().toLowerCase());
    public static final Block BLUE_GREEN_1 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.BLUE_GREEN_1)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.BLUE_GREEN_1.name().toLowerCase());
    public static final Block BLUE_GREEN_2 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.BLUE_GREEN_2)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.BLUE_GREEN_2.name().toLowerCase());
    public static final Block BLUE_GREEN_3 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.BLUE_GREEN_3)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.BLUE_GREEN_3.name().toLowerCase());
    public static final Block GREEN_1 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.GREEN_1)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.GREEN_1.name().toLowerCase());
    public static final Block GREEN_2 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.GREEN_2)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.GREEN_2.name().toLowerCase());
    public static final Block GREEN_3 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.GREEN_3)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.GREEN_3.name().toLowerCase());
    public static final Block YELLOW_GREEN_1 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.YELLOW_GREEN_1)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.YELLOW_GREEN_1.name().toLowerCase());
    public static final Block YELLOW_GREEN_2 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.YELLOW_GREEN_2)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.YELLOW_GREEN_2.name().toLowerCase());
    public static final Block YELLOW_GREEN_3 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.YELLOW_GREEN_3)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.YELLOW_GREEN_3.name().toLowerCase());
    public static final Block YELLOW_1 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.YELLOW_1)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.YELLOW_1.name().toLowerCase());
    public static final Block YELLOW_2 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.YELLOW_2)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.YELLOW_2.name().toLowerCase());
    public static final Block YELLOW_3 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.YELLOW_3)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.YELLOW_3.name().toLowerCase());
    public static final Block ORANGE_YELLOW_1 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.ORANGE_YELLOW_1)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_YELLOW_1.name().toLowerCase());
    public static final Block ORANGE_YELLOW_2 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.ORANGE_YELLOW_2)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_YELLOW_2.name().toLowerCase());
    public static final Block ORANGE_YELLOW_3 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.ORANGE_YELLOW_3)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_YELLOW_3.name().toLowerCase());
    public static final Block ORANGE_1 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.ORANGE_1)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_1.name().toLowerCase());
    public static final Block ORANGE_2 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.ORANGE_2)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_2.name().toLowerCase());
    public static final Block ORANGE_3 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.ORANGE_3)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_3.name().toLowerCase());
    public static final Block ORANGE_RED_1 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.ORANGE_RED_1)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_RED_1.name().toLowerCase());
    public static final Block ORANGE_RED_2 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.ORANGE_RED_2)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_RED_2.name().toLowerCase());
    public static final Block ORANGE_RED_3 = register(new BaseBlock(AbstractBlock.Settings.create().mapColor(BlockColorUtils.getMapColorByConfigColor(ConfigColor.ORANGE_RED_3)).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)), ConfigColor.ORANGE_RED_3.name().toLowerCase());
    public static final Map<ConfigColor, Block> colorBlockMap = new HashMap<>();
    public static final Map<ConfigColor, Block> colorBlockPowderMap = new HashMap<>();


    public static final Block RED_1_POWDER = register(new ConcretePowderBlock(RED_1, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.RED_1.name().toLowerCase() + "_powder");
    public static final Block RED_2_POWDER = register(new ConcretePowderBlock(RED_2, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.RED_2.name().toLowerCase() + "_powder");
    public static final Block RED_3_POWDER = register(new ConcretePowderBlock(RED_3, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.RED_3.name().toLowerCase() + "_powder");
    public static final Block RED_PURPLE_1_POWDER = register(new ConcretePowderBlock(RED_PURPLE_1, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.RED_PURPLE_1.name().toLowerCase() + "_powder");
    public static final Block RED_PURPLE_2_POWDER = register(new ConcretePowderBlock(RED_PURPLE_2, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.RED_PURPLE_2.name().toLowerCase() + "_powder");
    public static final Block RED_PURPLE_3_POWDER = register(new ConcretePowderBlock(RED_PURPLE_3, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.RED_PURPLE_3.name().toLowerCase() + "_powder");
    public static final Block PURPLE_1_POWDER = register(new ConcretePowderBlock(PURPLE_1, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.PURPLE_1.name().toLowerCase() + "_powder");
    public static final Block PURPLE_2_POWDER = register(new ConcretePowderBlock(PURPLE_2, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.PURPLE_2.name().toLowerCase() + "_powder");
    public static final Block PURPLE_3_POWDER = register(new ConcretePowderBlock(PURPLE_3, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.PURPLE_3.name().toLowerCase() + "_powder");
    public static final Block PURPLE_BLUE_1_POWDER = register(new ConcretePowderBlock(PURPLE_BLUE_1, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.PURPLE_BLUE_1.name().toLowerCase() + "_powder");
    public static final Block PURPLE_BLUE_2_POWDER = register(new ConcretePowderBlock(PURPLE_BLUE_2, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.PURPLE_BLUE_2.name().toLowerCase() + "_powder");
    public static final Block PURPLE_BLUE_3_POWDER = register(new ConcretePowderBlock(PURPLE_BLUE_3, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.PURPLE_BLUE_3.name().toLowerCase() + "_powder");
    public static final Block BLUE_1_POWDER = register(new ConcretePowderBlock(BLUE_1, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.BLUE_1.name().toLowerCase() + "_powder");
    public static final Block BLUE_2_POWDER = register(new ConcretePowderBlock(BLUE_2, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.BLUE_2.name().toLowerCase() + "_powder");
    public static final Block BLUE_3_POWDER = register(new ConcretePowderBlock(BLUE_3, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.BLUE_3.name().toLowerCase() + "_powder");
    public static final Block BLUE_GREEN_1_POWDER = register(new ConcretePowderBlock(BLUE_GREEN_1, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.BLUE_GREEN_1.name().toLowerCase() + "_powder");
    public static final Block BLUE_GREEN_2_POWDER = register(new ConcretePowderBlock(BLUE_GREEN_2, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.BLUE_GREEN_2.name().toLowerCase() + "_powder");
    public static final Block BLUE_GREEN_3_POWDER = register(new ConcretePowderBlock(BLUE_GREEN_3, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.BLUE_GREEN_3.name().toLowerCase() + "_powder");
    public static final Block GREEN_1_POWDER = register(new ConcretePowderBlock(GREEN_1, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.GREEN_1.name().toLowerCase() + "_powder");
    public static final Block GREEN_2_POWDER = register(new ConcretePowderBlock(GREEN_2, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.GREEN_2.name().toLowerCase() + "_powder");
    public static final Block GREEN_3_POWDER = register(new ConcretePowderBlock(GREEN_3, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.GREEN_3.name().toLowerCase() + "_powder");
    public static final Block YELLOW_GREEN_1_POWDER = register(new ConcretePowderBlock(YELLOW_GREEN_1, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.YELLOW_GREEN_1.name().toLowerCase() + "_powder");
    public static final Block YELLOW_GREEN_2_POWDER = register(new ConcretePowderBlock(YELLOW_GREEN_2, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.YELLOW_GREEN_2.name().toLowerCase() + "_powder");
    public static final Block YELLOW_GREEN_3_POWDER = register(new ConcretePowderBlock(YELLOW_GREEN_3, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.YELLOW_GREEN_3.name().toLowerCase() + "_powder");
    public static final Block YELLOW_1_POWDER = register(new ConcretePowderBlock(YELLOW_1, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.YELLOW_1.name().toLowerCase() + "_powder");
    public static final Block YELLOW_2_POWDER = register(new ConcretePowderBlock(YELLOW_2, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.YELLOW_2.name().toLowerCase() + "_powder");
    public static final Block YELLOW_3_POWDER = register(new ConcretePowderBlock(YELLOW_3, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.YELLOW_3.name().toLowerCase() + "_powder");
    public static final Block ORANGE_YELLOW_1_POWDER = register(new ConcretePowderBlock(ORANGE_YELLOW_1, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.ORANGE_YELLOW_1.name().toLowerCase() + "_powder");
    public static final Block ORANGE_YELLOW_2_POWDER = register(new ConcretePowderBlock(ORANGE_YELLOW_2, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.ORANGE_YELLOW_2.name().toLowerCase() + "_powder");
    public static final Block ORANGE_YELLOW_3_POWDER = register(new ConcretePowderBlock(ORANGE_YELLOW_3, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.ORANGE_YELLOW_3.name().toLowerCase() + "_powder");
    public static final Block ORANGE_1_POWDER = register(new ConcretePowderBlock(ORANGE_1, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.ORANGE_1.name().toLowerCase() + "_powder");
    public static final Block ORANGE_2_POWDER = register(new ConcretePowderBlock(ORANGE_2, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.ORANGE_2.name().toLowerCase() + "_powder");
    public static final Block ORANGE_3_POWDER = register(new ConcretePowderBlock(ORANGE_3, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.ORANGE_3.name().toLowerCase() + "_powder");
    public static final Block ORANGE_RED_1_POWDER = register(new ConcretePowderBlock(ORANGE_RED_1, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.ORANGE_RED_1.name().toLowerCase() + "_powder");
    public static final Block ORANGE_RED_2_POWDER = register(new ConcretePowderBlock(ORANGE_RED_2, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.ORANGE_RED_2.name().toLowerCase() + "_powder");
    public static final Block ORANGE_RED_3_POWDER = register(new ConcretePowderBlock(ORANGE_RED_3, AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)), ConfigColor.ORANGE_RED_3.name().toLowerCase() + "_powder");

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

        colorBlockPowderMap.put(ConfigColor.RED_1, RED_1_POWDER);
        colorBlockPowderMap.put(ConfigColor.RED_2, RED_2_POWDER);
        colorBlockPowderMap.put(ConfigColor.RED_3, RED_3_POWDER);
        colorBlockPowderMap.put(ConfigColor.RED_PURPLE_1, RED_PURPLE_1_POWDER);
        colorBlockPowderMap.put(ConfigColor.RED_PURPLE_2, RED_PURPLE_2_POWDER);
        colorBlockPowderMap.put(ConfigColor.RED_PURPLE_3, RED_PURPLE_3_POWDER);
        colorBlockPowderMap.put(ConfigColor.PURPLE_1, PURPLE_1_POWDER);
        colorBlockPowderMap.put(ConfigColor.PURPLE_2, PURPLE_2_POWDER);
        colorBlockPowderMap.put(ConfigColor.PURPLE_3, PURPLE_3_POWDER);
        colorBlockPowderMap.put(ConfigColor.PURPLE_BLUE_1, PURPLE_BLUE_1_POWDER);
        colorBlockPowderMap.put(ConfigColor.PURPLE_BLUE_2, PURPLE_BLUE_2_POWDER);
        colorBlockPowderMap.put(ConfigColor.PURPLE_BLUE_3, PURPLE_BLUE_3_POWDER);
        colorBlockPowderMap.put(ConfigColor.BLUE_1, BLUE_1_POWDER);
        colorBlockPowderMap.put(ConfigColor.BLUE_2, BLUE_2_POWDER);
        colorBlockPowderMap.put(ConfigColor.BLUE_3, BLUE_3_POWDER);
        colorBlockPowderMap.put(ConfigColor.BLUE_GREEN_1, BLUE_GREEN_1_POWDER);
        colorBlockPowderMap.put(ConfigColor.BLUE_GREEN_2, BLUE_GREEN_2_POWDER);
        colorBlockPowderMap.put(ConfigColor.BLUE_GREEN_3, BLUE_GREEN_3_POWDER);
        colorBlockPowderMap.put(ConfigColor.GREEN_1, GREEN_1_POWDER);
        colorBlockPowderMap.put(ConfigColor.GREEN_2, GREEN_2_POWDER);
        colorBlockPowderMap.put(ConfigColor.GREEN_3, GREEN_3_POWDER);
        colorBlockPowderMap.put(ConfigColor.YELLOW_GREEN_1, YELLOW_GREEN_1_POWDER);
        colorBlockPowderMap.put(ConfigColor.YELLOW_GREEN_2, YELLOW_GREEN_2_POWDER);
        colorBlockPowderMap.put(ConfigColor.YELLOW_GREEN_3, YELLOW_GREEN_3_POWDER);
        colorBlockPowderMap.put(ConfigColor.YELLOW_1, YELLOW_1_POWDER);
        colorBlockPowderMap.put(ConfigColor.YELLOW_2, YELLOW_2_POWDER);
        colorBlockPowderMap.put(ConfigColor.YELLOW_3, YELLOW_3_POWDER);
        colorBlockPowderMap.put(ConfigColor.ORANGE_YELLOW_1, ORANGE_YELLOW_1_POWDER);
        colorBlockPowderMap.put(ConfigColor.ORANGE_YELLOW_2, ORANGE_YELLOW_2_POWDER);
        colorBlockPowderMap.put(ConfigColor.ORANGE_YELLOW_3, ORANGE_YELLOW_3_POWDER);
        colorBlockPowderMap.put(ConfigColor.ORANGE_1, ORANGE_1_POWDER);
        colorBlockPowderMap.put(ConfigColor.ORANGE_2, ORANGE_2_POWDER);
        colorBlockPowderMap.put(ConfigColor.ORANGE_3, ORANGE_3_POWDER);
        colorBlockPowderMap.put(ConfigColor.ORANGE_RED_1, ORANGE_RED_1_POWDER);
        colorBlockPowderMap.put(ConfigColor.ORANGE_RED_2, ORANGE_RED_2_POWDER);
        colorBlockPowderMap.put(ConfigColor.ORANGE_RED_3, ORANGE_RED_3_POWDER);

    }



    public static void initialize() {
        Utils.LOGGER.warn("ColorBlocks initialize");
    }

}