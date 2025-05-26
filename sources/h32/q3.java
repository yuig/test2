package h32;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class q3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f67197a;

    static {
        int[] iArr = new int[r3.values().length];
        try {
            iArr[r3.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r3.PLAYING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r3.PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r3.STALLING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[r3.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f67197a = iArr;
    }
}
