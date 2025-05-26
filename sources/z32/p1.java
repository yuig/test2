package z32;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140828a;

    static {
        int[] iArr = new int[q1.values().length];
        try {
            iArr[q1.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q1.BOTTOM_LEFT_INSIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q1.BOTTOM_LEFT_OUTSIDE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q1.BOTTOM_RIGHT_INSIDE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[q1.BOTTOM_RIGHT_OUTSIDE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[q1.BOTTOM_CENTER_BORDER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f140828a = iArr;
    }
}
