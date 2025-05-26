package s92;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112109a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.OFFLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.WIFI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.CELLULAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f112109a = iArr;
    }
}
