package z2;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140606a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f140607b;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.Redirected.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.Cancelled.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.RedirectCancelled.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f140606a = iArr;
        int[] iArr2 = new int[x.values().length];
        try {
            iArr2[x.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[x.Captured.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[x.ActiveParent.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[x.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f140607b = iArr2;
    }
}
