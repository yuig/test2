package gk2;

/* loaded from: classes4.dex */
public final class i2 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final ak2.g f65463c;

    /* renamed from: d, reason: collision with root package name */
    public final long f65464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(uj2.h hVar) {
        super(hVar);
        bk.f fVar = ck2.i.f27926f;
        this.f65463c = fVar;
        this.f65464d = 3L;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        ok2.f fVar = new ok2.f();
        bVar.d(fVar);
        new h2(bVar, this.f65464d, this.f65463c, fVar, this.f65321b).b();
    }
}
