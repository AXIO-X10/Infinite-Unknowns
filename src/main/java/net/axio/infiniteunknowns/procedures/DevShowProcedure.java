package net.axio.infiniteunknowns.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.axio.infiniteunknowns.network.InfiniteUnknownsModVariables;

public class DevShowProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (InfiniteUnknownsModVariables.MapVariables.get(world).devshow == 0) {
			InfiniteUnknownsModVariables.MapVariables.get(world).devshow = 1;
			InfiniteUnknownsModVariables.MapVariables.get(world).syncData(world);
		} else if (InfiniteUnknownsModVariables.MapVariables.get(world).devshow == 1) {
			InfiniteUnknownsModVariables.MapVariables.get(world).devshow = 0;
			InfiniteUnknownsModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal((Component.translatable("command.devshow.done").getString())), false);
	}
}
