package fh2;

import th2.g;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f62170a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.REACT_NATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.UNITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.FLUTTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f62170a = iArr;
    }
}
