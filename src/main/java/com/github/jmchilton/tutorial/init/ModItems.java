package com.github.jmchilton.tutorial.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.github.jmchilton.tutorial.Reference;
import com.github.jmchilton.tutorial.items.ItemBase;
import com.github.jmchilton.tutorial.items.VesArmoreBase;
import com.github.jmchilton.tutorial.items.VesSword;


public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();

	public static final Item VES_CRYSTAL = new ItemBase("ves_crystal");

	public static final ToolMaterial TOOL_VES = EnumHelper.addToolMaterial("tool_ves", 2, 180, 5.0F, Float.MAX_VALUE, 5);
	
	public static final Item VES_SWORD = new VesSword("ves_sword", TOOL_VES);

	public static final ArmorMaterial ARMOR_VES = EnumHelper.addArmorMaterial("armor_ves", Reference.MOD_ID + ":ves", Integer.MAX_VALUE, new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}, Integer.MAX_VALUE, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Float.MAX_VALUE);

	public static final Item VES_CHESTPLATE = new VesArmoreBase("ves_chestplate", ARMOR_VES, 1, EntityEquipmentSlot.CHEST);
	public static final Item VES_HELMET = new VesArmoreBase("ves_helmet", ARMOR_VES, 1, EntityEquipmentSlot.HEAD);
	public static final Item VES_BOOTS = new VesArmoreBase("ves_boots", ARMOR_VES, 1, EntityEquipmentSlot.FEET);
	public static final Item VES_LEGGINGS = new VesArmoreBase("ves_leggings", ARMOR_VES, 1, EntityEquipmentSlot.LEGS);

}