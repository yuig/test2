package b42;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21778a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.EVEN_BLOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.BIG_OFFSET_BLOCK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.SMALL_OFFSET_BLOCK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.BIG_SINGLE_OFFSET_BLOCK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f21778a = iArr;
    }
}
