package com.zandor300.advancedtools.items.tools.redstone;

import net.minecraft.item.ItemSword;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class RedstoneSword extends ItemSword {

	public RedstoneSword(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("RedstoneSword");
		this.setTextureName("advancedtools:redstonesword");
	}
}
