package gk2;

/* loaded from: classes2.dex */
public final class j2 extends ok2.f implements uj2.k {

    /* renamed from: i, reason: collision with root package name */
    public final xp2.b f65471i;

    /* renamed from: j, reason: collision with root package name */
    public final sk2.a f65472j;

    /* renamed from: k, reason: collision with root package name */
    public final xp2.c f65473k;

    /* renamed from: l, reason: collision with root package name */
    public long f65474l;

    public j2(vk2.a aVar, sk2.a aVar2, g2 g2Var) {
        this.f65471i = aVar;
        this.f65472j = aVar2;
        this.f65473k = g2Var;
    }

    @Override // xp2.b
    public final void a() {
        this.f65473k.cancel();
        this.f65471i.a();
    }

    @Override // xp2.b
    public final void c(Object obj) {
        this.f65474l++;
        this.f65471i.c(obj);
    }

    @Override // ok2.f, xp2.c
    public final void cancel() {
        super.cancel();
        this.f65473k.cancel();
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        h(ok2.d.INSTANCE);
        long j13 = this.f65474l;
        if (j13 != 0) {
            this.f65474l = 0L;
            g(j13);
        }
        this.f65473k.request(1L);
        this.f65472j.c(th3);
    }
}
