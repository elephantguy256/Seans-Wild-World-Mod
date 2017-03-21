package net.minecraft.entity.passive;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Zebra Shark Female.tcn - TechneToTabulaImporter
 * Created using Tabula 5.1.0
 */
public class ModelZebraShark extends ModelBase {

    public ModelRenderer Head;
    public ModelRenderer Nose;
    public ModelRenderer Body;
    public ModelRenderer Abdomen;
    public ModelRenderer Dorsal;
    public ModelRenderer LeftPectoral;
    public ModelRenderer RightPectoral;
    public ModelRenderer TailBase;
    public ModelRenderer LeftAbdominal;
    public ModelRenderer RightAbdominal;
    public ModelRenderer UpperTail;
    public ModelRenderer LowerTail;

    public ModelZebraShark() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Dorsal = new ModelRenderer(this, 59, 19);
        this.Dorsal.setRotationPoint(0.0F, -3.0F, 7.0F);
        this.Dorsal.addBox(-0.5F, -9.6F, -0.5F, 1, 10, 5, 0.0F);
        this.setRotateAngle(Dorsal, -1.1383037381507017F, 0.0F, 0.0F);
        this.LeftAbdominal = new ModelRenderer(this, 55, 52);
        this.LeftAbdominal.setRotationPoint(2.5F, 1.5F, 0.5F);
        this.LeftAbdominal.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(LeftAbdominal, -0.20943951023931953F, -0.0F, 0.17453292519943295F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 1.0F, 0.2F);
        this.Body.addBox(-5.0F, -3.5F, 0.0F, 10, 7, 16, 0.0F);
        this.setRotateAngle(Body, 0.04363323129985824F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 54, 0);
        this.Head.setRotationPoint(0.0F, 18.5F, -8.0F);
        this.Head.addBox(-4.0F, -1.5F, -7.0F, 8, 6, 8, 0.0F);
        this.setRotateAngle(Head, 0.04363323129985824F, 0.0F, 0.0F);
        this.RightPectoral = new ModelRenderer(this, 27, 33);
        this.RightPectoral.setRotationPoint(-4.0F, 2.0F, 1.5F);
        this.RightPectoral.addBox(-8.0F, -0.5F, -2.0F, 8, 1, 6, 0.0F);
        this.setRotateAngle(RightPectoral, 0.0F, 0.2617993877991494F, 0.0F);
        this.Abdomen = new ModelRenderer(this, 0, 24);
        this.Abdomen.setRotationPoint(0.0F, 0.0F, 15.0F);
        this.Abdomen.addBox(-3.0F, -3.0F, 0.0F, 6, 6, 7, 0.0F);
        this.setRotateAngle(Abdomen, 0.02617993877991494F, 0.0F, 0.0F);
        this.LeftPectoral = new ModelRenderer(this, 27, 24);
        this.LeftPectoral.setRotationPoint(4.0F, 2.0F, 1.5F);
        this.LeftPectoral.addBox(0.0F, -0.5F, -2.0F, 8, 1, 6, 0.0F);
        this.setRotateAngle(LeftPectoral, 0.0F, -0.2617993877991494F, 0.0F);
        this.RightAbdominal = new ModelRenderer(this, 55, 41);
        this.RightAbdominal.setRotationPoint(-3.0F, 1.5F, 0.5F);
        this.RightAbdominal.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(RightAbdominal, -1.811651763570114F, -1.3962634015954636F, 1.5707963267948966F);
        this.LowerTail = new ModelRenderer(this, 35, 45);
        this.LowerTail.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerTail.addBox(-1.0F, 0.4F, 1.0F, 2, 4, 5, 0.0F);
        this.setRotateAngle(LowerTail, -1.0927506446736497F, 0.0F, 0.0F);
        this.Nose = new ModelRenderer(this, 88, 0);
        this.Nose.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Nose.addBox(-2.5F, 0.0F, -3.0F, 5, 4, 5, 0.0F);
        this.UpperTail = new ModelRenderer(this, 12, 42);
        this.UpperTail.setRotationPoint(0.0F, -1.0F, 6.2F);
        this.UpperTail.addBox(-1.0F, -0.5F, -0.5F, 2, 4, 15, 0.0F);
        this.setRotateAngle(UpperTail, 0.5918411493512771F, 0.0F, 0.0F);
        this.TailBase = new ModelRenderer(this, 0, 38);
        this.TailBase.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.TailBase.addBox(-2.0F, -2.5F, 0.0F, 4, 5, 8, 0.0F);
        this.setRotateAngle(TailBase, 0.017453292519943295F, 0.0F, 0.0F);
        this.Body.addChild(this.Dorsal);
        this.Abdomen.addChild(this.LeftAbdominal);
        this.Head.addChild(this.Body);
        this.Body.addChild(this.RightPectoral);
        this.Body.addChild(this.Abdomen);
        this.Body.addChild(this.LeftPectoral);
        this.Abdomen.addChild(this.RightAbdominal);
        this.UpperTail.addChild(this.LowerTail);
        this.Head.addChild(this.Nose);
        this.TailBase.addChild(this.UpperTail);
        this.Abdomen.addChild(this.TailBase);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Head.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
