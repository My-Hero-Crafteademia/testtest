package net.mcreator.testgod.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnQuirkOFAProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getPersistentData().getString("playerQuirks")).equals("oneforall")) {
			return true;
		}
		return false;
	}
}
