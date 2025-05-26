package gk2;

/* loaded from: classes2.dex */
public final class m0 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final ak2.f f65529c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65530d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65531e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65532f;

    public m0(uj2.h hVar, ak2.f fVar, int i13, int i14) {
        super(hVar);
        this.f65529c = fVar;
        this.f65530d = false;
        this.f65531e = i13;
        this.f65532f = i14;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        ak2.f fVar = this.f65529c;
        uj2.h hVar = this.f65321b;
        if (bs1.c.r2(hVar, bVar, fVar)) {
            return;
        }
        hVar.l(new l0(this.f65531e, this.f65532f, this.f65529c, bVar, this.f65530d));
    }
}
