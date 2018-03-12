package com.github.jmchilton.tutorial.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class VesCrystalBlock extends BlockBase {

	public VesCrystalBlock(String name, Material material) {
		super(name, material);

		setSoundType(SoundType.GLASS);
		setHardness(200.8F);
		setResistance(0.0F);
		setHarvestLevel("sword", 3);
		setLightLevel(11);
		// setLightOpacity(1);
		// setBlockUnbreakable();
	}

}
