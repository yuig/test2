package g32;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f63452a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.TRUSTED_NATIVE_CREATOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.CREATOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.NON_CREATOR_BIZ.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c.TOP_VETTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f63452a = iArr;
    }
}
