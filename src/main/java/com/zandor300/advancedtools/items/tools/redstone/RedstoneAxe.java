package com.zandor300.advancedtools.items.tools.redstone;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;
import net.minecraft.item.ItemAxe;

public class RedstoneAxe extends ItemAxe{

	public RedstoneAxe(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("RedstoneAxe");
		this.setTextureName("advancedtools:redstoneaxe");
	}
}

