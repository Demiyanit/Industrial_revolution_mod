package net.lolgames.industrialrev.item;

import net.lolgames.industrialrev.industrialrev;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, industrialrev.MOD_ID);

    public static final RegistryObject<Item> DREAMSHARD = ITEMS.register("dream_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INDUSTRIAL_REVOLUTION_TAB)));

    public static final RegistryObject<Item> DREAMCLUSTER = ITEMS.register("dream_cluster",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INDUSTRIAL_REVOLUTION_TAB)));

    public static final RegistryObject<Item> TEST_RAW_ITEM = ITEMS.register("test_raw_item",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INDUSTRIAL_REVOLUTION_TAB)));

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INDUSTRIAL_REVOLUTION_TAB)));


    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
