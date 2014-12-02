package com.zandor300.advancedtools.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Oredictionary {

    public static void init(){

        // Ingots
        OreDictionary.registerOre("ingotBone", new ItemStack(ModItems.boneIngot));
        OreDictionary.registerOre("ingotRedstone", new ItemStack(ModItems.redstoneIngot));
        OreDictionary.registerOre("ingotEnderion", new ItemStack(ModItems.enderionIngot));
        //OreDictionary.registerOre("ingotFlint", new ItemStack(ModItems.flintIngot));
        OreDictionary.registerOre("ingotLapis", new ItemStack(ModItems.lapisIngot));
        //OreDictionary.registerOre("ingotNetherion", new ItemStack(ModItems.netherionIngot));


        // Nuggets
        OreDictionary.registerOre("nuggetEnderion", new ItemStack(ModItems.enderionNugget));
        //OreDictionary.registerOre("nuggetEmerald", new ItemStack(ModItems.emeraldNugget));
        //OreDictionary.registerOre("nuggetBone", new ItemStack(ModItems.boneNugget));
        //OreDictionary.registerOre("nuggetFlint", new ItemStack(ModItems.flintNugget));
        //OreDictionary.registerOre("nuggetLapis", new ItemStack(ModItems.lapisNugget));
        //OreDictionary.registerOre("nuggetNetherion", new ItemStack(ModItems.netherionNugget));
        //OreDictionary.registerOre("nuggetQuartz", new ItemStack(ModItems.quartzNugget));
        //OreDictionary.registerOre("nuggetRedstone", new ItemStack(ModItems.redstoneNugget));

        // Materials
        OreDictionary.registerOre("materialEnderPearl", new ItemStack(Items.ender_pearl));
    }
}