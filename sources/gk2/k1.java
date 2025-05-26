package gk2;

/* loaded from: classes2.dex */
public final class k1 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f65484c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final int f65485d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65486e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f65487f;

    public k1(int i13, y yVar, r42.k kVar) {
        super(yVar);
        this.f65487f = kVar;
        this.f65485d = i13;
        this.f65486e = false;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        int i13 = this.f65484c;
        boolean z13 = this.f65486e;
        int i14 = this.f65485d;
        uj2.h hVar = this.f65321b;
        Object obj = this.f65487f;
        switch (i13) {
            case 0:
                uj2.z a13 = ((uj2.a0) obj).a();
                if (!(bVar instanceof dk2.a)) {
                    hVar.l(new j1(bVar, a13, z13, i14));
                    break;
                } else {
                    hVar.l(new i1((dk2.a) bVar, a13, z13, i14));
                    break;
                }
            default:
                ak2.f fVar = (ak2.f) obj;
                if (!bs1.c.r2(hVar, bVar, fVar)) {
                    hVar.l(new t2(i14, fVar, bVar, z13));
                    break;
                }
                break;
        }
    }

    public k1(uj2.h hVar, uj2.a0 a0Var, int i13) {
        super(hVar);
        this.f65487f = a0Var;
        this.f65486e = false;
        this.f65485d = i13;
    }
}
