package jk2;

/* loaded from: classes2.dex */
public final class m extends a {

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f76576b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76577c;

    /* renamed from: d, reason: collision with root package name */
    public final pk2.e f76578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(uj2.q qVar, int i13, pk2.e eVar) {
        super(qVar);
        ck2.e eVar2 = ck2.i.f27921a;
        this.f76576b = eVar2;
        this.f76578d = eVar;
        this.f76577c = Math.max(8, i13);
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        uj2.t tVar = this.f76382a;
        ak2.f fVar = this.f76576b;
        if (lb.l0.A1(tVar, vVar, fVar)) {
            return;
        }
        pk2.e eVar = pk2.e.IMMEDIATE;
        int i13 = this.f76577c;
        pk2.e eVar2 = this.f76578d;
        if (eVar2 == eVar) {
            tVar.d(new l(new rk2.d(vVar), fVar, i13));
        } else {
            tVar.d(new j(i13, vVar, fVar, eVar2 == pk2.e.END));
        }
    }
}
