package com.github.gtmega.baublesbatpacks.items;

import ic2.core.init.InternalName;
import net.minecraft.item.ItemStack;

public class Items {

    enum Item {
        BatPack,
        AdvPack,
        EnergyPack,
        LapPack;
        public ItemStack stack;
    }



    public static void init() {
        registerBatPack(Item.BatPack,InternalName.itemArmorBatpack,60000D,1,100D);
        registerBatPack(Item.AdvPack,InternalName.itemArmorAdvBatpack,600000D,2,1000D);
        registerBatPack(Item.EnergyPack,InternalName.itemArmorEnergypack,2000000D,3,4000D);
        registerBatPack(Item.LapPack,InternalName.itemArmorLappack,20000000D,4,40000D);
    }

    public static void registerBatPack(Item item,InternalName name,double capacity, int tier, double dischargeRate) {
        item.stack = new ItemStack(new BatPack(name,capacity,tier,dischargeRate));
    }
}
