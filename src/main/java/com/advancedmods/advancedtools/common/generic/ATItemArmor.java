package com.advancedmods.advancedtools.common.generic;

import com.advancedmods.advancedtools.core.ATProps;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by Dennisbonke on 15-4-2015.
 */
public class ATItemArmor extends ItemArmor {

    public ATItemArmor(ArmorMaterial material, int j, int j1) {
        super(material, j, j);
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", ATProps.modid.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", ATProps.modid.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}
