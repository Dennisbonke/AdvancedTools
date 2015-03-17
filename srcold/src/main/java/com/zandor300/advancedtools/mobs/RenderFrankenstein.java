package com.zandor300.advancedtools.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderFrankenstein extends RenderLiving {

	private static final ResourceLocation Frankenstein = new ResourceLocation(
			"advancedtools:textures/mobs/frankenstein.png");

	public RenderFrankenstein(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return Frankenstein;
	}
}
