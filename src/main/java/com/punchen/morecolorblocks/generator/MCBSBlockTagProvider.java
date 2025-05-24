package com.punchen.morecolorblocks.generator;

import com.punchen.morecolorblocks.block.ColorBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.punchen.morecolorblocks.block.ColorBlocks.colorBlockMap;

public class MCBSBlockTagProvider extends FabricTagProvider<Block> {
    public MCBSBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.BLOCK, registriesFuture);
    }

    protected void addColorBlockTag(TagKey<Block> tagKey, boolean replace, List<Block> blockList) {
        FabricTagProvider<Block>.FabricTagBuilder blockTagBuilder = getOrCreateTagBuilder(tagKey);
        for (Block block : blockList) {
            blockTagBuilder.add(block);
        }
        blockTagBuilder.setReplace(replace);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        addColorBlockTag(BlockTags.PICKAXE_MINEABLE, false, new ArrayList<>(colorBlockMap.values()));
        addColorBlockTag(BlockTags.PICKAXE_MINEABLE, false, List.of(ColorBlocks.BASE_COLOR_BLOCK));
        addColorBlockTag(BlockTags.SHOVEL_MINEABLE, false, new ArrayList<>());
        addColorBlockTag(BlockTags.HOE_MINEABLE, false, new ArrayList<>());
        addColorBlockTag(BlockTags.AXE_MINEABLE, false, new ArrayList<>());
    }
}