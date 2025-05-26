package kk2;

import kb.q0;
import uj2.f0;

/* loaded from: classes2.dex */
public final class g extends uj2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79943a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f79944b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.e f79945c;

    public g(f0 f0Var, ak2.e eVar, int i13) {
        this.f79943a = i13;
        this.f79944b = f0Var;
        this.f79945c = eVar;
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        int i13 = this.f79943a;
        ak2.e eVar = this.f79945c;
        f0 f0Var = this.f79944b;
        switch (i13) {
            case 0:
                ((uj2.b0) f0Var).p(new f(d0Var, eVar, 0));
                break;
            case 1:
                ((uj2.b0) f0Var).p(new q0(1, this, d0Var));
                break;
            case 2:
                ((uj2.b0) f0Var).p(new j(d0Var, eVar));
                break;
            default:
                ((uj2.b0) f0Var).p(new q0(3, this, d0Var));
                break;
        }
    }
}
