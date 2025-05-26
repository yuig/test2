package bk;

/* loaded from: classes3.dex */
public final class j extends f {

    /* renamed from: a, reason: collision with root package name */
    public final f f23075a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23076b;

    public j(g gVar, float f13) {
        this.f23075a = gVar;
        this.f23076b = f13;
    }

    @Override // bk.f
    public final boolean J() {
        return this.f23075a.J();
    }

    @Override // bk.f
    public final void Q(float f13, float f14, float f15, z zVar) {
        this.f23075a.Q(f13, f14 - this.f23076b, f15, zVar);
    }
}
