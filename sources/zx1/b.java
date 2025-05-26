package zx1;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f143029a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f143030b;

    static {
        int[] iArr = new int[cy1.a.values().length];
        try {
            iArr[cy1.a.REFRESH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cy1.a.FETCH_PIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cy1.a.NAVIGATE_TO_CONVERT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cy1.a.NAVIGATE_TO_GRAPH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f143029a = iArr;
        int[] iArr2 = new int[cy1.f.values().length];
        try {
            iArr2[cy1.f.REFRESH.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[cy1.f.FETCH_METRICS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[cy1.f.NAVIGATE_TO_GRAPH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f143030b = iArr2;
    }
}
