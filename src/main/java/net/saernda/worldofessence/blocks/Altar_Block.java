package net.saernda.worldofessence.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

import java.util.Random;

public class Altar_Block extends Block {

	public Random rand = new Random();

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
		playerIn.addChatMessage(new ChatComponentText("you clicked the Altar"));

		int i;

		double d0;
		double d1;
		double d2;
		for(i = 0; i < 10; ++i) {
			d0 = (double)pos.getX() + rand.nextDouble();
			d1 = (double)pos.getY() + rand.nextDouble() * 0.5D + 0.5D;
			d2 = (double)pos.getZ() + rand.nextDouble();
			worldIn.spawnParticle(EnumParticleTypes.FLAME, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
		}
		return super.onBlockActivated(worldIn, pos, state, playerIn, side, hitX, hitY, hitZ);
	}
}
