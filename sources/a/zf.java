package a;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class zf {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f199a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f200b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f201c;

    static {
        int[] iArr = new int[bj.e.values().length];
        try {
            iArr[bj.e.RIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bj.e.LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bj.e.UP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[bj.e.DOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f199a = iArr;
        int[] iArr2 = new int[wi.d.values().length];
        try {
            iArr2[wi.d.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[wi.d.TOP_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[wi.d.BOTTOM_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[wi.d.BOTTOM_LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f200b = iArr2;
        int[] iArr3 = new int[bj.d.values().length];
        try {
            iArr3[bj.d.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[bj.d.ANY.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[bj.d.LANDSCAPE.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[bj.d.PORTRAIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[bj.d.SQUARE.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        f201c = iArr3;
    }
}
