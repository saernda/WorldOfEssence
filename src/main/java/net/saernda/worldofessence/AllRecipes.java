package net.saernda.worldofessence;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AllRecipes {
	
	public static void addRecipes() {
		
		GameRegistry.addRecipe(new ItemStack (Items.diamond, 2),
				"xyx", "yzy", "yxy", 'x', Blocks.obsidian, 'z', Items.diamond, 'y', Items.coal);
		
		GameRegistry.addRecipe(new ItemStack (Items.diamond_pickaxe, 1),
			" x ", " z ", " y ", 'x', Items.diamond, 'z', Items.iron_pickaxe, 'y', Items.stick);
		
		GameRegistry.addRecipe(new ItemStack (Items.diamond_shovel, 1),
			" x ", " z ", " y ", 'x', Items.diamond, 'z', Items.iron_shovel, 'y', Items.stick);
		
		GameRegistry.addRecipe(new ItemStack (Items.diamond_axe, 1),
			" x ", " z ", " y ", 'x', Items.diamond, 'z', Items.iron_axe, 'y', Items.stick);
		
		GameRegistry.addRecipe(new ItemStack (Items.ender_pearl, 1),
			"xxx", "xzx", "xxx", 'x', Blocks.obsidian, 'z', Items.lava_bucket);
		
		GameRegistry.addRecipe(new ItemStack (Items.ghast_tear, 4),
			"xxx", "xzx", "xxx", 'x', Items.ender_pearl, 'z', Items.feather);
		
		GameRegistry.addRecipe(new ItemStack (Items.iron_pickaxe, 1),
			" x ", " z ", " y ", 'x', Items.iron_ingot, 'z', Items.stone_pickaxe, 'y', Items.stick);
		
		GameRegistry.addRecipe(new ItemStack (Items.iron_shovel, 1),
			" x ", " z ", " y ", 'x', Items.iron_ingot, 'z', Items.stone_shovel, 'y', Items.stick);
		
		GameRegistry.addRecipe(new ItemStack (Items.iron_axe, 1),
			" x ", " z ", " y ", 'x', Items.iron_ingot, 'z', Items.stone_axe, 'y', Items.stick);
		
		GameRegistry.addRecipe(new ItemStack (Items.blaze_rod, 1),
			"  x", " x ", "z  ", 'x', Items.gold_ingot, 'z', Items.lava_bucket);
		
		GameRegistry.addRecipe(new ItemStack (Blocks.furnace, 1),
			"xxx", "x x", "xxx", 'x', Blocks.stone);
		
		GameRegistry.addRecipe(new ItemStack (Blocks.furnace, 1),
			"xxx", "x x", "xxx", 'x', Blocks.stonebrick);
		
		GameRegistry.addRecipe(new ItemStack(ItemsClass.PureWater, 4),
			"xxx", "xyx", "xxx", 'x', Items.glowstone_dust,'y', Items.water_bucket);
		
		GameRegistry.addRecipe(new ItemStack(BlocksClass.Altar, 1),
			"xxx", "xyx", "xxx", 'x', ItemsClass.PureWater, 'y', Blocks.emerald_block);
		
		GameRegistry.addRecipe(new ItemStack(ItemsClass.EmptyEssence, 4),
				"yxy", "xzx", "yxy", 'x', ItemsClass.PureWater,'y', Items.blaze_powder, 'z', Blocks.stone);
	}
	
	public static void addEssenceRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsClass.AirEssence), ItemsClass.EmptyEssence, Items.potionitem);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsClass.FireEssence), ItemsClass.EmptyEssence, Items.lava_bucket);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsClass.WaterEssence), ItemsClass.EmptyEssence, Items.water_bucket);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsClass.EarthEssence), ItemsClass.EmptyEssence, Blocks.dirt);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsClass.LavaEssence), ItemsClass.FireEssence, ItemsClass.EarthEssence);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsClass.AlcoholEssence), ItemsClass.FireEssence, ItemsClass.WaterEssence);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsClass.EnergyEssence), ItemsClass.FireEssence, ItemsClass.AirEssence);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsClass.DustEssence), ItemsClass.EarthEssence, ItemsClass.AirEssence);
		
	}

}