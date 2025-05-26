package q7;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes3.dex */
public final class p extends n {

    /* renamed from: j, reason: collision with root package name */
    public final v f102671j;

    /* renamed from: k, reason: collision with root package name */
    public final v f102672k;

    /* renamed from: l, reason: collision with root package name */
    public final long f102673l;

    public p(j jVar, long j13, long j14, long j15, long j16, long j17, List list, long j18, v vVar, v vVar2, long j19, long j23) {
        super(jVar, j13, j14, j15, j17, list, j18, j19, j23);
        this.f102671j = vVar;
        this.f102672k = vVar2;
        this.f102673l = j16;
    }

    @Override // q7.s
    public final j a(m mVar) {
        v vVar = this.f102671j;
        if (vVar == null) {
            return (j) this.f102680c;
        }
        androidx.media3.common.b bVar = mVar.f102657a;
        return new j(vVar.a(bVar.f18751a, 0L, bVar.f18760j, 0L), 0L, -1L);
    }

    @Override // q7.n
    public final long g(long j13) {
        if (this.f102666f != null) {
            return r0.size();
        }
        long j14 = this.f102673l;
        if (j14 != -1) {
            return (j14 - this.f102664d) + 1;
        }
        if (j13 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j13).multiply(BigInteger.valueOf(this.f102678a));
        BigInteger multiply2 = BigInteger.valueOf(this.f102665e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i13 = rk.a.f108434a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // q7.n
    public final j l(long j13, m mVar) {
        long j14 = this.f102664d;
        List list = this.f102666f;
        long j15 = list != null ? ((q) list.get((int) (j13 - j14))).f102674a : (j13 - j14) * this.f102665e;
        androidx.media3.common.b bVar = mVar.f102657a;
        return new j(this.f102672k.a(bVar.f18751a, j13, bVar.f18760j, j15), 0L, -1L);
    }
}
