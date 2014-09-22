package com.zandor300.advancedtools.items.food;

import net.minecraft.item.ItemFood;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class Strawberry extends ItemFood {

	public Strawberry(int id, int heal, boolean b) {
		super(id, b);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("Strawberry");
		this.setTextureName("advancedtools:strawberry");
	}
}
