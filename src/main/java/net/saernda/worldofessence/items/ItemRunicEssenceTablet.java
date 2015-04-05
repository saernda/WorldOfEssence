package net.saernda.worldofessence.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiCrafting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.saernda.worldofessence.gui.Gui_Test;

public class ItemRunicEssenceTablet extends Item{
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		Minecraft.getMinecraft().displayGuiScreen(new Gui_Test());
		return super.onItemRightClick(item, world, player);
	}

}
