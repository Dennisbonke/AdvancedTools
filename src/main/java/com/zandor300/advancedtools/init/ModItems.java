package com.zandor300.advancedtools.init;

import com.zandor300.advancedtools.items.armor.*;
import com.zandor300.advancedtools.items.food.LuckyStar;
import com.zandor300.advancedtools.items.food.Strawberry;
import com.zandor300.advancedtools.items.tools.bone.*;
import com.zandor300.advancedtools.items.tools.emerald.*;
import com.zandor300.advancedtools.items.tools.enderion.*;
import com.zandor300.advancedtools.items.tools.ingot.*;
import com.zandor300.advancedtools.items.tools.lapis.*;
import com.zandor300.advancedtools.items.tools.nuggets.EnderionNugget;
import com.zandor300.advancedtools.items.tools.redstone.*;
import com.zandor300.advancedtools.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    // Food
    public static Item Strawberry = new Strawberry(3000, 2, true);
    public static Item LuckyStar = new LuckyStar(3001, 20, true);

    // Bone
    // TODO: Playtest material values.
    public static Item.ToolMaterial bone = EnumHelper.addToolMaterial("Bone", 1, 450, 7.0f, 1.5f, 10);
    public static ItemArmor.ArmorMaterial boneArmor = EnumHelper.addArmorMaterial("Bone", 5, new int[]{1, 2, 1, 1}, 15);
    public static Item boneIngot = new BoneIngot(4000);
    public static Item bonePickaxe = new BonePickaxe(5005, bone);
    public static Item boneShovel = new BoneShovel(5006, bone);
    public static Item boneAxe = new BoneAxe(5007, bone);
    public static Item boneSword = new BoneSword(5008, bone);
    public static Item boneHoe = new BoneHoe(5009, bone);
    public static Item boneHelmet = new BoneArmor("BoneHelmet", "bonehelmet", boneArmor, 0);
    public static Item boneChestplate = new BoneArmor("BoneChestplate", "bonechestplate", boneArmor, 1);
    public static Item boneLeggings = new BoneArmor("BoneLeggings", "boneleggings", boneArmor, 2);
    public static Item boneBoots = new BoneArmor("BoneBoots", "boneboots", boneArmor, 3);

    // Redstone
    // TODO: Playtest material values.
    public static Item.ToolMaterial redstone = EnumHelper.addToolMaterial("Redstone", 2, 750, 8.0f, 2.5f, 30);
    public static ItemArmor.ArmorMaterial redstoneArmor = EnumHelper.addArmorMaterial("Redstone", 20, new int[] { 2, 5, 4, 2 }, 35);
    public static Item redstoneIngot = new RedstoneIngot(4001);
    public static Item redstonePickaxe = new RedstonePickaxe(5010, redstone);
    public static Item redstoneShovel = new RedstoneShovel(5011, redstone);
    public static Item redstoneAxe = new RedstoneAxe(5012, redstone);
    public static Item redstoneSword = new RedstoneSword(5013, redstone);
    public static Item redstoneHoe = new RedstoneHoe(5014, redstone);
    public static Item redstoneHelmet = new RedstoneArmor("RedstoneHelmet", "redstonehelmet", redstoneArmor, 0);
    public static Item redstoneChestplate = new RedstoneArmor("RedstoneChestplate", "redstonechestplate", redstoneArmor, 1);
    public static Item redstoneLeggings = new RedstoneArmor("RedstoneLeggings", "redstoneleggings", redstoneArmor, 2);
    public static Item redstoneBoots = new RedstoneArmor("RedstoneBoots", "redstoneboots", redstoneArmor, 3);

    // Emerald
    // TODO: Playtest material values.
    public static Item.ToolMaterial emerald = EnumHelper.addToolMaterial("Emerald", 3, 1500, 10.0f, 4.0f, 22);
    public static ItemArmor.ArmorMaterial emeraldArmor = EnumHelper.addArmorMaterial("Emerald", 30, new int[] { 4, 7, 5, 4 }, 25);
    public static Item emeraldPickaxe = new EmeraldPickaxe(5000, emerald);
    public static Item emeraldShovel = new EmeraldShovel(5001, emerald);
    public static Item emeraldAxe = new EmeraldAxe(5002, emerald);
    public static Item emeraldSword = new EmeraldSword(5003, emerald);
    public static Item emeraldHoe = new EmeraldHoe(5004, emerald);
    public static Item emeraldHelmet = new EmeraldArmor("EmeraldHelmet", "emeraldhelmet", emeraldArmor, 0);
    public static Item emeraldChestplate = new EmeraldArmor("EmeraldChestplate", "emeraldchestplate", emeraldArmor, 1);
    public static Item emeraldLeggings = new EmeraldArmor("EmeraldLeggings", "emeraldleggings", emeraldArmor, 2);
    public static Item emeraldBoots = new EmeraldArmor("EmeraldBoots", "emeraldboots", emeraldArmor, 3);

    // Enderion
    // TODO: Change Tool and Armor material values to fit Enderion.
    public static Item.ToolMaterial enderion = EnumHelper.addToolMaterial("Enderion", 3, 2000, 11.0f, 4.5f, 32);
    //public static ItemArmor.ArmorMaterial enderionArmor = EnumHelper.addArmorMaterial("Enderion", 40, new int[] { 4, 7, 5, 4 }, 35);
    public static Item enderionIngot = new EnderionIngot(6000);
    public static Item enderionNugget = new EnderionNugget(6001);
    public static Item enderionPickaxe = new EnderionPickaxe(6002, enderion);
    public static Item enderionShovel = new EnderionShovel(6003, enderion);
    public static Item enderionAxe = new EnderionAxe(6004, enderion);
    public static Item enderionSword = new EnderionSword(6005, enderion);
    public static Item enderionHoe = new EnderionHoe(6006, enderion);
    //public static Item enderionHelmet = new EnderionArmor("EnderionHelmet", "enderionhelmet", enderionArmor, 0);
    //public static Item enderionChestplate = new EnderionArmor("EnderionChestplate", "enderionchestplate", enderionArmor, 1);
    //public static Item enderionLeggings = new EnderionArmor("EnderionLeggings", "enderionleggings", enderionArmor, 2);
    //public static Item enderionnBoots = new EnderionArmor("EnderionBoots", "enderionboots", enderionArmor, 3);

    // Lapis
    // TODO: Change Tool and Armor material values to fit Lapis.
    public static Item.ToolMaterial lapis = EnumHelper.addToolMaterial("Lapis", 3, 600, 7.5f, 3.0f, 20);
    public static ItemArmor.ArmorMaterial lapisArmor = EnumHelper.addArmorMaterial("Lapis", 25, new int[] { 3, 6, 5, 3 }, 25);
    public static Item lapisIngot = new LapisIngot(7000);
    //public static Item lapisPickaxe = new LapisPickaxe(7001, lapis);
    //public static Item lapisShovel = new LapisShovel(7002, lapis);
    //public static Item lapisAxe = new LapisAxe(7003, lapis);
    public static Item lapisSword = new LapisSword(7004, lapis);
    public static Item lapisHoe = new LapisHoe(7005, lapis);
    public static Item lapisHelmet = new LapisArmor("LapisHelmet", "lapishelmet", lapisArmor, 0);
    public static Item lapisChestplate = new LapisArmor("LapisChestplate", "lapischestplate", lapisArmor, 1);
    public static Item lapisLeggings = new LapisArmor("LapisLeggings", "lapisleggings", lapisArmor, 2);
    public static Item lapisBoots = new LapisArmor("LapisBoots", "lapisboots", lapisArmor, 3);

    // Flint
    // TODO: Change Tool and Armor material values to fit Flint.
    //public static Item.ToolMaterial flint = EnumHelper.addToolMaterial("Flint", 2, 400, 6.5f, 3.0f, 15);
    //public static ItemArmor.ArmorMaterial flintArmor = EnumHelper.addArmorMaterial("Flint", 22, new int[] { 2, 5, 3, 2 }, 13);
    //public static Item flintIngot = new FlintIngot(8000);
    //public static Item flintPickaxe = new FlintPickaxe(8001, flint);
    //public static Item flintShovel = new FlintShovel(8002, flint);
    //public static Item flintAxe = new FlintAxe(8003, flint);
    //public static Item flintSword = new FlintSword(8004, flint);
    //public static Item flintHoe = new FlintHoe(8005, flint);
    //public static Item flintHelmet = new FlintArmor("flintHelmet", "flinthelmet", flintArmor, 0);
    //public static Item flintChestplate = new FlintArmor("flintChestplate", "flintchestplate", flintArmor, 1);
    //public static Item flintLeggings = new FlintArmor("flintLeggings", "flintleggings", flintArmor, 2);
    //public static Item flintBoots = new FlintArmor("flintBoots", "flintboots", flintArmor, 3);

    public static void init() {

        // Food
        GameRegistry.registerItem(Strawberry, "Strawberry");
        GameRegistry.registerItem(LuckyStar, "Lucky Star");

        // Ingots
        GameRegistry.registerItem(boneIngot, "Bone Ingot");
        GameRegistry.registerItem(redstoneIngot, "Redstone Ingot");
        GameRegistry.registerItem(enderionIngot, "Enderion Ingot");
        GameRegistry.registerItem(lapisIngot, "Lapis Ingot");
        //GameRegistry.registerItem(flintIngot, "Flint Ingot");

        // Nuggets
        GameRegistry.registerItem(enderionNugget, "Enderion Nugget");

        // Tools
        // Emerald
        GameRegistry.registerItem(emeraldPickaxe, "Emerald Pickaxe");
        GameRegistry.registerItem(emeraldShovel, "Emerald Shovel");
        GameRegistry.registerItem(emeraldAxe, "Emerald Axe");
        GameRegistry.registerItem(emeraldSword, "Emerald Sword");
        GameRegistry.registerItem(emeraldHoe, "Emerald Hoe");

        // Redstone
        GameRegistry.registerItem(redstonePickaxe, "Redstone Pickaxe");
        GameRegistry.registerItem(redstoneShovel, "Redstone Shovel");
        GameRegistry.registerItem(redstoneAxe, "Redstone Axe");
        GameRegistry.registerItem(redstoneSword, "Redstone Sword");
        GameRegistry.registerItem(redstoneHoe, "Redstone Hoe");

        // Bone
        GameRegistry.registerItem(bonePickaxe, "Bone Pickaxe");
        GameRegistry.registerItem(boneShovel, "Bone Shovel");
        GameRegistry.registerItem(boneAxe, "Bone Axe");
        GameRegistry.registerItem(boneSword, "Bone Sword");
        GameRegistry.registerItem(boneHoe, "Bone Hoe");

        // Enderion
        GameRegistry.registerItem(enderionPickaxe, "Enderion Pickaxe");
        GameRegistry.registerItem(enderionShovel, "Enderion Shovel");
        GameRegistry.registerItem(enderionAxe, "Enderion Axe");
        GameRegistry.registerItem(enderionSword, "Enderion Sword");
        GameRegistry.registerItem(enderionHoe, "Enderion Hoe");

        // Lapis
        //GameRegistry.registerItem(lapisPickaxe, "Lapis Pickaxe");
        //GameRegistry.registerItem(lapisShovel, "Lapis Shovel");
        //GameRegistry.registerItem(lapisAxe, "Lapis Axe");
        GameRegistry.registerItem(lapisSword, "Lapis Sword");
        GameRegistry.registerItem(lapisHoe, "Lapis Hoe");

        // Flint
        //GameRegistry.registerItem(flintPickaxe, "Flint Pickaxe");
        //GameRegistry.registerItem(flintShovel, "Flint Shovel");
        //GameRegistry.registerItem(flintAxe, "Flint Axe");
        //GameRegistry.registerItem(flintSword, "Flint Sword");
        //GameRegistry.registerItem(flintHoe, "Flint Hoe");

        // Armor
        // Emerald
        GameRegistry.registerItem(emeraldHelmet, "Emerald Helmet");
        GameRegistry.registerItem(emeraldChestplate, "Emerald Chestplate");
        GameRegistry.registerItem(emeraldLeggings, "Emerald Leggings");
        GameRegistry.registerItem(emeraldBoots, "Emerald Boots");

        // Redstone
        GameRegistry.registerItem(redstoneHelmet, "Redstone Helmet");
        GameRegistry.registerItem(redstoneChestplate, "Redstone Chestplate");
        GameRegistry.registerItem(redstoneLeggings, "Redstone Leggings");
        GameRegistry.registerItem(redstoneBoots, "Redstone Boots");

        // Bone
        GameRegistry.registerItem(boneHelmet, "Bone Helmet");
        GameRegistry.registerItem(boneChestplate, "Bone Chestplate");
        GameRegistry.registerItem(boneLeggings, "Bone Leggings");
        GameRegistry.registerItem(boneBoots, "Bone Boots");

        // Enderion
        //GameRegistry.registerItem(enderionHelmet, "Enderion Helmet");
        //GameRegistry.registerItem(enderionChestplate, "Enderion Chestplate");
        //GameRegistry.registerItem(enderionLeggings, "Enderion Leggings");
        //GameRegistry.registerItem(enderionnBoots, "Enderion Boots");

        // Lapis
        GameRegistry.registerItem(lapisHelmet, "Lapis Helmet");
        GameRegistry.registerItem(lapisChestplate, "Lapis Chestplate");
        GameRegistry.registerItem(lapisLeggings, "Lapis Leggings");
        GameRegistry.registerItem(lapisBoots, "Lapis Boots");

        // Flint
        //GameRegistry.registerItem(flintHelmet, "Flint Helmet");
        //GameRegistry.registerItem(flintChestplate, "Flint Chestplate");
        //GameRegistry.registerItem(flintLeggings, "Flint Leggings");
        //GameRegistry.registerItem(flintBoots, "Flint Boots");
    }
}