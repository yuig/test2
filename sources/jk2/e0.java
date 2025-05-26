package jk2;

/* loaded from: classes4.dex */
public final class e0 extends uj2.l implements dk2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.t f76443a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76444b = 0;

    public e0(uj2.t tVar) {
        this.f76443a = tVar;
    }

    @Override // dk2.c
    public final uj2.q a() {
        return new c0(this.f76443a, this.f76444b, null, false);
    }

    @Override // uj2.l
    public final void g(uj2.m mVar) {
        this.f76443a.d(new d0(mVar, this.f76444b));
    }
}
