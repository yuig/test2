package yf1;

import a42.r;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f138966a;

    static {
        int[] iArr = new int[r.values().length];
        try {
            iArr[r.UNSATISFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r.NEUTRAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r.SATISFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f138966a = iArr;
    }
}
