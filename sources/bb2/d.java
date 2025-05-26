package bb2;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22602a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f22603b;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.FIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.FILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f22602a = iArr;
        int[] iArr2 = new int[a.values().length];
        try {
            iArr2[a.SCALE_TO_MAX_WIDTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[a.SCALE_TO_MAX_HEIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f22603b = iArr2;
    }
}
