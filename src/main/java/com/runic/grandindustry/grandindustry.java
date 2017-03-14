package com.runic.grandindustry;

import com.runic.grandindustry.data.modStrings;
import com.runic.grandindustry.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * This file was born into existence by our overlord RunicEnergy on 13Mar2017 at 19:11.
 */
@Mod(modid = modStrings.MODID, version = modStrings.VERSION)
public class grandindustry {
    @Mod.Instance
    public static grandindustry instance;
    @SidedProxy(clientSide = modStrings.CLIENT_PROXY, serverSide = modStrings.SERVER_PROXY, modId = modStrings.MODID)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
