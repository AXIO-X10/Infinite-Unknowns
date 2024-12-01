
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.axio.infiniteunknowns.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.axio.infiniteunknowns.block.IronFrameBlock;
import net.axio.infiniteunknowns.InfiniteUnknownsMod;

public class InfiniteUnknownsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(InfiniteUnknownsMod.MODID);
	public static final DeferredBlock<Block> IRON_FRAME = REGISTRY.register("iron_frame", IronFrameBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
