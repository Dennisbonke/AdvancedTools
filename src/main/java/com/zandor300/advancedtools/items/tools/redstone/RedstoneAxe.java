package com.zandor300.advancedtools.items.tools.redstone;

import net.minecraft.item.ItemAxe;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class RedstoneAxe extends ItemAxe {

	public RedstoneAxe(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("RedstoneAxe");
		this.setTextureName("advancedtools:redstoneaxe");
	}
}
