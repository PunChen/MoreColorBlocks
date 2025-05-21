package com.punchen.morecolorblocks;

import com.punchen.morecolorblocks.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class MoreColorBlocks implements ModInitializer {

    @Override
    public void onInitialize() {
        ModBlocks.initialize();
    }
}
