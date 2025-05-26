package je;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f75675a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f75676b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f75677c;

    static {
        int[] iArr = new int[d1.values().length];
        f75677c = iArr;
        try {
            iArr[d1.Miter.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f75677c[d1.Round.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f75677c[d1.Bevel.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[c1.values().length];
        f75676b = iArr2;
        try {
            iArr2[c1.Butt.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f75676b[c1.Round.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f75676b[c1.Square.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[t.values().length];
        f75675a = iArr3;
        try {
            iArr3[t.xMidYMin.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f75675a[t.xMidYMid.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f75675a[t.xMidYMax.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f75675a[t.xMaxYMin.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f75675a[t.xMaxYMid.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f75675a[t.xMaxYMax.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f75675a[t.xMinYMid.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f75675a[t.xMinYMax.ordinal()] = 8;
        } catch (NoSuchFieldError unused14) {
        }
    }
}
