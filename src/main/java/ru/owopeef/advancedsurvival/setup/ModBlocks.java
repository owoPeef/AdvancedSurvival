package ru.owopeef.advancedsurvival.setup;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> RUBY_ORE = register("ruby_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3, 10).explosionResistance(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RUBY_BLOCK = register("ruby_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(3, 10).sound(SoundType.METAL)));
    static void register() { }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        return ret;
    }
}
