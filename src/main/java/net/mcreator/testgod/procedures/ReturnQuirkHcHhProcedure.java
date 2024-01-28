package net.mcreator.testgod.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnQuirkHcHhProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getPersistentData().getString("playerQuirks")).equals("halfcoldhalfhot")) {
			return true;
		}
		return false;
	}
}
