package com.zandor300.advancedtools.init.always;

import com.zandor300.advancedtools.items.armor.BoneArmor;
import com.zandor300.advancedtools.items.armor.EmeraldArmor;
import com.zandor300.advancedtools.items.armor.LapisArmor;
import com.zandor300.advancedtools.items.armor.RedstoneArmor;
import com.zandor300.advancedtools.items.food.LuckyStar;
import com.zandor300.advancedtools.items.food.Strawberry;
import com.zandor300.advancedtools.items.tools.bone.*;
import com.zandor300.advancedtools.items.tools.emerald.*;
import com.zandor300.advancedtools.items.tools.enderion.*;
import com.zandor300.advancedtools.items.tools.ingot.*;
import com.zandor300.advancedtools.items.tools.lapis.LapisHoe;
import com.zandor300.advancedtools.items.tools.lapis.LapisSword;
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
    // TODO: Finish Bone.
    public static Item.ToolMaterial bone = EnumHelper.addToolMaterial("Bone", 1, 450, 7.0f, 1.5f, 10);
    public static ItemArmor.ArmorMaterial boneArmor = EnumHelper.addArmorMaterial("Bone", 5, new int[]{1, 2, 1, 1}, 15);
    public static Item boneIngot = new BoneIngot(4000);
    //public static Item boneNugget = new BoneNugget(4010);
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
    // TODO: Finish Redstone.
    public static Item.ToolMaterial redstone = EnumHelper.addToolMaterial("Redstone", 2, 750, 8.0f, 2.5f, 30);
    public static ItemArmor.ArmorMaterial redstoneArmor = EnumHelper.addArmorMaterial("Redstone", 20, new int[] { 2, 5, 4, 2 }, 35);
    public static Item redstoneIngot = new RedstoneIngot(4001);
    //public static Item redstoneNugget = new RedstoneNugget(4015);
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
    // TODO: Finish Emerald.
    public static Item.ToolMaterial emerald = EnumHelper.addToolMaterial("Emerald", 3, 1500, 10.0f, 4.0f, 22);
    public static ItemArmor.ArmorMaterial emeraldArmor = EnumHelper.addArmorMaterial("Emerald", 30, new int[] { 4, 7, 5, 4 }, 25);
    //public static Item emeraldNugget = new EmeraldNugget(5000);
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
    // TODO: To be replaced to Advanced Machines
    // TODO: Change Tool and Armor material values to fit Enderion.
    // TODO: Finish Enderion.
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
    // TODO: Finish Lapis.
    public static Item.ToolMaterial lapis = EnumHelper.addToolMaterial("Lapis", 2, 600, 7.5f, 3.0f, 20);
    public static ItemArmor.ArmorMaterial lapisArmor = EnumHelper.addArmorMaterial("Lapis", 25, new int[] { 3, 6, 5, 3 }, 25);
    public static Item lapisIngot = new LapisIngot(7000);
    //public static Item lapisNugget = new LapisNugget(7006);
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
    // TODO: Finish Flint.
    //public static Item.ToolMaterial flint = EnumHelper.addToolMaterial("Flint", 2, 400, 6.5f, 3.0f, 15);
    //public static ItemArmor.ArmorMaterial flintArmor = EnumHelper.addArmorMaterial("Flint", 22, new int[] { 2, 5, 3, 2 }, 13);
    //public static Item flintIngot = new FlintIngot(8000);
    //public static Item flintNugget = new FlintNugget(8006);
    //public static Item flintPickaxe = new FlintPickaxe(8001, flint);
    //public static Item flintShovel = new FlintShovel(8002, flint);
    //public static Item flintAxe = new FlintAxe(8003, flint);
    //public static Item flintSword = new FlintSword(8004, flint);
    //public static Item flintHoe = new FlintHoe(8005, flint);
    //public static Item flintHelmet = new FlintArmor("flintHelmet", "flinthelmet", flintArmor, 0);
    //public static Item flintChestplate = new FlintArmor("flintChestplate", "flintchestplate", flintArmor, 1);
    //public static Item flintLeggings = new FlintArmor("flintLeggings", "flintleggings", flintArmor, 2);
    //public static Item flintBoots = new FlintArmor("flintBoots", "flintboots", flintArmor, 3);

    // Netherion
    // TODO: To be replaced to Advanced Machines
    // TODO: Change Tool and Armor material values to fit Netherion.
    // TODO: Finish Netherion.
    //public static Item.ToolMaterial netherion = EnumHelper.addToolMaterial("Netherion", 2, 400, 6.5f, 3.0f, 15);
    //public static ItemArmor.ArmorMaterial netherionArmor = EnumHelper.addArmorMaterial("Netherion", 22, new int[] { 2, 5, 3, 2 }, 13);
    //public static Item netherionIngot = new NetherionIngot(9000);
    //public static Item netherionNugget = new NetherionNugget(9001);
    //public static Item netherionPickaxe = new NetherionPickaxe(9002, netherion);
    //public static Item netherionShovel = new NetherionShovel(9002, netherion);
    //public static Item netherionAxe = new NetherionAxe(9003, netherion);
    //public static Item netherionSword = new NetherionSword(9004, netherion);
    //public static Item netherionHoe = new NetherionHoe(9005, netherion);
    //public static Item netherionHelmet = new NetherionArmor("netherionHelmet", "netherionhelmet", netherionArmor, 0);
    //public static Item netherionChestPlate = new NetherionArmor("netherionChestplate", "netherionchestplate", netherionArmor, 1);
    //public static Item netherionLeggings = new NetherionArmor("netherionLeggings", "netherionleggings", netherionArmor, 2);
    //public static Item netherionBoots = new NetherionArmor("netherionBoots", "netherionboots", netherionArmor, 3);

    // Quartz
    // TODO: To be replaced to Advanced Machines
    // TODO: Change Tool and Armor material values to fit Quartz.
    // TODO: Finish Quartz.
    //public static Item.ToolMaterial quartz = EnumHelper.addToolMaterial("Quartz", 2, 400, 6.5f, 3.0f, 15);
    //public static ItemArmor.ArmorMaterial quartzArmor = EnumHelper.addArmorMaterial("Quartz", 22, new int[] { 2, 5, 3, 2 }, 13);
    //public static Item quartzIngot = new QuartzIngot(9000);
    //public static Item quartzNugget = new QuartzNugget(9001);
    //public static Item quartzPickaxe = new QuartzPickaxe(9002, quartz);
    //public static Item quartzShovel = new QuartzShovel(9002, quartz);
    //public static Item quartzAxe = new QuartzAxe(9003, quartz);
    //public static Item quartzSword = new QuartzSword(9004, quartz);
    //public static Item quartzHoe = new QuartzHoe(9005, quartz);
    //public static Item quartzHelmet = new QuartzArmor("quartzHelmet", "quartzhelmet", quartzArmor, 0);
    //public static Item quartzChestPlate = new QuartzArmor("quartzChestplate", "quartzchestplate", quartzArmor, 1);
    //public static Item quartzLeggings = new QuartzArmor("quartzLeggings", "quartzleggings", quartzArmor, 2);
    //public static Item quartzBoots = new QuartzArmor("quartzBoots", "quartzboots", quartzArmor, 3);

    // Copper
    // TODO: To be replaced to Advanced Machines
    // TODO: Change Tool and Armor material values to fit Copper.
    // TODO: Finish Copper.
    //public static Item.ToolMaterial copper = EnumHelper.addToolMaterial("Copper", 2, 400, 6.5f, 3.0f, 15);
    //public static ItemArmor.ArmorMaterial copperArmor = EnumHelper.addArmorMaterial("Copper", 22, new int[] { 2, 5, 3, 2 }, 13);
    public static Item copperIngot = new CopperIngot(9000);
    //public static Item copperNugget = new CopperNugget(9001);
    //public static Item copperPickaxe = new CopperPickaxe(9002, copper);
    //public static Item copperShovel = new CopperShovel(9002, copper);
    //public static Item copperAxe = new CopperAxe(9003, copper);
    //public static Item copperSword = new CopperSword(9004, copper);
    //public static Item copperHoe = new CopperHoe(9005, copper);
    //public static Item copperHelmet = new CopperArmor("copperHelmet", "copperhelmet", copperArmor, 0);
    //public static Item copperChestPlate = new CopperArmor("copperChestplate", "copperchestplate", copperArmor, 1);
    //public static Item copperLeggings = new CopperArmor("copperLeggings", "copperleggings", copperArmor, 2);
    //public static Item copperBoots = new CopperArmor("copperBoots", "copperboots", copperArmor, 3);

    public static void init() {

        // Food
        GameRegistry.registerItem(Strawberry, "Strawberry");
        GameRegistry.registerItem(LuckyStar, "Lucky Star");

        // Ingots
        // TODO: Make Textures for remaining Ingots before being re-enabled.
        GameRegistry.registerItem(boneIngot, "Bone Ingot");
        GameRegistry.registerItem(redstoneIngot, "Redstone Ingot");
        GameRegistry.registerItem(enderionIngot, "Enderion Ingot");
        GameRegistry.registerItem(lapisIngot, "Lapis Ingot");
        //GameRegistry.registerItem(flintIngot, "Flint Ingot");
        //GameRegistry.registerItem(netherionIngot, "Netherion Ingot");
        //GameRegistry.registerItem(quartzIngot, "Quartz Ingot");
        GameRegistry.registerItem(copperIngot, "Copper Ingot");

        // Nuggets
        // TODO: Make Textures for remaining Nuggets before being re-enabled.
        //GameRegistry.registerItem(emeraldNugget, "Emerald Nugget");
        //GameRegistry.registerItem(redstoneNugget, "Redstone Nugget");
        //GameRegistry.registerItem(boneNugget, "Bone Nugget");
        GameRegistry.registerItem(enderionNugget, "Enderion Nugget");
        //GameRegistry.registerItem(lapisNugget, "Lapis Nugget");
        //GameRegistry.registerItem(flintNugget, "Flint Nugget");
        //GameRegistry.registerItem(netherionNugget, "Netherion Nugget");
        //GameRegistry.registerItem(quartzNugget, "Quartz Nugget");
        //GameRegistry.registerItem(copperNugget, "Copper Nugget");

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
        // TODO: To be replaced to Advanced Machines
        GameRegistry.registerItem(enderionPickaxe, "Enderion Pickaxe");
        GameRegistry.registerItem(enderionShovel, "Enderion Shovel");
        GameRegistry.registerItem(enderionAxe, "Enderion Axe");
        GameRegistry.registerItem(enderionSword, "Enderion Sword");
        GameRegistry.registerItem(enderionHoe, "Enderion Hoe");

        // Lapis
        // TODO: Make Textures for Lapis before being re-enabled.
        //GameRegistry.registerItem(lapisPickaxe, "Lapis Pickaxe");
        //GameRegistry.registerItem(lapisShovel, "Lapis Shovel");
        //GameRegistry.registerItem(lapisAxe, "Lapis Axe");
        GameRegistry.registerItem(lapisSword, "Lapis Sword");
        GameRegistry.registerItem(lapisHoe, "Lapis Hoe");

        // Flint
        // TODO: Make Textures for Flint before being re-enabled.
        //GameRegistry.registerItem(flintPickaxe, "Flint Pickaxe");
        //GameRegistry.registerItem(flintShovel, "Flint Shovel");
        //GameRegistry.registerItem(flintAxe, "Flint Axe");
        //GameRegistry.registerItem(flintSword, "Flint Sword");
        //GameRegistry.registerItem(flintHoe, "Flint Hoe");

        // Netherion
        // TODO: To be replaced to Advanced Machines
        // TODO: Make Textures for Netherion before being re-enabled.
        //GameRegistry.registerItem(netherionPickaxe, "Netherion Pickaxe");
        //GameRegistry.registerItem(netherionShovel, "Netherion Shovel");
        //GameRegistry.registerItem(netherionAxe, "Netherion Axe");
        //GameRegistry.registerItem(netherionSword, "Netherion Sword");
        //GameRegistry.registerItem(netherionHoe, "Netherion Hoe");

        // Quartz
        // TODO: To be replaced to Advanced Machines
        // TODO: Make Textures for Quartz before being re-enabled.
        //GameRegistry.registerItem(quartzPickaxe, "Quartz Pickaxe");
        //GameRegistry.registerItem(quartzShovel, "Quartz Shovel");
        //GameRegistry.registerItem(quartzAxe, "Quartz Axe");
        //GameRegistry.registerItem(quartzSword, "Quartz Sword");
        //GameRegistry.registerItem(quartzHoe, "Quartz Hoe");

        // Copper
        // TODO: To be replaced to Advanced Machines
        // TODO: Make Textures for Copper before being re-enabled.
        //GameRegistry.registerItem(copperPickaxe, "Copper Pickaxe");
        //GameRegistry.registerItem(copperShovel, "Copper Shovel");
        //GameRegistry.registerItem(copperAxe, "Copper Axe");
        //GameRegistry.registerItem(copperSword, "Copper Sword");
        //GameRegistry.registerItem(copperHoe, "Copper Hoe");

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
        // TODO: Make Textures for Enderion before being re-enabled.
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
        // TODO: Make Textures for Flint before being re-enabled.
        //GameRegistry.registerItem(flintHelmet, "Flint Helmet");
        //GameRegistry.registerItem(flintChestplate, "Flint Chestplate");
        //GameRegistry.registerItem(flintLeggings, "Flint Leggings");
        //GameRegistry.registerItem(flintBoots, "Flint Boots");

        // Netherion
        // TODO: To be replaced to Advanced Machines
        // TODO: Make Textures for Netherion before being re-enabled.
        //GameRegistry.registerItem(netherionHelmet, "Netherion Helmet");
        //GameRegistry.registerItem(netherionChestplate, "Netherion Chestplate");
        //GameRegistry.registerItem(netherionLeggings, "Netherion Leggings");
        //GameRegistry.registerItem(netherionBoots, "Netherion Boots");

        // Quartz
        // TODO: To be replaced to Advanced Machines
        // TODO: Make Textures for Quartz before being re-enabled.
        //GameRegistry.registerItem(quartzHelmet, "Quartz Helmet");
        //GameRegistry.registerItem(quartzChestplate, "Quartz Chestplate");
        //GameRegistry.registerItem(quartzLeggings, "Quartz Leggings");
        //GameRegistry.registerItem(quartzBoots, "Quartz Boots");

        // Copper
        // TODO: To be replaced to Advanced Machines
        // TODO: Make Textures for Copper before being re-enabled.
        //GameRegistry.registerItem(copperHelmet, "Copper Helmet");
        //GameRegistry.registerItem(copperChestplate, "Copper Chestplate");
        //GameRegistry.registerItem(copperLeggings, "Copper Leggings");
        //GameRegistry.registerItem(copperBoots, "Copper Boots");
    }
}