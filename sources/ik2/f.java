package ik2;

import java.util.concurrent.Callable;
import jk2.k2;
import uj2.q;
import uj2.t;
import wr0.l;

/* loaded from: classes4.dex */
public final class f extends uj2.b {

    /* renamed from: a, reason: collision with root package name */
    public final q f72434a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f72435b;

    public f(k2 k2Var, l lVar) {
        this.f72434a = k2Var;
        this.f72435b = lVar;
    }

    @Override // uj2.b
    public final void k(uj2.d dVar) {
        uj2.f fVar;
        t tVar = this.f72434a;
        boolean z13 = tVar instanceof Callable;
        ak2.f fVar2 = this.f72435b;
        if (!z13) {
            tVar.d(new e(dVar, fVar2));
            return;
        }
        try {
            Object call = ((Callable) tVar).call();
            if (call != null) {
                Object apply = fVar2.apply(call);
                ck2.i.b(apply, "The mapper returned a null CompletableSource");
                fVar = (uj2.f) apply;
            } else {
                fVar = null;
            }
            if (fVar == null) {
                bk2.d.complete(dVar);
            } else {
                ((uj2.b) fVar).j(dVar);
            }
        } catch (Throwable th3) {
            bp1.h.H(th3);
            bk2.d.error(th3, dVar);
        }
    }
}
