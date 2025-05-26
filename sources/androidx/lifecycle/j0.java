package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class j0 extends l0 {

    /* renamed from: l, reason: collision with root package name */
    public final p.g f18649l = new p.g();

    @Override // androidx.lifecycle.h0
    public final void g() {
        Iterator it = this.f18649l.iterator();
        while (true) {
            p.e eVar = (p.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            i0 i0Var = (i0) ((Map.Entry) eVar.next()).getValue();
            i0Var.f18645a.f(i0Var);
        }
    }

    @Override // androidx.lifecycle.h0
    public final void h() {
        Iterator it = this.f18649l.iterator();
        while (true) {
            p.e eVar = (p.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            i0 i0Var = (i0) ((Map.Entry) eVar.next()).getValue();
            i0Var.f18645a.j(i0Var);
        }
    }

    public void l(h0 h0Var, m0 m0Var) {
        if (h0Var == null) {
            throw new NullPointerException("source cannot be null");
        }
        i0 i0Var = new i0(h0Var, m0Var);
        i0 i0Var2 = (i0) this.f18649l.c(h0Var, i0Var);
        if (i0Var2 != null && i0Var2.f18646b != m0Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (i0Var2 == null && this.f18633c > 0) {
            h0Var.f(i0Var);
        }
    }
}
