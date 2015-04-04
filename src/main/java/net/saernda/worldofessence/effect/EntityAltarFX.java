package net.saernda.worldofessence.effect;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.saernda.worldofessence.WorldOfEssence;
import org.lwjgl.opengl.GL11;

public class EntityAltarFX extends EntityFX {

    private static final ResourceLocation texture = new ResourceLocation(WorldOfEssence.MODID, "textures/particle/AltarFX.png");

    public EntityAltarFX(World worldIn, double x, double y, double z) {

        super(worldIn, x, y, z);
    }

    public void renderParticle(Tessellator tess, float partialTicks, float par3, float par4, float par5, float par6, float par7) {

        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
        GL11.glDepthMask(false);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glAlphaFunc(GL11.GL_GREATER, 0.003921569F);
        tess.draw()
        tess.setBrightness(getBrightnessForRender(partialTicks));
        float scale = 0.1F * particleScale

    }
}
