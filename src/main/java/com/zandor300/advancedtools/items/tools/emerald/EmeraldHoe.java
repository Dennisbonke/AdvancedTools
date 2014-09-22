package com.zandor300.advancedtools.items.tools.emerald;

import net.minecraft.item.ItemHoe;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class EmeraldHoe extends ItemHoe {

	public EmeraldHoe(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("EmeraldHoe");
		this.setTextureName("advancedtools:emeraldhoe");
	}
}
