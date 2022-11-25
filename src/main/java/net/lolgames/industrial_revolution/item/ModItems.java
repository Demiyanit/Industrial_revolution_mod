package net.lolgames.industrial_revolution.item;

import net.lolgames.industrial_revolution.block.ModBlocks;
import net.lolgames.industrial_revolution.industrial_revolution;
import net.lolgames.industrial_revolution.item.custom.EightBallItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, industrial_revolution.MOD_ID);

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(
                    new Item.Properties().tab(ModCreativeModeTab.TEST_ITEMS_TAB)));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(
                    new Item.Properties().tab(ModCreativeModeTab.INDUSTRIAL_REVOLUTION_TAB)));

    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(
                    new Item.Properties().tab(ModCreativeModeTab.INDUSTRIAL_REVOLUTION_TAB)));

    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(
                    new Item.Properties().tab(ModCreativeModeTab.TEST_ITEMS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> TEST_CROP_SEEDS = ITEMS.register("test_crop_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TEST_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.TEST_ITEMS_TAB)));

    public static final RegistryObject<Item> TEST_CROP_FOOD = ITEMS.register("test_crop_food",
            () -> new Item(
                    new Item.Properties().tab(ModCreativeModeTab.TEST_ITEMS_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(10).build())));



    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
