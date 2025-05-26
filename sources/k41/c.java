package k41;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f78303a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f78304b;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.Wide.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.Default.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.Compact.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f78303a = iArr;
        int[] iArr2 = new int[zo.c.values().length];
        try {
            iArr2[zo.c.SINGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[zo.c.DENSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[zo.c.DEFAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f78304b = iArr2;
    }
}
