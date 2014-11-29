package com.zandor300.advancedtools.items.tools.redstone;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;
import net.minecraft.item.ItemSpade;

public class RedstoneShovel extends ItemSpade {

	public RedstoneShovel(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("RedstoneShovel");
		this.setTextureName("advancedtools:redstoneshovel");
	}
}

