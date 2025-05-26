package c2;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class w5 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25362a;

    static {
        int[] iArr = new int[v2.values().length];
        try {
            iArr[v2.Focused.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v2.UnfocusedEmpty.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v2.UnfocusedNotEmpty.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f25362a = iArr;
    }
}
