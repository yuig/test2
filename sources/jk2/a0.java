package jk2;

/* loaded from: classes2.dex */
public final class a0 extends a {

    /* renamed from: b, reason: collision with root package name */
    public final ak2.e f76383b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.e f76384c;

    /* renamed from: d, reason: collision with root package name */
    public final ak2.a f76385d;

    /* renamed from: e, reason: collision with root package name */
    public final ak2.a f76386e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(uj2.t tVar, ak2.e eVar, ak2.e eVar2, ak2.a aVar) {
        super(tVar);
        ck2.c cVar = ck2.i.f27923c;
        this.f76383b = eVar;
        this.f76384c = eVar2;
        this.f76385d = aVar;
        this.f76386e = cVar;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        this.f76382a.d(new z(vVar, this.f76383b, this.f76384c, this.f76385d, this.f76386e));
    }
}
