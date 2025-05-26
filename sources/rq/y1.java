package rq;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f109667a;

    static {
        int[] iArr = new int[oq.c1.values().length];
        try {
            iArr[oq.c1.IN_STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[oq.c1.OUT_OF_STOCK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[oq.c1.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f109667a = iArr;
    }
}
