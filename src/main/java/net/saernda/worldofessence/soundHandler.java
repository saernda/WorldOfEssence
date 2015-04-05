package net.saernda.worldofessence;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class soundHandler {

    public static void playSoundAtEntity(String name, World world, EntityPlayer playerIn, float volume, float pitch) {
        world.playSoundAtEntity(playerIn, WorldOfEssence.MODID + ":" + name, (float)volume, (float)pitch);
    }


}
