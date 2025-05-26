package e0;

import android.util.Rational;
import android.util.Size;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Rational f56693a = new Rational(4, 3);

    /* renamed from: b, reason: collision with root package name */
    public static final Rational f56694b = new Rational(3, 4);

    /* renamed from: c, reason: collision with root package name */
    public static final Rational f56695c = new Rational(16, 9);

    /* renamed from: d, reason: collision with root package name */
    public static final Rational f56696d = new Rational(9, 16);

    public static boolean a(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (!rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            Size size3 = k0.c.f77781a;
            if (size.getHeight() * size.getWidth() < k0.c.a(size2)) {
                return false;
            }
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i13 = width % 16;
            if (i13 != 0 || height % 16 != 0) {
                if (i13 == 0) {
                    return b(height, width, rational);
                }
                if (height % 16 == 0) {
                    return b(width, height, rational2);
                }
                return false;
            }
            if (!b(Math.max(0, height - 16), width, rational) && !b(Math.max(0, width - 16), height, rational2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(int i13, int i14, Rational rational) {
        com.bumptech.glide.d.h(i14 % 16 == 0);
        double numerator = (rational.getNumerator() * i13) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i14 + (-16))) && numerator < ((double) (i14 + 16));
    }
}
