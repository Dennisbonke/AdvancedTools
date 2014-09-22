package com.zandor300.advancedtools.items.tools.ingot;

import net.minecraft.item.Item;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class RedstoneIngot extends Item {

	public RedstoneIngot(int id) {
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("RedstoneIngot");
		this.setTextureName("advancedtools:redstoneingot");
	}
}
