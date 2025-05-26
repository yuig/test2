package jk;

/* loaded from: classes.dex */
public final class h implements kk.o {

    /* renamed from: a, reason: collision with root package name */
    public h6.q f76337a;

    public final bk.m a() {
        h6.q qVar = this.f76337a;
        if (qVar == null) {
            throw new IllegalStateException(String.valueOf(h6.q.class.getCanonicalName()).concat(" must be set"));
        }
        bk.m mVar = new bk.m();
        mVar.f23078a = mVar;
        f fVar = new f(qVar);
        mVar.f23079b = fVar;
        mVar.f23080c = kk.n.b(new g(fVar, 2));
        h hVar = new h();
        hVar.f76337a = qVar;
        mVar.f23081d = kk.n.b(hVar);
        mVar.f23082e = kk.n.b(new g((kk.o) mVar.f23079b, 4));
        kk.o b13 = kk.n.b(new g((kk.o) mVar.f23079b, 3));
        mVar.f23083f = b13;
        mVar.f23084g = kk.n.b(new mk.g((kk.o) mVar.f23080c, (kk.o) mVar.f23081d, (kk.o) mVar.f23082e, b13, 1));
        kk.o b14 = kk.n.b(new g((kk.o) mVar.f23079b, 1));
        mVar.f23085h = b14;
        g gVar = new g(b14, 0);
        mVar.f23086i = gVar;
        kk.o b15 = kk.n.b(new mk.g((kk.o) mVar.f23079b, b14, (kk.o) mVar.f23082e, gVar, 0));
        mVar.f23087j = b15;
        kk.o b16 = kk.n.b(new x92.b((kk.o) mVar.f23084g, b15, (kk.o) mVar.f23085h, 18));
        mVar.f23088k = b16;
        mVar.f23089l = kk.n.b(new tb.e(qVar, b16));
        return mVar;
    }

    @Override // kk.o
    public final Object zza() {
        w b13 = w.b(this.f76337a.f67746a);
        if (b13 != null) {
            return b13;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
