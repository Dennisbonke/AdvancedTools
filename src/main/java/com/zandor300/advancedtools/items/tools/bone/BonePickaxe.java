package com.zandor300.advancedtools.items.tools.bone;

import net.minecraft.item.ItemPickaxe;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class BonePickaxe extends ItemPickaxe {

	public BonePickaxe(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("BonePickaxe");
		this.setTextureName("advancedtools:bonepickaxe");
	}
}
