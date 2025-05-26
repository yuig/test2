package com.pinterest.shuffles.scene.composer;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f52158a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f52159b;

    static {
        int[] iArr = new int[u0.values().length];
        try {
            iArr[u0.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u0.CENTER_INSIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u0.CENTER_INSIDE_NO_UPSCALE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f52158a = iArr;
        int[] iArr2 = new int[t0.values().length];
        try {
            iArr2[t0.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[t0.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[t0.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[t0.LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[t0.RIGHT.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        f52159b = iArr2;
    }
}
