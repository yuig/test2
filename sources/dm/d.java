package dm;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f55309a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f55310b;

    static {
        int[] iArr = new int[fm.f.values().length];
        f55310b = iArr;
        try {
            iArr[fm.f.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f55310b[fm.f.BAD_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f55310b[fm.f.AUTH_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[fm.d.values().length];
        f55309a = iArr2;
        try {
            iArr2[fm.d.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f55309a[fm.d.BAD_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
