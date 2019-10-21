package com.bewitchment.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * statueHornedHuntsmen - cybercat5555
 * Created using Tabula 7.0.1
 */
public class ModelHerneStatue extends ModelBase {
    public ModelRenderer plith01;
    public ModelRenderer body00;
    public ModelRenderer spear01a;
    public ModelRenderer plith02;
    public ModelRenderer chest;
    public ModelRenderer moss01;
    public ModelRenderer moss02a;
    public ModelRenderer lLegMossa;
    public ModelRenderer rLegMossa;
    public ModelRenderer neck00;
    public ModelRenderer leftArm00;
    public ModelRenderer rightArm00;
    public ModelRenderer leftLeg00;
    public ModelRenderer rightLeg00;
    public ModelRenderer leftPec;
    public ModelRenderer backFur;
    public ModelRenderer mossMantle;
    public ModelRenderer rightPec;
    public ModelRenderer moss02b;
    public ModelRenderer lLegMossb;
    public ModelRenderer rLegMossb;
    public ModelRenderer neck01;
    public ModelRenderer neckFur01;
    public ModelRenderer neckFur03;
    public ModelRenderer head;
    public ModelRenderer neckFur02;
    public ModelRenderer neckFur04;
    public ModelRenderer upperJaw;
    public ModelRenderer lowerJaw;
    public ModelRenderer lEar;
    public ModelRenderer rEar;
    public ModelRenderer rAntler01;
    public ModelRenderer lAntler01;
    public ModelRenderer upperJaw00;
    public ModelRenderer upperJaw01;
    public ModelRenderer rAntler02a;
    public ModelRenderer rAntler02b;
    public ModelRenderer rAntler05a;
    public ModelRenderer rAntler10a;
    public ModelRenderer rAntler11a;
    public ModelRenderer rAntler03;
    public ModelRenderer rAntler04;
    public ModelRenderer rAntler07a;
    public ModelRenderer rAntler08a;
    public ModelRenderer rAntler09a;
    public ModelRenderer rAntler04b;
    public ModelRenderer rAntler04c;
    public ModelRenderer rAntler04d;
    public ModelRenderer rAntler07b;
    public ModelRenderer rAntler08b;
    public ModelRenderer rAntler09b;
    public ModelRenderer rAntler05b;
    public ModelRenderer rAntler05c;
    public ModelRenderer rAntler05d;
    public ModelRenderer rAntler10b;
    public ModelRenderer rAntler11b;
    public ModelRenderer lAntler02a;
    public ModelRenderer lAntler02b;
    public ModelRenderer lAntler05a;
    public ModelRenderer lAntler10a;
    public ModelRenderer lAntler11a;
    public ModelRenderer lAntler03;
    public ModelRenderer lAntler04;
    public ModelRenderer lAntler07a;
    public ModelRenderer lAntler08a;
    public ModelRenderer lAntler09a;
    public ModelRenderer lAntler04b;
    public ModelRenderer lAntler04c;
    public ModelRenderer lAntler04d;
    public ModelRenderer lAntler07b;
    public ModelRenderer lAntler08b;
    public ModelRenderer lAntler09b;
    public ModelRenderer lAntler05b;
    public ModelRenderer lAntler05c;
    public ModelRenderer lAntler05d;
    public ModelRenderer lAntler10b;
    public ModelRenderer lAntler11b;
    public ModelRenderer leftArm01;
    public ModelRenderer lMoss;
    public ModelRenderer rightArm01;
    public ModelRenderer rMoss;
    public ModelRenderer leftLeg01;
    public ModelRenderer leftLeg02;
    public ModelRenderer leftHoof;
    public ModelRenderer rightLeg01;
    public ModelRenderer rightLeg02;
    public ModelRenderer rightHoof;
    public ModelRenderer spear01b;
    public ModelRenderer spear02;
    public ModelRenderer spearTip03a;
    public ModelRenderer spearTip02;

