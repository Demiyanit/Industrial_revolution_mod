package net.lolgames.industrial_revolution.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EightBallItem extends Item {
    public EightBallItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND){
            //Output a random number
            outputRandomNumber(player);
            //Set a cooldown
            player.getCooldowns().addCooldown(this, 28);
        }


        return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown()){
            components.add(Component.literal("Right click for random number").withStyle(ChatFormatting.BLUE));

        }
        else {
            components.add(Component.literal("Press Shift for more info").withStyle(ChatFormatting.GOLD));
        }
        super.appendHoverText(stack, level, components, flag);
    }

    private void outputRandomNumber(Player player){
        player.sendSystemMessage(Component.literal("The Number is " + getRandomNumber()));
    }

    private int getRandomNumber() {
        return RandomSource.createNewThreadLocalInstance().nextInt(10);
    }
}
