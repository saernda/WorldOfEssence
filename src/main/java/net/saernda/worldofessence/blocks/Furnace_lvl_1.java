package net.saernda.worldofessence.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Furnace_lvl_1 extends Block {

    public Furnace_lvl_1(Material arg0) {
        super(arg0);
        this.setHardness(5.0F);
        this.setLightLevel(1.0F);
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean isFullCube()
    {
        return false;
    }
}
