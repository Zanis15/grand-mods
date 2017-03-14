package com.runic.grandindustry.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This file was born into existence by our overlord RunicEnergy on 13Mar2017 at 22:07.
 */
public class ModItems {

    public static ItemBase ingotCopper;

    public static void init(){
        ingotCopper = register(new ItemBase("ingotCopper").setCreativeTab(CreativeTabs.MATERIALS));
    }

    private static <T extends Item> T register(T item){
        GameRegistry.register(item);

        if(item instanceof ItemBase){
            ((ItemBase)item).registerItemModel();
        }

        return item;
    }
}