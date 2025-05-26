package jk2;

/* loaded from: classes4.dex */
public final class s implements uj2.v {

    /* renamed from: a, reason: collision with root package name */
    public final bk2.a f76684a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.v f76685b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f76686c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik2.b f76687d;

    public s(ik2.b bVar, bk2.a aVar, uj2.v vVar) {
        this.f76687d = bVar;
        this.f76684a = aVar;
        this.f76685b = vVar;
    }

    @Override // uj2.v
    public final void a() {
        if (this.f76686c) {
            return;
        }
        this.f76686c = true;
        ((uj2.t) this.f76687d.f72423c).d(new fk2.o(this, 1));
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.a aVar = this.f76684a;
        aVar.getClass();
        bk2.c.set(aVar, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        a();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f76686c) {
            lb.l0.R0(th3);
        } else {
            this.f76686c = true;
            this.f76685b.onError(th3);
        }
    }
}
