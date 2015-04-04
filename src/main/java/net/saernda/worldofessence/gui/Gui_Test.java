package net.saernda.worldofessence.gui;

import java.io.IOException;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.saernda.worldofessence.WorldOfEssence;

public class Gui_Test extends GuiScreen{
	
	int guiWidth = 256;
	int guiHeight = 256;
	
	@Override
	public void drawScreen(int x, int y, float ticks) {
		
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		GL11.glColor4f(1, 1, 1, 1);
		drawDefaultBackground();
		mc.renderEngine.bindTexture(new ResourceLocation(WorldOfEssence.MODID, "textures/gui/Gui_Test.png"));
		
		//Draw Mics
		drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);
		
		//Text
		fontRendererObj.drawString("Welcome", guiX + 110, guiY + 47, 0xffffff);
		
		super.drawScreen(x, y, ticks);
	}
	@Override
	protected void keyTyped(char typedChar, int keyCode) throws IOException {
		switch(keyCode){
		case Keyboard.KEY_E:
			mc.displayGuiScreen(null);
		}
		super.keyTyped(typedChar, keyCode);
	}

}
