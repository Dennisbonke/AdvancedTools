package com.zandor300.advancedtools.items.tools.ingot;

import com.zandor300.advancedtools.init.ModItems;
import com.zandor300.advancedtools.items.genericitems.ItemAT;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RedstoneIngot extends ItemAT {

	public RedstoneIngot(int id) {
		this.setUnlocalizedName("RedstoneIngot");
		OreDictionary.registerOre("ingotRedstone", new ItemStack(ModItems.redstoneIngot));
	}
}
