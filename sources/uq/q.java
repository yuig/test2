package uq;

import rh1.y;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123020a;

    static {
        int[] iArr = new int[y.values().length];
        try {
            iArr[y.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y.TRANSLATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y.ORIGINAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f123020a = iArr;
    }
}
