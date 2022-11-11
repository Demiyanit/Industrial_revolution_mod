package net.lolgames.industrial_revolution.item;

import net.lolgames.industrial_revolution.industrial_revolution;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, industrial_revolution.MOD_ID);

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INDUSTRIAL_REVOLUTION_TAB)));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INDUSTRIAL_REVOLUTION_TAB)));

    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INDUSTRIAL_REVOLUTION_TAB)));


    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
