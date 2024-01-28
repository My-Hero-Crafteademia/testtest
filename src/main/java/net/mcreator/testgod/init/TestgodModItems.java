
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testgod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.testgod.item.DNAQuirkSelectorItem;
import net.mcreator.testgod.TestgodMod;

public class TestgodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestgodMod.MODID);
	public static final RegistryObject<Item> DNA_QUIRK_SELECTOR = REGISTRY.register("dna_quirk_selector", () -> new DNAQuirkSelectorItem());
}
