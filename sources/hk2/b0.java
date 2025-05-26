package hk2;

import uj2.f0;

/* loaded from: classes4.dex */
public final class b0 extends uj2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69391a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.n f69392b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f69393c;

    public b0(uj2.n nVar, Object obj, int i13) {
        this.f69391a = i13;
        this.f69392b = nVar;
        this.f69393c = obj;
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        int i13 = this.f69391a;
        uj2.n nVar = this.f69392b;
        int i14 = 1;
        Object obj = this.f69393c;
        switch (i13) {
            case 0:
                ((uj2.l) nVar).f(new a0(i14, d0Var, (f0) obj));
                break;
            default:
                ((uj2.l) nVar).f(new j(i14, d0Var, obj));
                break;
        }
    }
}
