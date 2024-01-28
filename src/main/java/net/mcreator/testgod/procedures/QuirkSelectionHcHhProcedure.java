package net.mcreator.testgod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class QuirkSelectionHcHhProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("playerQuirks", "halfcoldhalfhot");
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
