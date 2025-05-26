package h32;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f67429a;

    static {
        int[] iArr = new int[z0.values().length];
        try {
            iArr[z0.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z0.BACKGROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z0.INACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[z0.ACTIVE_OFFLINE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[z0.BACKGROUND_OFFLINE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[z0.INACTIVE_OFFLINE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[z0.OTHER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f67429a = iArr;
    }
}
