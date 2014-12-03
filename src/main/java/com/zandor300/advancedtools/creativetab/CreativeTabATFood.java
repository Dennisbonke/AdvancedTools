package com.zandor300.advancedtools.creativetab;

import com.zandor300.advancedtools.init.ModItems;
import com.zandor300.advancedtools.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Deprecated
public class CreativeTabATFood {
    public static final CreativeTabs tab = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.Strawberry;
        }

        @Override
        public String getTranslatedTabLabel() {
            return "Advanced Tools:Food";
        }
    };
}
