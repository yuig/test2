package an;

import com.google.zxing.FormatException;

/* loaded from: classes3.dex */
public abstract class j extends gh0.b {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f15623b = {1, 1, 1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f15624c = {1, 1, 1, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f15625d = {1, 1, 1, 1, 1, 1};

    /* renamed from: e, reason: collision with root package name */
    public static final int[][] f15626e;

    /* renamed from: f, reason: collision with root package name */
    public static final int[][] f15627f;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f15626e = iArr;
        int[][] iArr2 = new int[20][];
        f15627f = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i13 = 10; i13 < 20; i13++) {
            int[] iArr3 = f15626e[i13 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i14 = 0; i14 < iArr3.length; i14++) {
                iArr4[i14] = iArr3[(iArr3.length - i14) - 1];
            }
            f15627f[i13] = iArr4;
        }
    }

    public static boolean r0(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i13 = length - 1;
        return s0(charSequence.subSequence(0, i13)) == Character.digit(charSequence.charAt(i13), 10);
    }

    public static int s0(CharSequence charSequence) {
        int length = charSequence.length();
        int i13 = 0;
        for (int i14 = length - 1; i14 >= 0; i14 -= 2) {
            int charAt = charSequence.charAt(i14) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.a();
            }
            i13 += charAt;
        }
        int i15 = i13 * 3;
        for (int i16 = length - 2; i16 >= 0; i16 -= 2) {
            int charAt2 = charSequence.charAt(i16) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.a();
            }
            i15 += charAt2;
        }
        return (1000 - i15) % 10;
    }
}
