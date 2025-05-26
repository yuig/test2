package com.modiface.mfemakeupkit.effects;

import android.graphics.PointF;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class MFEMakeupDeformableFoundationLayer extends MFEMakeupLayer implements Cloneable, MFEMakeupDeformableFoundationBaseLayer {
    public float deformationAreaFactor;
    public float eraseBlurFactor;
    public float eraseExpandFactorHorizontal;
    public float eraseExpandFactorTop;
    public PointF[] referenceCheekPoints;
    public PointF[] referenceContourPoints;
    public PointF[] referenceFacePoints;
    public float referenceFaceRotationX;
    public float referenceFaceRotationY;
    public float referenceFaceRotationZ;
    public PointF[] referenceForeheadPoints;
    public PointF[] referenceInnerMouthPoints;
    public boolean referenceIsContourUsed;
    public boolean referenceIsMouthOpen;
    public PointF[] referenceLeftBrowPoints;
    public PointF[] referenceLeftExtendedBrowPoints;
    public PointF[] referenceLeftEyePoints;
    public PointF[] referenceNosePoints;
    public PointF[] referenceOuterMouthPoints;
    public PointF[] referenceRightBrowPoints;
    public PointF[] referenceRightExtendedBrowPoints;
    public PointF[] referenceRightEyePoints;

    public MFEMakeupDeformableFoundationLayer() {
        this.referenceIsMouthOpen = false;
        this.referenceIsContourUsed = false;
        this.referenceFaceRotationX = 0.0f;
        this.referenceFaceRotationY = 0.0f;
        this.referenceFaceRotationZ = 0.0f;
        this.deformationAreaFactor = 1.0f;
        this.eraseExpandFactorTop = 1.0f;
        this.eraseExpandFactorHorizontal = 1.0f;
        this.eraseBlurFactor = 1.0f;
    }

    @Override // com.modiface.mfemakeupkit.effects.MFEMakeupLayer
    @NonNull
    /* renamed from: clone */
    public MFEMakeupDeformableFoundationLayer mo112clone() {
        MFEMakeupDeformableFoundationLayer mFEMakeupDeformableFoundationLayer = new MFEMakeupDeformableFoundationLayer();
        copyBasePropertiesToOther(mFEMakeupDeformableFoundationLayer);
        PointF[] pointFArr = this.referenceLeftEyePoints;
        mFEMakeupDeformableFoundationLayer.referenceLeftEyePoints = pointFArr == null ? null : (PointF[]) pointFArr.clone();
        PointF[] pointFArr2 = this.referenceLeftBrowPoints;
        mFEMakeupDeformableFoundationLayer.referenceLeftBrowPoints = pointFArr2 == null ? null : (PointF[]) pointFArr2.clone();
        PointF[] pointFArr3 = this.referenceRightEyePoints;
        mFEMakeupDeformableFoundationLayer.referenceRightEyePoints = pointFArr3 == null ? null : (PointF[]) pointFArr3.clone();
        PointF[] pointFArr4 = this.referenceRightBrowPoints;
        mFEMakeupDeformableFoundationLayer.referenceRightBrowPoints = pointFArr4 == null ? null : (PointF[]) pointFArr4.clone();
        PointF[] pointFArr5 = this.referenceOuterMouthPoints;
        mFEMakeupDeformableFoundationLayer.referenceOuterMouthPoints = pointFArr5 == null ? null : (PointF[]) pointFArr5.clone();
        PointF[] pointFArr6 = this.referenceInnerMouthPoints;
        mFEMakeupDeformableFoundationLayer.referenceInnerMouthPoints = pointFArr6 == null ? null : (PointF[]) pointFArr6.clone();
        PointF[] pointFArr7 = this.referenceFacePoints;
        mFEMakeupDeformableFoundationLayer.referenceFacePoints = pointFArr7 == null ? null : (PointF[]) pointFArr7.clone();
        PointF[] pointFArr8 = this.referenceContourPoints;
        mFEMakeupDeformableFoundationLayer.referenceContourPoints = pointFArr8 == null ? null : (PointF[]) pointFArr8.clone();
        PointF[] pointFArr9 = this.referenceForeheadPoints;
        mFEMakeupDeformableFoundationLayer.referenceForeheadPoints = pointFArr9 == null ? null : (PointF[]) pointFArr9.clone();
        PointF[] pointFArr10 = this.referenceNosePoints;
        mFEMakeupDeformableFoundationLayer.referenceNosePoints = pointFArr10 == null ? null : (PointF[]) pointFArr10.clone();
        PointF[] pointFArr11 = this.referenceCheekPoints;
        mFEMakeupDeformableFoundationLayer.referenceCheekPoints = pointFArr11 == null ? null : (PointF[]) pointFArr11.clone();
        PointF[] pointFArr12 = this.referenceLeftExtendedBrowPoints;
        mFEMakeupDeformableFoundationLayer.referenceLeftExtendedBrowPoints = pointFArr12 == null ? null : (PointF[]) pointFArr12.clone();
        PointF[] pointFArr13 = this.referenceRightExtendedBrowPoints;
        mFEMakeupDeformableFoundationLayer.referenceRightExtendedBrowPoints = pointFArr13 != null ? (PointF[]) pointFArr13.clone() : null;
        mFEMakeupDeformableFoundationLayer.referenceIsMouthOpen = this.referenceIsMouthOpen;
        mFEMakeupDeformableFoundationLayer.referenceIsContourUsed = this.referenceIsContourUsed;
        mFEMakeupDeformableFoundationLayer.referenceFaceRotationX = this.referenceFaceRotationX;
        mFEMakeupDeformableFoundationLayer.referenceFaceRotationY = this.referenceFaceRotationY;
        mFEMakeupDeformableFoundationLayer.referenceFaceRotationZ = this.referenceFaceRotationZ;
        mFEMakeupDeformableFoundationLayer.deformationAreaFactor = this.deformationAreaFactor;
        mFEMakeupDeformableFoundationLayer.eraseExpandFactorTop = this.eraseExpandFactorTop;
        mFEMakeupDeformableFoundationLayer.eraseExpandFactorHorizontal = this.eraseExpandFactorHorizontal;
        mFEMakeupDeformableFoundationLayer.eraseBlurFactor = this.eraseBlurFactor;
        return mFEMakeupDeformableFoundationLayer;
    }

    public MFEMakeupDeformableFoundationLayer(MFEMakeupProduct mFEMakeupProduct) {
        super(mFEMakeupProduct);
        this.referenceIsMouthOpen = false;
        this.referenceIsContourUsed = false;
        this.referenceFaceRotationX = 0.0f;
        this.referenceFaceRotationY = 0.0f;
        this.referenceFaceRotationZ = 0.0f;
        this.deformationAreaFactor = 1.0f;
        this.eraseExpandFactorTop = 1.0f;
        this.eraseExpandFactorHorizontal = 1.0f;
        this.eraseBlurFactor = 1.0f;
    }
}
