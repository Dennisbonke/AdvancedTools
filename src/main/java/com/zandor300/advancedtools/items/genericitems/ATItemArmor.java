package com.zandor300.advancedtools.items.genericitems;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;
import com.zandor300.advancedtools.reference.Reference;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ATItemArmor extends ItemArmor{
    public ATItemArmor(ArmorMaterial material, int j, int j1) {
        super(material, j, j);
        this.setCreativeTab(CreativeTabAT.tab);
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}