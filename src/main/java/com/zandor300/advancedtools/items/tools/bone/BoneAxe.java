package com.zandor300.advancedtools.items.tools.bone;

import net.minecraft.item.ItemAxe;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class BoneAxe extends ItemAxe {

	public BoneAxe(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("BoneAxe");
		this.setTextureName("advancedtools:boneaxe");
	}
}
