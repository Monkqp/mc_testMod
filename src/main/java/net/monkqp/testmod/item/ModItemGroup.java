package net.monkqp.testmod.item;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import net.minecraft.util.Identifier;
import net.monkqp.testmod.Testmod;

public class ModItemGroup {
    public static final ItemGroup GENERAL = FabricItemGroupBuilder.build(new Identifier(Testmod.MOD_ID,
            "general"),
            () -> new ItemStack(Moditems.bobi));
}
