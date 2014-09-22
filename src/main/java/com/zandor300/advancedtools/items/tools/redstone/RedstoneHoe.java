package com.zandor300.advancedtools.items.tools.redstone;

import net.minecraft.item.ItemHoe;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class RedstoneHoe extends ItemHoe {

	public RedstoneHoe(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("RedstoneHoe");
		this.setTextureName("advancedtools:redstonehoe");
	}
}
