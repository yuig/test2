package jk2;

/* loaded from: classes4.dex */
public final class n0 extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76600b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.f f76601c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f76602d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(uj2.t tVar, ak2.f fVar, boolean z13, int i13) {
        super(tVar);
        this.f76600b = i13;
        this.f76601c = fVar;
        this.f76602d = z13;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        int i13 = this.f76600b;
        uj2.t tVar = this.f76382a;
        boolean z13 = this.f76602d;
        ak2.f fVar = this.f76601c;
        switch (i13) {
            case 0:
                tVar.d(new m0(vVar, fVar, z13));
                break;
            case 1:
                tVar.d(new r0(0, vVar, fVar, z13));
                break;
            case 2:
                tVar.d(new r0(1, vVar, fVar, z13));
                break;
            default:
                m1 m1Var = new m1(vVar, fVar, z13);
                vVar.b(m1Var.f76589d);
                tVar.d(m1Var);
                break;
        }
    }
}
