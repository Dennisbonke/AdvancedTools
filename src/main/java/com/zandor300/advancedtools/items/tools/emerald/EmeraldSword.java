package com.zandor300.advancedtools.items.tools.emerald;

import net.minecraft.item.ItemSword;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class EmeraldSword extends ItemSword {

	public EmeraldSword(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("EmeraldSword");
		this.setTextureName("advancedtools:emeraldsword");
	}
}
