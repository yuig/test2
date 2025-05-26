package androidx.camera.core.impl;

import a.o3;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public interface v0 {
    static v1 B(v0 v0Var, v0 v0Var2) {
        if (v0Var == null && v0Var2 == null) {
            return v1.f16979c;
        }
        q1 k13 = v0Var2 != null ? q1.k(v0Var2) : q1.c();
        if (v0Var != null) {
            Iterator it = v0Var.a().iterator();
            while (it.hasNext()) {
                z(k13, v0Var2, v0Var, (c) it.next());
            }
        }
        return v1.b(k13);
    }

    static void z(q1 q1Var, v0 v0Var, v0 v0Var2, c cVar) {
        if (!Objects.equals(cVar, j1.f16888ln)) {
            q1Var.q(cVar, v0Var2.i(cVar), v0Var2.f(cVar));
            return;
        }
        o0.b bVar = (o0.b) v0Var2.j(cVar, null);
        o0.b bVar2 = (o0.b) v0Var.j(cVar, null);
        u0 i13 = v0Var2.i(cVar);
        if (bVar != null) {
            if (bVar2 != null) {
                o0.a aVar = bVar.f92746a;
                if (aVar == null) {
                    aVar = bVar2.f92746a;
                }
                o0.c cVar2 = bVar.f92747b;
                if (cVar2 == null) {
                    cVar2 = bVar2.f92747b;
                }
                int i14 = bVar.f92748c;
                if (i14 == 0) {
                    i14 = bVar2.f92748c;
                }
                bVar2 = new o0.b(aVar, cVar2, i14);
            }
            q1Var.q(cVar, i13, bVar);
        }
        bVar = bVar2;
        q1Var.q(cVar, i13, bVar);
    }

    Set a();

    boolean d(c cVar);

    Object e(c cVar, u0 u0Var);

    Object f(c cVar);

    Set g(c cVar);

    void h(o3 o3Var);

    u0 i(c cVar);

    Object j(c cVar, Object obj);
}
