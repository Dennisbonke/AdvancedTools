package com.zandor300.advancedtools.items.tools.emerald;

import net.minecraft.item.ItemAxe;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class EmeraldAxe extends ItemAxe {

	public EmeraldAxe(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("EmeraldAxe");
		this.setTextureName("advancedtools:emeraldaxe");
	}
}
