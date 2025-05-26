package jk2;

/* loaded from: classes2.dex */
public final class g0 extends uj2.b0 implements dk2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.t f76475a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76476b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f76477c;

    public g0(uj2.t tVar, Object obj) {
        this.f76475a = tVar;
        this.f76477c = obj;
    }

    @Override // dk2.c
    public final uj2.q a() {
        return new c0(this.f76475a, this.f76476b, this.f76477c, true);
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        this.f76475a.d(new f0(d0Var, this.f76476b, this.f76477c));
    }
}
