package com.github.gtmega.baublesbatpacks.items;

import com.github.gtmega.baublesbatpacks.Tags;
import com.github.gtmega.baublesbatpacks.interfaces.IBatPackBaubles;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BatPackBauble extends Item implements IBatPackBaubles {
    protected int tier;
    protected double maxCharge;
    protected double transferLimit;

    private IIcon icon;

    public BatPackBauble(String unlocalizedName, double maxCharge, int tier, double transferLimit) {
        this.setUnlocalizedName(unlocalizedName);
        this.maxCharge = maxCharge;
        this.tier = tier;
        this.transferLimit = transferLimit;
        this.setMaxStackSize(1);
    }

    @Override
    public void registerIcons(IIconRegister registry) {
        this.icon = registry.registerIcon(Tags.MODID + ":baubleBatpack_t" + this.tier);
    }

    @Override
    public IIcon getIconFromDamage(int meta) {
        return this.icon;
    }

    public boolean canProvideEnergy(ItemStack itemStack) {
        return true;
    }

    @Override
    public Item getChargedItem(ItemStack itemStack) {
        return this;
    }

    @Override
    public Item getEmptyItem(ItemStack itemStack) {
        return this;
    }

    @Override
    public int getTier(ItemStack itemStack) {
        return this.tier;
    }

    @Override
    public double getMaxCharge(ItemStack itemStack) {
        return this.maxCharge;
    }

    @Override
    public double getTransferLimit(ItemStack itemStack) {
        return this.transferLimit;
    }
}
