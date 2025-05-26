package f4;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f61036a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f61037b = new Object[0];

    public static final int a(int i13, int i14, int[] iArr) {
        int i15 = i13 - 1;
        int i16 = 0;
        while (i16 <= i15) {
            int i17 = (i16 + i15) >>> 1;
            int i18 = iArr[i17];
            if (i18 < i14) {
                i16 = i17 + 1;
            } else {
                if (i18 <= i14) {
                    return i17;
                }
                i15 = i17 - 1;
            }
        }
        return ~i16;
    }
}
