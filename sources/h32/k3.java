package h32;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class k3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f67135a;

    static {
        int[] iArr = new int[l3.values().length];
        try {
            iArr[l3.PROCESSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l3.PROCESSING_FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l3.REVIEWING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l3.REVIEWING_FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l3.SUCCESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[l3.DEFERRED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f67135a = iArr;
    }
}
