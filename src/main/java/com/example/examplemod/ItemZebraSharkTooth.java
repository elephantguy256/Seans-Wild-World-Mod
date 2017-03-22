package com.example.examplemod;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
public class ItemZebraSharkTooth extends Item
{
public ItemZebraSharkTooth()
{
setUnlocalizedName(mainRegistry.MODID + "_" + "zebra_shark_tooth");
setTextureName(mainRegistry.MODID + ":" + "zebra_shark_tooth");
setCreativeTab(CreativeTabs.tabMisc);
}
}