package com.zandor300.advancedtools.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {

    public static void init(){

        // Armor
        // Emerald
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHelmet), "eee", "e e", "   ", 'e', "gemEmerald"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldChestplate), "e e", "eee", "eee", 'e', "gemEmerald"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldLeggings), "eee", "e e", "e e", 'e', "gemEmerald"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldBoots), "   ", "e e", "e e", 'e', "gemEmerald"));

        // Redstone
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneHelmet), "rrr", "r r", "   ", 'r', "ingotRedstone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneChestplate), "r r", "rrr", "rrr", 'r', "ingotRedstone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneLeggings), "rrr", "r r", "r r", 'r', "ingotRedstone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneBoots), "   ", "r r", "r r", 'r', "ingotRedstone"));

        // Bone
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.boneHelmet), "bbb", "b b", "   ", 'b', "ingotBone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.boneChestplate), "b b", "bbb", "bbb", 'b', "ingotBone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.boneLeggings), "bbb", "b b", "b b", 'b', "ingotBone"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.boneBoots), "   ", "b b", "b b", 'b', "ingotBone"));

        // Tools
        // Emerald
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldAxe), "ee ", "es ", " s ", 'e', "gemEmerald", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldSword), " e ", " e ", " s ", 'e', "gemEmerald", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldShovel), " e ", " s ", " s ", 'e', "gemEmerald", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldPickaxe), "eee", " s ", " s ", 'e', "gemEmerald", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHoe), "ee ", " s ", " s ", 'e', "gemEmerald", 's', "stickWood"));

        // Redstone
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstonePickaxe), "rrr", " s ", " s ", 'r', "ingotRedstone", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneAxe), "rr ", "rs ", " s ", 'r', "ingotRedstone", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneShovel), "r", "s", "s", 'r', "ingotRedstone", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneSword), "r", "r", "s", 'r', "ingotRedstone", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneHoe), "rr ", " s ", " s ", 'r', "ingotRedstone", 's', "stickWood"));

        // Bone
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.boneAxe), "bb ", "bs ", " s ", 'b', "ingotBone", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.boneShovel), " b ", " s ", " s ", 'b', "ingotBone", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.boneSword), " b ", " b ", " s ", 'b', "ingotBone", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bonePickaxe), "bbb", " s ", " s ", 'b', "ingotBone", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.boneHoe), "bb ", " s ", " s ", 'b', "ingotBone", 's', "stickWood"));

        // Enderion
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderionAxe), "ee ", "es ", " s ", 'e', "ingotEnderion", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderionShovel), " e ", " s ", " s ", 'e', "ingotEnderion", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderionSword), " e ", " e ", " s ", 'e', "ingotEnderion", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderionPickaxe), "eee", " s ", " s ", 'e', "ingotEnderion", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderionHoe), "ee ", " s ", " s ", 'e', "ingotEnderion", 's', "stickWood"));

        // Lapis
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lapisSword), " l ", " l ", " s ", 'l', "gemLapis", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lapisHoe), "ll ", " s ", " s ", 'l', "gemLapis", 's', "stickWood"));

        // Ingots
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.redstoneIngot, 3), "rrr", "rir", "rrr", 'r', "dustRedstone", 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.boneIngot, 3), "bbb", "bib", "bbb", 'b', "dyeWhite", 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderionIngot, 3), "eee", "eie", "eee", 'e', "materialEnderPearl", 'i', "ingotIron"));
    }
}
