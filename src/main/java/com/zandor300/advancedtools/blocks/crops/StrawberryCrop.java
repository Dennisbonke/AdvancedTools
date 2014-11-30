package com.zandor300.advancedtools.blocks.crops;

import javax.swing.Icon;

import com.zandor300.advancedtools.reference.Reference;
import net.minecraft.block.BlockCrops;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;

public class StrawberryCrop extends BlockCrops {

	@SideOnly(Side.CLIENT)
	private Icon[] iconArray;

	public StrawberryCrop(int i) {
		super();
		this.setBlockName("StrawberryCrop");
	}

	 //@SideOnly(Side.CLIENT)
	 //public void registerIcons(IIconRegister iconRegister) {
	 //this.iconArray = new Icon[4];
	 //for (int i = 0; i < this.iconArray.length; i++)
	//	 this.iconArray[i] = (Icon) iconRegister.registerIcon(Reference.MOD_ID
	//			 + ":tomato_" + i);
	 //}
}
