package pu0;

import com.pinterest.api.model.fk;
import com.pinterest.api.model.wk;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f101387a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f101388b;

    static {
        int[] iArr = new int[fk.values().length];
        try {
            iArr[fk.Instant.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fk.FadeIn.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fk.Expand.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[fk.SlideInLeft.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[fk.SlideInRight.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[fk.SlideInUp.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[fk.SlideInDown.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[fk.Spread.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[fk.ScaleInUp.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[fk.ScaleInDown.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f101387a = iArr;
        int[] iArr2 = new int[wk.values().length];
        try {
            iArr2[wk.Instant.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[wk.FadeOut.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[wk.Shrink.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[wk.SlideOutLeft.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[wk.SlideOutRight.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[wk.SlideOutDown.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[wk.SlideOutUp.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[wk.Collapse.ordinal()] = 8;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[wk.ScaleOutUp.ordinal()] = 9;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[wk.ScaleOutDown.ordinal()] = 10;
        } catch (NoSuchFieldError unused20) {
        }
        f101388b = iArr2;
    }
}
