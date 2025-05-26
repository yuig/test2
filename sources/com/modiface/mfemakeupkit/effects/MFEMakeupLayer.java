package com.modiface.mfemakeupkit.effects;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class MFEMakeupLayer implements Cloneable {
    public BlendMode blendMode;
    public String glitterMaskImagePath;
    public String glitterSurfaceNormalImagePath;
    public int maskImageHeight;
    public String maskImagePath;
    public int maskImageWidth;
    public MFEMakeupProduct product;
    public int sourceSide;
    public int targetSide;

    public enum BlendMode {
        Makeup,
        AlphaBlend,
        MakeupBlend,
        SolidColorBlend;

        public static String[] getEnumNames() {
            BlendMode[] values = values();
            String[] strArr = new String[values.length];
            for (int i13 = 0; i13 < values.length; i13++) {
                strArr[i13] = values[i13].name();
            }
            return strArr;
        }
    }

    public static final class Side {
        public static final int Both = 3;
        public static final int Left = 1;
        public static final int None = 0;
        public static final int Right = 2;
    }

    public MFEMakeupLayer() {
        this.product = null;
        this.maskImagePath = null;
        this.glitterMaskImagePath = null;
        this.glitterSurfaceNormalImagePath = null;
        this.blendMode = BlendMode.Makeup;
        this.targetSide = 3;
        this.sourceSide = 1;
    }

    public void copyBasePropertiesToOther(@NonNull MFEMakeupLayer mFEMakeupLayer) {
        MFEMakeupProduct mFEMakeupProduct = this.product;
        mFEMakeupLayer.product = mFEMakeupProduct == null ? null : mFEMakeupProduct.m115clone();
        mFEMakeupLayer.maskImagePath = this.maskImagePath;
        mFEMakeupLayer.maskImageWidth = this.maskImageWidth;
        mFEMakeupLayer.maskImageHeight = this.maskImageHeight;
        mFEMakeupLayer.glitterMaskImagePath = this.glitterMaskImagePath;
        mFEMakeupLayer.glitterSurfaceNormalImagePath = this.glitterSurfaceNormalImagePath;
        mFEMakeupLayer.blendMode = this.blendMode;
        mFEMakeupLayer.targetSide = this.targetSide;
        mFEMakeupLayer.sourceSide = this.sourceSide;
    }

    @Override // 
    @NonNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public MFEMakeupLayer mo112clone() {
        MFEMakeupLayer mFEMakeupLayer = new MFEMakeupLayer();
        copyBasePropertiesToOther(mFEMakeupLayer);
        return mFEMakeupLayer;
    }

    public MFEMakeupLayer(MFEMakeupProduct mFEMakeupProduct) {
        this.product = null;
        this.maskImagePath = null;
        this.glitterMaskImagePath = null;
        this.glitterSurfaceNormalImagePath = null;
        this.blendMode = BlendMode.Makeup;
        this.targetSide = 3;
        this.sourceSide = 1;
        this.product = mFEMakeupProduct;
    }
}
