package com.github.gtmega.baublesbatpacks;

import codechicken.nei.api.API;
import com.github.gtmega.baublesbatpacks.items.Items;

import cpw.mods.fml.common.event.*;

import gregtech.api.util.GT_ModHandler;

import net.minecraft.item.ItemStack;

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

        Items.init();
    }

    // load "Do your mod setup. Build whatever data structures you care about. Register recipes."
    public void init(FMLInitializationEvent event) {

    }

    // postInit "Handle interaction with other mods, complete your setup based on this."
    public void postInit(FMLPostInitializationEvent event) {
        ItemStack stack = GT_ModHandler.getModItem("IC2", "itemArmorAdvBatpack", 1);
        API.hideItem(stack);
        recipes.load();
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