package net.saernda.worldofessence;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterRe {
	
	public static void RegisterBlock(Block block) {
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
	}
	
	public static void RegisterItem(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
	
	public static void RegisterRenderBlock(Block block) {
		
		Item item = Item.getItemFromBlock(block);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(WorldOfEssence.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
	public static void registerRenderItem(Item item) {
		{
		    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		    
		    	renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(WorldOfEssence.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		}
	}

}