package com.punchen.morecolorblocks.generator;

import com.punchen.morecolorblocks.block.ColorBlocks;
import com.punchen.morecolorblocks.colors.ConfigColor;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static com.punchen.morecolorblocks.block.ColorBlocks.colorBlockMap;

public class MCBSLootTableProvider extends FabricBlockLootTableProvider {
    protected MCBSLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // drop color block itself when mined
        for (ConfigColor color : colorBlockMap.keySet()) {
            addDrop(colorBlockMap.get(color));
        }
        addDrop(ColorBlocks.BASE_COLOR_BLOCK);
    }
}