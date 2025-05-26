package gk2;

/* loaded from: classes2.dex */
public final class r extends uj2.h {

    /* renamed from: b, reason: collision with root package name */
    public final uj2.j f65596b;

    /* renamed from: c, reason: collision with root package name */
    public final uj2.a f65597c;

    public r(uj2.j jVar, uj2.a aVar) {
        this.f65596b = jVar;
        this.f65597c = aVar;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        int i13 = k.f65475a[this.f65597c.ordinal()];
        l mVar = i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? new m(bVar, uj2.h.f122339a) : new o(bVar) : new n(bVar, 0) : new n(bVar, 1) : new p(bVar);
        bVar.d(mVar);
        try {
            this.f65596b.G(mVar);
        } catch (Throwable th3) {
            bp1.h.H(th3);
            mVar.e(th3);
        }
    }
}
