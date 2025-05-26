package yf0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f138958a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.STATUS_BAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.NAVIGATION_BAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.SYSTEM_BARS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f138958a = iArr;
    }
}
