package com.zandor300.advancedtools.init;

import com.zandor300.advancedtools.items.armor.ArmorItem;
import com.zandor300.advancedtools.items.food.LuckyStar;
import com.zandor300.advancedtools.items.food.Strawberry;
import com.zandor300.advancedtools.items.tools.bone.*;
import com.zandor300.advancedtools.items.tools.emerald.*;
import com.zandor300.advancedtools.items.tools.ingot.BoneIngot;
import com.zandor300.advancedtools.items.tools.ingot.RedstoneIngot;
import com.zandor300.advancedtools.items.tools.redstone.*;
import com.zandor300.advancedtools.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static Item Strawberry = new Strawberry(3000, 2, true);
    public static Item LuckyStar = new LuckyStar(3001, 20, true);

    public static Item.ToolMaterial bone = EnumHelper.addToolMaterial("Bone", 3,
            250, 7.0f, 2.5f, 10);
    public static Item boneIngot = new BoneIngot(4000);
    public static Item bonePickaxe = new BonePickaxe(5005, bone);
    public static Item boneShovel = new BoneShovel(5006, bone);
    public static Item boneAxe = new BoneAxe(5007, bone);
    public static Item boneSword = new BoneSword(5008, bone);
    public static Item boneHoe = new BoneHoe(5009, bone);

    public static Item.ToolMaterial redstone = EnumHelper.addToolMaterial(
            "Redstone", 3, 750, 8.0f, 3.0f, 40);
    public static Item redstoneIngot = new RedstoneIngot(4001);
    public static Item redstonePickaxe = new RedstonePickaxe(5010, redstone);
    public static Item redstoneShovel = new RedstoneShovel(5011, redstone);
    public static Item redstoneAxe = new RedstoneAxe(5012, redstone);
    public static Item redstoneSword = new RedstoneSword(5013, redstone);
    public static Item redstoneHoe = new RedstoneHoe(5014, redstone);

    public static Item.ToolMaterial emerald = EnumHelper.addToolMaterial("Emerald",
            3, 2000, 10.0f, 4.0f, 22);
    public static ItemArmor.ArmorMaterial emeraldArmor = EnumHelper.addArmorMaterial(
            "Emerald", 43, new int[] { 4, 6, 5, 4 }, 25);
    public static Item emeraldPickaxe = new EmeraldPickaxe(5000, emerald);
    public static Item emeraldShovel = new EmeraldShovel(5001, emerald);
    public static Item emeraldAxe = new EmeraldAxe(5002, emerald);
    public static Item emeraldSword = new EmeraldSword(5003, emerald);
    public static Item emeraldHoe = new EmeraldHoe(5004, emerald);
    public static Item emeraldHelmet = new ArmorItem("EmeraldHelmet",
            "emeraldhelmet", emeraldArmor, 0);
    public static Item emeraldChestplate = new ArmorItem("EmeraldChestplate",
            "emeraldchestplate", emeraldArmor, 1);
    public static Item emeraldLeggings = new ArmorItem("EmeraldLeggings",
            "emeraldleggings", emeraldArmor, 2);
    public static Item emeraldBoots = new ArmorItem("Emeraldboots",
            "emeraldboots", emeraldArmor, 3);

    public static void init() {
        GameRegistry.registerItem(Strawberry, "Strawberry");
        GameRegistry.registerItem(LuckyStar, "Lucky Star");

        GameRegistry.registerItem(boneIngot, "Bone Ingot");
        GameRegistry.registerItem(redstoneIngot, "Redstone Ingot");

        GameRegistry.registerItem(emeraldPickaxe, "Emerald Pickaxe");
        GameRegistry.registerItem(emeraldShovel, "Emerald Shovel");
        GameRegistry.registerItem(emeraldAxe, "Emerald Axe");
        GameRegistry.registerItem(emeraldSword, "Emerald Sword");
        GameRegistry.registerItem(emeraldHoe, "Emerald Hoe");

        GameRegistry.registerItem(emeraldHelmet, "Emerald Helmet");
        GameRegistry.registerItem(emeraldChestplate, "Emerald Chestplate");
        GameRegistry.registerItem(emeraldLeggings, "Emerald Leggings");
        GameRegistry.registerItem(emeraldBoots, "Emerald Boots");

        GameRegistry.registerItem(bonePickaxe, "Bone Pickaxe");
        GameRegistry.registerItem(boneShovel, "Bone Shovel");
        GameRegistry.registerItem(boneAxe, "Bone Axe");
        GameRegistry.registerItem(boneSword, "Bone Sword");
        GameRegistry.registerItem(boneHoe, "Bone Hoe");

        GameRegistry.registerItem(redstonePickaxe, "Redstone Pickaxe");
        GameRegistry.registerItem(redstoneShovel, "Redstone Shovel");
        GameRegistry.registerItem(redstoneAxe, "Redstone Axe");
        GameRegistry.registerItem(redstoneSword, "Redstone Sword");
        GameRegistry.registerItem(redstoneHoe, "Redstone Hoe");
    }
}
