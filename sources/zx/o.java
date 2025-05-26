package zx;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f142998a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f142999b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f143000c;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.HOURS_24.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.DAYS_7.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.DAYS_14.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f.DAYS_21.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[f.DAYS_30.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[f.DAYS_60.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[f.DAYS_90.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[f.CUSTOM.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f142998a = iArr;
        int[] iArr2 = new int[d.values().length];
        try {
            iArr2[d.ORGANIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[d.PAID_AND_EARNED.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[d.ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        f142999b = iArr2;
        int[] iArr3 = new int[k.values().length];
        try {
            iArr3[k.ALL_PINS.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[k.YOUR_PINS.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[k.OTHER_PINS.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        f143000c = iArr3;
    }
}
