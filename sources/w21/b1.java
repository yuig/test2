package w21;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f127652a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.PreInitial.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.Initial.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.Expanded.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.Final.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[e.Expired.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f127652a = iArr;
    }
}
