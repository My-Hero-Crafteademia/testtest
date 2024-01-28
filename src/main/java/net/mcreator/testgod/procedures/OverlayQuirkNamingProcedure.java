package net.mcreator.testgod.procedures;

import net.minecraft.world.entity.Entity;

public class OverlayQuirkNamingProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getPersistentData().getString("playerQuirks")).equals("oneforall")) {
			return "One For All";
		}
		if ((entity.getPersistentData().getString("playerQuirks")).equals("halfcoldhalfhot")) {
			return "Half-Cold Half-Hot";
		}
		return "";
	}
}
