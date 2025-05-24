package com.punchen.morecolorblocks.generator;

import com.punchen.morecolorblocks.block.ColorBlocks;
import com.punchen.morecolorblocks.colors.ConfigColor;
import com.punchen.morecolorblocks.utils.Reference;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class MCBSCNProvider extends FabricLanguageProvider {


    public MCBSCNProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        // 中文翻译
        for (ConfigColor color : ColorBlocks.colorBlockMap.keySet()) {
            translationBuilder.add(ColorBlocks.colorBlockMap.get(color), color.cn_name);
        }
        for (ConfigColor color : ColorBlocks.colorBlockPowderMap.keySet()) {
            translationBuilder.add(ColorBlocks.colorBlockPowderMap.get(color), color.cn_name + "粉末");
        }
        translationBuilder.add(Reference.MOD_NAME, "更多色彩方块");
//        translationBuilder.add(ColorBlocks.BASE_COLOR_BLOCK, BASE_COLOR_BLOCK_NAME_CN);
    }
}