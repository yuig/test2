package k0;

import a.sc;
import androidx.camera.core.impl.t;
import androidx.camera.core.impl.v;
import androidx.camera.core.impl.x;
import androidx.camera.core.impl.z;
import c0.j0;
import c0.n0;

/* loaded from: classes2.dex */
public final class d extends a {
    @Override // k0.a
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        throw null;
    }

    public final void i(n0 n0Var) {
        j0 H1 = n0Var.H1();
        z zVar = H1 instanceof h0.c ? ((h0.c) H1).f66375a : null;
        if ((zVar.t() == v.LOCKED_FOCUSED || zVar.t() == v.PASSIVE_FOCUSED) && zVar.C() == t.CONVERGED && zVar.y() == x.CONVERGED) {
            super.f(n0Var);
        } else {
            ((sc) this.f77780d).getClass();
            n0Var.close();
        }
    }
}
