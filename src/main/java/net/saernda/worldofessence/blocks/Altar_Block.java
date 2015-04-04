package net.saernda.worldofessence.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import java.util.Random;

public class Altar_Block extends Block {

	int static Random rand = new Random();

	public Altar_Block(Material arg0) {
		super(arg0);
		this.setHardness(5.0F);
		this.setLightLevel(1.0F);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
	}
	
    public boolean isOpaqueCube()
    {
        return false;
    }

	public boolean isFullCube()
	{
		return false;
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {

		if (!worldIn.isRemote && rand.nextFloat()<0.1F)
		{
			double motionX = rand.nextGaussian() * 0.02D;
			double motionY = rand.nextGaussian() * 0.02D;
			double motionZ = rand.nextGaussian() * 0.02D;
			worldIn.spawnParticle(
					"happyVillager",
					hitX + rand.nextFloat() * width * 2.0F - width,
					hitY + 0.5D + rand.nextFloat() * height,
					hitZ + rand.nextFloat() * width * 2.0F - width,
					motionX,
					motionY,
					motionZ);
		}

		return super.onBlockActivated(worldIn, pos, state, playerIn, side, hitX, hitY, hitZ);
	}
}
