package gk2;

/* loaded from: classes4.dex */
public final class i extends a {

    /* renamed from: c, reason: collision with root package name */
    public final ak2.f f65456c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65457d;

    /* renamed from: e, reason: collision with root package name */
    public final pk2.e f65458e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h0 h0Var, pk2.e eVar) {
        super(h0Var);
        ck2.e eVar2 = ck2.i.f27921a;
        this.f65456c = eVar2;
        this.f65457d = 2;
        this.f65458e = eVar;
    }

    public static c o(xp2.b bVar, ak2.f fVar, int i13, pk2.e eVar) {
        int i14 = b.f65332a[eVar.ordinal()];
        return i14 != 1 ? i14 != 2 ? new e(bVar, fVar, i13) : new d(i13, fVar, bVar, true) : new d(i13, fVar, bVar, false);
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        uj2.h hVar = this.f65321b;
        ak2.f fVar = this.f65456c;
        if (bs1.c.r2(hVar, bVar, fVar)) {
            return;
        }
        hVar.b(o(bVar, fVar, this.f65457d, this.f65458e));
    }
}
