
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.axio.infiniteunknowns.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.axio.infiniteunknowns.item.FlintMachiningHammerItem;
import net.axio.infiniteunknowns.InfiniteUnknownsMod;

public class InfiniteUnknownsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(InfiniteUnknownsMod.MODID);
	public static final DeferredItem<Item> IRON_FRAME = block(InfiniteUnknownsModBlocks.IRON_FRAME);
	public static final DeferredItem<Item> FLINT_MACHINING_HAMMER = REGISTRY.register("flint_machining_hammer", FlintMachiningHammerItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
