package nu;

import mu.i0;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f92311a;

    static {
        int[] iArr = new int[i0.values().length];
        try {
            iArr[i0.NETWORK_ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i0.NETWORK_IF_NOT_CACHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f92311a = iArr;
    }
}
