package fc;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f61619a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f61620b;

    static {
        int[] iArr = new int[ec.i.values().length];
        f61620b = iArr;
        try {
            iArr[ec.i.MASK_MODE_NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f61620b[ec.i.MASK_MODE_SUBTRACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f61620b[ec.i.MASK_MODE_INTERSECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f61620b[ec.i.MASK_MODE_ADD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[g.values().length];
        f61619a = iArr2;
        try {
            iArr2[g.SHAPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f61619a[g.PRE_COMP.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f61619a[g.SOLID.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f61619a[g.IMAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f61619a[g.NULL.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f61619a[g.TEXT.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f61619a[g.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
