package cl;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f27973a;

    static {
        int[] iArr = new int[ll.n.values().length];
        f27973a = iArr;
        try {
            iArr[ll.n.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f27973a[ll.n.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f27973a[ll.n.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
