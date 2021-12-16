package com.github.gtmega.baublesbatpacks.items;

import ic2.core.init.InternalName;
import net.minecraft.item.ItemStack;

public class Items {

    public enum Item {
        BatPack,
        AdvPack,
        EnergyPack,
        LapPack,
        AdvancedLapPack,
        UltimateLapPack,
        EpicLapPack;
        public ItemStack stack;
    }



    public static void init() {
        registerBatPack(Item.BatPack,InternalName.itemArmorBatpack,120_000D,1,200D);
        registerBatPack(Item.AdvPack,InternalName.itemArmorAdvBatpack,1_200_000D,2,2_000D);
        registerBatPack(Item.EnergyPack,InternalName.itemArmorEnergypack,4_000_000D,3,8_000D);
        //registerBatPack(Item.LapPack,InternalName.itemArmorLappack,20000000D,4,80_000D);
        Item.AdvancedLapPack.stack = new ItemStack(new AdvancedLapPack(6_000_000,3,1000_000));
        Item.UltimateLapPack.stack = new ItemStack(new UltimateLapPack(60_000_000,4,600_000));
        Item.EpicLapPack.stack = new ItemStack(new EpicLapPack(600_000_000,5,6_000_000));
    }

    public static void registerBatPack(Item item,InternalName name,double capacity, int tier, double dischargeRate) {
        item.stack = new ItemStack(new BatPack(name,capacity,tier,dischargeRate));
    }
}
