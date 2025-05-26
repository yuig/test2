package com.modiface.mfemakeupkit.effects;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class MFEMakeupLipLayer extends MFEMakeupLayer implements Cloneable {
    public float blurFactor;
    public float blurFactorInnerBottom;
    public float blurFactorInnerTop;
    public Placement placement;
    public Style style;

    public enum Placement {
        Full,
        InnerHorizontal,
        OuterHorizontal,
        InnerVertical,
        OuterVertical;

        private static String[] getEnumNames() {
            Placement[] values = values();
            String[] strArr = new String[values.length];
            for (int i13 = 0; i13 < values.length; i13++) {
                strArr[i13] = values[i13].name();
            }
            return strArr;
        }
    }

    public enum Style {
        Default,
        Brilliant,
        Metallic;

        private static String[] getEnumNames() {
            Style[] values = values();
            String[] strArr = new String[values.length];
            for (int i13 = 0; i13 < values.length; i13++) {
                strArr[i13] = values[i13].name();
            }
            return strArr;
        }
    }

    public MFEMakeupLipLayer() {
        this.blurFactor = 0.7f;
        this.blurFactorInnerTop = 0.7f;
        this.blurFactorInnerBottom = 0.7f;
        this.style = Style.Default;
        this.placement = Placement.Full;
    }

    @Override // com.modiface.mfemakeupkit.effects.MFEMakeupLayer
    @NonNull
    /* renamed from: clone */
    public MFEMakeupLipLayer mo112clone() {
        MFEMakeupLipLayer mFEMakeupLipLayer = new MFEMakeupLipLayer();
        copyBasePropertiesToOther(mFEMakeupLipLayer);
        mFEMakeupLipLayer.blurFactor = this.blurFactor;
        mFEMakeupLipLayer.blurFactorInnerTop = this.blurFactorInnerTop;
        mFEMakeupLipLayer.blurFactorInnerBottom = this.blurFactorInnerBottom;
        mFEMakeupLipLayer.style = this.style;
        mFEMakeupLipLayer.placement = this.placement;
        return mFEMakeupLipLayer;
    }

    public MFEMakeupLipLayer(MFEMakeupProduct mFEMakeupProduct, Style style) {
        super(mFEMakeupProduct);
        this.blurFactor = 0.7f;
        this.blurFactorInnerTop = 0.7f;
        this.blurFactorInnerBottom = 0.7f;
        Style style2 = Style.Default;
        this.style = style2;
        this.placement = Placement.Full;
        this.style = style == null ? style2 : style;
    }
}
