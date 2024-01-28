
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testgod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.testgod.TestgodMod;

public class TestgodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestgodMod.MODID);
	public static final RegistryObject<CreativeModeTab> MHC = REGISTRY.register("mhc",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.testgod.mhc")).icon(() -> new ItemStack(TestgodModItems.DNA_QUIRK_SELECTOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TestgodModItems.DNA_QUIRK_SELECTOR.get());
			})

					.build());
}
