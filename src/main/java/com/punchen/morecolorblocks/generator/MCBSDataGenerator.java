package com.punchen.morecolorblocks.generator;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MCBSDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(MCBSLootTableProvider::new);
        pack.addProvider(MCBSModelProvider::new);
        pack.addProvider(MCBSBlockTagProvider::new);
    }

}
