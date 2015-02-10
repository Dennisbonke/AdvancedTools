package com.zandor300.advancedtools;

import com.zandor300.advancedtools.common.CommonProxy;
import com.zandor300.advancedtools.core.ATProps;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Dennisbonke on 10-2-2015.
 */
@Mod(name = ATProps.name, modid = ATProps.modid, version = ATProps.version)
public class AdvancedTools {

    @Instance(ATProps.modid)
    public static AdvancedTools instance;
    @SidedProxy(clientSide = ATProps.clientproxy, serverSide = ATProps.commonproxy)
    public static CommonProxy proxy;
    public static Logger log = LogManager.getLogger(ATProps.modid);

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public static void Init(FMLInitializationEvent event){

    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event){

    }

}
