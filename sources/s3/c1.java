package s3;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f110745a;

    static {
        int[] iArr = new int[g0.values().length];
        try {
            iArr[g0.LookaheadMeasuring.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0.Measuring.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g0.LookaheadLayingOut.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g0.LayingOut.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[g0.Idle.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f110745a = iArr;
    }
}
