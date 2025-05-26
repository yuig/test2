package z32;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140808a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.COLLAPSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.PREVIEW_EXPANDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.PREVIEW_COLLAPSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f140808a = iArr;
    }
}
