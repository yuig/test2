package yq0;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.t1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import i1.a1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import so.oa;

/* loaded from: classes.dex */
public final class z extends m implements os.m {

    /* renamed from: e, reason: collision with root package name */
    public final sq0.f0 f139759e;

    /* renamed from: f, reason: collision with root package name */
    public final ao2.j0 f139760f;

    /* renamed from: g, reason: collision with root package name */
    public final t1 f139761g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f139762h;

    /* renamed from: i, reason: collision with root package name */
    public final xj2.b f139763i;

    /* renamed from: j, reason: collision with root package name */
    public wh0.h f139764j;

    /* renamed from: k, reason: collision with root package name */
    public final a7.o f139765k;

    /* renamed from: l, reason: collision with root package name */
    public u f139766l;

    /* renamed from: m, reason: collision with root package name */
    public e f139767m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(sq0.f0 dataSourceProvider, ao2.j0 scope, int i13) {
        super((sq0.e0) dataSourceProvider.s().get(0));
        t1 viewModelStore = new t1();
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        this.f139759e = dataSourceProvider;
        this.f139760f = scope;
        this.f139761g = viewModelStore;
        this.f139762h = false;
        this.f139763i = new xj2.b();
        this.f139765k = new a7.o(true);
    }

    @Override // qa2.s1
    public final void C() {
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        boolean z13 = this.f139762h;
        sq0.f0 f0Var = this.f139759e;
        if (z13) {
            x xVar = new x();
            xVar.h(f0Var.s());
            j0Var.f80434a = xVar;
            vq0.i iVar = f0Var instanceof vq0.i ? (vq0.i) f0Var : null;
            Object obj = f0Var.s().get(0);
            if (iVar != null && obj != null) {
                wh0.h hVar = new wh0.h(j0Var, (a0) obj, 1);
                z(hVar);
                this.f139764j = hVar;
            }
        }
        xj2.b bVar = this.f139763i;
        bVar.d();
        for (a0 a0Var : f0Var.s()) {
            bVar.a(a0Var.K1().F(new ug0.d(16, new a1(this, a0Var, j0Var, 9)), new ug0.d(17, y.f139758i), ck2.i.f27923c, ck2.i.f27924d));
        }
    }

    @Override // qa2.s1
    public final void D() {
        wh0.h hVar;
        this.f139763i.d();
        this.f139761g.a();
        if (!this.f139762h || (hVar = this.f139764j) == null) {
            return;
        }
        B(hVar);
    }

    public final boolean E(int i13, int i14) {
        sq0.f0 f0Var = this.f139759e;
        sq0.o r13 = f0Var.r(i13);
        sq0.o r14 = f0Var.r(i14);
        if (r13 == null || r14 == null) {
            return false;
        }
        return Intrinsics.d((a0) r13.f115027a, (a0) r14.f115027a);
    }

    public final boolean F(int i13) {
        int d2;
        sq0.o r13 = this.f139759e.r(i13);
        if (r13 == null) {
            return false;
        }
        sq0.e0 c13 = r13.c();
        nr0.j jVar = c13 instanceof nr0.j ? (nr0.j) c13 : null;
        if (jVar == null || (d2 = r13.d()) < 0 || d2 >= jVar.a()) {
            return false;
        }
        Object obj = jVar.d().get(d2);
        if (!(obj instanceof f30)) {
            return false;
        }
        f30 f30Var = (f30) obj;
        return (f30Var.m5().booleanValue() || ((es.c) as.c.a()).M(f30Var) || b40.r0(f30Var)) ? false : true;
    }

    public final void G(int i13, Function0 creatorLambda) {
        Intrinsics.checkNotNullParameter(creatorLambda, "creatorLambda");
        this.f139765k.j(i13, new f(creatorLambda));
    }

    public final void H(int[] ids, Function0 creatorLambda) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(creatorLambda, "creatorLambda");
        for (int i13 : ids) {
            this.f139765k.j(i13, new f(creatorLambda));
        }
    }

    @Override // yq0.m, androidx.recyclerview.widget.b2
    public final int e() {
        return this.f139759e.a();
    }

    @Override // androidx.recyclerview.widget.b2
    public final long f(int i13) {
        dl1.s item;
        String id3;
        e eVar = this.f139767m;
        long hashCode = (eVar == null || (item = ((rr0.g) ((sr0.b) eVar).f115080a).getItem(i13)) == null || (id3 = item.getId()) == null) ? -1L : id3.hashCode();
        if (hashCode != -1) {
            return hashCode;
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        return this.f139759e.getItemViewType(i13);
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        d0 viewHolder = (d0) y2Var;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        KeyEvent.Callback callback = viewHolder.f139687u;
        if (!(callback instanceof yk1.n)) {
            vb0.j.f125466a.G("The registered view " + viewHolder.f19717a + " must implement MvpView", new Object[0]);
            return;
        }
        if (viewHolder instanceof c) {
            return;
        }
        u uVar = this.f139766l;
        if (uVar != null) {
            uVar.K(viewHolder, i13);
        }
        Intrinsics.g(callback, "null cannot be cast to non-null type com.pinterest.framework.mvp.MvpView");
        this.f139759e.p(i13, (yk1.n) callback);
        u uVar2 = this.f139766l;
        if (uVar2 != null) {
            uVar2.E(viewHolder, i13);
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView viewGroup, int i13) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        f fVar = (f) this.f139765k.g(i13);
        if (fVar == null) {
            if (i13 != -1) {
                String e13 = a.a.e("Did you forget to register a view creator for type ", i13, "?");
                if (!ff0.j.f62104b) {
                    Context context = kb0.a.f79058b;
                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().e(e13);
                }
            }
            Context context2 = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return new c(context2);
        }
        u uVar = this.f139766l;
        if (uVar != null) {
            uVar.o(viewGroup, i13);
        }
        a0 a0Var = (a0) this.f139759e.q(i13);
        View view = (View) fVar.f139693a.invoke();
        d0 d0Var = new d0(view);
        view.setTag(t0.registry_view_holder, d0Var);
        boolean z13 = a0Var instanceof ar0.a;
        View view2 = d0Var.f139687u;
        if (z13) {
            ar0.a aVar = (ar0.a) a0Var;
            if (view2 instanceof ar0.b) {
                if (aVar != null) {
                    view2.setOnClickListener(new c0(0, aVar, d0Var));
                } else {
                    view2.setOnClickListener(null);
                }
            }
        }
        yk1.m S = a0Var.S(i13);
        wt1.e eVar = S instanceof wt1.e ? (wt1.e) S : null;
        if (eVar != null) {
            eVar.a(dl2.b.b(this.f139760f.getCoroutineContext().plus(new ao2.i0("SBABridgePresenter"))), this.f139761g, view2);
        }
        if (S != null) {
            yk1.j.a().d(view, S);
        }
        u uVar2 = this.f139766l;
        if (uVar2 == null) {
            return d0Var;
        }
        uVar2.F(d0Var, viewGroup, i13);
        return d0Var;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void x(y2 y2Var) {
        d0 holder = (d0) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        y92.i iVar = holder.f139688v;
        if (iVar != null) {
            iVar.onViewDetached();
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final void y(y2 y2Var) {
        d0 holder = (d0) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        y92.i iVar = holder.f139688v;
        if (iVar != null) {
            iVar.onViewRecycled();
        }
    }
}
