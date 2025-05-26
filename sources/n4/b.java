package n4;

import kh2.w;

/* loaded from: classes.dex */
public interface b {
    default long A(float f13) {
        return o(g0(f13));
    }

    default int R(float f13) {
        float l03 = l0(f13);
        if (Float.isInfinite(l03)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(l03);
    }

    default float T(long j13) {
        if (n.a(m.b(j13), 4294967296L)) {
            return l0(t(j13));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    float b();

    default float f0(int i13) {
        return i13 / b();
    }

    default float g0(float f13) {
        return f13 / b();
    }

    float j0();

    default float l0(float f13) {
        return b() * f13;
    }

    default long o(float f13) {
        float[] fArr = o4.b.f92870a;
        if (!(j0() >= 1.03f)) {
            return w.r0(4294967296L, f13 / j0());
        }
        o4.a b13 = o4.b.b(j0());
        return w.r0(4294967296L, b13 != null ? b13.a(f13) : f13 / j0());
    }

    default long p(long j13) {
        return j13 != y2.h.f136670b ? b7.c.e(g0(a3.f.d(j13)), g0(a3.f.b(j13))) : y2.h.f136670b;
    }

    default float t(long j13) {
        float c13;
        float j03;
        if (!n.a(m.b(j13), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        float[] fArr = o4.b.f92870a;
        if (j0() >= 1.03f) {
            o4.a b13 = o4.b.b(j0());
            c13 = m.c(j13);
            if (b13 != null) {
                return b13.b(c13);
            }
            j03 = j0();
        } else {
            c13 = m.c(j13);
            j03 = j0();
        }
        return j03 * c13;
    }

    default long v0(long j13) {
        return j13 != y2.h.f136670b ? bs1.c.c(l0(g.b(j13)), l0(g.a(j13))) : y2.h.f136670b;
    }
}
