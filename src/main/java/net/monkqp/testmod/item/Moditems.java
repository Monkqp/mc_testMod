package net.monkqp.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.monkqp.testmod.Testmod;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class Moditems {

    public static final Item bobi = registerItem("bobi",
            new Item(new FabricItemSettings().group(ModItemGroup.GENERAL).food(ModFoodComponents.bobi)));

    public static final Item carlos = registerItem("carlos",
            new Item(new FabricItemSettings().group(ModItemGroup.GENERAL).food(ModFoodComponents.bobi)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Testmod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Testmod.LOGGER.info(Testmod.MOD_ID + ": Registering Items");
    }

}
