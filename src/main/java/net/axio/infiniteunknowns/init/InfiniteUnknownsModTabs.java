
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.axio.infiniteunknowns.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.axio.infiniteunknowns.InfiniteUnknownsMod;

public class InfiniteUnknownsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InfiniteUnknownsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PAGE_TOOLS = REGISTRY.register("page_tools",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.infinite_unknowns.page_tools")).icon(() -> new ItemStack(Blocks.AIR)).displayItems((parameters, tabData) -> {
				tabData.accept(InfiniteUnknownsModItems.FLINT_MACHINING_HAMMER.get());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PAGE_BLOCK = REGISTRY.register("page_block",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.infinite_unknowns.page_block")).icon(() -> new ItemStack(Blocks.AIR)).displayItems((parameters, tabData) -> {
				tabData.accept(InfiniteUnknownsModBlocks.IRON_FRAME.get().asItem());
			})

					.build());
}
