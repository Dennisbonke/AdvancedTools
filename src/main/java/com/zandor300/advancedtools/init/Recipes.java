package com.zandor300.advancedtools.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {

    public static void init(){

        // Emerald Armour
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHelmet), "eee", "e e", "   ", "e", "gemEmerald"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldChestplate), "e e", "eee", "eee", "e", "gemEmerald"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldLeggings), "eee", "e e", "e e", "e", "gemEmerald"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldBoots), "   ", "e e", "e e", "e", "gemEmerald"));

        // Emerald Tools
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldAxe), "ee ", "es ", " s ", "e", "gemEmerald", "s", "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldSword), " e ", " e ", " s ", "e", "gemEmerald", "s", "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldShovel), " e ", " s ", " s ", "e", "gemEmerald", "s", "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldPickaxe), "eee", " s ", " s ", "e", "gemEmerald", "s", "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHoe), "ee ", " s ", " s ", "e", "gemEmerald", "s", "stickWood"));

        // Redstone Tools
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstonePickaxe), "rrr", " s ", " s ", "r", "ingotRedstone", "s", "stickWood"));

        // Bone Tools
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.boneAxe), "bb ", "bs ", " s ", "b", "ingotBone", "s", "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.boneShovel), " b ", " s ", " s ", "b", "ingotBone", "s", "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.boneSword), " b ", " b ", " s ", "b", "ingotBone", "s", "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bonePickaxe), "bbb", " s ", " s ", "b", "ingotBone", "s", "stickWood"));

        // Ingots
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneIngot), "rrr", "rir", "rrr", "r", "dustRedstone", "i", "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.boneIngot), "bbb", "bib", "bbb", "b", "dyeWhite", "i", "ingotIron"));
    }
}
