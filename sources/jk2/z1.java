package jk2;

/* loaded from: classes4.dex */
public final class z1 extends a {

    /* renamed from: b, reason: collision with root package name */
    public final ak2.g f76782b;

    /* renamed from: c, reason: collision with root package name */
    public final long f76783c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(uj2.q qVar) {
        super(qVar);
        bk.f fVar = ck2.i.f27926f;
        this.f76782b = fVar;
        this.f76783c = 3L;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        bk2.a aVar = new bk2.a();
        vVar.b(aVar);
        new y1(vVar, this.f76783c, this.f76782b, aVar, this.f76382a).d();
    }
}
