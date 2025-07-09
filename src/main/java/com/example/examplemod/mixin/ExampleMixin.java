package com.example.examplemod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.example.examplemod.ExampleMod;

import net.minecraft.init.Bootstrap;

@Mixin(Bootstrap.class)
public class ExampleMixin {

	@Inject(at = @At("HEAD"), method = "register")
	private static void onLoad(CallbackInfo info) {
		ExampleMod.LOGGER.info("Hello, from example mod mixin");
	}
}
