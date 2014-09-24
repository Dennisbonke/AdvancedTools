package com.zandor300.advancedtools.items.tools.redstone;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;
import net.minecraft.item.ItemPickaxe;

public class RedstonePickaxe extends ItemPickaxe {

	public RedstonePickaxe(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("RedstonePickaxe");
		this.setTextureName("advancedtools:redstonepickaxe");
	}
}
