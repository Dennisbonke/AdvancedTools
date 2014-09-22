package com.zandor300.advancedtools.items.tools.bone;

import net.minecraft.item.ItemSpade;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class BoneShovel extends ItemSpade {

	public BoneShovel(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("BoneShovel");
		this.setTextureName("advancedtools:boneshovel");
	}
}
