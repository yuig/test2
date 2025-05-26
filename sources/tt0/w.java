package tt0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f119225a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.RECORDING_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.RECORDING_STOPPING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.RECORDING_STOPPED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s.PHOTO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f119225a = iArr;
    }
}
