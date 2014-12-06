package com.zandor300.advancedtools.plugins;

import com.dennisbonke.dblib.pulsar.pulse.Handler;
import com.dennisbonke.dblib.pulsar.pulse.Pulse;
import com.dennisbonke.dblib.util.LogHelper;
import com.zandor300.advancedtools.reference.Reference;
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