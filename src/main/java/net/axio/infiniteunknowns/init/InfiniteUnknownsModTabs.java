
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.axio.infiniteunknowns.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.axio.infiniteunknowns.InfiniteUnknownsMod;

public class InfiniteUnknownsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InfiniteUnknownsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PAGE_TOOLS = REGISTRY.register("page_tools",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.infinite_unknowns.page_tools")).icon(() -> new ItemStack(InfiniteUnknownsModItems.FLINT_MACHINING_HAMMER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(InfiniteUnknownsModItems.IRON_MACHINING_HAMMER.get());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PAGE_BLOCK = REGISTRY.register("page_block",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.infinite_unknowns.page_block")).icon(() -> new ItemStack(InfiniteUnknownsModBlocks.IRON_FRAME.get())).displayItems((parameters, tabData) -> {
				tabData.accept(InfiniteUnknownsModBlocks.IRON_FRAME.get().asItem());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PAGE_MATERIAL = REGISTRY.register("page_material",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.infinite_unknowns.page_material")).icon(() -> new ItemStack(InfiniteUnknownsModItems.IRON_PLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(InfiniteUnknownsModItems.IRON_PLATE.get());
				tabData.accept(InfiniteUnknownsModItems.IRON_BAR.get());
				tabData.accept(InfiniteUnknownsModItems.CRUDE_STEEL_INGOTS.get());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PAGE_MISCELLANEOUS = REGISTRY.register("page_miscellaneous",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.infinite_unknowns.page_miscellaneous")).icon(() -> new ItemStack(InfiniteUnknownsModItems.ERLENMEYER_FLASK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(InfiniteUnknownsModItems.ERLENMEYER_FLASK.get());
			})

					.build());
}
