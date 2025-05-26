package ol2;

import jk.v;
import kh2.p2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a */
    @NotNull
    public static final e f96454a = new e(null);

    /* renamed from: b */
    public static final a f96455b;

    static {
        Integer num = hl2.a.f69553b;
        f96455b = (num == null || num.intValue() >= 34) ? new pl2.a() : new c();
    }

    public abstract int a(int i13);

    public double b() {
        return p2.X(a(26), a(27));
    }

    public double c() {
        return d();
    }

    public double d() {
        double b13;
        if (!Double.isInfinite(1.0d) || Double.isInfinite(0.0d) || Double.isNaN(0.0d) || Double.isInfinite(1.0d) || Double.isNaN(1.0d)) {
            b13 = 0.0d + (b() * 1.0d);
        } else {
            double d2 = 2;
            double b14 = ((1.0d / d2) - (0.0d / d2)) * b();
            b13 = 0.0d + b14 + b14;
        }
        return b13 >= 1.0d ? Math.nextAfter(1.0d, Double.NEGATIVE_INFINITY) : b13;
    }

    public int e() {
        return a(32);
    }

    public int f(int i13, int i14) {
        int e13;
        int i15;
        int i16;
        v.h(i13, i14);
        int i17 = i14 - i13;
        if (i17 > 0 || i17 == Integer.MIN_VALUE) {
            if (((-i17) & i17) == i17) {
                i16 = a(v.k(i17));
            } else {
                do {
                    e13 = e() >>> 1;
                    i15 = e13 % i17;
                } while ((i17 - 1) + (e13 - i15) < 0);
                i16 = i15;
            }
            return i13 + i16;
        }
        while (true) {
            int e14 = e();
            if (i13 <= e14 && e14 < i14) {
                return e14;
            }
        }
    }

    public long g() {
        return (e() << 32) + e();
    }
}
