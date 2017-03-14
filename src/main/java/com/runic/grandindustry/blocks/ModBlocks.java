package com.runic.grandindustry.blocks;

import com.runic.grandindustry.data.blockStrings;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This file was born into existence by our overlord RunicEnergy on 13Mar2017 at 22:42.
 */
public class ModBlocks {

    public static BlockOre oreCopper;
    public static BlockOre oreTin;
    public static BlockOre oreSilver;

    public static void init(){
        oreCopper = register(new BlockOre(blockStrings.nOreCopper).setCreativeTab(CreativeTabs.MATERIALS));
        oreTin = register(new BlockOre(blockStrings.nOreTin).setCreativeTab(CreativeTabs.MATERIALS));
        oreSilver = register(new BlockOre(blockStrings.nOreSilver).setCreativeTab(CreativeTabs.MATERIALS));
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock){
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if(block instanceof BlockBase){
            ((BlockBase)block).registerItemModel(itemBlock);
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
