package net.lolgames.industrial_revolution.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab INDUSTRIAL_REVOLUTION_TAB = new CreativeModeTab("industrial_revolution_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TEST_ITEM.get());
        }
    };
    public static final CreativeModeTab TEST_ITEMS_TAB = new CreativeModeTab("test_items_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TEST_ITEM.get());
        }
    };
}
