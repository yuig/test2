package es;

import com.pinterest.api.model.g;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f59986a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f59987b;

    static {
        int[] iArr = new int[x32.e.values().length];
        try {
            iArr[x32.e.RATING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x32.e.PRICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x32.e.DELIVERY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f59986a = iArr;
        int[] iArr2 = new int[g.b.values().length];
        try {
            iArr2[g.b.CONTROL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[g.b.ENABLED_FLICKER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[g.b.ENABLED_OVERLAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[g.b.CONTROL_EXPANSION.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[g.b.ENABLED_EXPANSION_OVERLAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[g.b.ENABLED_EXPANSION_ICON.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        f59987b = iArr2;
    }
}
