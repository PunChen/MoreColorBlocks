package com.punchen.morecolorblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ExampleBlock extends Block {
 
    public ExampleBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState());

    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient) {
            player.sendMessage(Text.literal("Hello, world!"), false);
        }
        return ActionResult.SUCCESS;
//        return super.onUse(state, world, pos, player, hit);
    }

    // 对于 1.20.5 以下版本，方法参数应该是“BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit”
//    @Override
    public ActionResult onUse(World world, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient) {
            player.sendMessage(Text.literal("Hello, world!"), false);
        }
        return ActionResult.SUCCESS;
    }
}