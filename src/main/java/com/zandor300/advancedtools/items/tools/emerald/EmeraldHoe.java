package com.zandor300.advancedtools.items.tools.emerald;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;
import net.minecraft.item.ItemHoe;

public class EmeraldHoe extends ItemHoe {

	public EmeraldHoe(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("EmeraldHoe");
		this.setTextureName("advancedtools:emeraldhoe");
	}
}
