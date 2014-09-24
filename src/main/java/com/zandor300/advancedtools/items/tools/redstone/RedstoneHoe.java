package com.zandor300.advancedtools.items.tools.redstone;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;
import net.minecraft.item.ItemHoe;

public class RedstoneHoe extends ItemHoe {

	public RedstoneHoe(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("RedstoneHoe");
		this.setTextureName("advancedtools:redstonehoe");
	}
}
