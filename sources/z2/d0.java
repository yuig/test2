package z2;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140611a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f140612b;

    static {
        int[] iArr = new int[n4.k.values().length];
        try {
            iArr[n4.k.Ltr.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n4.k.Rtl.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f140611a = iArr;
        int[] iArr2 = new int[x.values().length];
        try {
            iArr2[x.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[x.ActiveParent.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[x.Captured.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[x.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f140612b = iArr2;
    }
}
