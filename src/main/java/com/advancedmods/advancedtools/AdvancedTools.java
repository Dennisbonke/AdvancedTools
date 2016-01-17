package com.advancedmods.advancedtools;

import com.advancedmods.advancedtools.common.generic.CreativeTabATCombat;
import com.advancedmods.advancedtools.common.generic.CreativeTabATMaterials;
import com.advancedmods.advancedtools.common.generic.CreativeTabATTools;
import com.advancedmods.advancedtools.core.ATProps;
import com.advancedmods.advancedtools.core.ATRegistry;
import com.advancedmods.amcore.core.environment.IMCHandler;
import com.advancedmods.amcore.core.mod.BaseMod;
import com.advancedmods.amcore.core.mod.updater.UpdateManager;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLLoadCompleteEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.MinecraftError;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Dennisbonke on 17-3-2015.
 */
@Mod(modid = ATProps.modid, name = ATProps.name, version = ATProps.version, dependencies = ATProps.dependencies, modLanguage = "java", canBeDeactivated = false, acceptedMinecraftVersions = ATProps.MC_VERSION)
public class AdvancedTools extends BaseMod {

    @Instance(ATProps.modid)
    public static AdvancedTools instance;
    public static Logger log = LogManager.getLogger(ATProps.modid);
    public static final String issueURL = "https://github.com/AdvancedMods/AdvancedTools/issues";
    public static final String updateURL = "https://raw.github.com/AdvancedMods/AdvancedTools/master/VERSION";
    public static final String downloadURL = "http://ci.zsinfo.nl/view/AdvancedMods/job/AdvancedTools/lastSuccessfulBuild";
    // Creative Tabs
    public static final CreativeTabs tabCombat = new CreativeTabATCombat("Combat");
    public static final CreativeTabs tabMaterials = new CreativeTabATMaterials("Materials");
    public static final CreativeTabs tabTools = new CreativeTabATTools("Tools");
    private static final MinecraftError error = new MinecraftError();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        // Starting mod
        log.info("Starting Advanced Tools version: " + ATProps.version + "...");
        log.info("Entering Pre-Init...");
        // Update Checker
        try {
            log.info("Starting Update Checker for Advanced Tools...");
            UpdateManager.registerUpdater(new UpdateManager(this, updateURL, downloadURL));
            log.info("Update Checker for Advanced Tools started");
        } catch (Exception e) {
            log.error("=============================ERROR!=============================");
            log.error("Failed to start the update checker, printing stacktrace...");
            log.error("Please report this as a bug report with the stacktrace, the minecraft log and a mod list + version to: " + issueURL);
            log.error("=============================ERROR!=============================");
            e.printStackTrace();
        }
        // Items and Blocks Registry
        try {
            log.info("Registering Items and Blocks...");
            ATRegistry.registerItemsAndBlocks();
            log.info("Items and Blocks registered.");
        } catch (Exception e) {
            log.fatal("=============================FATAL ERROR!=============================");
            log.fatal("Failed to register Items and Blocks, printing stacktrace...");
            log.fatal("This is a severe error, halting the game, as there is probably something wrong with a mod or the minecraft base game!");
            log.fatal("Please report this as a bug report with the stacktrace, the minecraft log and a mod list + version to: " + issueURL);
            log.fatal("=============================FATAL ERROR!=============================");
            e.printStackTrace();
            FMLCommonHandler.instance().raiseException(error, "[Advanced Tools] Failed to register Items and Blocks, halting game", true);
        }
        // Oredictionary Registry
        try {
            log.info("Registering OreDictionary...");
            ATRegistry.registerOredict();
            log.info("OreDictionary registered.");
        } catch (Exception e) {
            log.error("=============================ERROR!=============================");
            log.error("Failed to add ingots and nuggets, printing stacktrace...");
            log.error("This is a severe error, skipping the recipe registration to avoid problems!");
            log.error("Please report this as a bug report with the stacktrace, the minecraft log and a mod list + version to: " + issueURL);
            log.error("=============================ERROR!=============================");
            e.printStackTrace();
        }
        log.info("Pre-Init Finished");
    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {

        log.info("Entering Init...");
        // Recipe Registry
        try {
            log.info("Registering Recipes...");
            ATRegistry.registerRecipes();
            log.info("Recipes registered.");
        } catch (Exception e) {
            log.error("=============================ERROR!=============================");
            log.error("Failed to register recipes, printing stacktrace...");
            log.error("Please report this as a bug report with the stacktrace, the minecraft log and a mod list + version to: " + issueURL);
            log.error("=============================ERROR!=============================");
            e.printStackTrace();
        }
        log.info("Init Finished");
        log.info("Mod loaded");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        log.info("Entering Post-Init...");
        log.info("Post-Init Finished");
    }

    @EventHandler
    public void handleIMC(FMLInterModComms.IMCEvent event) {

        // IMCHandler
        try {
            log.info("Processing IMC messages...");
            IMCHandler.processIMC(event.getMessages());
            log.info("IMC Messages processed.");
        } catch (Exception e) {
            log.error("=============================ERROR!=============================");
            log.error("Failed to process IMC Messages, printing stacktrace...");
            log.error("Please report this as a bug report with the stacktrace, the minecraft log and a mod list + version to: " + issueURL);
            log.error("=============================ERROR!=============================");
            e.printStackTrace();
        }
    }

    @EventHandler
    public void loadComplete(FMLLoadCompleteEvent event) {

        // Fetching runtime messages
        try {
            log.info("Fetching runtime IMC messages...");
            IMCHandler.processIMC(FMLInterModComms.fetchRuntimeMessages(this));
            log.info("Fetched runtime IMC messages.");
        } catch (Exception e) {
            log.error("=============================ERROR!=============================");
            log.error("Failed to fetch IMC Runtime messages, printing stacktrace...");
            log.error("Please report this as a bug report with the stacktrace, the minecraft log and a mod list + version to: " + issueURL);
            log.error("=============================ERROR!=============================");
            e.printStackTrace();
        }
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
