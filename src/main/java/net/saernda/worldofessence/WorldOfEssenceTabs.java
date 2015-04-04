package net.saernda.worldofessence;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WorldOfEssenceTabs extends CreativeTabs {

	public WorldOfEssenceTabs(String arg0) {
		super(arg0);
		this.setBackgroundImageName("WOEBackground.png");
	}

	@Override
	public Item getTabIconItem() {
		return ItemsClass.PureWater;
	}

}
