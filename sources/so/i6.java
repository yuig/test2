package so;

/* loaded from: classes3.dex */
public final class i6 implements ni0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bf2.d f113462b;

    public /* synthetic */ i6(bf2.d dVar, int i13) {
        this.f113461a = i13;
        this.f113462b = dVar;
    }

    public final ni0.d a(uk1.d dVar, uj2.q qVar) {
        int i13 = this.f113461a;
        bf2.d dVar2 = this.f113462b;
        switch (i13) {
            case 0:
                r8 r8Var = (r8) dVar2;
                lh0.f b13 = s8.b(r8Var.f114091b);
                oa oaVar = r8Var.f114090a;
                es.h hVar = (es.h) oaVar.f113735i7.get();
                fs.c h03 = oa.h0(oaVar);
                s8 s8Var = r8Var.f114091b;
                return new ni0.d(qVar, dVar, b13, hVar, h03, s8Var.a6(), (l51.a) s8Var.X1.get());
            default:
                t8 t8Var = (t8) dVar2;
                lh0.f fVar = new lh0.f((lh0.z0) ((sa) t8Var.f114638d).f114603f.D0.get());
                oa oaVar2 = t8Var.f114636b;
                es.h hVar2 = (es.h) oaVar2.f113735i7.get();
                fs.c h04 = oa.h0(oaVar2);
                af2.a aVar = t8Var.f114638d;
                return new ni0.d(qVar, dVar, fVar, hVar2, h04, new hs.d((lh0.d) ((sa) aVar).f114603f.Q6.get()), (l51.a) ((sa) aVar).f114607j.get());
        }
    }
}
