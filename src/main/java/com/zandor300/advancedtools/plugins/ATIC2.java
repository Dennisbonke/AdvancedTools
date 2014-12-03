package com.zandor300.advancedtools.plugins;

import com.zandor300.advancedtools.pulsar.pulse.Handler;
import com.zandor300.advancedtools.pulsar.pulse.Pulse;
import com.zandor300.advancedtools.reference.Reference;
import com.zandor300.advancedtools.utilities.LogHelper;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

// bugfix

@GameRegistry.ObjectHolder(Reference.MOD_ID)
@Pulse(id = "Advanced Tools IC2 Compatibility ", description = "Advanced Tools compatibility for Industrial Craft 2", modsRequired = "ic2", forced = true)
public class ATIC2 {
    @Handler
    public void init (FMLInitializationEvent event)
    {
        LogHelper.info("IC2 detected. Preparing for shenanigans.");
    }
}