package q7;

import d7.n0;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class n extends s {

    /* renamed from: d, reason: collision with root package name */
    public final long f102664d;

    /* renamed from: e, reason: collision with root package name */
    public final long f102665e;

    /* renamed from: f, reason: collision with root package name */
    public final List f102666f;

    /* renamed from: g, reason: collision with root package name */
    public final long f102667g;

    /* renamed from: h, reason: collision with root package name */
    public final long f102668h;

    /* renamed from: i, reason: collision with root package name */
    public final long f102669i;

    public n(j jVar, long j13, long j14, long j15, long j16, List list, long j17, long j18, long j19) {
        super(jVar, j13, j14);
        this.f102664d = j15;
        this.f102665e = j16;
        this.f102666f = list;
        this.f102669i = j17;
        this.f102667g = j18;
        this.f102668h = j19;
    }

    public final long b(long j13, long j14) {
        long g13 = g(j13);
        return g13 != -1 ? g13 : (int) (j((j14 - this.f102668h) + this.f102669i, j13) - c(j13, j14));
    }

    public final long c(long j13, long j14) {
        long g13 = g(j13);
        long j15 = this.f102664d;
        if (g13 == -1) {
            long j16 = this.f102667g;
            if (j16 != -9223372036854775807L) {
                return Math.max(j15, j((j14 - this.f102668h) - j16, j13));
            }
        }
        return j15;
    }

    public abstract long g(long j13);

    public final long h(long j13, long j14) {
        long j15 = this.f102678a;
        long j16 = this.f102664d;
        List list = this.f102666f;
        if (list != null) {
            return (((q) list.get((int) (j13 - j16))).f102675b * 1000000) / j15;
        }
        long g13 = g(j14);
        return (g13 == -1 || j13 != (j16 + g13) - 1) ? (this.f102665e * 1000000) / j15 : j14 - k(j13);
    }

    public final long j(long j13, long j14) {
        long g13 = g(j14);
        long j15 = this.f102664d;
        if (g13 == 0) {
            return j15;
        }
        if (this.f102666f == null) {
            long j16 = (j13 / ((this.f102665e * 1000000) / this.f102678a)) + j15;
            return j16 < j15 ? j15 : g13 == -1 ? j16 : Math.min(j16, (j15 + g13) - 1);
        }
        long j17 = (g13 + j15) - 1;
        long j18 = j15;
        while (j18 <= j17) {
            long j19 = ((j17 - j18) / 2) + j18;
            long k13 = k(j19);
            if (k13 < j13) {
                j18 = j19 + 1;
            } else {
                if (k13 <= j13) {
                    return j19;
                }
                j17 = j19 - 1;
            }
        }
        return j18 == j15 ? j18 : j17;
    }

    public final long k(long j13) {
        long j14 = this.f102664d;
        List list = this.f102666f;
        long j15 = list != null ? ((q) list.get((int) (j13 - j14))).f102674a - this.f102679b : (j13 - j14) * this.f102665e;
        int i13 = n0.f53866a;
        return n0.g0(j15, 1000000L, this.f102678a, RoundingMode.DOWN);
    }

    public abstract j l(long j13, m mVar);

    public boolean n() {
        return this.f102666f != null;
    }
}
