package com.zandor300.advancedtools.items.tools.bone;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;
import net.minecraft.item.ItemAxe;

public class BoneAxe extends ItemAxe {

	public BoneAxe(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("BoneAxe");
		this.setTextureName("advancedtools:boneaxe");
	}
}
