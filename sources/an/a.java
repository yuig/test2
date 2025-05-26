package an;

/* loaded from: classes3.dex */
public abstract class a extends gh0.b {

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f15607b = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f15608c = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    public static boolean r0(char c13, char[] cArr) {
        for (char c14 : cArr) {
            if (c14 == c13) {
                return true;
            }
        }
        return false;
    }
}
