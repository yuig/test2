package tl1;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f118074a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f118075b;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.StartBelow.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.StartAbove.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f118074a = iArr;
        int[] iArr2 = new int[o.values().length];
        try {
            iArr2[o.Bold.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[o.Normal.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f118075b = iArr2;
    }
}
