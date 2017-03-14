package com.runic.grandindustry.proxies;

import com.runic.grandindustry.data.modStrings;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * This file was born into existence by our overlord RunicEnergy on 13Mar2017 at 21:43.
 */
public class ClientProxy extends CommonProxy{
    @Override
    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(modStrings.MODID + ":" + id, "inventory"));
    }
}
