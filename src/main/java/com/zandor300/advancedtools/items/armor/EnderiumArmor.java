package com.zandor300.advancedtools.items.armor;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;
import com.zandor300.advancedtools.init.ModItems;
import com.zandor300.advancedtools.items.genericitems.ATItemArmor;
import com.zandor300.advancedtools.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

/**
 * Created by Zandor on 1-12-2014.
 */
public class EnderiumArmor extends ATItemArmor{

    public EnderiumArmor(String name, String texture, ArmorMaterial material, int j) {
        super(material, j, j);
        this.setCreativeTab(CreativeTabAT.tab);
        this.setUnlocalizedName(name);
        this.setTextureName(Reference.MOD_ID + ":" + texture);
    }
}
