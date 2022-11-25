package net.lolgames.industrial_revolution.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;

public class test_lamp_block extends Block {

    public static final BooleanProperty LIT = BooleanProperty.create("lit");

    public test_lamp_block(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult hitResult) {

        if (!level.isClientSide() && interactionHand == interactionHand.MAIN_HAND){
            level.setBlock(blockPos, state.cycle(LIT), 3);
        }

        return super.use(state, level, blockPos, player, interactionHand, hitResult);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }
}
