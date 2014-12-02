package com.zandor300.advancedtools;

import com.zandor300.advancedtools.init.ModBlocks;
import com.zandor300.advancedtools.init.ModItems;
import com.zandor300.advancedtools.init.Recipes;
import com.zandor300.advancedtools.reference.Reference;
import com.zandor300.advancedtools.utilities.LogHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.zandor300.advancedtools.mobs.FrankensteinMob;
import com.zandor300.advancedtools.proxy.ServerProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class AdvancedTools {

	@SidedProxy(clientSide = Reference.CLIENTSIDE, serverSide = Reference.SERVERSIDE)
	public static ServerProxy Proxy;


	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		// Render Info
		//Proxy.registerRenderInfo();

		// Register Entity
		//registerEntity(FrankensteinMob.class, "Frankenstein", 0xeaeae9,
		//		0xc99a03);

       	// ModBlocks.init();

		ModItems.preinit();

        ModItems.init();

        LogHelper.info("Pre Initialization Complete!");
	}
	// register Frankenstein Mob
	/*private static void registerEntity(Class<? extends Entity> class1,
			String entityName, int bkEggColor, int fgEggColor) {
		int id = EntityRegistry.findGlobalUniqueEntityId();

		EntityRegistry.registerGlobalEntityID(class1, entityName, id);
		EntityList.entityEggs.put(Integer.valueOf(id), new EntityEggInfo(id,
				bkEggColor, fgEggColor));
	}

	public void addSpawn(Class<? extends EntityLiving> entityClass,
			int spawnProb, int min, int max, BiomeGenBase[] biomes) {
		if (spawnProb > 0)
			EntityRegistry.addSpawn(entityClass, spawnProb, min, max,
					EnumCreatureType.creature, biomes);
	}

	*/@EventHandler
	public static void Init(FMLInitializationEvent event) {

		Recipes.init();

        LogHelper.info("Initialization Complete!");
	}

	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post Initialization Complete!");
	}
}
