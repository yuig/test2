package hs1;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f70065a;

    static {
        int[] iArr = new int[nd.a.values().length];
        try {
            iArr[nd.a.MEMORY_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[nd.a.LOCAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[nd.a.DATA_DISK_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[nd.a.RESOURCE_DISK_CACHE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[nd.a.REMOTE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f70065a = iArr;
    }
}
