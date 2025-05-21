package com.punchen.morecolorblocks.client;

import com.punchen.morecolorblocks.block.BlockColor;
import com.punchen.morecolorblocks.block.ModBlocks;
import com.punchen.morecolorblocks.utils.Utils;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

public class MoreColorBlocksClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
//        for (BlockColor color : BlockColor.values()) {
//            ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex)
//                    -> Utils.toHexColor(color), ModBlocks.BASE_COLOR_BLOCK);
//        }
        // 52 149 235
//        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x3495eb, ModBlocks.BASE_COLOR_BLOCK);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) ->
                Utils.toHexColor(BlockColor.RED_PURPLE_3), ModBlocks.BASE_COLOR_BLOCK);
    }
}
