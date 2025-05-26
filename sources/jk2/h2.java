package jk2;

/* loaded from: classes2.dex */
public final class h2 implements uj2.v {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76493a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.t f76494b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f76496d = true;

    /* renamed from: c, reason: collision with root package name */
    public final bk2.a f76495c = new bk2.a();

    public h2(uj2.v vVar, uj2.t tVar) {
        this.f76493a = vVar;
        this.f76494b = tVar;
    }

    @Override // uj2.v
    public final void a() {
        if (!this.f76496d) {
            this.f76493a.a();
        } else {
            this.f76496d = false;
            this.f76494b.d(this);
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.a aVar = this.f76495c;
        aVar.getClass();
        bk2.c.set(aVar, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f76496d) {
            this.f76496d = false;
        }
        this.f76493a.c(obj);
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        this.f76493a.onError(th3);
    }
}
