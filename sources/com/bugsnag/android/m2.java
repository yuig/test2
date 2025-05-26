package com.bugsnag.android;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f29348a;

    static {
        int[] iArr = new int[g0.values().length];
        f29348a = iArr;
        try {
            iArr[g0.DELIVERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f29348a[g0.UNDELIVERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f29348a[g0.FAILURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
