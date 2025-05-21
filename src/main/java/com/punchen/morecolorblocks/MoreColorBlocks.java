package com.punchen.morecolorblocks;

import com.punchen.morecolorblocks.block.ModBlocks;
import com.punchen.morecolorblocks.utils.Utils;
import net.fabricmc.api.ModInitializer;

public class MoreColorBlocks implements ModInitializer {

    @Override
    public void onInitialize() {
        Utils.LOGGER.warn("MoreColorBlocks onInitialize start");
        ModBlocks.initialize();
        Utils.LOGGER.warn("MoreColorBlocks onInitialize end");
    }
}
