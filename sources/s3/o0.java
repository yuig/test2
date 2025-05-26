package s3;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f110850a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f110851b;

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
            iArr[g0.LayingOut.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g0.LookaheadLayingOut.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f110850a = iArr;
        int[] iArr2 = new int[i0.values().length];
        try {
            iArr2[i0.InMeasureBlock.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[i0.InLayoutBlock.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f110851b = iArr2;
    }
}
