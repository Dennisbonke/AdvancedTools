package com.zandor300.advancedtools.items.tools.bone;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;
import net.minecraft.item.ItemPickaxe;

public class BonePickaxe extends ItemPickaxe {

	public BonePickaxe(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("BonePickaxe");
		this.setTextureName("advancedtools:bonepickaxe");
	}
}
