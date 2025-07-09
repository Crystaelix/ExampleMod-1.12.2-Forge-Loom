package com.example.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExampleMod.MOD_ID, name = ExampleMod.NAME, version = ExampleMod.VERSION, dependencies = ExampleMod.DEPENDENCIES)
public class ExampleMod {

	public static final String MOD_ID = "examplemod";
	public static final String NAME = "ExampleMod";
	public static final String VERSION = "0@VERSION@";
	public static final String DEPENDENCIES = "required:mixinconbooter;";
	public static final Logger LOGGER = LogManager.getLogger();

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LOGGER.info("Hello, from example mod preInit");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info("Hello, from example mod init");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		LOGGER.info("Hello, from example mod postInit");
	}
}
