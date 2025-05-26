package ec;

/* loaded from: classes.dex */
public abstract /* synthetic */ class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f58350a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f58351b;

    static {
        int[] iArr = new int[w.values().length];
        f58351b = iArr;
        try {
            iArr[w.BEVEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f58351b[w.MITER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f58351b[w.ROUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[v.values().length];
        f58350a = iArr2;
        try {
            iArr2[v.BUTT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f58350a[v.ROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f58350a[v.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
