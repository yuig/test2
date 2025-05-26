package vw1;

import tf.h;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f126803a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.LINEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.STEPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.CUBIC_BEZIER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.HORIZONTAL_BEZIER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f126803a = iArr;
    }
}
