package an2;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15811a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f15812b;

    static {
        int[] iArr = new int[n0.values().length];
        try {
            iArr[n0.PLAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n0.HTML.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f15811a = iArr;
        int[] iArr2 = new int[j0.values().length];
        try {
            iArr2[j0.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[j0.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[j0.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f15812b = iArr2;
    }
}
