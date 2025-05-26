package ep0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f59888a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.PICTURE_TAKEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.LIVE_CAMERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.WAITING_LOCK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.WAITING_PRECAPTURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[b.WAITING_NON_PRECAPTURE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f59888a = iArr;
    }
}
