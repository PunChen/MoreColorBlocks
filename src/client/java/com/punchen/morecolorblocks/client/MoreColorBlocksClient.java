package com.punchen.morecolorblocks.client;

import com.punchen.morecolorblocks.block.BlockColor;
import com.punchen.morecolorblocks.block.ColorBlocks;
import com.punchen.morecolorblocks.utils.Utils;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

import static com.punchen.morecolorblocks.block.ColorBlocks.colorBlockMap;

public class MoreColorBlocksClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // 52 149 235
        Utils.LOGGER.warn("onInitializeClient start");
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) ->
                Utils.toHexColor(BlockColor.ORANGE_RED_1), ColorBlocks.BASE_COLOR_BLOCK);
        // 以树叶作为父类，手动修改颜色
        for (BlockColor color : colorBlockMap.keySet()) {
            ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> Utils.toHexColor(color), colorBlockMap.get(color));
        }
        Utils.LOGGER.warn("onInitializeClient end");
    }
}
