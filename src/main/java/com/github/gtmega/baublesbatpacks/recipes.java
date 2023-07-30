package com.github.gtmega.baublesbatpacks;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.objects.ItemData;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import ic2.api.item.IC2Items;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static com.github.gtmega.baublesbatpacks.items.Items.Item.*;

public class recipes {

    public static void load() {
        OrePrefixes casing = OrePrefixes.itemCasing;

        ItemStack crystal = GT_ModHandler.getModItem("IC2", "itemBatCrystal", 1, GT_Values.W);
        {
            ItemStack reBatdis = GT_ModHandler.getModItem("IC2", "itemBatREDischarged", 1, GT_Values.W);
            ItemStack reBat = GT_ModHandler.getModItem("IC2", "itemBatRE", 1, GT_Values.W);
            ItemStack circuit = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Basic, 1);
            ItemStack wire = GT_OreDictUnificator.get(OrePrefixes.wireGt02, Materials.Tin, 1);
            Object ironCase = GT_OreDictUnificator.get(casing, Materials.Iron, 1L);
            GT_ModHandler.addCraftingRecipe(BatPack.stack, new Object[]{"BCB", "BIB", "BWB",
                    'B', reBat, 'C', circuit, 'I', ironCase, 'W', wire});
            GT_ModHandler.addCraftingRecipe(BatPack.stack, new Object[]{"BCB", "BIB", "BWB",
                    'B', reBatdis, 'C', circuit, 'I', ironCase, 'W', wire});
        }
        {
            ItemStack reBat = GT_ModHandler.getModItem("IC2", "itemAdvBat", 1, GT_Values.W);
            ItemStack circuit = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 1);
            ItemStack wire = GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.Copper, 1);
            Object ironCase = GT_OreDictUnificator.get(casing, Materials.Bronze, 1L);
            GT_ModHandler.addCraftingRecipe(AdvPack.stack, new Object[]{"BCB", "BIB", "BWB",
                    'B', reBat, 'C', circuit, 'I', ironCase, 'W', wire});
        }
        {
            ItemStack circuit = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Advanced, 1);
            ItemStack wire = GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.Gold, 1);
            Object ironCase = GT_OreDictUnificator.get(casing, Materials.StainlessSteel, 1L);
            Items.feather.setDamage(EnergyPack.stack, GT_Values.W);
            GT_ModHandler.addCraftingRecipe(EnergyPack.stack, new Object[]{"CIC", "BRB", "IWI",
                    'B', crystal, 'C', circuit, 'I', ironCase, 'W', wire, 'R', AdvPack.stack});
        }
        {
            ItemStack circuit = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 1);
            ItemStack wire = GT_OreDictUnificator.get(OrePrefixes.wireGt16, Materials.NiobiumTitanium, 1);
            Object ironCase = GT_OreDictUnificator.get(casing, Materials.Chrome, 1L);
            ItemStack lap = GT_ModHandler.getModItem("IC2", "itemBatLamaCrystal", 1, GT_Values.W);
            Items.feather.setDamage(AdvancedLapPack.stack, GT_Values.W);
            GT_ModHandler.addCraftingRecipe(UltimateLapPack.stack, new Object[]{"IBI", "BRB", "CWC",
                    'B', lap, 'C', circuit, 'I', ironCase, 'W', wire, 'R', AdvancedLapPack.stack});
        }
        {
            ItemStack circuit = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Ultimate, 1);
            ItemStack wire = GT_OreDictUnificator.get(OrePrefixes.wireGt16, Materials.SuperconductorZPM, 1);
            Object ironCase = GT_ModHandler.getModItem("dreamcraft", "item.IridiumAlloyItemCasing", 1);
            Object lap = ItemList.Energy_LapotronicOrb;
            Items.feather.setDamage(UltimateLapPack.stack, GT_Values.W);
            GT_ModHandler.addCraftingRecipe(EpicLapPack.stack, new Object[]{"IBI", "BRB", "CWC",
                    'B', lap, 'C', circuit, 'I', ironCase, 'W', wire, 'R', UltimateLapPack.stack});
        }
        {
            ItemStack carcbon = GT_ModHandler.getModItem("IC2", "itemPartCarbonPlate", 1);
            ItemStack wire = GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.Platinum, 1);
            ItemStack circuit = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 1);
            Items.feather.setDamage(EnergyPack.stack, GT_Values.W);
            GT_ModHandler.addCraftingRecipe(AdvancedLapPack.stack, new Object[]{"CEC", "EBE", "WTW",
                    'C', carcbon, 'E', crystal, 'B', EnergyPack.stack, 'W', wire, 'T', circuit});
        }
        {
            ItemStack pack = GT_ModHandler.getModItem("IC2", "itemArmorBatpack", 1, GT_Values.W);
            GT_ModHandler.addCraftingRecipe(BatPack.stack, new Object[]{"B", 'B', pack});
        }
        {
            ItemStack pack = GT_ModHandler.getModItem("IC2", "itemArmorAdvBatpack", 1, GT_Values.W);
            GT_ModHandler.addCraftingRecipe(AdvPack.stack, new Object[]{"B", 'B', pack});
        }
        {
            ItemStack pack = GT_ModHandler.getModItem("IC2", "itemArmorEnergypack", 1, GT_Values.W);
            GT_ModHandler.addCraftingRecipe(EnergyPack.stack, new Object[]{"B", 'B', pack});
        }
        {
            ItemStack pack = GT_ModHandler.getModItem("GraviSuite", "advLappack", 1, GT_Values.W);
            GT_ModHandler.addCraftingRecipe(AdvancedLapPack.stack, new Object[]{"B", 'B', pack});
        }
        {
            ItemStack pack = GT_ModHandler.getModItem("GraviSuite", "ultimateLappack", 1, GT_Values.W);
            GT_ModHandler.addCraftingRecipe(UltimateLapPack.stack, new Object[]{"B", 'B', pack});
        }
        {
            ItemStack pack = GT_ModHandler.getModItem("GraviSuite", "epicLappack", 1, GT_Values.W);
            GT_ModHandler.addCraftingRecipe(EpicLapPack.stack, new Object[]{"B", 'B', pack});
        }
    }
}
