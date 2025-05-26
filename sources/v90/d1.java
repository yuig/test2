package v90;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f124878a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f124879b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f124880c;

    static {
        int[] iArr = new int[s90.v0.values().length];
        try {
            iArr[s90.v0.PinCloseup.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s90.v0.Composer.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s90.v0.Effects.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f124878a = iArr;
        int[] iArr2 = new int[p1.values().length];
        try {
            iArr2[p1.Add.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[p1.Erase.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f124879b = iArr2;
        int[] iArr3 = new int[n1.values().length];
        try {
            iArr3[n1.SELECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[n1.REFINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f124880c = iArr3;
    }
}
