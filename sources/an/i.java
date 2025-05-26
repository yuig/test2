package an;

import java.util.Map;
import kh2.w;

/* loaded from: classes3.dex */
public final class i extends w {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f15620a = {1, 1, 1, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f15621b = {3, 1, 1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[][] f15622c = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // kh2.w, vm.d
    public final xm.b A(String str, vm.a aVar, int i13, int i14, Map map) {
        if (aVar == vm.a.ITF) {
            return super.A(str, aVar, i13, i14, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(aVar)));
    }

    @Override // kh2.w
    public final boolean[] y(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[(length * 9) + 9];
        int r13 = w.r(zArr, 0, f15620a, true);
        for (int i13 = 0; i13 < length; i13 += 2) {
            int digit = Character.digit(str.charAt(i13), 10);
            int digit2 = Character.digit(str.charAt(i13 + 1), 10);
            int[] iArr = new int[10];
            for (int i14 = 0; i14 < 5; i14++) {
                int i15 = i14 * 2;
                int[][] iArr2 = f15622c;
                iArr[i15] = iArr2[digit][i14];
                iArr[i15 + 1] = iArr2[digit2][i14];
            }
            r13 += w.r(zArr, r13, iArr, true);
        }
        w.r(zArr, r13, f15621b, true);
        return zArr;
    }
}
