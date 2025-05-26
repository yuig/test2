package com.google.protobuf;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f33868a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f33869b;

    static {
        int[] iArr = new int[x0.values().length];
        f33869b = iArr;
        try {
            iArr[x0.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f33869b[x0.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f33869b[x0.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[e0.values().length];
        f33868a = iArr2;
        try {
            iArr2[e0.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f33868a[e0.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f33868a[e0.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
