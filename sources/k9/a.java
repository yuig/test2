package k9;

import d7.n0;
import java.math.BigInteger;
import q8.d0;
import q8.e0;
import q8.f0;

/* loaded from: classes3.dex */
public final class a implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f78659a;

    public a(b bVar) {
        this.f78659a = bVar;
    }

    @Override // q8.e0
    public final d0 e(long j13) {
        b bVar = this.f78659a;
        BigInteger valueOf = BigInteger.valueOf((bVar.f78663d.f78699i * j13) / 1000000);
        long j14 = bVar.f78662c;
        long j15 = bVar.f78661b;
        f0 f0Var = new f0(j13, n0.j((valueOf.multiply(BigInteger.valueOf(j14 - j15)).divide(BigInteger.valueOf(bVar.f78665f)).longValue() + j15) - 30000, bVar.f78661b, j14 - 1));
        return new d0(f0Var, f0Var);
    }

    @Override // q8.e0
    public final boolean h() {
        return true;
    }

    @Override // q8.e0
    public final long l() {
        return (this.f78659a.f78665f * 1000000) / r0.f78663d.f78699i;
    }
}
