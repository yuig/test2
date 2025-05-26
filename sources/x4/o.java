package x4;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f131802a;

    static {
        int[] iArr = new int[v.values().length];
        f131802a = iArr;
        try {
            iArr[v.UNDEFINED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f131802a[v.SETUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f131802a[v.MOVING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f131802a[v.FINISHED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
