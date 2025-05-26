package gk2;

/* loaded from: classes4.dex */
public final class u1 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f65653c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65654d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f65655e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(uj2.h hVar, ep.a aVar, boolean z13, int i13) {
        super(hVar);
        this.f65653c = i13;
        this.f65655e = aVar;
        this.f65654d = z13;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        int i13 = this.f65653c;
        uj2.h hVar = this.f65321b;
        boolean z13 = this.f65654d;
        Object obj = this.f65655e;
        switch (i13) {
            case 0:
                t1 t1Var = new t1(bVar, (ak2.f) obj, z13);
                bVar.d(t1Var);
                hVar.l(t1Var);
                break;
            default:
                hVar.l(new l2(bVar, obj, z13));
                break;
        }
    }
}
