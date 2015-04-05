package net.saernda.worldofessence;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WorldOfEssenceTabsEss extends CreativeTabs {

	public WorldOfEssenceTabsEss(String arg0) {
		super(arg0);
		this.setBackgroundImageName("WOEBackground.png");
	}

	@Override
	public Item getTabIconItem() {
		return ItemsClass.EmptyEssence;
	}

}
