package o82;

import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b3 extends yq0.m {

    /* renamed from: l, reason: collision with root package name */
    public static final int f93539l = k82.a.state_based_item_view_model;

    /* renamed from: e, reason: collision with root package name */
    public final ao2.j0 f93540e;

    /* renamed from: f, reason: collision with root package name */
    public final n f93541f;

    /* renamed from: g, reason: collision with root package name */
    public final yq0.u f93542g;

    /* renamed from: h, reason: collision with root package name */
    public final Application f93543h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.t1 f93544i;

    /* renamed from: j, reason: collision with root package name */
    public final n.f f93545j;

    /* renamed from: k, reason: collision with root package name */
    public final a7.o f93546k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(ao2.j0 scope, n recyclerDataSource, yq0.u uVar, Application application, int i13) {
        super(recyclerDataSource);
        uVar = (i13 & 4) != 0 ? null : uVar;
        androidx.lifecycle.t1 viewModelStore = new androidx.lifecycle.t1();
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(recyclerDataSource, "recyclerDataSource");
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        this.f93540e = scope;
        this.f93541f = recyclerDataSource;
        this.f93542g = uVar;
        this.f93543h = application;
        this.f93544i = viewModelStore;
        this.f93545j = new n.f(scope);
        this.f93546k = new a7.o(true);
    }

    public static /* synthetic */ void G(b3 b3Var, int i13, Function0 function0, l82.i0 i0Var, c cVar, o2 o2Var, l82.i iVar, int i14) {
        if ((i14 & 64) != 0) {
            iVar = null;
        }
        b3Var.F(i13, function0, i0Var, cVar, o2Var, "", iVar);
    }

    @Override // qa2.s1
    public final void D() {
        this.f93544i.a();
    }

    public final void E(int i13, Function0 viewCreator, vq0.h mvpViewBinder, Function1 vmStateToModelConverter) {
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(mvpViewBinder, "mvpViewBinder");
        Intrinsics.checkNotNullParameter(vmStateToModelConverter, "vmStateToModelConverter");
        this.f93546k.j(i13, new z2(new yq0.f(viewCreator), mvpViewBinder, new y2(mvpViewBinder, vmStateToModelConverter)));
    }

    public final void F(int i13, Function0 viewCreator, l82.i0 initialVMState, c displayStateBinder, o2 displayStateRenderer, String tag, l82.i iVar) {
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(initialVMState, "initialVMState");
        Intrinsics.checkNotNullParameter(displayStateBinder, "displayStateBinder");
        Intrinsics.checkNotNullParameter(displayStateRenderer, "displayStateRenderer");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f93546k.j(i13, new a3(new yq0.f(viewCreator), new r02.t(displayStateBinder, 1), new p2(initialVMState, displayStateRenderer, tag, iVar, this.f93543h), f2.f93589o, this.f93544i));
    }

    public final void H(int i13, Function0 viewCreator) {
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        w2 w2Var = new w2();
        this.f93546k.j(i13, new a3(new yq0.f(viewCreator), new p90.m(12), w2Var, f2.f93590p, this.f93544i));
    }

    public final void I(int i13, Function0 viewCreator, b displayStateBinder, q itemViewModelCreator) {
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(displayStateBinder, "displayStateBinder");
        Intrinsics.checkNotNullParameter(itemViewModelCreator, "itemViewModelCreator");
        this.f93546k.j(i13, new a3(new yq0.f(viewCreator), displayStateBinder, itemViewModelCreator, f2.f93591q, this.f93544i));
    }

    public final void J(int i13, Function0 viewCreator, p90.m displayStateBinder, p90.n itemViewModelCreator, Function1 vmStateConverter) {
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(displayStateBinder, "displayStateBinder");
        Intrinsics.checkNotNullParameter(itemViewModelCreator, "itemViewModelCreator");
        Intrinsics.checkNotNullParameter(vmStateConverter, "vmStateConverter");
        this.f93546k.j(i13, new a3(new yq0.f(viewCreator), displayStateBinder, itemViewModelCreator, vmStateConverter, this.f93544i));
    }

    @Override // androidx.recyclerview.widget.b2
    public final long f(int i13) {
        return this.f93541f.getItemId(i13).hashCode();
    }

    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        return this.f93541f.getItemViewType(i13);
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(androidx.recyclerview.widget.y2 y2Var, int i13) {
        yq0.d0 viewHolder = (yq0.d0) y2Var;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (viewHolder instanceof yq0.c) {
            return;
        }
        yq0.u uVar = this.f93542g;
        if (uVar != null) {
            uVar.K(viewHolder, i13);
        }
        ((n) this.f139716d).v2(viewHolder.f139687u, i13);
        if (uVar != null) {
            uVar.E(viewHolder, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.b2
    public final androidx.recyclerview.widget.y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        x2 x2Var = (x2) this.f93546k.g(i13);
        int i14 = 0;
        if (x2Var == null) {
            vb0.j.f125466a.G(a.a.d("You must register view type ", i13), new Object[0]);
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new yq0.c(bs1.c.k0(context));
        }
        yq0.u uVar = this.f93542g;
        if (uVar != null) {
            uVar.o(parent, i13);
        }
        View view = (View) x2Var.a().f139693a.invoke();
        yq0.d0 d0Var = new yq0.d0(view);
        view.setTag(m60.t0.registry_view_holder, d0Var);
        sq0.e0 e0Var = this.f139716d;
        if (e0Var instanceof ar0.a) {
            Intrinsics.g(e0Var, "null cannot be cast to non-null type com.pinterest.feature.core.view.recycler.ClickAwareRecyclerDataSource");
            ar0.a aVar = (ar0.a) e0Var;
            View view2 = d0Var.f139687u;
            if (view2 instanceof ar0.b) {
                view2.setOnClickListener(new yq0.c0(i14, aVar, d0Var));
            }
        }
        boolean z13 = x2Var instanceof z2;
        androidx.lifecycle.t1 t1Var = this.f93544i;
        ao2.j0 j0Var = this.f93540e;
        if (z13) {
            z2 z2Var = (z2) x2Var;
            yk1.m f13 = z2Var.f93768b.f();
            if (f13 != null) {
                yk1.j.a().d(view, f13);
                wt1.e eVar = f13 instanceof wt1.e ? (wt1.e) f13 : null;
                if (eVar != null) {
                    ho2.c b13 = dl2.b.b(j0Var.getCoroutineContext().plus(new ao2.i0("SBABridgePresenter")));
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    eVar.a(b13, t1Var, view);
                }
            }
            y2 y2Var = z2Var.f93769c;
            Intrinsics.g(y2Var, "null cannot be cast to non-null type com.pinterest.statebasedrecycler.StateBasedRecyclerAdapter.LegacyMvpBinder<com.pinterest.framework.mvp.MvpView, kotlin.Any, com.pinterest.statebased.VMState>");
            ((n) e0Var).F2(i13, y2Var);
        } else if (x2Var instanceof a3) {
            a3 a3Var = (a3) x2Var;
            n nVar = (n) e0Var;
            b displayStateBinder = a3Var.f93531b;
            Intrinsics.g(displayStateBinder, "null cannot be cast to non-null type com.pinterest.statebasedrecycler.DisplayStateBinder<com.pinterest.architecture.primitives.DisplayState, android.view.View, com.pinterest.architecture.primitives.FeatureEvent>");
            nVar.p1(i13, displayStateBinder);
            Function1 function1 = a3Var.f93533d;
            Intrinsics.g(function1, "null cannot be cast to non-null type kotlin.Function1<com.pinterest.statebased.VMState, com.pinterest.statebased.VMState>");
            dl2.b.y(1, function1);
            nVar.q2(i13, function1);
            wt1.d viewModel = a3Var.f93532c.b(dl2.b.b(j0Var.getCoroutineContext().plus(new ao2.i0("Recycler Item ViewModel"))));
            if (viewModel != 0) {
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                n.f fVar = this.f93545j;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(displayStateBinder, "displayStateBinder");
                view.setTag(f93539l, viewModel);
                kotlin.jvm.internal.j.z((ao2.j0) fVar.f88576b, null, null, new w0(view, viewModel, displayStateBinder, null), 3);
                view.addOnAttachStateChangeListener(fVar);
                view.isAttachedToWindow();
                if (viewModel instanceof l82.b) {
                    t1Var.b(String.valueOf(viewModel.hashCode()), (androidx.lifecycle.l1) viewModel);
                }
            }
        }
        if (uVar != null) {
            uVar.F(d0Var, parent, i13);
        }
        return d0Var;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void x(androidx.recyclerview.widget.y2 y2Var) {
        yq0.d0 holder = (yq0.d0) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        y92.i iVar = holder.f139688v;
        if (iVar != null) {
            iVar.onViewDetached();
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final void y(androidx.recyclerview.widget.y2 y2Var) {
        yq0.d0 holder = (yq0.d0) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        y92.i iVar = holder.f139688v;
        if (iVar != null) {
            iVar.onViewRecycled();
        }
    }
}
