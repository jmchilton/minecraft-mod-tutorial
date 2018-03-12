package com.github.jmchilton.tutorial.items;

import com.github.jmchilton.tutorial.Vespawn;
import com.github.jmchilton.tutorial.init.ModItems;
import com.github.jmchilton.tutorial.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class VesArmoreBase extends ItemArmor implements IHasModel {

	public VesArmoreBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);

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
