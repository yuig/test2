package yi1;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139119a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f139120b;

    static {
        int[] iArr = new int[g0.values().length];
        try {
            iArr[g0.COLLAGE_FEED_BORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f139119a = iArr;
        int[] iArr2 = new int[m.values().length];
        try {
            iArr2[m.BOTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[m.VERTICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[m.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f139120b = iArr2;
    }
}
