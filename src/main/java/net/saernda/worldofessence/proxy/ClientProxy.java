package net.saernda.worldofessence.proxy;

import net.saernda.worldofessence.BlocksClass;
import net.saernda.worldofessence.ItemsClass;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
		BlocksClass.registerRenders();
		ItemsClass.registerRenders();
	}
}
