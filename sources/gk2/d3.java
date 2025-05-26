package gk2;

/* loaded from: classes2.dex */
public final class d3 implements uj2.k {

    /* renamed from: a, reason: collision with root package name */
    public final e3 f65380a;

    public d3(e3 e3Var) {
        this.f65380a = e3Var;
    }

    @Override // xp2.b
    public final void a() {
    }

    @Override // xp2.b
    public final void c(Object obj) {
        this.f65380a.lazySet(obj);
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.setOnce(this.f65380a.f65398e, cVar)) {
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        e3 e3Var = this.f65380a;
        ok2.g.cancel(e3Var.f65396c);
        e3Var.f65394a.onError(th3);
    }
}
