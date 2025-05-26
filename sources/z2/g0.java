package z2;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140618a;

    static {
        int[] iArr = new int[x.values().length];
        try {
            iArr[x.ActiveParent.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x.Active.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x.Captured.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[x.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f140618a = iArr;
    }
}
