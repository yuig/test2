package hs1;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f70080a;

    static {
        int[] iArr = new int[x.values().length];
        try {
            iArr[x.MEMORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x.DISK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x.NETWORK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f70080a = iArr;
    }
}
