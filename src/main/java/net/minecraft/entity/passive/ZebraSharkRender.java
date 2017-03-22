package net.minecraft.entity.passive;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;



public class ZebraSharkRender extends RenderLiving{

	 public ZebraSharkRender(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
		// TODO Auto-generated constructor stub
	}

	 public void ZebraSharkRender(EntityZebraShark var1, double var2, double var4, double var6, float var8, float var9)
	 {
	 super.doRender(var1, var2, var4, var6, var8, var9);
	 }

	 public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
	 {
	 this.ZebraSharkRender((EntityZebraShark)var1, var2, var4, var6, var8, var9);
	 }

	 public void doYOURMOB(Entity var1, double var2, double var4, double var6, float var8, float var9)
	 {
	 this.ZebraSharkRender((EntityZebraShark)var1, var2, var4, var6, var8, var9);
	 }

	 @Override
	 protected ResourceLocation getEntityTexture(Entity entity) {
	 return texture;
	 }
	 public static ResourceLocation texture = new ResourceLocation("em" + ":" + "textures/entities/fish/zebrashark.png");
}