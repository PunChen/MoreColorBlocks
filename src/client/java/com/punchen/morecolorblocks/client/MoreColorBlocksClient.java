package com.punchen.morecolorblocks.client;

import com.punchen.morecolorblocks.colors.ConfigColor;
import com.punchen.morecolorblocks.block.ColorBlocks;
import com.punchen.morecolorblocks.items.ColorItems;
import com.punchen.morecolorblocks.utils.Utils;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

import static com.punchen.morecolorblocks.block.ColorBlocks.colorBlockMap;

public class MoreColorBlocksClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // 52 149 235
        Utils.LOGGER.warn("MoreColorBlocksClient onInitializeClient start");
//        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) ->
//                Utils.toHexColor(255, 255, 255), ColorBlocks.BASE_COLOR_BLOCK);
//        ColorProviderRegistry.ITEM.register((state, tintIndex) ->
//                Utils.toHexColor(255, 255, 255), ColorBlocks.BASE_COLOR_BLOCK);
//         以树叶作为父类，手动修改颜色
        for (ConfigColor color : colorBlockMap.keySet()) {
            ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> Utils.toHexColor(color), colorBlockMap.get(color));
            ColorProviderRegistry.ITEM.register((state, tintIndex) -> Utils.toHexColor(color), ColorItems.colorItemMap.get(color));
        }
        Utils.LOGGER.warn("MoreColorBlocksClient onInitializeClient end");
    }
}
