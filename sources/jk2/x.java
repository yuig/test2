package jk2;

/* loaded from: classes2.dex */
public final class x extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76737b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f76738c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(uj2.t tVar, Object obj, int i13) {
        super(tVar);
        this.f76737b = i13;
        this.f76738c = obj;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        int i13 = this.f76737b;
        int i14 = 1;
        uj2.t tVar = this.f76382a;
        Object obj = this.f76738c;
        switch (i13) {
            case 0:
                tVar.d(new w(vVar, (ak2.e) obj, 0));
                break;
            case 1:
                tVar.d(new y(vVar, (ak2.a) obj));
                break;
            case 2:
                tVar.d(new w(vVar, (ak2.g) obj, i14));
                break;
            default:
                r1 r1Var = new r1(vVar, 1);
                vVar.b(r1Var);
                bk2.c.setOnce(r1Var, ((uj2.a0) obj).b(new lb.x(14, this, r1Var)));
                break;
        }
    }
}
