package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class x {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f33710a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f33711b;

    static {
        int[] iArr = new int[m0.values().length];
        f33711b = iArr;
        try {
            iArr[m0.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f33711b[m0.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f33711b[m0.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[y.values().length];
        f33710a = iArr2;
        try {
            iArr2[y.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f33710a[y.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f33710a[y.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
