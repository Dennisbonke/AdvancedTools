package com.zandor300.advancedtools.blocks;

import com.zandor300.advancedtools.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.zandor300.advancedtools.creativetab.CreativeTabAT;

public class CreateBlock extends Block {

	public CreateBlock(String name, String texture, int id, Material material,
			CreativeTabs tab, float hardness, float resistance, float lightlevel) {
		super(material);
		this.setCreativeTab(CreativeTabAT.tab);
		this.setStepSound(soundTypeWood);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(lightlevel);
		this.setBlockName(name);
		this.setBlockTextureName(Reference.MOD_ID + ":" + texture);
	}
}