package net.saernda.worldofessence;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.saernda.worldofessence.blocks.Altar_Block;

public class BlocksClass {
	
	public static Block Altar;
	
	public static void init() {
		
		Altar = new Altar_Block(Material.iron).setUnlocalizedName("Altar").setCreativeTab(WorldOfEssence.tabWorldOfEssence);


	}
	
	public static void register() {
		RegisterRe.RegisterBlock(Altar);
	}
	
	public static void registerRenders() {
		RegisterRe.RegisterRenderBlock(Altar);
	}

}