package de1;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f54635a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f54636b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f54637c;

    static {
        int[] iArr = new int[q42.f.values().length];
        try {
            iArr[q42.f.MERCHANT_FILTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q42.f.SHOP_FILTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q42.f.STRUCTURED_CONTENT_TYPE_FILTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f54635a = iArr;
        int[] iArr2 = new int[zd1.q.values().length];
        try {
            iArr2[zd1.q.PRICE_FILTER_ITEM.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[zd1.q.MULTI_SELECT_FILTER_ITEM.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f54636b = iArr2;
        int[] iArr3 = new int[t32.f.values().length];
        try {
            iArr3[t32.f.PRODUCT_ON_SALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[t32.f.PRODUCT_PRICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[t32.f.PRODUCT_MERCHANT.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[t32.f.PRODUCT_BRAND.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        f54637c = iArr3;
    }
}
