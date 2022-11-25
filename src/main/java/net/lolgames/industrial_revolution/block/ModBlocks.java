package net.lolgames.industrial_revolution.block;

import net.lolgames.industrial_revolution.block.custom.JumpyBlock;
import net.lolgames.industrial_revolution.block.custom.Test_Crop;
import net.lolgames.industrial_revolution.block.custom.test_lamp_block;
import net.lolgames.industrial_revolution.industrial_revolution;
import net.lolgames.industrial_revolution.item.ModCreativeModeTab;
import net.lolgames.industrial_revolution.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, industrial_revolution.MOD_ID);

    public static final RegistryObject<Block> TEST_BLOCK = registerBlock("test_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.TEST_ITEMS_TAB);

    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.INDUSTRIAL_REVOLUTION_TAB);

    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.INDUSTRIAL_REVOLUTION_TAB);

    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.INDUSTRIAL_REVOLUTION_TAB);

    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.INDUSTRIAL_REVOLUTION_TAB);

    public static final RegistryObject<Block> JUMPY_BLOCK = registerBlock("jumpy_block",
            () -> new JumpyBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.TEST_ITEMS_TAB);

    public static final RegistryObject<Block> TEST_CROP = BLOCKS.register("test_crop",
        () -> new Test_Crop(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> TEST_LAMP_BLOCK = registerBlock("test_lamp_block",
            () -> new test_lamp_block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(test_lamp_block.LIT) ? 15 : 0)), ModCreativeModeTab.TEST_ITEMS_TAB);


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab ){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
