package p7;

import d7.n0;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final q8.m f99004a;

    /* renamed from: b, reason: collision with root package name */
    public final long f99005b;

    public l(q8.m mVar, long j13) {
        this.f99004a = mVar;
        this.f99005b = j13;
    }

    @Override // p7.k
    public final long a(long j13, long j14) {
        return this.f99004a.f102960d[(int) j13];
    }

    @Override // p7.k
    public final long b(long j13, long j14) {
        return 0L;
    }

    @Override // p7.k
    public final long c(long j13) {
        return this.f99004a.f102961e[(int) j13] - this.f99005b;
    }

    @Override // p7.k
    public final long d(long j13, long j14) {
        return -9223372036854775807L;
    }

    @Override // p7.k
    public final q7.j e(long j13) {
        return new q7.j(null, this.f99004a.f102959c[(int) j13], r0.f102958b[r8]);
    }

    @Override // p7.k
    public final long f(long j13, long j14) {
        return n0.e(this.f99004a.f102961e, j13 + this.f99005b, true);
    }

    @Override // p7.k
    public final long g(long j13) {
        return this.f99004a.f102957a;
    }

    @Override // p7.k
    public final boolean h() {
        return true;
    }

    @Override // p7.k
    public final long i() {
        return 0L;
    }

    @Override // p7.k
    public final long j(long j13, long j14) {
        return this.f99004a.f102957a;
    }
}
