package com.zandor300.advancedtools.items.tools.emerald;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;
import net.minecraft.item.ItemAxe;

public class EmeraldAxe extends ItemAxe {

	public EmeraldAxe(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("EmeraldAxe");
		this.setTextureName("advancedtools:emeraldaxe");
	}
}
