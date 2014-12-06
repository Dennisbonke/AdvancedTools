package com.zandor300.advancedtools.plugins;

import com.dennisbonke.dblib.pulsar.pulse.Handler;
import com.dennisbonke.dblib.pulsar.pulse.Pulse;
import com.dennisbonke.dblib.util.LogHelper;
import com.zandor300.advancedtools.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

// bugfix

@GameRegistry.ObjectHolder(Reference.MOD_ID)
@Pulse(id = "Advanced Tools TE4 Compatibility ", description = "Advanced Tools compatibility for Thermal Expansion", modsRequired = "ThermalExpansion", forced = true)
public class ATTE4
{
    @Handler
    public void init ()
    {
        LogHelper.info("Thermal Expansion detected. Stay Tuned!");
    }
}