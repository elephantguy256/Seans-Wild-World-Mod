package com.hyeanmod.proxy;



import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.entity.passive.EntityZebraShark;
import net.minecraft.entity.passive.ModelZebraShark;
import net.minecraft.entity.passive.ZebraSharkRender;

public class ClientProxy extends CommonProxy{

@Override
public void registerRenderers() {
    RenderingRegistry.registerEntityRenderingHandler(EntityZebraShark.class, new ZebraSharkRender(new ModelZebraShark(), 0.5F)); // 0.5F is shadow size 

}
}