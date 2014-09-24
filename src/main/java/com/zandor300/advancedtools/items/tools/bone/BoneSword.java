package com.zandor300.advancedtools.items.tools.bone;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;
import net.minecraft.item.ItemSword;

public class BoneSword extends ItemSword {

	public BoneSword(int id, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setUnlocalizedName("BoneSword");
		this.setTextureName("advancedtools:bonesword");
	}
}
