package com.github.gtmega.baublesbatpacks.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import ic2.api.item.ElectricItem;
import ic2.api.item.IElectricItem;
import ic2.api.item.IElectricItemManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public interface IBatPackBaubles extends IBauble {

    double getMaxTransfer(ItemStack stack);

    int getTier();

    @Override
    default void onWornTick(ItemStack batPack, EntityLivingBase player) {
        if (player instanceof EntityPlayerMP) {
            double transfer = getMaxChargeEnergy(batPack);
            double used = 0;
            EntityPlayerMP mpPlayer = (EntityPlayerMP) player;
            ItemStack heldItem = mpPlayer.inventory.mainInventory[mpPlayer.inventory.currentItem];
            if (heldItem != null) {
                used += chargeItem(heldItem,transfer-used);
            }
            for (ItemStack stack : mpPlayer.inventory.armorInventory) {
                if (stack != null) {
                    used += chargeItem(stack,transfer-used);
                }
            }
            discharge(batPack,used);
        }
    }

    default double chargeItem(ItemStack toCharge,double maxTransfer) {
        Item item = toCharge.getItem();
        if (item instanceof IBatPackBaubles) return 0;
        if (item instanceof IElectricItemManager) {
            return  ((IElectricItemManager) item).charge(toCharge,maxTransfer,getTier(),false,false);
        } else if (item instanceof IElectricItem) {
            return ElectricItem.manager.charge(toCharge,maxTransfer,getTier(),false,false);
        }
        return 0;
    }

    default void discharge(ItemStack batPack, double amount) {
        ElectricItem.manager.discharge(batPack,amount,getTier(),false,false,false);
    }

    default double getMaxChargeEnergy(ItemStack stack) {
        return ElectricItem.manager.discharge(stack,getMaxTransfer(stack),getTier(),false,false,true);
    }

    @Override
    default BaubleType getBaubleType(ItemStack itemstack) {
        return BaubleType.BELT;
    }

    @Override
    default void onEquipped(ItemStack itemstack, EntityLivingBase player) {

    }

    @Override
    default void onUnequipped(ItemStack itemstack, EntityLivingBase player) {

    }

    @Override
    default boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
        return true;
    }

    @Override
    default boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
        return true;
    }
}
