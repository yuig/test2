package t9;

import android.graphics.Rect;
import d7.c0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f116775b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f116776c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f116777d;

    /* renamed from: e, reason: collision with root package name */
    public int f116778e;

    /* renamed from: f, reason: collision with root package name */
    public int f116779f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f116780g;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f116774a = new int[4];

    /* renamed from: h, reason: collision with root package name */
    public int f116781h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f116782i = -1;

    public static int a(int[] iArr, int i13) {
        return (i13 < 0 || i13 >= iArr.length) ? iArr[0] : iArr[i13];
    }

    public static int c(int i13, int i14) {
        return (i13 & 16777215) | ((i14 * 17) << 24);
    }

    public final void b(c0 c0Var, boolean z13, Rect rect, int[] iArr) {
        int i13;
        int i14;
        int width = rect.width();
        int height = rect.height();
        int i15 = !z13 ? 1 : 0;
        int i16 = i15 * width;
        while (true) {
            int i17 = 0;
            do {
                int i18 = 0;
                for (int i19 = 1; i18 < i19 && i19 <= 64; i19 <<= 2) {
                    if (c0Var.b() < 4) {
                        i13 = -1;
                        i14 = 0;
                        break;
                    }
                    i18 = (i18 << 4) | c0Var.g(4);
                }
                i13 = i18 & 3;
                i14 = i18 < 4 ? width : i18 >> 2;
                int min = Math.min(i14, width - i17);
                if (min > 0) {
                    int i23 = i16 + min;
                    Arrays.fill(iArr, i16, i23, this.f116774a[i13]);
                    i17 += min;
                    i16 = i23;
                }
            } while (i17 < width);
            i15 += 2;
            if (i15 >= height) {
                return;
            }
            i16 = i15 * width;
            c0Var.c();
        }
    }
}
