package gk2;

/* loaded from: classes4.dex */
public final class f extends ok2.f implements uj2.k {

    /* renamed from: i, reason: collision with root package name */
    public final g f65399i;

    /* renamed from: j, reason: collision with root package name */
    public long f65400j;

    public f(g gVar) {
        this.f65399i = gVar;
    }

    @Override // xp2.b
    public final void a() {
        long j13 = this.f65400j;
        if (j13 != 0) {
            this.f65400j = 0L;
            g(j13);
        }
        c cVar = (c) this.f65399i;
        cVar.f65351k = false;
        cVar.g();
    }

    @Override // xp2.b
    public final void c(Object obj) {
        this.f65400j++;
        this.f65399i.e(obj);
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        long j13 = this.f65400j;
        if (j13 != 0) {
            this.f65400j = 0L;
            g(j13);
        }
        this.f65399i.b(th3);
    }
}
