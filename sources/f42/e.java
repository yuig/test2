package f42;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f61074a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.DENIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.ALLOWED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.BIPA_PERMISSION_REQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f61074a = iArr;
    }
}
