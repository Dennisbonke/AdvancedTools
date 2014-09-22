package com.zandor300.advancedtools.creativetab;

import com.zandor300.advancedtools.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.zandor300.advancedtools.AdvancedTools;

public class CreativeTabAT {

	public static final CreativeTabs tab = new CreativeTabs(Reference.MOD_ID) {
		@Override
		public Item getTabIconItem() {
			return AdvancedTools.emeraldSword;
		}

		@Override
		public String getTranslatedTabLabel() {
			return Reference.MOD_NAME;
		}
	};
}
