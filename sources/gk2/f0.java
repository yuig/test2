package gk2;

/* loaded from: classes2.dex */
public final class f0 extends uj2.b0 implements dk2.b {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.h f65401a;

    /* renamed from: b, reason: collision with root package name */
    public final long f65402b = 0;

    public f0(uj2.h hVar) {
        this.f65401a = hVar;
    }

    @Override // dk2.b
    public final uj2.h c() {
        return new d0(this.f65401a, this.f65402b);
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        this.f65401a.l(new e0(d0Var, this.f65402b, null));
    }
}
