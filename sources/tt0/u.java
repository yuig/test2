package tt0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f119219a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f119220b;

    static {
        int[] iArr = new int[r.values().length];
        try {
            iArr[r.CAMERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r.ACTIVE_RECORDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r.UNDECIDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[r.COUNTDOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[r.PHOTO.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f119219a = iArr;
        int[] iArr2 = new int[s.values().length];
        try {
            iArr2[s.RECORDING_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[s.RECORDING_STOPPING.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[s.RECORDING_STOPPED.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[s.COUNTDOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[s.PHOTO.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        f119220b = iArr2;
    }
}
