package net.lolgames.industrialrev.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab INDUSTRIAL_REVOLUTION_TAB = new CreativeModeTab("industrial_revolution_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DREAMCLUSTER.get());
        }
    };
}
