
package net.axio.infiniteunknowns.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.axio.infiniteunknowns.procedures.DevSHowCheckProcedure;

@EventBusSubscriber({Dist.CLIENT})
public class DebugTestOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (DevSHowCheckProcedure.execute(world)) {
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.infinite_unknowns.debug_test.label_infinite_unknowns_010dev1"), w / 2 + -216, h / 2 + -121, -65536, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.infinite_unknowns.debug_test.label_the_development_version_is_enabl"), w / 2 + -216, h / 2 + -112, -65536, false);
		}
	}
}
