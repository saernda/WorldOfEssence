package net.saernda.worldofessence.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.saernda.worldofessence.soundHandler;


public class ItemRingFly extends Item{

    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {

        playerIn.setItemInUse(itemStackIn, this.getMaxItemUseDuration(itemStackIn));
        playerIn.capabilities.allowFlying = true;
        playerIn.fallDistance = 0.0F;
        soundHandler.playSoundAtEntity("FlightToggle", playerIn.worldObj, playerIn, 1, 1);

        if (playerIn.isSneaking()) {
            playerIn.setItemInUse(itemStackIn, this.getMaxItemUseDuration(itemStackIn));
            playerIn.capabilities.allowFlying = false;
        }
        return super.onItemRightClick(itemStackIn, worldIn, playerIn);
    }

}