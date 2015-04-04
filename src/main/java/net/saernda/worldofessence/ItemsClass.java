package net.saernda.worldofessence;

import net.minecraft.item.Item;
import net.saernda.worldofessence.items.ItemRunicEssenceTablet;

public class ItemsClass {
	
	public static Item RunicEssenceTablet;
	
    public static Item PureWater;
    public static Item EmptyEssence;
    
    public static Item FireEssence;
    public static Item EarthEssence;
    public static Item AirEssence;
    public static Item WaterEssence;
	
	public static Item LavaEssence;
	public static Item AlcoholEssence;
	public static Item EnergyEssence;
	public static Item DustEssence;
	public static Item SteamEssence;
	public static Item SwampEssence;
	public static Item AshEssence;
	public static Item LifeEssence;
	public static Item PlasmaEssence;
    
    public static void init() {
    	RunicEssenceTablet = new ItemRunicEssenceTablet().setUnlocalizedName("RunicEssenceTablet").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
    	
    	PureWater = new Item().setUnlocalizedName("PureWater").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
    	EmptyEssence = new Item().setUnlocalizedName("EmptyEssence").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
    	
    	FireEssence = new Item().setUnlocalizedName("FireEssence").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
    	EarthEssence = new Item().setUnlocalizedName("EarthEssence").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
    	AirEssence = new Item().setUnlocalizedName("AirEssence").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
    	WaterEssence = new Item().setUnlocalizedName("WaterEssence").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
		
		LavaEssence = new Item().setUnlocalizedName("LavaEssence").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
		AlcoholEssence = new Item().setUnlocalizedName("AlcoholEssence").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
		EnergyEssence = new Item().setUnlocalizedName("EnergyEssence").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
		DustEssence = new Item().setUnlocalizedName("DustEssence").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
		SteamEssence = new Item().setUnlocalizedName("SteamEssence").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
		SwampEssence = new Item().setUnlocalizedName("SwampEssence").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
		AshEssence = new Item().setUnlocalizedName("AshEssence").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
		LifeEssence = new Item().setUnlocalizedName("LifeEssence").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
		PlasmaEssence = new Item().setUnlocalizedName("PlasmaEssence").setCreativeTab(WorldOfEssence.tabWorldOfEssence);
    }
    
    public static void register() {
    	RegisterRe.RegisterItem(RunicEssenceTablet);
    	
    	RegisterRe.RegisterItem(PureWater);
    	RegisterRe.RegisterItem(EmptyEssence);
    	
    	RegisterRe.RegisterItem(FireEssence);
    	RegisterRe.RegisterItem(EarthEssence);
    	RegisterRe.RegisterItem(AirEssence);
    	RegisterRe.RegisterItem(WaterEssence);
		
		RegisterRe.RegisterItem(LavaEssence);
		RegisterRe.RegisterItem(AlcoholEssence);
		RegisterRe.RegisterItem(EnergyEssence);
		RegisterRe.RegisterItem(DustEssence);
    	RegisterRe.RegisterItem(SteamEssence);
    	RegisterRe.RegisterItem(SwampEssence);
    	RegisterRe.RegisterItem(AshEssence);
    	RegisterRe.RegisterItem(LifeEssence);
    	RegisterRe.RegisterItem(PlasmaEssence);
    }
    
	public static void registerRenders() {
		RegisterRe.registerRenderItem(RunicEssenceTablet);
		
		RegisterRe.registerRenderItem(PureWater);
		RegisterRe.registerRenderItem(EmptyEssence);
		
		RegisterRe.registerRenderItem(FireEssence);
		RegisterRe.registerRenderItem(EarthEssence);
		RegisterRe.registerRenderItem(AirEssence);
		RegisterRe.registerRenderItem(WaterEssence);
		
		RegisterRe.registerRenderItem(LavaEssence);
		RegisterRe.registerRenderItem(AlcoholEssence);
		RegisterRe.registerRenderItem(EnergyEssence);
		RegisterRe.registerRenderItem(DustEssence);
		RegisterRe.registerRenderItem(SteamEssence);
		RegisterRe.registerRenderItem(SwampEssence);
		RegisterRe.registerRenderItem(AshEssence);
		RegisterRe.registerRenderItem(LifeEssence);
		RegisterRe.registerRenderItem(PlasmaEssence);
	}

}