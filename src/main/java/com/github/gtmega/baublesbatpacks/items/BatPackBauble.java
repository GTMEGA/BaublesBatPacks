package com.github.gtmega.baublesbatpacks.items;

import com.github.gtmega.baublesbatpacks.Tags;
import com.github.gtmega.baublesbatpacks.interfaces.IBatPackBauble;
import ic2.api.item.ElectricItem;
import lombok.val;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;

import java.util.List;

public class BatPackBauble extends Item implements IBatPackBauble {
    protected int tier;
    protected double maxCharge;
    protected double transferLimit;

    private IIcon icon;

    @Override
    public boolean showDurabilityBar(ItemStack stack) {
        return true;
    }

    public BatPackBauble(double maxCharge, int tier, double transferLimit) {
        this.setUnlocalizedName("batpackBauble.t" + tier);
        this.maxCharge = maxCharge;
        this.tier = tier;
        this.transferLimit = transferLimit;
        this.setMaxStackSize(1);
    }

    @Override
    public double getDurabilityForDisplay(ItemStack stack) {
        return 1D-(ElectricItem.manager.getCharge(stack) / maxCharge);
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

    @Override
    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack itemStack, EntityPlayer player, List info, boolean b) {
        String baseUnlocalized = String.format("item.batpackBauble.t%d.desc.", this.getTier(itemStack));

        int index = 0;
        String localized = StatCollector.translateToLocal(baseUnlocalized + index);
        while(!localized.contains(baseUnlocalized)) {
            info.add(localized);

            localized = StatCollector.translateToLocal(baseUnlocalized + ++index);
        }
    }
}
