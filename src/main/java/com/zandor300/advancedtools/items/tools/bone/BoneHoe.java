package com.zandor300.advancedtools.items.tools.bone;

import net.minecraft.item.ItemHoe;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class BoneHoe extends ItemHoe {

	public BoneHoe(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("BoneHoe");
		this.setTextureName("advancedtools:bonehoe");
	}
}
