package com.zandor300.advancedtools.blocks.crops;

import javax.swing.Icon;

import net.minecraft.block.BlockCrops;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class StrawberryCrop extends BlockCrops {

	@SideOnly(Side.CLIENT)
	private Icon[] iconArray;

	public StrawberryCrop(int i) {
		super();
		this.setBlockName("StrawberryCrop");
	}

	// @SideOnly(Side.CLIENT)
	// public void registerIcons(IconRegister iconRegister) {
	// this.iconArray = new Icon[4];
	// for (int i = 0; i < this.iconArray.length; i++)
	// this.iconArray[i] = iconRegister.registerIcons(RefStrings.MODID
	// + ":tomato_" + i);
	// }
}
