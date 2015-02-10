package com.zandor300.advancedtools.common.creativetabs;

import com.zandor300.advancedtools.core.ATProps;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Dennisbonke on 10-2-2015.
 */
public class CreativeTabATMaterials {

    public static final CreativeTabs ATMaterials_tab = new CreativeTabs(ATProps.modid) {

        @Override
        public Item getTabIconItem() {
            return Items.gold_ingot;
        }

        @Override
        public String getTranslatedTabLabel() {
            return "Advanced Tools:Materials";
        }

    };

}
