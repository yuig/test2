package yb;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f138404a;

    static {
        int[] iArr = new int[ec.k.values().length];
        f138404a = iArr;
        try {
            iArr[ec.k.MERGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f138404a[ec.k.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f138404a[ec.k.SUBTRACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f138404a[ec.k.INTERSECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f138404a[ec.k.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
