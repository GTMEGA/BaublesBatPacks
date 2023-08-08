package com.github.gtmega.baublesbatpacks.mixin.mixins.common.ic2;

import baubles.common.lib.PlayerHandler;
import com.github.gtmega.baublesbatpacks.interfaces.IBatPackBauble;
import ic2.core.block.wiring.TileEntityChargepadBatBox;
import ic2.core.block.wiring.TileEntityChargepadBlock;
import ic2.core.block.wiring.TileEntityChargepadCESU;
import ic2.core.block.wiring.TileEntityChargepadMFE;
import ic2.core.block.wiring.TileEntityChargepadMFSU;
import lombok.val;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.entity.player.EntityPlayer;

@Mixin(value = { TileEntityChargepadBatBox.class,
                 TileEntityChargepadCESU.class,
                 TileEntityChargepadMFE.class,
                 TileEntityChargepadMFSU.class })
public abstract class ChargePadMixin extends TileEntityChargepadBlock {
    public ChargePadMixin(int tier, int output, int maxStorage) {
        super(tier, output, maxStorage);
    }

    @Inject(method = "getItems",
            at = @At("RETURN"),
            remap = false,
            require = 1)
    private void injectBaublesCharge(EntityPlayer player, CallbackInfo ci) {
        val baubles = PlayerHandler.getPlayerBaubles(player);

        for (val bauble : baubles.stackList) {
            if (bauble != null && bauble.getItem() instanceof IBatPackBauble) {
                this.chargeitems(bauble, this.getOutput());
                baubles.markDirty();
            }
        }
    }
}
