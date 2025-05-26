package ll;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f83752a;

    static {
        int[] iArr = new int[u.values().length];
        f83752a = iArr;
        try {
            iArr[u.SHA256.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f83752a[u.SHA384.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f83752a[u.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
