package fk1;

import qa2.g0;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f62360a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f62361b;

    static {
        int[] iArr = new int[g0.values().length];
        try {
            iArr[g0.SHOW_PROMOTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0.SHOW_SPONSORSHIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g0.SHOW_AFFILIATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g0.DO_NOT_SHOW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f62360a = iArr;
        int[] iArr2 = new int[v32.c.values().length];
        try {
            iArr2[v32.c.LIKE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[v32.c.LAUGH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[v32.c.THANKS.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[v32.c.LIGHTBULB.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[v32.c.WOW.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        f62361b = iArr2;
    }
}
