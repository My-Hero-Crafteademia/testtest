
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testgod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.testgod.world.inventory.MenuModMAINMenu;
import net.mcreator.testgod.TestgodMod;

public class TestgodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TestgodMod.MODID);
	public static final RegistryObject<MenuType<MenuModMAINMenu>> QUIRK_SELECTOR_GUI = REGISTRY.register("quirk_selector_gui", () -> IForgeMenuType.create(MenuModMAINMenu::new));
}
