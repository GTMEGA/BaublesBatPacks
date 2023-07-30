package com.github.gtmega.baublesbatpacks.items;

import com.github.gtmega.baublesbatpacks.interfaces.IBatPackBaubles;
import cpw.mods.fml.common.registry.GameRegistry;
import gravisuite.lappacks.ItemUltimateLappack;
import net.minecraft.item.ItemStack;

public class UltimateLapPack extends ItemUltimateLappack implements IBatPackBaubles {
    public UltimateLapPack(int maxCharge, int tier, int transferLimit) {
        super(ArmorMaterial.DIAMOND, 0, 1, maxCharge, tier, transferLimit);
        setUnlocalizedName("ultLappack");
        GameRegistry.registerItem(this, getUnlocalizedName());
    }

    @Override
    public double getMaxTransfer(ItemStack stack) {
        return getTransferLimit(null);
    }

    @Override
    public int getTier() {
        return getTier(null);
    }
}
