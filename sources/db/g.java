package db;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f54272a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.STRICT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.LOG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.QUIET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f54272a = iArr;
    }
}
