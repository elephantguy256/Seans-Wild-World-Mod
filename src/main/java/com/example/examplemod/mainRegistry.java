package com.example.examplemod;


import com.hyeanmod.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.passive.EntityZebraShark;
import net.minecraft.item.Item;


@Mod(modid = mainRegistry.MODID, version = mainRegistry.VERSION)
public class mainRegistry
{
	public static Item zebra_shark_tooth;
    public static final String MODID = "em";
    public static final String VERSION = "1.0";
    {
    }
	@SidedProxy(clientSide="com.hyeanmod.proxy.ClientProxy", serverSide="com.hyeanmod.proxy.ServerProxy")
	public static CommonProxy proxy;
    public static mainRegistry modInstance;
    
    @EventHandler
	public void preInit(FMLPreInitializationEvent e) {
    	zebra_shark_tooth = new ItemZebraSharkTooth();
    	
    	GameRegistry.registerItem(zebra_shark_tooth, "zebra_shark_tooth");
	    this.proxy.preInit(e);
	    proxy.registerRenderers();
    	EntityList.addMapping(EntityZebraShark.class, "Zebra Shark", 5, 0xE18519, 0000000);
    	int entityID = EntityRegistry.findGlobalUniqueEntityId();
    }
    }
