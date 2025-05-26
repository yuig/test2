package pn2;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f100776a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f100777b;

    static {
        int[] iArr = new int[sn2.m.values().length];
        try {
            iArr[sn2.m.INV.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sn2.m.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[sn2.m.IN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f100776a = iArr;
        int[] iArr2 = new int[w0.values().length];
        try {
            iArr2[w0.CHECK_ONLY_LOWER.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[w0.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[w0.SKIP_LOWER.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f100777b = iArr2;
    }
}
