package com.advancedmods.advancedtools.core;

import com.advancedmods.amcore.core.AMCoreProps;

/**
 * Created by Dennisbonke on 17-3-2015.
 */
public class ATProps {

    // Versioning
    public static final String REQUIRED_MC_VERSION = "1.7.10";
    public static final String VERSION_COMPLETE = "1.7.10R0.1.0A1";
    public static final String FORGE_BASE = "10.13.2.";
    public static final String FORGE_BUILD = "1240";
    public static final String FORGE_VERSION = "[" + FORGE_BASE + FORGE_BUILD + "]";
    public static final String AMCORE_VERSION = "[" + AMCoreProps.version + "]";

    // General Mod stuff
    public static final String name = "Advanced Tools";
    public static final String modid = "AdvancedTools";
    public static final String version = VERSION_COMPLETE;
    public static final String dependencies = "required-after:Forge@" + FORGE_VERSION + ";" + "required-after:AMCore@" + AMCORE_VERSION;
    //public static final String commonproxy = "com.advancedmods.advancedtools.common.CommonProxy";
    //public static final String clientproxy = "com.advancedmods.advancedtools.client.ClientProxy";

}
