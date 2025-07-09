package com.example.examplemod;

import java.util.ArrayList;
import java.util.List;

import net.minecraftforge.fml.common.Loader;
import zone.rong.mixinbooter.ILateMixinLoader;

public class ExampleLateMixinLoader implements ILateMixinLoader {

	@Override
	public List<String> getMixinConfigs() {
		List<String> mixinConfigs = new ArrayList<>();
		if(Loader.isModLoaded("jei")) {
			mixinConfigs.add("examplemod.mixins.jei.json");
		}
		return mixinConfigs;
	}
}
