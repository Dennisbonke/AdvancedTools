package com.zandor300.advancedtools.items.tools.ingot;

import net.minecraft.item.Item;
import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class BoneIngot extends Item {

	public BoneIngot(int id) {
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("BoneIngot");
		this.setTextureName("advancedtools:boneingot");
	}
}
