package cn1;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class z {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f28257a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f28258b;

    static {
        int[] iArr = new int[dn1.d.values().length];
        try {
            iArr[dn1.d.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dn1.d.TRANSPARENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f28257a = iArr;
        int[] iArr2 = new int[dn1.e.values().length];
        try {
            iArr2[dn1.e.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[dn1.e.LEADING_ICON_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[dn1.e.TRAILING_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[dn1.e.END_ACTION_BUTTONS_DEFAULT.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[dn1.e.END_ACTION_BUTTONS_CUSTOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f28258b = iArr2;
    }
}
