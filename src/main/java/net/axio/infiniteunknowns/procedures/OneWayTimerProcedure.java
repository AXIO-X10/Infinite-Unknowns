package net.axio.infiniteunknowns.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import net.axio.infiniteunknowns.network.InfiniteUnknownsModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class OneWayTimerProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		InfiniteUnknownsModVariables.MapVariables.get(world).timer = Math.floor(InfiniteUnknownsModVariables.MapVariables.get(world).timer + 1);
		InfiniteUnknownsModVariables.MapVariables.get(world).syncData(world);
	}
}
