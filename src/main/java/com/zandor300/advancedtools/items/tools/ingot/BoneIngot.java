package com.zandor300.advancedtools.items.tools.ingot;

import com.zandor300.advancedtools.init.ModItems;
import com.zandor300.advancedtools.items.genericitems.ItemAT;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class BoneIngot extends ItemAT {

	public BoneIngot(int id) {
		this.setUnlocalizedName("BoneIngot");
		OreDictionary.registerOre("ingotBone", new ItemStack(ModItems.boneIngot));
	}
}
