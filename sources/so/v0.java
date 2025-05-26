package so;

/* loaded from: classes3.dex */
public final class v0 implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bf2.d f114665b;

    public /* synthetic */ v0(bf2.d dVar, int i13) {
        this.f114664a = i13;
        this.f114665b = dVar;
    }

    public final xw1.a a() {
        int i13 = this.f114664a;
        bf2.d dVar = this.f114665b;
        switch (i13) {
            case 0:
                r8 r8Var = (r8) dVar;
                return new xw1.a((yx.b) r8Var.f114091b.f114307g7.get(), (b60.b) r8Var.f114090a.f113850p0.get());
            default:
                qb qbVar = (qb) dVar;
                return new xw1.a((yx.b) qbVar.f114078c.F0.get(), (b60.b) qbVar.f114076a.f113850p0.get());
        }
    }
}
