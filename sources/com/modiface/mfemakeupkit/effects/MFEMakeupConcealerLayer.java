package com.modiface.mfemakeupkit.effects;

/* loaded from: classes7.dex */
public class MFEMakeupConcealerLayer extends MFEMakeupFoundationLayer implements MFEMakeupConcealerBaseLayer {
    public float offsetX;
    public float offsetY;
    public float scaleX;
    public float scaleY;
    public final Style style;

    public enum Style {
        Custom,
        Default;

        private static String[] getEnumNames() {
            Style[] values = values();
            String[] strArr = new String[values.length];
            for (int i13 = 0; i13 < values.length; i13++) {
                strArr[i13] = values[i13].name();
            }
            return strArr;
        }
    }

    public MFEMakeupConcealerLayer() {
        this(null, Style.Custom);
    }

    public MFEMakeupConcealerLayer(MFEMakeupProduct mFEMakeupProduct, Style style) {
        super(mFEMakeupProduct);
        style = style == null ? Style.Custom : style;
        this.style = style;
        if (style == Style.Custom) {
            this.offsetX = 0.0f;
            this.offsetY = 0.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.sourceSide = 1;
            return;
        }
        this.offsetX = 0.1363f;
        this.offsetY = -0.2416f;
        this.scaleX = 1.332f;
        this.scaleY = 1.045f;
        this.sourceSide = 2;
    }
}
