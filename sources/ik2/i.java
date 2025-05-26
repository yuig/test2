package ik2;

import java.util.concurrent.Callable;
import kk2.a0;
import uj2.b0;
import uj2.f0;
import uj2.q;
import uj2.t;
import uj2.v;

/* loaded from: classes4.dex */
public final class i extends q {

    /* renamed from: a, reason: collision with root package name */
    public final q f72447a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f72448b;

    public i(q qVar, ak2.f fVar) {
        this.f72447a = qVar;
        this.f72448b = fVar;
    }

    @Override // uj2.q
    public final void G(v vVar) {
        f0 f0Var;
        t tVar = this.f72447a;
        boolean z13 = tVar instanceof Callable;
        ak2.f fVar = this.f72448b;
        if (!z13) {
            tVar.d(new h(vVar, fVar));
            return;
        }
        try {
            Object call = ((Callable) tVar).call();
            if (call != null) {
                Object apply = fVar.apply(call);
                ck2.i.b(apply, "The mapper returned a null SingleSource");
                f0Var = (f0) apply;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                bk2.d.complete(vVar);
            } else {
                ((b0) f0Var).p(new a0(vVar));
            }
        } catch (Throwable th3) {
            bp1.h.H(th3);
            bk2.d.error(th3, vVar);
        }
    }
}
