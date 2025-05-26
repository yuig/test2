package jk2;

/* loaded from: classes2.dex */
public final class q0 extends uj2.b implements dk2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.t f76648a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f76649b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f76650c = false;

    public q0(uj2.t tVar, ak2.f fVar) {
        this.f76648a = tVar;
        this.f76649b = fVar;
    }

    @Override // dk2.c
    public final uj2.q a() {
        return new n0(this.f76648a, this.f76649b, this.f76650c, 0);
    }

    @Override // uj2.b
    public final void k(uj2.d dVar) {
        this.f76648a.d(new p0(dVar, this.f76649b, this.f76650c));
    }
}
