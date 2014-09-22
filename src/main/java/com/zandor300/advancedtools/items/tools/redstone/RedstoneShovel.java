package com.zandor300.advancedtools.items.tools.redstone;

import net.minecraft.item.ItemSpade;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class RedstoneShovel extends ItemSpade {

	public RedstoneShovel(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("RedstoneShovel");
		this.setTextureName("advancedtools:redstoneshovel");
	}
}
