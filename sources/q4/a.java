package q4;

import lb.l0;

/* loaded from: classes3.dex */
public final class a implements y {

    /* renamed from: a, reason: collision with root package name */
    public final u2.e f102305a;

    /* renamed from: b, reason: collision with root package name */
    public final long f102306b;

    public a(u2.e eVar, long j13) {
        this.f102305a = eVar;
        this.f102306b = j13;
    }

    @Override // q4.y
    public final long a(n4.i iVar, long j13, n4.k kVar, long j14) {
        long a13 = this.f102305a.a(0L, l0.d(iVar.f89184c - iVar.f89182a, iVar.f89185d - iVar.f89183b), kVar);
        long a14 = this.f102305a.a(0L, j14, kVar);
        long j15 = ((-((int) (a14 & 4294967295L))) & 4294967295L) | ((-((int) (a14 >> 32))) << 32);
        long j16 = this.f102306b;
        return n4.h.c(n4.h.c(n4.h.c(iVar.a(), a13), j15), d7.b.a(((int) (j16 >> 32)) * (kVar == n4.k.Ltr ? 1 : -1), (int) (j16 & 4294967295L)));
    }
}
