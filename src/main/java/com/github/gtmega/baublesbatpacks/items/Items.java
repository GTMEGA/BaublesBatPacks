package com.github.gtmega.baublesbatpacks.items;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items {
    public static Item batpackBaubleT1;
    public static Item batpackBaubleT2;
    public static Item batpackBaubleT3;
    public static Item batpackBaubleT4;
    public static Item batpackBaubleT5;
    public static Item batpackBaubleT6;

    public static void init() {
        batpackBaubleT1 = new BatPackBauble(120_000D,
                                            1,
                                            200D);
        GameRegistry.registerItem(batpackBaubleT1, batpackBaubleT1.getUnlocalizedName());

        batpackBaubleT2 = new BatPackBauble(1_200_000D,
                                            2,
                                            2_000D);
        GameRegistry.registerItem(batpackBaubleT2, batpackBaubleT2.getUnlocalizedName());

        batpackBaubleT4 = new BatPackBauble(6_000_000D,
                                            3,
                                            100_000D);
        GameRegistry.registerItem(batpackBaubleT4, batpackBaubleT4.getUnlocalizedName());

        batpackBaubleT5 = new BatPackBauble(60_000_000D,
                                            4,
                                            500_000D);
        GameRegistry.registerItem(batpackBaubleT5, batpackBaubleT5.getUnlocalizedName());

        batpackBaubleT6 = new BatPackBauble(600_000_000D,
                                            5,
                                            6_000_000);
        GameRegistry.registerItem(batpackBaubleT6, batpackBaubleT6.getUnlocalizedName());
    }
}
