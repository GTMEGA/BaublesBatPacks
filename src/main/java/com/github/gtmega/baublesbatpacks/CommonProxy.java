package com.github.gtmega.baublesbatpacks;

import baubles.api.expanded.BaubleExpandedSlots;
import com.github.gtmega.baublesbatpacks.items.Items;

import net.minecraftforge.common.ForgeModContainer;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.*;

public class CommonProxy {

    // preInit "Run before anything else. Read your config, create blocks, items,
    // etc, and register them with the GameRegistry."
    public void preInit(FMLPreInitializationEvent event) {
        Config.synchronizeConfiguration(event.getSuggestedConfigurationFile());

        BaublesBatPacks.info(Config.greeting);
        BaublesBatPacks.info(String.format("I am %s at version %s and group name %s",
                                           Tags.MODNAME,
                                           Tags.VERSION,
                                           Tags.GROUPNAME));

//        BaubleExpandedSlots.tryRegisterType("batpack-producer");
//        BaubleExpandedSlots.tryAssignSlotOfType("batpack-producer");

        if (Loader.isModLoaded("Baubles Expanded")) {
            BaubleExpandedSlots.tryRegisterType(Constants.batpackType);
            BaubleExpandedSlots.tryAssignSlotOfType(Constants.batpackType);
        }

        Items.init();
    }

    // load "Do your mod setup. Build whatever data structures you care about. Register recipes."
    public void init(FMLInitializationEvent event) {

    }

    // postInit "Handle interaction with other mods, complete your setup based on this."
    public void postInit(FMLPostInitializationEvent event) {

    }

    public void serverAboutToStart(FMLServerAboutToStartEvent event) {

    }

    // register server commands in this event handler
    public void serverStarting(FMLServerStartingEvent event) {

    }

    public void serverStarted(FMLServerStartedEvent event) {

    }

    public void serverStopping(FMLServerStoppingEvent event) {

    }

    public void serverStopped(FMLServerStoppedEvent event) {

    }
}