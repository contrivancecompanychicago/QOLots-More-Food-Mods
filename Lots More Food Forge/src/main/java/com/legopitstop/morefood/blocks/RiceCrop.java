package com.legopitstop.morefood.blocks;

import com.legopitstop.morefood.init.MoreFoodItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BeetrootBlock;
import net.minecraft.world.level.block.state.BlockState;

public class RiceCrop extends BeetrootBlock {
    public RiceCrop(Properties builder) {
        super(builder);
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter p_57256_, BlockPos p_57257_, BlockState p_57258_) {
        return new ItemStack(MoreFoodItems.RICE_SEEDS.get());
    }
}