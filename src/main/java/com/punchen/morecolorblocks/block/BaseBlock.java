package com.punchen.morecolorblocks.block;

import net.minecraft.block.Block;

public class BaseBlock extends Block {


    public BaseBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState());
    }
}