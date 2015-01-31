package mods.fossil.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWeakSarcosuchus extends ModelBase
{
  //fields
    ModelRenderer UpperBody;
    ModelRenderer Body;
    ModelRenderer LowerBody;
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer UpperJaw;
    ModelRenderer Snout;
    ModelRenderer BottomJawBase;
    ModelRenderer BottomJaw;
    ModelRenderer Teeth;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Tail2Osteoderms;
    ModelRenderer Tail3Osteoderms;
    ModelRenderer RightUpperBodyOsteoderms;
    ModelRenderer Tail1Osteoderms;
    ModelRenderer MiddleUpperBodyOsteoderms;
    ModelRenderer LeftUpperBodyOsteoderms;
    ModelRenderer LeftLowerBodyOsteoderms;
    ModelRenderer MiddleLowerBodyOsteoderms;
    ModelRenderer LeftBodyOsteoderms;
    ModelRenderer MiddleBodyOsteoderms;
    ModelRenderer RightBodyOsteoderms;
    ModelRenderer RightLowerBodyOsteoderms;
    ModelRenderer RightHindThigh;
    ModelRenderer RightHindfoot;
    ModelRenderer RightFrontThigh;
    ModelRenderer RightFrontLeg;
    ModelRenderer RightFrontFoot;
    ModelRenderer LeftFHindThigh;
    ModelRenderer LeftHindfoot;
    ModelRenderer LeftHindLeg;
    ModelRenderer RightHindLeg;
    ModelRenderer LeftFrontThigh;
    ModelRenderer LeftFrontLeg;
    ModelRenderer LeftFrontFoot;
  
  public ModelWeakSarcosuchus()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      UpperBody = new ModelRenderer(this, 68, 66);
      UpperBody.addBox(-8.5F, 0F, -12F, 17, 11, 12);
      UpperBody.setRotationPoint(0F, 12F, 14F);
      UpperBody.setTextureSize(256, 128);
      UpperBody.mirror = true;
      setRotation(UpperBody, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 61, 92);
      Body.addBox(-9F, 0F, 0F, 18, 13, 21);
      Body.setRotationPoint(0F, 11F, 14F);
      Body.setTextureSize(256, 128);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      LowerBody = new ModelRenderer(this, 1, 81);
      LowerBody.addBox(-8.5F, 0F, 0F, 17, 11, 11);
      LowerBody.setRotationPoint(0F, 12F, 34F);
      LowerBody.setTextureSize(256, 128);
      LowerBody.mirror = true;
      setRotation(LowerBody, 0F, 0F, 0F);
      Neck = new ModelRenderer(this, 1, 110);
      Neck.addBox(-6.5F, 0F, -7F, 13, 9, 8);
      Neck.setRotationPoint(0F, 13F, 2F);
      Neck.setTextureSize(256, 128);
      Neck.mirror = true;
      setRotation(Neck, 0F, -0.1396263F, 0F);
      Head = new ModelRenderer(this, 0, 14);
      Head.addBox(-8F, -3.5F, -9F, 16, 7, 9);
      Head.setRotationPoint(0F, 14.5F, -4F);
      Head.setTextureSize(256, 128);
      Head.mirror = true;
      setRotation(Head, 0.0349066F, -0.1745329F, -0.1396263F);
      UpperJaw = new ModelRenderer(this, 62, 37);
      UpperJaw.addBox(-2F, 0F, -17F, 7, 5, 18);
      UpperJaw.setRotationPoint(0F, 13F, -13F);
      UpperJaw.setTextureSize(256, 128);
      UpperJaw.mirror = true;
      setRotation(UpperJaw, 0.0349066F, -0.1745329F, -0.122173F);
      Snout = new ModelRenderer(this, 0, 0);
      Snout.addBox(-5.5F, -1.5F, -5F, 11, 7, 6);
      Snout.setRotationPoint(4.5F, 13F, -30.5F);
      Snout.setTextureSize(256, 128);
      Snout.mirror = true;
      setRotation(Snout, 0.0349066F, -0.1745329F, -0.1047198F);
      BottomJawBase = new ModelRenderer(this, 193, 0);
      BottomJawBase.addBox(-7F, 1F, -8F, 13, 4, 8);
      BottomJawBase.setRotationPoint(0.5F, 17.5F, -4.9F);
      BottomJawBase.setTextureSize(256, 128);
      BottomJawBase.mirror = true;
      setRotation(BottomJawBase, 0.0698132F, -0.1745329F, -0.122173F);
      BottomJaw = new ModelRenderer(this, 76, 0);
      BottomJaw.addBox(-1.5F, 1.4F, -21F, 7, 3, 21);
      BottomJaw.setRotationPoint(-0.5F, 18F, -13F);
      BottomJaw.setTextureSize(256, 128);
      BottomJaw.mirror = true;
      setRotation(BottomJaw, 0.0698132F, -0.1745329F, -0.122173F);
      Teeth = new ModelRenderer(this, 0, 46);
      Teeth.addBox(-2.5F, 0F, -23F, 8, 3, 24);
      Teeth.setRotationPoint(0F, 17.6F, -12F);
      Teeth.setTextureSize(256, 128);
      Teeth.mirror = true;
      setRotation(Teeth, 0.0349066F, -0.1745329F, -0.122173F);
      Tail1 = new ModelRenderer(this, 145, 86);
      Tail1.addBox(-7F, 0F, 0F, 14, 8, 18);
      Tail1.setRotationPoint(0F, 14F, 43F);
      Tail1.setTextureSize(256, 128);
      Tail1.mirror = true;
      setRotation(Tail1, 0F, 0.1570796F, 0F);
      Tail2 = new ModelRenderer(this, 181, 53);
      Tail2.addBox(-5F, 1F, 0F, 10, 7, 24);
      Tail2.setRotationPoint(3F, 14F, 60F);
      Tail2.setTextureSize(256, 128);
      Tail2.mirror = true;
      setRotation(Tail2, 0F, 0.3141593F, 0F);
      Tail3 = new ModelRenderer(this, 186, 92);
      Tail3.addBox(-4F, 0F, 0F, 8, 5, 27);
      Tail3.setRotationPoint(9F, 17F, 82F);
      Tail3.setTextureSize(256, 128);
      Tail3.mirror = true;
      setRotation(Tail3, 0F, 0.5934119F, 0F);
      Tail2Osteoderms = new ModelRenderer(this, 118, 52);
      Tail2Osteoderms.addBox(0F, -5F, 0F, 1, 5, 20);
      Tail2Osteoderms.setRotationPoint(3F, 16F, 63F);
      Tail2Osteoderms.setTextureSize(256, 128);
      Tail2Osteoderms.mirror = true;
      setRotation(Tail2Osteoderms, 0F, 0.3141593F, 0F);
      Tail3Osteoderms = new ModelRenderer(this, 113, 23);
      Tail3Osteoderms.addBox(0F, -5F, 0F, 1, 5, 24);
      Tail3Osteoderms.setRotationPoint(9F, 17F, 82F);
      Tail3Osteoderms.setTextureSize(256, 128);
      Tail3Osteoderms.mirror = true;
      setRotation(Tail3Osteoderms, 0F, 0.5934119F, 0F);
      RightUpperBodyOsteoderms = new ModelRenderer(this, 124, 30);
      RightUpperBodyOsteoderms.addBox(1F, -5F, 0F, 1, 5, 17);
      RightUpperBodyOsteoderms.setRotationPoint(-5F, 16F, -5F);
      RightUpperBodyOsteoderms.setTextureSize(256, 128);
      RightUpperBodyOsteoderms.mirror = true;
      setRotation(RightUpperBodyOsteoderms, 0.0219973F, -0.0872665F, 0F);
      Tail1Osteoderms = new ModelRenderer(this, 117, 23);
      Tail1Osteoderms.addBox(0F, -5F, 0F, 1, 5, 24);
      Tail1Osteoderms.setRotationPoint(0F, 15F, 41F);
      Tail1Osteoderms.setTextureSize(256, 128);
      Tail1Osteoderms.mirror = true;
      setRotation(Tail1Osteoderms, 0F, 0.1570796F, 0F);
      MiddleUpperBodyOsteoderms = new ModelRenderer(this, 124, 30);
      MiddleUpperBodyOsteoderms.addBox(1F, -5F, 0F, 1, 5, 17);
      MiddleUpperBodyOsteoderms.setRotationPoint(0F, 15.5F, -5F);
      MiddleUpperBodyOsteoderms.setTextureSize(256, 128);
      MiddleUpperBodyOsteoderms.mirror = true;
      setRotation(MiddleUpperBodyOsteoderms, 0.0394506F, -0.0872665F, 0F);
      LeftUpperBodyOsteoderms = new ModelRenderer(this, 124, 30);
      LeftUpperBodyOsteoderms.addBox(1F, -5F, 0F, 1, 5, 17);
      LeftUpperBodyOsteoderms.setRotationPoint(5F, 16F, -5F);
      LeftUpperBodyOsteoderms.setTextureSize(256, 128);
      LeftUpperBodyOsteoderms.mirror = true;
      setRotation(LeftUpperBodyOsteoderms, 0.0219973F, -0.0872665F, 0F);
      LeftLowerBodyOsteoderms = new ModelRenderer(this, 128, 38);
      LeftLowerBodyOsteoderms.addBox(0F, -5F, 0F, 1, 5, 9);
      LeftLowerBodyOsteoderms.setRotationPoint(5F, 15F, 37F);
      LeftLowerBodyOsteoderms.setTextureSize(256, 128);
      LeftLowerBodyOsteoderms.mirror = true;
      setRotation(LeftLowerBodyOsteoderms, -0.0349066F, 0F, 0F);
      MiddleLowerBodyOsteoderms = new ModelRenderer(this, 128, 38);
      MiddleLowerBodyOsteoderms.addBox(0F, -5F, 0F, 1, 5, 9);
      MiddleLowerBodyOsteoderms.setRotationPoint(0F, 15F, 37F);
      MiddleLowerBodyOsteoderms.setTextureSize(256, 128);
      MiddleLowerBodyOsteoderms.mirror = true;
      setRotation(MiddleLowerBodyOsteoderms, 0F, 0F, 0F);
      LeftBodyOsteoderms = new ModelRenderer(this, 117, 23);
      LeftBodyOsteoderms.addBox(0F, -5F, 0F, 1, 5, 24);
      LeftBodyOsteoderms.setRotationPoint(5F, 15.5F, 11F);
      LeftBodyOsteoderms.setTextureSize(256, 128);
      LeftBodyOsteoderms.mirror = true;
      setRotation(LeftBodyOsteoderms, 0F, 0F, 0F);
      MiddleBodyOsteoderms = new ModelRenderer(this, 117, 23);
      MiddleBodyOsteoderms.addBox(0F, -5F, 0F, 1, 5, 24);
      MiddleBodyOsteoderms.setRotationPoint(0F, 15F, 11F);
      MiddleBodyOsteoderms.setTextureSize(256, 128);
      MiddleBodyOsteoderms.mirror = true;
      setRotation(MiddleBodyOsteoderms, 0F, 0F, 0F);
      RightBodyOsteoderms = new ModelRenderer(this, 117, 23);
      RightBodyOsteoderms.addBox(0F, -5F, 0F, 1, 5, 24);
      RightBodyOsteoderms.setRotationPoint(-5F, 15.5F, 11F);
      RightBodyOsteoderms.setTextureSize(256, 128);
      RightBodyOsteoderms.mirror = true;
      setRotation(RightBodyOsteoderms, 0F, 0F, 0F);
      RightLowerBodyOsteoderms = new ModelRenderer(this, 128, 38);
      RightLowerBodyOsteoderms.addBox(0F, -5F, 0F, 1, 5, 9);
      RightLowerBodyOsteoderms.setRotationPoint(-5F, 15F, 37F);
      RightLowerBodyOsteoderms.setTextureSize(256, 128);
      RightLowerBodyOsteoderms.mirror = true;
      setRotation(RightLowerBodyOsteoderms, -0.0349066F, 0F, 0F);
      RightHindThigh = new ModelRenderer(this, 174, 25);
      RightHindThigh.addBox(-3F, 0F, 0F, 6, 5, 7);
      RightHindThigh.setRotationPoint(-8F, 14F, 36F);
      RightHindThigh.setTextureSize(256, 128);
      RightHindThigh.mirror = true;
      setRotation(RightHindThigh, -0.4014257F, -1.570796F, 0.1047198F);
      RightHindfoot = new ModelRenderer(this, 210, 39);
      RightHindfoot.addBox(-3.5F, -2.5F, -8F, 5, 2, 7);
      RightHindfoot.setRotationPoint(-13.5F, 24.5F, 37.67F);
      RightHindfoot.setTextureSize(256, 128);
      RightHindfoot.mirror = true;
      setRotation(RightHindfoot, 0F, 1.48353F, 0F);
      RightFrontThigh = new ModelRenderer(this, 174, 25);
      RightFrontThigh.addBox(-3F, 0F, 0F, 6, 5, 7);
      RightFrontThigh.setRotationPoint(-8F, 14F, 13F);
      RightFrontThigh.setTextureSize(256, 128);
      RightFrontThigh.mirror = true;
      setRotation(RightFrontThigh, -0.1115358F, -1.570796F, -0.2974289F);
      RightFrontLeg = new ModelRenderer(this, 209, 25);
      RightFrontLeg.addBox(-3F, -0.5F, -3F, 4, 7, 5);
      RightFrontLeg.setRotationPoint(-13.5F, 18.5F, 14.67F);
      RightFrontLeg.setTextureSize(256, 128);
      RightFrontLeg.mirror = true;
      setRotation(RightFrontLeg, -0.3990504F, 0.2094395F, 0.6283185F);
      RightFrontFoot = new ModelRenderer(this, 210, 39);
      RightFrontFoot.addBox(-6.5F, -1.5F, -8F, 5, 2, 7);
      RightFrontFoot.setRotationPoint(-13.5F, 23.5F, 12.67F);
      RightFrontFoot.setTextureSize(256, 128);
      RightFrontFoot.mirror = true;
      setRotation(RightFrontFoot, 0F, 0.418879F, 0F);
      LeftFHindThigh = new ModelRenderer(this, 174, 25);
      LeftFHindThigh.addBox(-3F, 0F, 0F, 6, 5, 7);
      LeftFHindThigh.setRotationPoint(8F, 14F, 36F);
      LeftFHindThigh.setTextureSize(256, 128);
      LeftFHindThigh.mirror = true;
      setRotation(LeftFHindThigh, -0.4014257F, -4.712389F, 0.1047198F);
      LeftHindfoot = new ModelRenderer(this, 210, 39);
      LeftHindfoot.addBox(0F, -2.5F, -9F, 5, 2, 7);
      LeftHindfoot.setRotationPoint(13F, 24.5F, 38.7F);
      LeftHindfoot.setTextureSize(256, 128);
      LeftHindfoot.mirror = true;
      setRotation(LeftHindfoot, 0F, -1.169371F, 0F);
      LeftHindLeg = new ModelRenderer(this, 209, 25);
      LeftHindLeg.addBox(-3F, -0.5F, -2F, 4, 7, 5);
      LeftHindLeg.setRotationPoint(13.5F, 18.5F, 36.7F);
      LeftHindLeg.setTextureSize(256, 128);
      LeftHindLeg.mirror = true;
      setRotation(LeftHindLeg, 0.4848711F, 0.0174533F, -1.134464F);
      RightHindLeg = new ModelRenderer(this, 209, 25);
      RightHindLeg.addBox(-1F, -1.5F, -2F, 4, 7, 5);
      RightHindLeg.setRotationPoint(-13.5F, 18.5F, 35.67F);
      RightHindLeg.setTextureSize(256, 128);
      RightHindLeg.mirror = true;
      setRotation(RightHindLeg, 0.526759F, 0F, 1.012291F);
      LeftFrontThigh = new ModelRenderer(this, 174, 25);
      LeftFrontThigh.addBox(-3F, 0F, 0F, 6, 5, 7);
      LeftFrontThigh.setRotationPoint(8F, 14F, 13F);
      LeftFrontThigh.setTextureSize(256, 128);
      LeftFrontThigh.mirror = true;
      setRotation(LeftFrontThigh, -0.1115358F, -4.712389F, 0.2974216F);
      LeftFrontLeg = new ModelRenderer(this, 209, 25);
      LeftFrontLeg.addBox(-1F, -1.5F, -2F, 4, 7, 5);
      LeftFrontLeg.setRotationPoint(13.5F, 18.5F, 14.7F);
      LeftFrontLeg.setTextureSize(256, 128);
      LeftFrontLeg.mirror = true;
      setRotation(LeftFrontLeg, -0.5910366F, -0.6457718F, -0.4363323F);
      LeftFrontFoot = new ModelRenderer(this, 210, 39);
      LeftFrontFoot.addBox(-1F, -0.5F, -7F, 5, 2, 7);
      LeftFrontFoot.setRotationPoint(15F, 22.5F, 14.7F);
      LeftFrontFoot.setTextureSize(256, 128);
      LeftFrontFoot.mirror = true;
      setRotation(LeftFrontFoot, 0F, -0.6457718F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    UpperBody.render(f5);
    Body.render(f5);
    LowerBody.render(f5);
    Neck.render(f5);
    Head.render(f5);
    UpperJaw.render(f5);
    Snout.render(f5);
    BottomJawBase.render(f5);
    BottomJaw.render(f5);
    Teeth.render(f5);
    Tail1.render(f5);
    Tail2.render(f5);
    Tail3.render(f5);
    Tail2Osteoderms.render(f5);
    Tail3Osteoderms.render(f5);
    RightUpperBodyOsteoderms.render(f5);
    Tail1Osteoderms.render(f5);
    MiddleUpperBodyOsteoderms.render(f5);
    LeftUpperBodyOsteoderms.render(f5);
    LeftLowerBodyOsteoderms.render(f5);
    MiddleLowerBodyOsteoderms.render(f5);
    LeftBodyOsteoderms.render(f5);
    MiddleBodyOsteoderms.render(f5);
    RightBodyOsteoderms.render(f5);
    RightLowerBodyOsteoderms.render(f5);
    RightHindThigh.render(f5);
    RightHindfoot.render(f5);
    RightFrontThigh.render(f5);
    RightFrontLeg.render(f5);
    RightFrontFoot.render(f5);
    LeftFHindThigh.render(f5);
    LeftHindfoot.render(f5);
    LeftHindLeg.render(f5);
    RightHindLeg.render(f5);
    LeftFrontThigh.render(f5);
    LeftFrontLeg.render(f5);
    LeftFrontFoot.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
