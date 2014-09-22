package com.zandor300.advancedtools.proxy;

import com.zandor300.advancedtools.mobs.Frankenstein;
import com.zandor300.advancedtools.mobs.FrankensteinMob;
import com.zandor300.advancedtools.mobs.RenderFrankenstein;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy {

	@Override
	public void registerRenderInfo() {
		RenderingRegistry.registerEntityRenderingHandler(FrankensteinMob.class,
				new RenderFrankenstein(new Frankenstein(), 0.5f));
	}
}
