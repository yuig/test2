package uk;

import il.l4;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f122364a;

    static {
        int[] iArr = new int[l4.values().length];
        f122364a = iArr;
        try {
            iArr[l4.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f122364a[l4.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f122364a[l4.DESTROYED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
