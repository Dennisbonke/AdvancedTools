package com.zandor300.advancedtools.init;

import com.zandor300.advancedtools.blocks.CreateBlock;
import com.zandor300.advancedtools.blocks.crops.StrawberryCrop;
import com.zandor300.advancedtools.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    //public static final Block Transformer = new CreateBlock("Transformer",
    //        "transformer", 2000, Material.wood, CreativeTabs.tabBlock, 4f, 5f,
    //        0f);
    //public static final Block Lamp = new CreateBlock("Lamp", "lamp", 2001,
    //        Material.glass, CreativeTabs.tabBlock, 4f, 5f, 1f);
    //public static final Block LuckyStarBlock = new CreateBlock(
    //        "LuckyStarBlock", "luckystar", 2001, Material.glass,
    //        CreativeTabs.tabBlock, 4f, 5f, 1f);
    //public static Block StrawberryCrop = new StrawberryCrop(3001);


    public static void init() {
        //GameRegistry.registerBlock(Transformer, "Transformer");
        //GameRegistry.registerBlock(Lamp, "Lamp");
        //GameRegistry.registerBlock(LuckyStarBlock, "Lucky Star Block");
        //GameRegistry.registerBlock(StrawberryCrop, "Strawberry Crop");
    }
}