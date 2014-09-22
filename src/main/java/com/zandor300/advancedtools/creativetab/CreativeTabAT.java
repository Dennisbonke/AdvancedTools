package com.zandor300.advancedtools.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.zandor300.advancedtools.AdvancedTools;
import com.zandor300.advancedtools.lib.RefStrings;

public class CreativeTabAT {

	public static final CreativeTabs tab = new CreativeTabs(RefStrings.MODID) {
		@Override
		public Item getTabIconItem() {
			return AdvancedTools.emeraldSword;
		}

		@Override
		public String getTranslatedTabLabel() {
			return RefStrings.NAME;
		}
	};
}
