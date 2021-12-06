package com.github.gtmega.baublesbatpacks.items;

import com.github.gtmega.baublesbatpacks.interfaces.IBatPackBaubles;
import ic2.core.init.InternalName;
import ic2.core.item.armor.ItemArmorElectric;
import net.minecraft.item.ItemStack;

public class BatPack extends ItemArmorElectric implements IBatPackBaubles {

    public BatPack(InternalName internalName, double maxCharge, int tier, double transferLimit) {
        super(internalName, InternalName.batpack,1,maxCharge,transferLimit,tier);
    }

    public boolean canProvideEnergy(ItemStack itemStack) {
        return true;
    }

    public double getDamageAbsorptionRatio() {
        return 0.0D;
    }

    public int getEnergyPerDamage() {
        return 0;
    }

    @Override
    public double getMaxTransfer(ItemStack stack) {
        return getTransferLimit(stack);
    }

    @Override
    public int getTier() {
        return this.tier;
    }

}
