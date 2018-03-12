package com.github.jmchilton.tutorial.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.github.jmchilton.tutorial.Vespawn;
import com.github.jmchilton.tutorial.init.ModItems;
import com.github.jmchilton.tutorial.util.IHasModel;


public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Vespawn.proxy.registerItemRenderer(this, 0, "inventory");
	}

}