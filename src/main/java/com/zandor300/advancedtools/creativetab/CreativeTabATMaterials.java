package com.zandor300.advancedtools.creativetab;

import com.zandor300.advancedtools.init.always.ModItems;
import com.zandor300.advancedtools.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabATMaterials {
    public static final CreativeTabs tab = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.enderionIngot;
        }

        @Override
        public String getTranslatedTabLabel() {
            return "Advanced Tools:Materials";
        }
    };
}