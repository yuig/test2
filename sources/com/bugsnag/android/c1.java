package com.bugsnag.android;

/* loaded from: classes3.dex */
public final class c1 extends id.a {

    /* renamed from: c, reason: collision with root package name */
    public final hd.h f29173c;

    /* renamed from: d, reason: collision with root package name */
    public final id.d f29174d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f29175e;

    public c1(id.b bVar, id.b bVar2, z zVar, hd.c cVar, c1 c1Var, id.e eVar, c2 c2Var, m mVar) {
        super(cVar);
        this.f29173c = (hd.h) bVar2.f72118c;
        hd.n nVar = this.f72117b;
        b1 b1Var = new b1(this, bVar, eVar, zVar, c1Var, c2Var, cVar);
        cVar.a(nVar, b1Var);
        this.f29174d = b1Var;
        hd.n nVar2 = this.f72117b;
        Runnable xVar = new x(this, c2Var, cVar, mVar, 2);
        cVar.a(nVar2, xVar);
        this.f29175e = xVar;
    }

    public c1(id.b bVar, z zVar, g2 g2Var, hd.c cVar, m mVar) {
        super(cVar);
        hd.h hVar = (hd.h) bVar.f72118c;
        this.f29173c = hVar;
        this.f29175e = new s1(hVar);
        hd.n nVar = this.f72117b;
        y3 y3Var = new y3(g2Var, this, mVar, zVar, cVar);
        cVar.a(nVar, y3Var);
        this.f29174d = y3Var;
    }
}
