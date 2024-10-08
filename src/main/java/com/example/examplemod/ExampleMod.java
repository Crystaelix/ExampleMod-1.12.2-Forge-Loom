package com.example.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ExampleMod.MOD_ID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod {

	public static final String MOD_ID = "examplemod";
	public static final String NAME = "ExampleMod";
	public static final String VERSION = "0@VERSION@";
	private static final Logger LOGGER = LogManager.getLogger();

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info("Hello from " + NAME);
	}
}
