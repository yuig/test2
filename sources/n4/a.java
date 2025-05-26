package n4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f89168a;

    public /* synthetic */ a(long j13) {
        this.f89168a = j13;
    }

    public static long a(long j13, int i13, int i14, int i15, int i16, int i17) {
        if ((i17 & 1) != 0) {
            i13 = j(j13);
        }
        if ((i17 & 2) != 0) {
            i14 = h(j13);
        }
        if ((i17 & 4) != 0) {
            i15 = i(j13);
        }
        if ((i17 & 8) != 0) {
            i16 = g(j13);
        }
        if (!(i15 >= 0 && i13 >= 0)) {
            kh2.n.i0("minHeight(" + i15 + ") and minWidth(" + i13 + ") must be >= 0");
            throw null;
        }
        if (!(i14 >= i13)) {
            kh2.n.i0("maxWidth(" + i14 + ") must be >= minWidth(" + i13 + ')');
            throw null;
        }
        if (i16 >= i15) {
            return bs1.c.N(i13, i14, i15, i16);
        }
        kh2.n.i0("maxHeight(" + i16 + ") must be >= minHeight(" + i15 + ')');
        throw null;
    }

    public static final boolean b(long j13, long j14) {
        return j13 == j14;
    }

    public static final boolean c(long j13) {
        int i13 = (int) (3 & j13);
        int i14 = (((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1);
        return (((int) (j13 >> (i14 + 46))) & ((1 << (18 - i14)) - 1)) != 0;
    }

    public static final boolean d(long j13) {
        int i13 = (int) (3 & j13);
        return (((int) (j13 >> 33)) & ((1 << (((((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j13) {
        int i13 = (int) (3 & j13);
        int i14 = (((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1);
        int i15 = (1 << (18 - i14)) - 1;
        int i16 = ((int) (j13 >> (i14 + 15))) & i15;
        int i17 = ((int) (j13 >> (i14 + 46))) & i15;
        return i16 == (i17 == 0 ? Integer.MAX_VALUE : i17 - 1);
    }

    public static final boolean f(long j13) {
        int i13 = (int) (3 & j13);
        int i14 = (1 << (((((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1)) + 13)) - 1;
        int i15 = ((int) (j13 >> 2)) & i14;
        int i16 = ((int) (j13 >> 33)) & i14;
        return i15 == (i16 == 0 ? Integer.MAX_VALUE : i16 - 1);
    }

    public static final int g(long j13) {
        int i13 = (int) (3 & j13);
        int i14 = (((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1);
        int i15 = ((int) (j13 >> (i14 + 46))) & ((1 << (18 - i14)) - 1);
        if (i15 == 0) {
            return Integer.MAX_VALUE;
        }
        return i15 - 1;
    }

    public static final int h(long j13) {
        int i13 = (int) (3 & j13);
        int i14 = (int) (j13 >> 33);
        int i15 = i14 & ((1 << (((((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1)) + 13)) - 1);
        if (i15 == 0) {
            return Integer.MAX_VALUE;
        }
        return i15 - 1;
    }

    public static final int i(long j13) {
        int i13 = (int) (3 & j13);
        int i14 = (((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1);
        return ((int) (j13 >> (i14 + 15))) & ((1 << (18 - i14)) - 1);
    }

    public static final int j(long j13) {
        int i13 = (int) (3 & j13);
        return ((int) (j13 >> 2)) & ((1 << (((((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j13) {
        int h10 = h(j13);
        String valueOf = h10 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(h10);
        int g13 = g(j13);
        String valueOf2 = g13 != Integer.MAX_VALUE ? String.valueOf(g13) : "Infinity";
        StringBuilder sb3 = new StringBuilder("Constraints(minWidth = ");
        sb3.append(j(j13));
        sb3.append(", maxWidth = ");
        sb3.append(valueOf);
        sb3.append(", minHeight = ");
        sb3.append(i(j13));
        sb3.append(", maxHeight = ");
        return ep.b.k(sb3, valueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f89168a == ((a) obj).f89168a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f89168a);
    }

    public final String toString() {
        return k(this.f89168a);
    }
}
