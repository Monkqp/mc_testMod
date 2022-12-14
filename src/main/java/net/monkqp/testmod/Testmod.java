package net.monkqp.testmod;

import net.fabricmc.api.ModInitializer;
import net.monkqp.testmod.item.ModItemGroup;
import net.monkqp.testmod.item.Moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Testmod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Moditems.registerModItems();
	}
}
