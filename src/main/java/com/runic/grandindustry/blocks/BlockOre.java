package com.runic.grandindustry.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * This file was born into existence by our overlord RunicEnergy on 13Mar2017 at 22:51.
 */
public class BlockOre extends BlockBase{

    public BlockOre(String name){
        super(Material.ROCK, name);
        setHardness(3f);
        setResistance(5f);
    }

    @Override
    public BlockOre setCreativeTab(CreativeTabs tab){
        super.setCreativeTab(tab);
        return this;
    }
}
