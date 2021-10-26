package ru.owopeef.advancedsurvival.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> RUBY_INGOT = Registration.ITEMS.register("ruby_ingot", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    static void register() {

    }
}
