package com.zandor300.advancedtools.items.tools.ingot;

import com.zandor300.advancedtools.init.ModItems;
import com.zandor300.advancedtools.items.genericitems.ItemAT;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class EnderionIngot extends ItemAT{
    public EnderionIngot(int id) {
        this.setUnlocalizedName("BoneIngot");
        //OreDictionary.registerOre("ingotEnderion", new ItemStack(ModItems.boneIngot));
    }
}
