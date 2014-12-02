package com.zandor300.advancedtools.items.armor;

import com.zandor300.advancedtools.creativetab.CreativeTabATTools;
import com.zandor300.advancedtools.items.genericitems.ATItemArmor;
import com.zandor300.advancedtools.reference.Reference;

/**
 * Created by Zandor300 on 1-12-2014.
 */
public class LapisArmor extends ATItemArmor{
    public LapisArmor(String name, String texture, ArmorMaterial material, int j) {
        super(material, j, j);
        this.setCreativeTab(CreativeTabATTools.tab);
        this.setUnlocalizedName(name);
        this.setTextureName(Reference.MOD_ID + ":" + texture);
    }

    /*@Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
                                  String type) {
        if (stack.getItem() == ModItems.emeraldHelmet
                || stack.getItem() == ModItems.emeraldChestplate
                || stack.getItem() == ModItems.emeraldBoots)
            return Reference.MOD_ID + ":textures/models/armor/emerald_1.png";
        if (stack.getItem() == ModItems.emeraldLeggings)
            return Reference.MOD_ID + ":textures/models/armor/emerald_2.png";
        return null;
    }*/
}
