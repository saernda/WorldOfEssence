package net.saernda.worldofessence.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;



public class ItemRingFly extends Item{

    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {

        playerIn.setItemInUse(itemStackIn, this.getMaxItemUseDuration(itemStackIn));
        playerIn.capabilities.allowFlying = true;
        playerIn.fallDistance = 0.0F;
        return super.onItemRightClick(itemStackIn, worldIn, playerIn);
    }
}
