package da2;

import zd1.p;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f54239a;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.PRODUCT_FILTER_SOURCE_RELATED_PRODUCTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.PRODUCT_FILTER_SOURCE_STELA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p.PRODUCT_FILTER_SOURCE_CLOSEUP_SHOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p.PRODUCT_FILTER_SOURCE_PINCH_TO_ZOOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f54239a = iArr;
    }
}
