package a41;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f594a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f595b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f596c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f597d;

    static {
        int[] iArr = new int[k0.values().length];
        try {
            iArr[k0.Expanded.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k0.Collapsed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f594a = iArr;
        int[] iArr2 = new int[g0.values().length];
        try {
            iArr2[g0.AvatarIcon.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[g0.BackIcon.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[g0.OptionsIcon.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[g0.SettingsIcon.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[g0.ShareIcon.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f595b = iArr2;
        int[] iArr3 = new int[n10.d.values().length];
        try {
            iArr3[n10.d.VERIFIED_USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        f596c = iArr3;
        int[] iArr4 = new int[f.values().length];
        try {
            iArr4[f.FadeIn.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[f.FadeOut.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f597d = iArr4;
    }
}
