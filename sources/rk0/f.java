package rk0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108458a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f108459b;

    static {
        int[] iArr = new int[jl0.d.values().length];
        try {
            iArr[jl0.d.VIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f108458a = iArr;
        int[] iArr2 = new int[s42.b.values().length];
        try {
            iArr2[s42.b.SELECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[s42.b.UNSELECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f108459b = iArr2;
    }
}
