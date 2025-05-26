package kk2;

import uj2.f0;

/* loaded from: classes2.dex */
public final class t extends uj2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79978a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f79979b;

    /* renamed from: c, reason: collision with root package name */
    public final uj2.a0 f79980c;

    public t(f0 f0Var, uj2.a0 a0Var, int i13) {
        this.f79978a = i13;
        this.f79979b = f0Var;
        this.f79980c = a0Var;
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        int i13 = this.f79978a;
        uj2.a0 a0Var = this.f79980c;
        f0 f0Var = this.f79979b;
        switch (i13) {
            case 0:
                ((uj2.b0) f0Var).p(new s(d0Var, a0Var));
                break;
            default:
                u uVar = new u(d0Var, f0Var);
                d0Var.b(uVar);
                xj2.c b13 = a0Var.b(uVar);
                bk2.a aVar = uVar.f79982b;
                aVar.getClass();
                bk2.c.replace(aVar, b13);
                break;
        }
    }
}
