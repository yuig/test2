package z2;

/* loaded from: classes.dex */
public abstract /* synthetic */ class y {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140653a;

    static {
        int[] iArr = new int[x.values().length];
        try {
            iArr[x.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x.Captured.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x.ActiveParent.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[x.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f140653a = iArr;
    }
}
