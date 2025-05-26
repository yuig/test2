package tm1;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f118137a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f118138b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f118139c;

    static {
        int[] iArr = new int[g92.d.values().length];
        try {
            iArr[g92.d.CALICO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f118137a = iArr;
        int[] iArr2 = new int[a.values().length];
        try {
            iArr2[a.RATIO_1_1.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[a.RATIO_3_2.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f118138b = iArr2;
        int[] iArr3 = new int[b.values().length];
        try {
            iArr3[b.SPOT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[b.HERO.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f118139c = iArr3;
    }
}
