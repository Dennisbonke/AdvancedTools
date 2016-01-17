package com.advancedmods.advancedtools.common.items.armor;

import com.advancedmods.advancedtools.AdvancedTools;
import com.advancedmods.advancedtools.common.generic.ATItemArmor;
import com.advancedmods.advancedtools.core.ATProps;
import com.advancedmods.advancedtools.core.ATRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

/**
 * Created by Dennisbonke on 15-4-2015.
 */
public class EmeraldArmor extends ATItemArmor {

    public EmeraldArmor(String name, String texture, ArmorMaterial material, int j) {
        super(material, j, j);
        this.setCreativeTab(AdvancedTools.tabCombat);
        this.setUnlocalizedName(name);
        this.setTextureName(ATProps.modid.toLowerCase() + ":" + texture);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == ATRegistry.emeraldHelmet
                || stack.getItem() == ATRegistry.emeraldChestplate
                || stack.getItem() == ATRegistry.emeraldBoots)
            return ATProps.modid.toLowerCase() + ":textures/models/armor/emerald_1.png";
        if (stack.getItem() == ATRegistry.emeraldLeggings)
            return ATProps.modid.toLowerCase() + ":textures/models/armor/emerald_2.png";
        return null;
    }



}
