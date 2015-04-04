package net.saernda.worldofessence;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.saernda.worldofessence.proxy.CommonProxy;

@Mod(modid = WorldOfEssence.MODID, version = WorldOfEssence.VERSION)
public class WorldOfEssence
{
    public static final String MODID = "worldofessence";
    public static final String VERSION = "1.0";
    public static final String CLIENT_PROXY_CLASS = "net.saernda.worldofessence.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "net.saernda.worldofessence.proxy.CommonProxy";
    
    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    public static final WorldOfEssenceTabs tabWorldOfEssence = new WorldOfEssenceTabs("tabWorldOfEssence");
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	BlocksClass.init();
    	BlocksClass.register();
    	
    	ItemsClass.init();    	
    	ItemsClass.register();
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	
    	proxy.registerRenders();
    	
    	//Mics
    	AllRecipes.addRecipes();
    	AllRecipes.addEssenceRecipes();
    	
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}