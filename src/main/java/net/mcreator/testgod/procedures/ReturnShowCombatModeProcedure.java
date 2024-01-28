package net.mcreator.testgod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.testgod.network.TestgodModVariables;

public class ReturnShowCombatModeProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity.getCapability(TestgodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TestgodModVariables.PlayerVariables())).toggle_combatmode_overlay == true;
	}
}