    public ModelHerneStatue() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.rightPec = new ModelRenderer(this, 19, 50);
        this.rightPec.mirror = true;
        this.rightPec.setRotationPoint(-2.8F, -4.8F, -1.0F);
        this.rightPec.addBox(-2.5F, -2.5F, -3.0F, 5, 5, 3, 0.0F);
        this.setRotateAngle(rightPec, 0.0F, 0.0F, -0.08726646259971647F);
        this.lAntler08b = new ModelRenderer(this, 107, 0);
        this.lAntler08b.setRotationPoint(0.0F, 2.9F, 0.0F);
        this.lAntler08b.addBox(-0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
        this.setRotateAngle(lAntler08b, 0.2792526803190927F, 0.0F, 0.3490658503988659F);
        this.lAntler04c = new ModelRenderer(this, 107, 0);
        this.lAntler04c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lAntler04c.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(lAntler04c, 0.7853981633974483F, 0.0F, 0.0F);
        this.lLegMossb = new ModelRenderer(this, 55, 43);
        this.lLegMossb.setRotationPoint(0.5F, 1.9F, 0.0F);
        this.lLegMossb.addBox(-0.5F, 0.0F, -3.0F, 1, 6, 6, 0.0F);
        this.setRotateAngle(lLegMossb, 0.0F, 0.0F, 0.4886921905584123F);
        this.rightArm00 = new ModelRenderer(this, 51, 1);
        this.rightArm00.mirror = true;
        this.rightArm00.setRotationPoint(-5.0F, -12.0F, 0.0F);
        this.rightArm00.addBox(-2.7F, -2.0F, -2.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(rightArm00, -0.2792526803190927F, 0.0F, 0.2617993877991494F);
        this.rMoss = new ModelRenderer(this, 68, 51);
        this.rMoss.mirror = true;
        this.rMoss.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.rMoss.addBox(-3.2F, -0.7F, -2.5F, 4, 5, 5, 0.0F);
        this.leftArm00 = new ModelRenderer(this, 51, 1);
        this.leftArm00.setRotationPoint(5.0F, -12.0F, 0.0F);
        this.leftArm00.addBox(-1.3F, -2.0F, -2.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(leftArm00, -0.8552113334772213F, 0.0F, -0.5410520681182421F);
        this.neckFur01 = new ModelRenderer(this, 71, 23);
        this.neckFur01.setRotationPoint(0.0F, -3.9F, -1.9F);
        this.neckFur01.addBox(-3.0F, 0.0F, -1.3F, 6, 6, 2, 0.0F);
        this.setRotateAngle(neckFur01, -0.40142572795869574F, 0.0F, 0.0F);
        this.leftLeg02 = new ModelRenderer(this, 0, 47);
        this.leftLeg02.setRotationPoint(0.0F, 7.4F, 0.1F);
        this.leftLeg02.addBox(-1.0F, 0.0F, -1.5F, 2, 8, 3, 0.0F);
        this.setRotateAngle(leftLeg02, -0.5759586531581287F, 0.0F, 0.0F);
        this.leftArm01 = new ModelRenderer(this, 53, 17);
        this.leftArm01.setRotationPoint(0.8F, 6.3F, -0.0F);
        this.leftArm01.addBox(-1.5F, -1.5F, -2.0F, 3, 12, 4, 0.0F);
        this.setRotateAngle(leftArm01, -1.2217304763960306F, 0.045553093477052F, 0.08726646259971647F);
        this.rEar = new ModelRenderer(this, 65, 0);
        this.rEar.mirror = true;
        this.rEar.setRotationPoint(-2.3F, -3.4F, 0.9F);
        this.rEar.addBox(-3.0F, -1.0F, -0.5F, 3, 2, 1, 0.0F);
        this.setRotateAngle(rEar, 0.17453292519943295F, 0.3490658503988659F, 0.45378560551852565F);
        this.rLegMossb = new ModelRenderer(this, 44, 51);
        this.rLegMossb.setRotationPoint(-0.5F, 1.9F, 0.0F);
        this.rLegMossb.addBox(-0.5F, 0.0F, -3.0F, 1, 6, 6, 0.0F);
        this.setRotateAngle(rLegMossb, 0.0F, 0.0F, -0.17453292519943295F);
        this.lAntler02b = new ModelRenderer(this, 107, 0);
        this.lAntler02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lAntler02b.addBox(-0.7F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.upperJaw = new ModelRenderer(this, 71, 14);
        this.upperJaw.setRotationPoint(0.0F, -3.2F, -3.8F);
        this.upperJaw.addBox(-2.0F, -1.35F, -4.2F, 4, 2, 5, 0.0F);
        this.setRotateAngle(upperJaw, 0.2792526803190927F, 0.0F, 0.0F);
        this.rAntler07a = new ModelRenderer(this, 107, 0);
        this.rAntler07a.mirror = true;
        this.rAntler07a.setRotationPoint(0.0F, 0.1F, 1.0F);
        this.rAntler07a.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rAntler07a, 0.8726646259971648F, 0.0F, 0.593411945678072F);
        this.lAntler05a = new ModelRenderer(this, 107, 0);
        this.lAntler05a.setRotationPoint(0.0F, 0.0F, 4.8F);
        this.lAntler05a.addBox(-0.5F, -3.5F, -0.4F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lAntler05a, -0.10471975511965977F, 0.0F, 0.3665191429188092F);
        this.rAntler11a = new ModelRenderer(this, 107, 0);
        this.rAntler11a.setRotationPoint(-0.4F, 0.0F, -0.2F);
        this.rAntler11a.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rAntler11a, 0.4363323129985824F, 0.0F, -0.4363323129985824F);
        this.spear01a = new ModelRenderer(this, 0, 65);
        this.spear01a.setRotationPoint(4.3F, -15.0F, -11.4F);
        this.spear01a.addBox(-0.8F, -8.0F, -0.5F, 1, 32, 1, 0.0F);
        this.setRotateAngle(spear01a, 0.20943951023931953F, 0.0F, 0.6981317007977318F);
        this.rLegMossa = new ModelRenderer(this, 55, 34);
        this.rLegMossa.mirror = true;
        this.rLegMossa.setRotationPoint(-3.3F, 0.1F, -0.4F);
        this.rLegMossa.addBox(-1.0F, 0.0F, -3.0F, 1, 2, 6, 0.0F);
        this.setRotateAngle(rLegMossa, -0.08726646259971647F, 0.0F, 0.3490658503988659F);
        this.rAntler04c = new ModelRenderer(this, 107, 0);
        this.rAntler04c.mirror = true;
        this.rAntler04c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rAntler04c.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(rAntler04c, 0.7853981633974483F, 0.0F, 0.0F);
        this.rAntler11b = new ModelRenderer(this, 107, 0);
        this.rAntler11b.mirror = true;
        this.rAntler11b.setRotationPoint(0.1F, -2.8F, 0.0F);
        this.rAntler11b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rAntler11b, 0.0F, 0.0F, 0.3141592653589793F);
        this.lAntler10b = new ModelRenderer(this, 107, 0);
        this.lAntler10b.setRotationPoint(0.1F, -3.1F, 0.0F);
        this.lAntler10b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lAntler10b, 0.0F, 0.0F, -0.3141592653589793F);
        this.rightHoof = new ModelRenderer(this, 9, 58);
        this.rightHoof.mirror = true;
        this.rightHoof.setRotationPoint(0.0F, 7.9F, -0.6F);
        this.rightHoof.addBox(-1.5F, 0.0F, -1.7F, 3, 2, 4, 0.0F);
        this.setRotateAngle(rightHoof, 0.22689280275926282F, 0.0F, -0.017453292519943295F);
        this.leftPec = new ModelRenderer(this, 19, 50);
        this.leftPec.setRotationPoint(2.8F, -4.8F, -1.0F);
        this.leftPec.addBox(-2.5F, -2.5F, -3.0F, 5, 5, 3, 0.0F);
        this.setRotateAngle(leftPec, 0.0F, 0.0F, 0.08726646259971647F);
        this.neck01 = new ModelRenderer(this, 28, 0);
        this.neck01.setRotationPoint(0.0F, -2.2F, 0.1F);
        this.neck01.addBox(-3.0F, -3.9F, -2.5F, 6, 3, 5, 0.0F);
        this.setRotateAngle(neck01, 0.13962634015954636F, 0.0F, 0.0F);
        this.rAntler01 = new ModelRenderer(this, 107, 0);
        this.rAntler01.mirror = true;
        this.rAntler01.setRotationPoint(-1.5F, -4.7F, -0.6F);
        this.rAntler01.addBox(-1.0F, -2.2F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(rAntler01, -0.3490658503988659F, 0.0F, -0.2792526803190927F);
        this.rightLeg02 = new ModelRenderer(this, 0, 47);
        this.rightLeg02.mirror = true;
        this.rightLeg02.setRotationPoint(0.0F, 7.0F, 1.4F);
        this.rightLeg02.addBox(-1.0F, 0.0F, -1.5F, 2, 8, 3, 0.0F);
        this.setRotateAngle(rightLeg02, -0.9948376736367678F, 0.0F, 0.0F);
        this.rAntler10b = new ModelRenderer(this, 107, 0);
        this.rAntler10b.mirror = true;
        this.rAntler10b.setRotationPoint(-0.1F, -3.1F, 0.0F);
        this.rAntler10b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rAntler10b, 0.0F, 0.0F, 0.3141592653589793F);
        this.lAntler04 = new ModelRenderer(this, 107, 0);
        this.lAntler04.setRotationPoint(0.0F, 0.0F, 4.8F);
        this.lAntler04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(lAntler04, -0.5235987755982988F, 0.0F, 0.0F);
        this.rAntler09b = new ModelRenderer(this, 107, 0);
        this.rAntler09b.mirror = true;
        this.rAntler09b.setRotationPoint(0.0F, 4.8F, 0.0F);
        this.rAntler09b.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rAntler09b, 0.2792526803190927F, 0.0F, -0.3490658503988659F);
        this.leftLeg01 = new ModelRenderer(this, 0, 34);
        this.leftLeg01.setRotationPoint(0.0F, 7.8F, -0.7F);
        this.leftLeg01.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(leftLeg01, 0.8726646259971648F, 0.0F, 0.08726646259971647F);
        this.rightLeg01 = new ModelRenderer(this, 0, 34);
        this.rightLeg01.mirror = true;
        this.rightLeg01.setRotationPoint(-0.6F, 7.1F, -0.7F);
        this.rightLeg01.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(rightLeg01, 0.6108652381980153F, 0.10471975511965977F, -0.19198621771937624F);
        this.lEar = new ModelRenderer(this, 65, 0);
        this.lEar.setRotationPoint(2.3F, -3.4F, 0.9F);
        this.lEar.addBox(0.0F, -1.0F, -0.5F, 3, 2, 1, 0.0F);
        this.setRotateAngle(lEar, 0.17453292519943295F, -0.3490658503988659F, -0.45378560551852565F);
        this.spear01b = new ModelRenderer(this, 0, 65);
        this.spear01b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spear01b.addBox(-0.2F, -8.0F, -0.5F, 1, 32, 1, 0.0F);
        this.rAntler07b = new ModelRenderer(this, 107, 0);
        this.rAntler07b.mirror = true;
        this.rAntler07b.setRotationPoint(0.0F, 2.9F, 0.0F);
        this.rAntler07b.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rAntler07b, 0.2792526803190927F, 0.0F, 0.0F);
        this.spearTip02 = new ModelRenderer(this, 7, 65);
        this.spearTip02.setRotationPoint(0.0F, 8.5F, 0.0F);
        this.spearTip02.addBox(-1.0F, -0.7F, -0.5F, 2, 2, 1, 0.0F);
        this.plith01 = new ModelRenderer(this, 60, 84);
        this.plith01.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.plith01.addBox(-8.5F, 0.0F, -8.5F, 17, 5, 17, 0.0F);
        this.chest = new ModelRenderer(this, 19, 33);
        this.chest.setRotationPoint(0.0F, -6.1F, 0.0F);
        this.chest.addBox(-4.5F, -8.0F, -3.0F, 9, 8, 6, 0.0F);
        this.setRotateAngle(chest, 0.03490658503988659F, 0.0F, 0.0F);
        this.lAntler01 = new ModelRenderer(this, 107, 0);
        this.lAntler01.setRotationPoint(1.5F, -4.6F, -0.6F);
        this.lAntler01.addBox(-1.0F, -2.3F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lAntler01, -0.3490658503988659F, 0.0F, 0.2792526803190927F);
        this.leftLeg00 = new ModelRenderer(this, 0, 16);
        this.leftLeg00.setRotationPoint(2.2F, 0.7F, 0.6F);
        this.leftLeg00.addBox(-2.0F, -0.7F, -2.5F, 4, 11, 5, 0.0F);
        this.setRotateAngle(leftLeg00, -0.7285004297824331F, -0.2792526803190927F, -0.10471975511965977F);
        this.lAntler05d = new ModelRenderer(this, 107, 0);
        this.lAntler05d.setRotationPoint(0.1F, -3.1F, -0.0F);
        this.lAntler05d.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lAntler05d, 0.0F, 0.0F, -0.3490658503988659F);
        this.rAntler04 = new ModelRenderer(this, 107, 0);
        this.rAntler04.mirror = true;
        this.rAntler04.setRotationPoint(0.0F, 0.0F, 4.8F);
        this.rAntler04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(rAntler04, -0.5235987755982988F, 0.0F, 0.0F);
        this.lAntler10a = new ModelRenderer(this, 107, 0);
        this.lAntler10a.setRotationPoint(0.4F, -0.4F, 0.7F);
        this.lAntler10a.addBox(-0.5F, -3.5F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lAntler10a, 0.0F, 0.0F, 0.3665191429188092F);
        this.rAntler04d = new ModelRenderer(this, 107, 0);
        this.rAntler04d.mirror = true;
        this.rAntler04d.setRotationPoint(0.0F, 0.0F, 3.6F);
        this.rAntler04d.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rAntler04d, 0.3141592653589793F, 0.2617993877991494F, 0.0F);
        this.rAntler09a = new ModelRenderer(this, 107, 0);
        this.rAntler09a.mirror = true;
        this.rAntler09a.setRotationPoint(0.0F, -0.4F, -1.0F);
        this.rAntler09a.addBox(-0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
        this.setRotateAngle(rAntler09a, 0.6108652381980153F, 0.12217304763960307F, -0.4363323129985824F);
        this.neckFur02 = new ModelRenderer(this, 89, 25);
        this.neckFur02.setRotationPoint(0.0F, -2.9F, -1.4F);
        this.neckFur02.addBox(-2.5F, 0.0F, -1.3F, 5, 5, 2, 0.0F);
        this.setRotateAngle(neckFur02, -0.767944870877505F, 0.0F, 0.0F);
        this.rAntler03 = new ModelRenderer(this, 107, 0);
        this.rAntler03.mirror = true;
        this.rAntler03.setRotationPoint(-0.2F, 0.0F, 5.4F);
        this.rAntler03.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(rAntler03, 0.6108652381980153F, 0.2617993877991494F, 0.0F);
        this.lAntler04d = new ModelRenderer(this, 107, 0);
        this.lAntler04d.setRotationPoint(0.0F, 0.0F, 3.6F);
        this.lAntler04d.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lAntler04d, 0.3141592653589793F, -0.2617993877991494F, 0.0F);
        this.upperJaw01 = new ModelRenderer(this, 104, 9);
        this.upperJaw01.setRotationPoint(0.0F, -1.7F, -4.1F);
        this.upperJaw01.addBox(-2.2F, -0.7F, -3.7F, 1, 2, 4, 0.0F);
        this.lAntler11b = new ModelRenderer(this, 107, 0);
        this.lAntler11b.setRotationPoint(0.1F, -2.8F, 0.0F);
        this.lAntler11b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lAntler11b, 0.0F, 0.0F, -0.3141592653589793F);
        this.head = new ModelRenderer(this, 71, 0);
        this.head.setRotationPoint(0.0F, -3.6F, 0.2F);
        this.head.addBox(-3.0F, -4.8F, -4.4F, 6, 5, 7, 0.0F);
        this.setRotateAngle(head, -0.045553093477052F, 0.3141592653589793F, 0.0F);
        this.neckFur04 = new ModelRenderer(this, 89, 36);
        this.neckFur04.setRotationPoint(0.0F, -3.5F, 1.3F);
        this.neckFur04.addBox(-2.5F, 0.0F, -0.7F, 5, 5, 2, 0.0F);
        this.setRotateAngle(neckFur04, 0.5235987755982988F, 0.0F, 0.0F);
        this.rAntler05b = new ModelRenderer(this, 107, 0);
        this.rAntler05b.mirror = true;
        this.rAntler05b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rAntler05b.addBox(-0.5F, -3.5F, -0.9F, 1, 3, 1, 0.0F);
        this.lAntler02a = new ModelRenderer(this, 107, 0);
        this.lAntler02a.setRotationPoint(-0.2F, -1.7F, -0.3F);
        this.lAntler02a.addBox(-0.2F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(lAntler02a, 0.7853981633974483F, 0.5235987755982988F, 0.13962634015954636F);
        this.moss02a = new ModelRenderer(this, 106, 30);
        this.moss02a.setRotationPoint(0.0F, 0.0F, 2.1F);
        this.moss02a.addBox(-4.5F, 0.0F, -0.5F, 9, 2, 1, 0.0F);
        this.setRotateAngle(moss02a, 0.5410520681182421F, 0.0F, 0.0F);
        this.lAntler03 = new ModelRenderer(this, 107, 0);
        this.lAntler03.setRotationPoint(0.2F, 0.0F, 5.4F);
        this.lAntler03.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(lAntler03, 0.6108652381980153F, -0.2617993877991494F, 0.0F);
        this.lAntler09a = new ModelRenderer(this, 107, 0);
        this.lAntler09a.setRotationPoint(0.0F, -0.4F, -1.0F);
        this.lAntler09a.addBox(-0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
        this.setRotateAngle(lAntler09a, 0.6108652381980153F, -0.12217304763960307F, 0.4363323129985824F);
        this.lowerJaw = new ModelRenderer(this, 90, 0);
        this.lowerJaw.setRotationPoint(0.0F, -0.5F, -3.9F);
        this.lowerJaw.addBox(-2.0F, -0.4F, -3.6F, 4, 1, 4, 0.0F);
        this.setRotateAngle(lowerJaw, 0.10471975511965977F, 0.0F, 0.0F);
        this.spear02 = new ModelRenderer(this, 0, 65);
        this.spear02.setRotationPoint(0.0F, 23.8F, 0.0F);
        this.spear02.addBox(-0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F);
        this.rightLeg00 = new ModelRenderer(this, 0, 16);
        this.rightLeg00.mirror = true;
        this.rightLeg00.setRotationPoint(-2.2F, 0.7F, 0.6F);
        this.rightLeg00.addBox(-2.0F, -0.7F, -2.5F, 4, 11, 5, 0.0F);
        this.setRotateAngle(rightLeg00, 0.091106186954104F, -0.19198621771937624F, 0.22689280275926282F);
        this.lAntler07b = new ModelRenderer(this, 107, 0);
        this.lAntler07b.setRotationPoint(0.0F, 2.9F, 0.0F);
        this.lAntler07b.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lAntler07b, 0.2792526803190927F, 0.0F, 0.0F);
        this.upperJaw00 = new ModelRenderer(this, 90, 15);
        this.upperJaw00.setRotationPoint(0.0F, -1.7F, -4.1F);
        this.upperJaw00.addBox(-1.7F, -0.7F, -3.7F, 4, 2, 4, 0.0F);
        this.rAntler02a = new ModelRenderer(this, 107, 0);
        this.rAntler02a.mirror = true;
        this.rAntler02a.setRotationPoint(0.2F, -1.7F, -0.3F);
        this.rAntler02a.addBox(-0.2F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(rAntler02a, 0.7853981633974483F, -0.5235987755982988F, -0.13962634015954636F);
        this.leftHoof = new ModelRenderer(this, 9, 58);
        this.leftHoof.setRotationPoint(0.0F, 7.9F, -0.6F);
        this.leftHoof.addBox(-1.5F, -1.0F, -1.7F, 3, 2, 4, 0.0F);
        this.setRotateAngle(leftHoof, 0.4363323129985824F, 0.0F, 0.03490658503988659F);
        this.lAntler07a = new ModelRenderer(this, 107, 0);
        this.lAntler07a.setRotationPoint(0.0F, 0.1F, 1.0F);
        this.lAntler07a.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lAntler07a, 0.8726646259971648F, 0.0F, -0.593411945678072F);
        this.lAntler05b = new ModelRenderer(this, 107, 0);
        this.lAntler05b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lAntler05b.addBox(-0.5F, -3.5F, -0.9F, 1, 3, 1, 0.0F);
        this.plith02 = new ModelRenderer(this, 68, 64);
        this.plith02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.plith02.addBox(-7.5F, -2.7F, -7.5F, 15, 3, 15, 0.0F);
        this.backFur = new ModelRenderer(this, 71, 42);
        this.backFur.setRotationPoint(0.0F, -7.9F, 2.2F);
        this.backFur.addBox(-3.5F, 0.0F, -0.7F, 7, 6, 2, 0.0F);
        this.setRotateAngle(backFur, 0.3665191429188092F, 0.0F, 0.0F);
        this.rAntler04b = new ModelRenderer(this, 107, 0);
        this.rAntler04b.mirror = true;
        this.rAntler04b.setRotationPoint(0.0F, 0.0F, 4.8F);
        this.rAntler04b.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rAntler04b, 0.3490658503988659F, 0.2617993877991494F, 0.0F);
        this.lAntler11a = new ModelRenderer(this, 107, 0);
        this.lAntler11a.setRotationPoint(0.4F, 0.0F, -0.2F);
        this.lAntler11a.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lAntler11a, 0.4363323129985824F, 0.0F, 0.4363323129985824F);
        this.rightArm01 = new ModelRenderer(this, 53, 17);
        this.rightArm01.mirror = true;
        this.rightArm01.setRotationPoint(-0.8F, 6.3F, -0.0F);
        this.rightArm01.addBox(-1.5F, -1.5F, -2.0F, 3, 12, 4, 0.0F);
        this.setRotateAngle(rightArm01, -0.7853981633974483F, -0.5462880558742251F, -0.08726646259971647F);
        this.lAntler05c = new ModelRenderer(this, 107, 0);
        this.lAntler05c.setRotationPoint(-0.1F, -2.9F, -0.2F);
        this.lAntler05c.addBox(-0.5F, -3.5F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lAntler05c, 0.0F, 0.0F, -0.17453292519943295F);
        this.rAntler05d = new ModelRenderer(this, 107, 0);
        this.rAntler05d.mirror = true;
        this.rAntler05d.setRotationPoint(-0.1F, -3.1F, -0.0F);
        this.rAntler05d.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rAntler05d, 0.0F, 0.0F, 0.3490658503988659F);
        this.neck00 = new ModelRenderer(this, 0, 0);
        this.neck00.setRotationPoint(0.0F, -13.5F, -1.4F);
        this.neck00.addBox(-3.5F, -3.7F, -3.0F, 7, 4, 6, 0.0F);
        this.setRotateAngle(neck00, 0.05235987755982988F, 0.22759093446006054F, 0.0F);
        this.moss02b = new ModelRenderer(this, 106, 34);
        this.moss02b.setRotationPoint(0.0F, 1.8F, 0.0F);
        this.moss02b.addBox(-4.5F, 0.0F, -0.5F, 9, 6, 1, 0.0F);
        this.setRotateAngle(moss02b, -0.2792526803190927F, 0.0F, 0.0F);
        this.mossMantle = new ModelRenderer(this, 87, 44);
        this.mossMantle.setRotationPoint(0.0F, -8.3F, 0.0F);
        this.mossMantle.addBox(-5.5F, 0.0F, -4.3F, 11, 6, 8, 0.0F);
        this.rAntler08b = new ModelRenderer(this, 107, 0);
        this.rAntler08b.mirror = true;
        this.rAntler08b.setRotationPoint(0.0F, 2.9F, 0.0F);
        this.rAntler08b.addBox(-0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
        this.setRotateAngle(rAntler08b, 0.2792526803190927F, 0.0F, -0.3490658503988659F);
        this.rAntler02b = new ModelRenderer(this, 107, 0);
        this.rAntler02b.mirror = true;
        this.rAntler02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rAntler02b.addBox(-0.7F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.lAntler04b = new ModelRenderer(this, 107, 0);
        this.lAntler04b.setRotationPoint(0.0F, 0.0F, 4.8F);
        this.lAntler04b.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lAntler04b, 0.3490658503988659F, -0.2617993877991494F, 0.0F);
        this.rAntler05a = new ModelRenderer(this, 107, 0);
        this.rAntler05a.mirror = true;
        this.rAntler05a.setRotationPoint(0.0F, 0.0F, 4.8F);
        this.rAntler05a.addBox(-0.5F, -3.5F, -0.4F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rAntler05a, -0.10471975511965977F, 0.0F, -0.3665191429188092F);
        this.rAntler10a = new ModelRenderer(this, 107, 0);
        this.rAntler10a.mirror = true;
        this.rAntler10a.setRotationPoint(-0.4F, -0.4F, 0.7F);
        this.rAntler10a.addBox(-0.5F, -3.5F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(rAntler10a, 0.0F, 0.0F, -0.3665191429188092F);
        this.body00 = new ModelRenderer(this, 19, 16);
        this.body00.setRotationPoint(0.0F, -3.7F, 0.5F);
        this.body00.addBox(-4.0F, -6.5F, -2.5F, 8, 8, 5, 0.0F);
        this.setRotateAngle(body00, 0.03490658503988659F, 0.0F, 0.0F);
        this.neckFur03 = new ModelRenderer(this, 71, 33);
        this.neckFur03.setRotationPoint(0.0F, -4.2F, 1.2F);
        this.neckFur03.addBox(-3.0F, 0.0F, -0.7F, 6, 6, 2, 0.0F);
        this.setRotateAngle(neckFur03, 0.6283185307179586F, 0.0F, 0.0F);
        this.lLegMossa = new ModelRenderer(this, 55, 34);
        this.lLegMossa.setRotationPoint(3.3F, 0.1F, -0.4F);
        this.lLegMossa.addBox(0.0F, 0.0F, -3.0F, 1, 2, 6, 0.0F);
        this.setRotateAngle(lLegMossa, -0.08726646259971647F, 0.0F, -0.6981317007977318F);
        this.spearTip03a = new ModelRenderer(this, 6, 71);
        this.spearTip03a.setRotationPoint(0.0F, 10.3F, 0.0F);
        this.spearTip03a.addBox(-1.0F, -1.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(spearTip03a, 0.0F, 0.0F, -0.7853981633974483F);
        this.moss01 = new ModelRenderer(this, 106, 18);
        this.moss01.setRotationPoint(0.0F, 0.0F, -2.2F);
        this.moss01.addBox(-4.5F, 0.0F, -0.5F, 9, 9, 1, 0.0F);
        this.setRotateAngle(moss01, -0.2792526803190927F, 0.0F, 0.0F);
        this.rAntler05c = new ModelRenderer(this, 107, 0);
        this.rAntler05c.mirror = true;
        this.rAntler05c.setRotationPoint(0.1F, -2.9F, -0.2F);
        this.rAntler05c.addBox(-0.5F, -3.5F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(rAntler05c, 0.0F, 0.0F, 0.17453292519943295F);
        this.lAntler08a = new ModelRenderer(this, 107, 0);
        this.lAntler08a.setRotationPoint(0.0F, 0.1F, 1.2F);
        this.lAntler08a.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lAntler08a, 0.6981317007977318F, 0.0F, 0.3490658503988659F);
        this.lMoss = new ModelRenderer(this, 68, 51);
        this.lMoss.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.lMoss.addBox(-0.8F, -0.7F, -2.5F, 4, 5, 5, 0.0F);
        this.lAntler09b = new ModelRenderer(this, 107, 0);
        this.lAntler09b.setRotationPoint(0.0F, 4.8F, 0.0F);
        this.lAntler09b.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lAntler09b, 0.2792526803190927F, 0.0F, 0.3490658503988659F);
        this.rAntler08a = new ModelRenderer(this, 107, 0);
        this.rAntler08a.mirror = true;
        this.rAntler08a.setRotationPoint(0.0F, 0.1F, 1.2F);
        this.rAntler08a.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rAntler08a, 0.6981317007977318F, 0.0F, -0.3490658503988659F);
        this.chest.addChild(this.rightPec);
        this.lAntler08a.addChild(this.lAntler08b);
        this.lAntler04.addChild(this.lAntler04c);
        this.lLegMossa.addChild(this.lLegMossb);
        this.body00.addChild(this.rightArm00);
        this.rightArm00.addChild(this.rMoss);
        this.body00.addChild(this.leftArm00);
        this.neck00.addChild(this.neckFur01);
        this.leftLeg01.addChild(this.leftLeg02);
        this.leftArm00.addChild(this.leftArm01);
        this.head.addChild(this.rEar);
        this.rLegMossa.addChild(this.rLegMossb);
        this.lAntler02a.addChild(this.lAntler02b);
        this.head.addChild(this.upperJaw);
        this.rAntler03.addChild(this.rAntler07a);
        this.lAntler02a.addChild(this.lAntler05a);
        this.rAntler02a.addChild(this.rAntler11a);
        this.body00.addChild(this.rLegMossa);
        this.rAntler04.addChild(this.rAntler04c);
        this.rAntler11a.addChild(this.rAntler11b);
        this.lAntler10a.addChild(this.lAntler10b);
        this.rightLeg02.addChild(this.rightHoof);
        this.chest.addChild(this.leftPec);
        this.neck00.addChild(this.neck01);
        this.head.addChild(this.rAntler01);
        this.rightLeg01.addChild(this.rightLeg02);
        this.rAntler10a.addChild(this.rAntler10b);
        this.lAntler03.addChild(this.lAntler04);
        this.rAntler09a.addChild(this.rAntler09b);
        this.leftLeg00.addChild(this.leftLeg01);
        this.rightLeg00.addChild(this.rightLeg01);
        this.head.addChild(this.lEar);
        this.spear01a.addChild(this.spear01b);
        this.rAntler07a.addChild(this.rAntler07b);
        this.spear02.addChild(this.spearTip02);
        this.body00.addChild(this.chest);
        this.head.addChild(this.lAntler01);
        this.body00.addChild(this.leftLeg00);
        this.lAntler05c.addChild(this.lAntler05d);
        this.rAntler03.addChild(this.rAntler04);
        this.lAntler02a.addChild(this.lAntler10a);
        this.rAntler04c.addChild(this.rAntler04d);
        this.rAntler03.addChild(this.rAntler09a);
        this.neck01.addChild(this.neckFur02);
        this.rAntler02b.addChild(this.rAntler03);
        this.lAntler04c.addChild(this.lAntler04d);
        this.head.addChild(this.upperJaw01);
        this.lAntler11a.addChild(this.lAntler11b);
        this.neck01.addChild(this.head);
        this.neck01.addChild(this.neckFur04);
        this.rAntler05a.addChild(this.rAntler05b);
        this.lAntler01.addChild(this.lAntler02a);
        this.body00.addChild(this.moss02a);
        this.lAntler02b.addChild(this.lAntler03);
        this.lAntler03.addChild(this.lAntler09a);
        this.head.addChild(this.lowerJaw);
        this.spear01a.addChild(this.spear02);
        this.body00.addChild(this.rightLeg00);
        this.lAntler07a.addChild(this.lAntler07b);
        this.head.addChild(this.upperJaw00);
        this.rAntler01.addChild(this.rAntler02a);
        this.leftLeg02.addChild(this.leftHoof);
        this.lAntler03.addChild(this.lAntler07a);
        this.lAntler05a.addChild(this.lAntler05b);
        this.plith01.addChild(this.plith02);
        this.chest.addChild(this.backFur);
        this.rAntler04.addChild(this.rAntler04b);
        this.lAntler02a.addChild(this.lAntler11a);
        this.rightArm00.addChild(this.rightArm01);
        this.lAntler05b.addChild(this.lAntler05c);
        this.rAntler05c.addChild(this.rAntler05d);
        this.body00.addChild(this.neck00);
        this.moss02a.addChild(this.moss02b);
        this.chest.addChild(this.mossMantle);
        this.rAntler08a.addChild(this.rAntler08b);
        this.rAntler02a.addChild(this.rAntler02b);
        this.lAntler04.addChild(this.lAntler04b);
        this.rAntler02a.addChild(this.rAntler05a);
        this.rAntler02a.addChild(this.rAntler10a);
        this.neck00.addChild(this.neckFur03);
        this.body00.addChild(this.lLegMossa);
        this.spear02.addChild(this.spearTip03a);
        this.body00.addChild(this.moss01);
        this.rAntler05b.addChild(this.rAntler05c);
        this.lAntler03.addChild(this.lAntler08a);
        this.leftArm00.addChild(this.lMoss);
        this.lAntler09a.addChild(this.lAntler09b);
        this.rAntler03.addChild(this.rAntler08a);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.spear01a.render(f5);
        this.plith01.render(f5);
        this.body00.render(f5);
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