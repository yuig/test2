package s3;

/* loaded from: classes.dex */
public abstract /* synthetic */ class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f110913a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f110914b;

    static {
        int[] iArr = new int[g0.values().length];
        try {
            iArr[g0.Measuring.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0.LayingOut.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f110913a = iArr;
        int[] iArr2 = new int[i0.values().length];
        try {
            iArr2[i0.InMeasureBlock.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[i0.InLayoutBlock.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f110914b = iArr2;
    }
}
