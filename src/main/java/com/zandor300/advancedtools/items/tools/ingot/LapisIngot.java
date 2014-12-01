package com.zandor300.advancedtools.items.tools.ingot;

import com.zandor300.advancedtools.init.ModItems;
import com.zandor300.advancedtools.items.genericitems.ItemAT;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Zandor300 on 1-12-2014.
 */
public class LapisIngot extends ItemAT{

    public LapisIngot(int id) {
        this.setUnlocalizedName("LapisIngot");
        OreDictionary.registerOre("ingotLapis", new ItemStack(ModItems.lapisIngot));
    }
}
