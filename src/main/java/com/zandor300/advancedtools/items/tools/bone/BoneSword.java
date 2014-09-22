package com.zandor300.advancedtools.items.tools.bone;

import net.minecraft.item.ItemSword;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class BoneSword extends ItemSword {

	public BoneSword(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("BoneSword");
		this.setTextureName("advancedtools:bonesword");
	}
}
