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
        batpackBaubleT1 = new BatPackBauble("batpackBaubleT1",
                                            120_000D,
                                            1,
                                            200D);
        GameRegistry.registerItem(batpackBaubleT1, batpackBaubleT1.getUnlocalizedName());

        batpackBaubleT2 = new BatPackBauble("batpackBaubleT2",
                                            1_200_000D,
                                            2,
                                            2_000D);
        GameRegistry.registerItem(batpackBaubleT2, batpackBaubleT2.getUnlocalizedName());

        batpackBaubleT3 = new BatPackBauble("batpackBaubleT3",
                                            4_000_000D,
                                            3,
                                            8_000D);
        GameRegistry.registerItem(batpackBaubleT3, batpackBaubleT3.getUnlocalizedName());

        batpackBaubleT4 = new BatPackBauble("batpackBaubleT4",
                                            6_000_00D,
                                            4,
                                            100_000D);
        GameRegistry.registerItem(batpackBaubleT4, batpackBaubleT4.getUnlocalizedName());

        batpackBaubleT5 = new BatPackBauble("batpackBaubleT5",
                                            60_000_000D,
                                            5,
                                            500_000D);
        GameRegistry.registerItem(batpackBaubleT5, batpackBaubleT5.getUnlocalizedName());

        batpackBaubleT6 = new BatPackBauble("batpackBaubleT6",
                                            600_000_000D,
                                            6,
                                            6_000_000);
        GameRegistry.registerItem(batpackBaubleT6, batpackBaubleT6.getUnlocalizedName());
    }
}
