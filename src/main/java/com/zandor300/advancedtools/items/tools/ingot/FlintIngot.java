package com.zandor300.advancedtools.items.tools.ingot;

import com.zandor300.advancedtools.init.ModItems;
import com.zandor300.advancedtools.items.genericitems.ItemAT;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Zandor on 2-12-2014.
 */
public class FlintIngot extends ItemAT {

    public FlintIngot(int id) {
        this.setUnlocalizedName("FlintIngot");
        OreDictionary.registerOre("ingotFlint", new ItemStack(ModItems.flintIngot));
    }
}
