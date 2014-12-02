package com.zandor300.advancedtools.items.armor;

import com.zandor300.advancedtools.creativetab.CreativeTabATTools;
import com.zandor300.advancedtools.init.ModItems;
import com.zandor300.advancedtools.items.genericitems.ATItemArmor;
import com.zandor300.advancedtools.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class RedstoneArmor extends ATItemArmor{
    public RedstoneArmor(String name, String texture, ArmorMaterial material, int j) {
        super(material, j, j);
        this.setCreativeTab(CreativeTabATTools.tab);
        this.setUnlocalizedName(name);
        this.setTextureName(Reference.MOD_ID + ":" + texture);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
                                  String type) {
        if (stack.getItem() == ModItems.redstoneHelmet
                || stack.getItem() == ModItems.redstoneChestplate
                || stack.getItem() == ModItems.redstoneBoots)
            return Reference.MOD_ID + ":textures/models/armor/emerald_1.png";
        if (stack.getItem() == ModItems.redstoneLeggings)
            return Reference.MOD_ID + ":textures/models/armor/emerald_2.png";
        return null;
    }
}
