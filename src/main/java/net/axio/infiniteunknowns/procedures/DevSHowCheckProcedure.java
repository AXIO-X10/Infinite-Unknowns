package net.axio.infiniteunknowns.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.axio.infiniteunknowns.network.InfiniteUnknownsModVariables;

public class DevSHowCheckProcedure {
	public static boolean execute(LevelAccessor world) {
		return InfiniteUnknownsModVariables.MapVariables.get(world).devshow == 1;
	}
}
