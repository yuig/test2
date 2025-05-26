package se0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112381a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f112382b;

    static {
        int[] iArr = new int[yk1.i.values().length];
        try {
            iArr[yk1.i.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yk1.i.LOADED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yk1.i.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f112381a = iArr;
        int[] iArr2 = new int[f.values().length];
        try {
            iArr2[f.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[f.LOADED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[f.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f112382b = iArr2;
    }
}
