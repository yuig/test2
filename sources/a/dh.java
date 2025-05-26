package a;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class dh {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f32a;

    static {
        int[] iArr = new int[wi.d.values().length];
        try {
            iArr[wi.d.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wi.d.BOTTOM_LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wi.d.BOTTOM_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[wi.d.TOP_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f32a = iArr;
    }
}
