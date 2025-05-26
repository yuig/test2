package com.modiface.mfemakeupkit.effects;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class MFEMakeupFoundationLayer extends MFEMakeupLayer implements Cloneable {
    public MFEMakeupProduct shadeMatchedProduct;

    public MFEMakeupFoundationLayer() {
        this.shadeMatchedProduct = null;
    }

    public MFEMakeupFoundationLayer(MFEMakeupProduct mFEMakeupProduct) {
        super(mFEMakeupProduct);
        this.shadeMatchedProduct = null;
    }

    @Override // com.modiface.mfemakeupkit.effects.MFEMakeupLayer
    @NonNull
    /* renamed from: clone */
    public MFEMakeupFoundationLayer mo112clone() {
        MFEMakeupFoundationLayer mFEMakeupFoundationLayer = new MFEMakeupFoundationLayer();
        copyBasePropertiesToOther(mFEMakeupFoundationLayer);
        MFEMakeupProduct mFEMakeupProduct = this.shadeMatchedProduct;
        mFEMakeupFoundationLayer.shadeMatchedProduct = mFEMakeupProduct == null ? null : mFEMakeupProduct.m115clone();
        return mFEMakeupFoundationLayer;
    }

    public MFEMakeupFoundationLayer(MFEMakeupProduct mFEMakeupProduct, MFEMakeupProduct mFEMakeupProduct2) {
        this(mFEMakeupProduct);
        this.shadeMatchedProduct = mFEMakeupProduct2;
    }
}
