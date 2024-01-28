package net.mcreator.testgod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.testgod.network.TestgodModVariables;

public class ToggleCombatModeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(TestgodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TestgodModVariables.PlayerVariables())).toggle_combatmode_overlay == false) {
			{
				boolean _setval = true;
				entity.getCapability(TestgodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.toggle_combatmode_overlay = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(TestgodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TestgodModVariables.PlayerVariables())).toggle_combatmode_overlay == true) {
			{
				boolean _setval = false;
				entity.getCapability(TestgodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.toggle_combatmode_overlay = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
