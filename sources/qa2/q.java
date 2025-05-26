package qa2;

import com.pinterest.api.model.g;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f103333a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f103334b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f103335c;

    static {
        int[] iArr = new int[g.b.values().length];
        try {
            iArr[g.b.ENABLED_OVERLAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.b.ENABLED_EXPANSION_OVERLAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.b.ENABLED_FLICKER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f103333a = iArr;
        int[] iArr2 = new int[g0.values().length];
        try {
            iArr2[g0.SHOW_SPONSORSHIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[g0.SHOW_PROMOTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f103334b = iArr2;
        int[] iArr3 = new int[ua2.b1.values().length];
        try {
            iArr3[ua2.b1.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[ua2.b1.FIXED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f103335c = iArr3;
    }
}
