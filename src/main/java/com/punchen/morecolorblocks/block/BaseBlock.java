package com.punchen.morecolorblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;

import java.util.function.Function;

public class BaseBlock extends Block {

    Function<BlockState, MapColor> mapColorProvider = new Function<BlockState, MapColor>() {
        @Override
        public MapColor apply(BlockState blockState) {
            blockState.getBlock();
            return null;
        }
    };

    public BaseBlock(Settings settings) {
        super(settings);
        settings.nonOpaque();
//        settings.mapColor(mapColorProvider);
//        settings.mapColor(MapColor.WHITE);
        setDefaultState(getDefaultState());
    }

}