package xv1;

import de1.r0;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f136022a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f136023b;

    static {
        int[] iArr = new int[r0.values().length];
        try {
            iArr[r0.PIN_CLOSEUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f136022a = iArr;
        int[] iArr2 = new int[q42.f.values().length];
        try {
            iArr2[q42.f.SHOP_FILTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[q42.f.MERCHANT_FILTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[q42.f.ONE_TAP_CONTENT_TYPE_FILTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        f136023b = iArr2;
    }
}
