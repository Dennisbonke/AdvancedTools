package com.advancedmods.advancedtools;

import com.advancedmods.advancedtools.common.generic.CreativeTabATCombat;
import com.advancedmods.advancedtools.common.generic.CreativeTabATMaterials;
import com.advancedmods.advancedtools.common.generic.CreativeTabATTools;
import com.advancedmods.advancedtools.core.ATProps;
import com.advancedmods.amcore.core.mod.BaseMod;
import com.advancedmods.amcore.core.mod.updater.UpdateManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Dennisbonke on 17-3-2015.
 */
@Mod(modid = ATProps.modid, name = ATProps.name, version = ATProps.version, acceptedMinecraftVersions = ATProps.MC_VERSION, dependencies = ATProps.dependencies, canBeDeactivated = false, modLanguage = "java")
public class AdvancedTools extends BaseMod {

    @Instance(ATProps.modid)
    public static AdvancedTools instance;
    public static Logger log = LogManager.getLogger(ATProps.modid);
    public static final String updateURL = "https://raw.github.com/AdvancedMods/AdvancedTools/master/VERSION";
    // Creative Tabs
    public static final CreativeTabs tabCombat = new CreativeTabATCombat("Combat");
    public static final CreativeTabs tabMaterials = new CreativeTabATMaterials("Materials");
    public static final CreativeTabs tabTools = new CreativeTabATTools("Tools");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        log.info("Starting Advanced Tools version: " + ATProps.version + "...");
        log.info("Entering Pre-Init...");
        log.info("Starting Update Checker for Advanced Tools...");
        UpdateManager.registerUpdater(new UpdateManager(this, updateURL, null));
        log.info("Update Checker for Advanced Tools started");
        log.info("Pre-Init Finished");

    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {

        log.info("Entering Init...");
        log.info("Init Finished");
        log.info("Mod loaded");

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        log.info("Entering Post-Init...");
        log.info("Post-Init Finished");

    }

    public String getModId() {
        return ATProps.modid;
    }

    public String getModName() {
        return ATProps.name;
    }

    public String getModVersion() {
        return ATProps.version;
    }

}
