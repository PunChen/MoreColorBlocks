package com.punchen.morecolorblocks.block;

import net.minecraft.block.Block;

public class BaseBlock extends Block {


    public BaseBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState());
    }

//    @Override
//    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
//        if (!world.isClient) {
//            player.sendMessage(Text.literal("Hello, world!"), false);
//        }
//        return ActionResult.SUCCESS;
//    }
}