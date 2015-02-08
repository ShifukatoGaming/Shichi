package io.github.shifukatogaming.shichi.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems 
{
	
	public static Item textureTest;
	
	public static void init() 
	{
		
		/*
		 * Items
		 */
		
		textureTest = new Item()
			.setCreativeTab(CreativeTabs.tabMisc)
			.setMaxStackSize(1);
		
	}
	
}
