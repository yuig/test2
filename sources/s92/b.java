package s92;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112108a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.LOCAL_MEMORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.LOCAL_DISK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.CDN_CACHE_HIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c.CDN_CACHE_MISS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f112108a = iArr;
    }
}
