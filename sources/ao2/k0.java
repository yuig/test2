package ao2;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20169a;

    static {
        int[] iArr = new int[l0.values().length];
        try {
            iArr[l0.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l0.ATOMIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l0.UNDISPATCHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l0.LAZY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f20169a = iArr;
    }
}
