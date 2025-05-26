package em1;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f59628a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f59629b;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.UNCHECKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.INDETERMINATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.CHECKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f59628a = iArr;
        int[] iArr2 = new int[e.values().length];
        try {
            iArr2[e.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[e.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[e.ENABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f59629b = iArr2;
    }
}
