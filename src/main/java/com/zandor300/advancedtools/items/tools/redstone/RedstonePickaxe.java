package com.zandor300.advancedtools.items.tools.redstone;

import net.minecraft.item.ItemPickaxe;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class RedstonePickaxe extends ItemPickaxe {

	public RedstonePickaxe(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("RedstonePickaxe");
		this.setTextureName("advancedtools:redstonepickaxe");
	}
}
