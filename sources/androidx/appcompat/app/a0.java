package androidx.appcompat.app;

import android.view.MenuItem;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class a0 implements m.b {

    /* renamed from: a, reason: collision with root package name */
    public final m.b f15951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f15952b;

    public a0(n0 n0Var, m.b bVar) {
        this.f15952b = n0Var;
        this.f15951a = bVar;
    }

    @Override // m.b
    public final boolean b(m.c cVar, n.o oVar) {
        ViewGroup viewGroup = this.f15952b.A;
        WeakHashMap weakHashMap = q5.v0.f102521a;
        q5.k0.c(viewGroup);
        return this.f15951a.b(cVar, oVar);
    }

    @Override // m.b
    public final void e(m.c cVar) {
        this.f15951a.e(cVar);
        n0 n0Var = this.f15952b;
        if (n0Var.f16103w != null) {
            n0Var.f16092l.getDecorView().removeCallbacks(n0Var.f16104x);
        }
        if (n0Var.f16102v != null) {
            q5.d1 d1Var = n0Var.f16105y;
            if (d1Var != null) {
                d1Var.b();
            }
            q5.d1 b13 = q5.v0.b(n0Var.f16102v);
            b13.a(0.0f);
            n0Var.f16105y = b13;
            b13.e(new y(this, 2));
        }
        o oVar = n0Var.f16094n;
        if (oVar != null) {
            oVar.onSupportActionModeFinished(n0Var.f16101u);
        }
        n0Var.f16101u = null;
        ViewGroup viewGroup = n0Var.A;
        WeakHashMap weakHashMap = q5.v0.f102521a;
        q5.k0.c(viewGroup);
        n0Var.R();
    }

    @Override // m.b
    public final boolean j(m.c cVar, MenuItem menuItem) {
        return this.f15951a.j(cVar, menuItem);
    }

    @Override // m.b
    public final boolean n(m.c cVar, n.o oVar) {
        return this.f15951a.n(cVar, oVar);
    }
}
