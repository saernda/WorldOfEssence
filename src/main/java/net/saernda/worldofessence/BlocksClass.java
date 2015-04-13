package net.saernda.worldofessence;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.saernda.worldofessence.blocks.Altar_Block;
import net.saernda.worldofessence.blocks.Furnace_lvl_1;

public class BlocksClass {
	
	public static Block Altar;
	public static Block Furnace_lvl_1;
	
	public static void init() {
		
		Altar = new Altar_Block(Material.iron).setUnlocalizedName("Altar").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
		Furnace_lvl_1 = new Furnace_lvl_1(Material.iron).setUnlocalizedName("Furnace_lvl_1").setCreativeTab(WorldOfEssence.tabWorldOfEssence);

	}
	
	public static void register() {
		RegisterRe.RegisterBlock(Altar);
		RegisterRe.RegisterBlock(Furnace_lvl_1);
	}
	
	public static void registerRenders() {
		RegisterRe.RegisterRenderBlock(Altar);
		RegisterRe.RegisterRenderBlock(Furnace_lvl_1);
	}

}