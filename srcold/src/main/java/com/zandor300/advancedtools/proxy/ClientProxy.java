package com.zandor300.advancedtools.proxy;

import com.zandor300.advancedtools.init.always.ModBlocks;
import com.zandor300.advancedtools.init.always.ModItems;
import com.zandor300.advancedtools.init.always.Oredictionary;
import com.zandor300.advancedtools.init.always.Recipes;
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
	@Override
	public void preInit(){
		Oredictionary.init();
		ModItems.init();
		ModBlocks.init();
	}
	@Override
	public void Init(){
		Recipes.init();
	}
}
