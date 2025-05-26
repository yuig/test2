package q7;

import java.util.ArrayList;
import java.util.List;
import pk.c1;

/* loaded from: classes3.dex */
public final class k extends m implements p7.k {

    /* renamed from: h, reason: collision with root package name */
    public final n f102653h;

    public k(long j13, androidx.media3.common.b bVar, c1 c1Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(bVar, c1Var, nVar, arrayList, list, list2);
        this.f102653h = nVar;
    }

    @Override // p7.k
    public final long a(long j13, long j14) {
        return this.f102653h.h(j13, j14);
    }

    @Override // p7.k
    public final long b(long j13, long j14) {
        return this.f102653h.c(j13, j14);
    }

    @Override // p7.k
    public final long c(long j13) {
        return this.f102653h.k(j13);
    }

    @Override // p7.k
    public final long d(long j13, long j14) {
        n nVar = this.f102653h;
        if (nVar.f102666f != null) {
            return -9223372036854775807L;
        }
        long b13 = nVar.b(j13, j14) + nVar.c(j13, j14);
        return (nVar.h(b13, j13) + nVar.k(b13)) - nVar.f102669i;
    }

    @Override // p7.k
    public final j e(long j13) {
        return this.f102653h.l(j13, this);
    }

    @Override // p7.k
    public final long f(long j13, long j14) {
        return this.f102653h.j(j13, j14);
    }

    @Override // p7.k
    public final long g(long j13) {
        return this.f102653h.g(j13);
    }

    @Override // p7.k
    public final boolean h() {
        return this.f102653h.n();
    }

    @Override // p7.k
    public final long i() {
        return this.f102653h.f102664d;
    }

    @Override // p7.k
    public final long j(long j13, long j14) {
        return this.f102653h.b(j13, j14);
    }

    @Override // q7.m
    public final String k() {
        return null;
    }

    @Override // q7.m
    public final p7.k l() {
        return this;
    }

    @Override // q7.m
    public final j m() {
        return null;
    }
}
