package m7;

/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: c */
    public static final x1 f86480c;

    /* renamed from: d */
    public static final x1 f86481d;

    /* renamed from: a */
    public final long f86482a;

    /* renamed from: b */
    public final long f86483b;

    static {
        x1 x1Var = new x1(0L, 0L);
        f86480c = x1Var;
        new x1(Long.MAX_VALUE, Long.MAX_VALUE);
        new x1(Long.MAX_VALUE, 0L);
        new x1(0L, Long.MAX_VALUE);
        f86481d = x1Var;
    }

    public x1(long j13, long j14) {
        bf.b.i(j13 >= 0);
        bf.b.i(j14 >= 0);
        this.f86482a = j13;
        this.f86483b = j14;
    }

    public final long a(long j13, long j14, long j15) {
        long j16 = this.f86482a;
        long j17 = this.f86483b;
        if (j16 == 0 && j17 == 0) {
            return j13;
        }
        int i13 = d7.n0.f53866a;
        long j18 = j13 - j16;
        if (((j16 ^ j13) & (j13 ^ j18)) < 0) {
            j18 = Long.MIN_VALUE;
        }
        long j19 = j13 + j17;
        if (((j17 ^ j19) & (j13 ^ j19)) < 0) {
            j19 = Long.MAX_VALUE;
        }
        boolean z13 = false;
        boolean z14 = j18 <= j14 && j14 <= j19;
        if (j18 <= j15 && j15 <= j19) {
            z13 = true;
        }
        return (z14 && z13) ? Math.abs(j14 - j13) <= Math.abs(j15 - j13) ? j14 : j15 : z14 ? j14 : z13 ? j15 : j18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x1.class != obj.getClass()) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return this.f86482a == x1Var.f86482a && this.f86483b == x1Var.f86483b;
    }

    public final int hashCode() {
        return (((int) this.f86482a) * 31) + ((int) this.f86483b);
    }
}
