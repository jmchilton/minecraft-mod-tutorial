package com.github.jmchilton.tutorial.items;

import com.github.jmchilton.tutorial.Vespawn;
import com.github.jmchilton.tutorial.init.ModItems;
import com.github.jmchilton.tutorial.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class VesSword extends ItemSword implements IHasModel {

	public VesSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);

	}

	@Override
	public void registerModels() {
		Vespawn.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
