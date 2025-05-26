package kotlin.collections;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f80355a;

    static {
        int[] iArr = new int[k1.values().length];
        try {
            iArr[k1.Done.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k1.Ready.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f80355a = iArr;
    }
}
