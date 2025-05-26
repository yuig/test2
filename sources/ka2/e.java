package ka2;

import dc0.q;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f78956a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f78957b;

    static {
        int[] iArr = new int[n10.d.values().length];
        try {
            iArr[n10.d.VERIFIED_USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n10.d.VERIFIED_MERCHANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f78956a = iArr;
        int[] iArr2 = new int[q.values().length];
        try {
            iArr2[q.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[q.Compact.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[q.List.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f78957b = iArr2;
    }
}
