package xe1;

import z32.s0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f134758a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f134759b;

    static {
        int[] iArr = new int[ue1.t.values().length];
        try {
            iArr[ue1.t.PIN_REP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ue1.t.SHOPPING_PIN_REP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ue1.t.IDEA_PIN_REP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ue1.t.IMAGE_ONLY_REP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f134758a = iArr;
        int[] iArr2 = new int[s0.values().length];
        try {
            iArr2[s0.CLOSEUP_MODULE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        f134759b = iArr2;
    }
}
