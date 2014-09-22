package com.zandor300.advancedtools.items.tools.emerald;

import net.minecraft.item.ItemSpade;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class EmeraldShovel extends ItemSpade {

	public EmeraldShovel(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("EmeraldShovel");
		this.setTextureName("advancedtools:emeraldshovel");
	}
}
