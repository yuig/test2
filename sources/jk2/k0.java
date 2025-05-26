package jk2;

/* loaded from: classes2.dex */
public final class k0 extends a {

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f76545b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f76546c;

    /* renamed from: d, reason: collision with root package name */
    public final int f76547d;

    /* renamed from: e, reason: collision with root package name */
    public final int f76548e;

    public k0(uj2.t tVar, ak2.f fVar, boolean z13, int i13, int i14) {
        super(tVar);
        this.f76545b = fVar;
        this.f76546c = z13;
        this.f76547d = i13;
        this.f76548e = i14;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        ak2.f fVar = this.f76545b;
        uj2.t tVar = this.f76382a;
        if (lb.l0.A1(tVar, vVar, fVar)) {
            return;
        }
        tVar.d(new j0(this.f76547d, this.f76548e, vVar, this.f76545b, this.f76546c));
    }
}
