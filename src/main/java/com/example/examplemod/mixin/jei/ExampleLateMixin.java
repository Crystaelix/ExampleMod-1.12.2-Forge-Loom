package com.example.examplemod.mixin.jei;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.example.examplemod.ExampleMod;

import mezz.jei.JustEnoughItems;

@Mixin(JustEnoughItems.class)
public class ExampleLateMixin {

	@Inject(at = @At("HEAD"), method = "preInit", remap = false)
	private void onPreInit(CallbackInfo info) {
		ExampleMod.LOGGER.info("Hello, from example mod late mixin");
	}
}
