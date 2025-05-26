package kk2;

import kb.q0;
import uj2.f0;

/* loaded from: classes2.dex */
public final class m extends uj2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79960a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f79961b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.f f79962c;

    public m(f0 f0Var, ak2.f fVar, int i13) {
        this.f79960a = i13;
        this.f79962c = fVar;
        this.f79961b = f0Var;
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        int i13 = this.f79960a;
        f0 f0Var = this.f79961b;
        ak2.f fVar = this.f79962c;
        switch (i13) {
            case 0:
                ((uj2.b0) f0Var).p(new l(0, d0Var, fVar));
                break;
            case 1:
                ((uj2.b0) f0Var).p(new q0(d0Var, fVar));
                break;
            default:
                ((uj2.b0) f0Var).p(new l(1, d0Var, fVar));
                break;
        }
    }
}
