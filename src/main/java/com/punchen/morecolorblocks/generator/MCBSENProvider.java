package com.punchen.morecolorblocks.generator;

import com.punchen.morecolorblocks.block.ColorBlocks;
import com.punchen.morecolorblocks.colors.ConfigColor;
import com.punchen.morecolorblocks.items.ColorItems;
import com.punchen.morecolorblocks.utils.Reference;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class MCBSENProvider extends FabricLanguageProvider {


    protected MCBSENProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        // 英文翻译
        for (ConfigColor color : ColorBlocks.colorBlockMap.keySet()) {
            translationBuilder.add(ColorBlocks.colorBlockMap.get(color), color.name().toLowerCase());
        }
        for (ConfigColor color : ColorBlocks.colorBlockPowderMap.keySet()) {
            translationBuilder.add(ColorBlocks.colorBlockPowderMap.get(color), color.name().toLowerCase() + "_powder");
        }
        for (ConfigColor color : ColorItems.colorDyeItemMap.keySet()) {
            translationBuilder.add(ColorItems.colorDyeItemMap.get(color), color.name().toLowerCase() + "_dye");
        }
        translationBuilder.add(Reference.MOD_NAME, Reference.MOD_NAME);
//        translationBuilder.add(ColorBlocks.BASE_COLOR_BLOCK, BASE_COLOR_BLOCK_NAME_EN);
    }
}