package kotlin.jvm.internal;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f80440a;

    static {
        int[] iArr = new int[rl2.z.values().length];
        try {
            iArr[rl2.z.INVARIANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rl2.z.IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rl2.z.OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f80440a = iArr;
    }
}
