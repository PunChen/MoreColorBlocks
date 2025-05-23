package com.punchen.morecolorblocks.generator;

import com.punchen.morecolorblocks.block.BlockColor;
import com.punchen.morecolorblocks.block.ColorBlocks;
import com.punchen.morecolorblocks.utils.Reference;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.apache.commons.compress.utils.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.punchen.morecolorblocks.block.ColorBlocks.colorBlockMap;

public class MCBSBlockTagProvider extends FabricTagProvider<Block> {
    public MCBSBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.BLOCK, registriesFuture);
    }

    // 生成钻石搞挖掘标签 pickaxe.json
    public static final TagKey<Block> COLOR_BLOCK_PICKAXE = TagKey.of(RegistryKeys.BLOCK,
            Identifier.ofVanilla("mineable/pickaxe"));

    public static final TagKey<Block> COLOR_BLOCK_HOE = TagKey.of(RegistryKeys.BLOCK,
            Identifier.ofVanilla("mineable/hoe.json"));

    public static final TagKey<Block> COLOR_BLOCK_SHOVEL = TagKey.of(RegistryKeys.BLOCK,
            Identifier.ofVanilla("mineable/shovel"));

    public static final TagKey<Block> COLOR_BLOCK_AXE = TagKey.of(RegistryKeys.BLOCK,
            Identifier.ofVanilla("mineable/axe"));

    protected void addColorBlockTag(TagKey<Block> tagKey, boolean replace, List<Block> blockList) {
        FabricTagProvider<Block>.FabricTagBuilder blockTagBuilder = getOrCreateTagBuilder(tagKey);
        for (Block block : blockList) {
            blockTagBuilder.add(block);
        }
        blockTagBuilder.setReplace(replace);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        addColorBlockTag(COLOR_BLOCK_PICKAXE, false, new ArrayList<>(colorBlockMap.values()));
        addColorBlockTag(COLOR_BLOCK_PICKAXE, false, List.of(ColorBlocks.BASE_COLOR_BLOCK));
        addColorBlockTag(COLOR_BLOCK_SHOVEL, false, List.of(ColorBlocks.CONDENSED_DIRT));
        addColorBlockTag(COLOR_BLOCK_HOE, false, new ArrayList<>());
        addColorBlockTag(COLOR_BLOCK_AXE, false, new ArrayList<>());
    }
}