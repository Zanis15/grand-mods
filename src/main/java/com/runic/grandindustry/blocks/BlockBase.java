package com.runic.grandindustry.blocks;

import com.runic.grandindustry.grandindustry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

/**
 * This file was born into existence by our overlord RunicEnergy on 13Mar2017 at 22:42.
 */
public class BlockBase extends Block{

    protected String name;

    public BlockBase(Material material, String name){
        super(material);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel(ItemBlock itemBlock){
        grandindustry.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab){
        super.setCreativeTab(tab);
        return this;
    }
}
