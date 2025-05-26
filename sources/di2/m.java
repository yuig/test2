package di2;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class m {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f55106a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f55107b;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.ON_FOREGROUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.ON_BACKGROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.END_MANUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f55106a = iArr;
        int[] iArr2 = new int[bi2.f.values().length];
        try {
            iArr2[bi2.f.FOREGROUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f55107b = iArr2;
    }
}
