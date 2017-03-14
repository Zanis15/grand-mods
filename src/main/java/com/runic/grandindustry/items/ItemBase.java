package com.runic.grandindustry.items;

import com.runic.grandindustry.grandindustry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * This file was born into existence by our overlord RunicEnergy on 13Mar2017 at 22:06.
 */
public class ItemBase extends Item{

    protected String name;

    public ItemBase(String name){
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel(){
        grandindustry.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab){
        super.setCreativeTab(tab);
        return this;
    }
}
