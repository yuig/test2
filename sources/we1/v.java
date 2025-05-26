package we1;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f129645a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f129646b;

    static {
        int[] iArr = new int[z32.t1.values().length];
        try {
            iArr[z32.t1.REASON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z32.t1.REACTION_COUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f129645a = iArr;
        int[] iArr2 = new int[z32.q1.values().length];
        try {
            iArr2[z32.q1.BOTTOM_RIGHT_INSIDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[z32.q1.BOTTOM_LEFT_INSIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[z32.q1.BOTTOM_LEFT_OUTSIDE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f129646b = iArr2;
    }
}
