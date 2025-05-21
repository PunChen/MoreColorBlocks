package com.punchen.morecolorblocks.block;


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
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;


public class ModBlocks {
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

    public static final Block CONDENSED_DIRT = register(
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS).requiresTool().strength(1.8F)),
            "condensed_dirt",
            true
    );

    public static final Block PINK_CONCRETE =
            register(new BaseConcreteBlock(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.PINK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F)), "pink_concrete", true);

    public static final Block BASE_COLOR_BLOCK =
            register(new BaseConcreteBlock(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F)), "base_color_block", true);


    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY =
            RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Reference.MOD_ID, "item_group"));

    public static void initialize() {

        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register((itemGroup) -> {
            itemGroup.add(ModBlocks.CONDENSED_DIRT.asItem());
            itemGroup.add(ModBlocks.PINK_CONCRETE.asItem());
            itemGroup.add(ModBlocks.BASE_COLOR_BLOCK.asItem());
        });

    }

}