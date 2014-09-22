package com.zandor300.advancedtools.items.food;

import net.minecraft.item.ItemFood;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class LuckyStar extends ItemFood {

	public LuckyStar(int id, int heal, boolean b) {
		super(id, b);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("LuckyStar");
		this.setTextureName("advancedtools:luckystar");
	}
}
