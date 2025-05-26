package vc;

/* loaded from: classes.dex */
public abstract /* synthetic */ class s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f125571a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.CacheOnly.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.NetworkOnly.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.CacheFirst.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f.NetworkFirst.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[f.CacheAndNetwork.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f125571a = iArr;
    }
}
