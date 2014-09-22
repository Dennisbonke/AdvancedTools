package com.zandor300.advancedtools.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.zandor300.advancedtools.AdvancedTools;
import com.zandor300.advancedtools.creativetab.CreativeTabAT;
import com.zandor300.advancedtools.lib.RefStrings;

public class ArmorItem extends ItemArmor {

	public ArmorItem(String name, String texture, ArmorMaterial material, int j) {
		super(material, j, j);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName(name);
		this.setTextureName(RefStrings.MODID + ":" + texture);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (stack.getItem() == AdvancedTools.emeraldHelmet
				|| stack.getItem() == AdvancedTools.emeraldChestplate
				|| stack.getItem() == AdvancedTools.emeraldBoots)
			return RefStrings.MODID + ":textures/models/armor/emerald_1.png";
		if (stack.getItem() == AdvancedTools.emeraldLeggings)
			return RefStrings.MODID + ":textures/models/armor/emerald_2.png";
		return null;
	};
}
