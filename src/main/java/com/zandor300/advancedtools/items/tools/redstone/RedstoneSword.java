package com.zandor300.advancedtools.items.tools.redstone;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;
import net.minecraft.item.ItemSword;

public class RedstoneSword extends ItemSword {

	public RedstoneSword(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("RedstoneSword");
		this.setTextureName("advancedtools:redstonesword");
	}
}
