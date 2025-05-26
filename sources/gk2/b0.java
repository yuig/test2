package gk2;

/* loaded from: classes2.dex */
public final class b0 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final ak2.e f65333c;

    /* renamed from: d, reason: collision with root package name */
    public final ak2.e f65334d;

    /* renamed from: e, reason: collision with root package name */
    public final ak2.a f65335e;

    /* renamed from: f, reason: collision with root package name */
    public final ak2.a f65336f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(uj2.h hVar, ak2.e eVar, ak2.e eVar2, ak2.a aVar) {
        super(hVar);
        ck2.c cVar = ck2.i.f27923c;
        this.f65333c = eVar;
        this.f65334d = eVar2;
        this.f65335e = aVar;
        this.f65336f = cVar;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        boolean z13 = bVar instanceof dk2.a;
        uj2.h hVar = this.f65321b;
        if (z13) {
            hVar.l(new z((dk2.a) bVar, this.f65333c, this.f65334d, this.f65335e, this.f65336f));
        } else {
            hVar.l(new a0(bVar, this.f65333c, this.f65334d, this.f65335e, this.f65336f));
        }
    }
}
