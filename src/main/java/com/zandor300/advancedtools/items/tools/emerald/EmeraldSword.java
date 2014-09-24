package com.zandor300.advancedtools.items.tools.emerald;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;
import net.minecraft.item.ItemSword;

public class EmeraldSword extends ItemSword {

	public EmeraldSword(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("EmeraldSword");
		this.setTextureName("advancedtools:emeraldsword");
	}
}
