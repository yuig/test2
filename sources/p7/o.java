package p7;

import androidx.media3.exoplayer.source.BehindLiveWindowException;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final h8.i f99011a;

    /* renamed from: b, reason: collision with root package name */
    public final q7.m f99012b;

    /* renamed from: c, reason: collision with root package name */
    public final q7.b f99013c;

    /* renamed from: d, reason: collision with root package name */
    public final k f99014d;

    /* renamed from: e, reason: collision with root package name */
    public final long f99015e;

    /* renamed from: f, reason: collision with root package name */
    public final long f99016f;

    public o(long j13, q7.m mVar, q7.b bVar, h8.i iVar, long j14, k kVar) {
        this.f99015e = j13;
        this.f99012b = mVar;
        this.f99013c = bVar;
        this.f99016f = j14;
        this.f99011a = iVar;
        this.f99014d = kVar;
    }

    public final o a(long j13, q7.m mVar) {
        long f13;
        k l13 = this.f99012b.l();
        k l14 = mVar.l();
        if (l13 == null) {
            return new o(j13, mVar, this.f99013c, this.f99011a, this.f99016f, l13);
        }
        if (!l13.h()) {
            return new o(j13, mVar, this.f99013c, this.f99011a, this.f99016f, l14);
        }
        long g13 = l13.g(j13);
        if (g13 == 0) {
            return new o(j13, mVar, this.f99013c, this.f99011a, this.f99016f, l14);
        }
        bf.b.w(l14);
        long i13 = l13.i();
        long c13 = l13.c(i13);
        long j14 = g13 + i13;
        long j15 = j14 - 1;
        long a13 = l13.a(j15, j13) + l13.c(j15);
        long i14 = l14.i();
        long c14 = l14.c(i14);
        long j16 = this.f99016f;
        if (a13 != c14) {
            if (a13 < c14) {
                throw new BehindLiveWindowException();
            }
            if (c14 < c13) {
                f13 = j16 - (l14.f(c13, j13) - i13);
                return new o(j13, mVar, this.f99013c, this.f99011a, f13, l14);
            }
            j14 = l13.f(c14, j13);
        }
        f13 = (j14 - i14) + j16;
        return new o(j13, mVar, this.f99013c, this.f99011a, f13, l14);
    }

    public final o b(q7.b bVar) {
        return new o(this.f99015e, this.f99012b, bVar, this.f99011a, this.f99016f, this.f99014d);
    }

    public final long c(long j13) {
        k kVar = this.f99014d;
        bf.b.w(kVar);
        return kVar.b(this.f99015e, j13) + this.f99016f;
    }

    public final long d(long j13) {
        long c13 = c(j13);
        k kVar = this.f99014d;
        bf.b.w(kVar);
        return (kVar.j(this.f99015e, j13) + c13) - 1;
    }

    public final long e() {
        k kVar = this.f99014d;
        bf.b.w(kVar);
        return kVar.g(this.f99015e);
    }

    public final long f(long j13) {
        long g13 = g(j13);
        k kVar = this.f99014d;
        bf.b.w(kVar);
        return kVar.a(j13 - this.f99016f, this.f99015e) + g13;
    }

    public final long g(long j13) {
        k kVar = this.f99014d;
        bf.b.w(kVar);
        return kVar.c(j13 - this.f99016f);
    }

    public final boolean h(long j13, long j14) {
        k kVar = this.f99014d;
        bf.b.w(kVar);
        return kVar.h() || j14 == -9223372036854775807L || f(j13) <= j14;
    }
}
