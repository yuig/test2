package zp;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f142525a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.VisibleToYouAndOthers.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.VisibleToOnlyOthers.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.Hidden.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f142525a = iArr;
    }
}
