package gk2;

/* loaded from: classes4.dex */
public final class j extends uj2.h {

    /* renamed from: b, reason: collision with root package name */
    public final xp2.a f65465b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.f f65466c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65467d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final pk2.e f65468e;

    public j(h0 h0Var, kk2.q qVar, pk2.e eVar) {
        this.f65465b = h0Var;
        this.f65466c = qVar;
        this.f65468e = eVar;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        xp2.a aVar = this.f65465b;
        ak2.f fVar = this.f65466c;
        if (bs1.c.r2(aVar, bVar, fVar)) {
            return;
        }
        aVar.b(i.o(bVar, fVar, this.f65467d, this.f65468e));
    }
}
