package dm1;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f55381a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.NEUTRAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.RECOMMENDATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[d.SUCCESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[d.ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f55381a = iArr;
    }
}
