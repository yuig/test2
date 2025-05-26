package c71;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26813a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f26814b;

    static {
        int[] iArr = new int[t32.f.values().length];
        try {
            iArr[t32.f.PRODUCT_PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t32.f.PRODUCT_BRAND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t32.f.PRODUCT_MERCHANT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[t32.f.PRODUCT_ON_SALE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f26813a = iArr;
        int[] iArr2 = new int[h61.h.values().length];
        try {
            iArr2[h61.h.PRODUCTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[h61.h.VIDEOS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[h61.h.BOARDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[h61.h.USERS.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[h61.h.PINS.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        f26814b = iArr2;
    }
}
