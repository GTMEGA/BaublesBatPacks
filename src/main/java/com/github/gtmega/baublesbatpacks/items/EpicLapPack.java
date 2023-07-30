package com.github.gtmega.baublesbatpacks.items;

import com.github.gtmega.baublesbatpacks.interfaces.IBatPackBaubles;
import cpw.mods.fml.common.registry.GameRegistry;
import gravisuite.lappacks.ItemEpicLappack;
import net.minecraft.item.ItemStack;

public class EpicLapPack extends ItemEpicLappack implements IBatPackBaubles {
    public EpicLapPack(int maxCharge, int tier, int transferLimit) {
        super(ArmorMaterial.DIAMOND, 0, 1, maxCharge, tier, transferLimit);
        setUnlocalizedName("epiclappack");
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
