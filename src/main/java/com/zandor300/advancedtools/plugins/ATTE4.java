package com.zandor300.advancedtools.plugins;

import com.zandor300.advancedtools.pulsar.pulse.Handler;
import com.zandor300.advancedtools.pulsar.pulse.Pulse;
import com.zandor300.advancedtools.reference.Reference;
import com.zandor300.advancedtools.utilities.LogHelper;
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