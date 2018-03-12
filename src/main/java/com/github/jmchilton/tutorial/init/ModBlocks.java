package com.github.jmchilton.tutorial.init;

import java.util.ArrayList;
import java.util.List;

import com.github.jmchilton.tutorial.blocks.BlockBase;
import com.github.jmchilton.tutorial.blocks.VesCrystalBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block VES_BLOCK = new BlockBase("ves_block", Material.IRON);
	public static final Block VES_CRYSTAL_BLOCK = new VesCrystalBlock("ves_crystal_block", Material.GLASS);
	
}
