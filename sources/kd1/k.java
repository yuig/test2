package kd1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.v0;
import com.pinterest.api.model.vh;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.grid.PinterestRecyclerView;
import ea1.t0;
import ea1.u0;
import h32.a4;
import h32.d4;
import h32.h2;
import java.util.List;
import kh2.a1;
import kh2.s0;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import ni1.d0;
import ni1.t2;
import o82.b3;
import qa2.j0;
import u50.r;
import xk2.n;
import yq0.g0;
import zy.o0;
import zy.z;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd1/k;", "Lp82/b;", "<init>", "()V", "shopping_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class k extends m {
    public static final /* synthetic */ int X0 = 0;
    public j0 K0;
    public zs1.a L0;
    public t2 M0;
    public d0 N0;
    public final m1 O0;
    public boolean P0;
    public GestaltSpinner Q0;
    public g0 R0;
    public final ll.j S0;
    public d4 T0;
    public final int U0;
    public final c V0;
    public final int W0;

    public k() {
        int i13 = 11;
        xk2.k r13 = d7.g.r(15, new t0(this, i13), n.NONE);
        int i14 = 12;
        this.O0 = a1.s(this, k0.f80436a.b(b.class), new u0(r13, i13), new ca1.m(r13, i14), new ca1.n(this, r13, i14));
        int i15 = 0;
        this.S0 = new ll.j(16, i15);
        this.T0 = d4.PIN;
        this.U0 = 45;
        this.V0 = new c(this, i15);
        this.W0 = f62.d.fragment_complete_the_look_sheet;
    }

    @Override // o82.i3
    public final List R8() {
        qc2.d dVar = new qc2.d();
        zs1.a aVar = this.L0;
        if (aVar != null) {
            return e0.b(new o0(new z(dVar, aVar), T8(), h2.GRID_CELL));
        }
        Intrinsics.r("impressionDebugUtils");
        throw null;
    }

    @Override // o82.i3
    public final r T8() {
        return new j(e9().c(), 0);
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new w41.g0(e9().a(), 9);
    }

    @Override // o82.i3
    public final r V8() {
        return new tx0.j(e9().c(), 29);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.J(1001, new c(this, 2), new p90.m(8), new p90.n(this, 10), new e(this, 1));
    }

    @Override // p82.b
    public final Function0 Y8() {
        return this.V0;
    }

    @Override // p82.b
    /* renamed from: Z8, reason: from getter */
    public final int getU0() {
        return this.U0;
    }

    @Override // p82.b
    /* renamed from: a9, reason: from getter */
    public final int getA0() {
        return this.W0;
    }

    @Override // nl1.d, nx.i1
    public final h32.g0 b2() {
        return h32.g0.COMPLETE_THE_LOOK_STORY;
    }

    @Override // nl1.d
    public final h32.g0 d7() {
        return h32.g0.COMPLETE_THE_LOOK_STORY;
    }

    public final b e9() {
        return (b) this.O0.getValue();
    }

    @Override // sq0.b0
    /* renamed from: getNumColumns */
    public final int getT0() {
        return 1;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getF57498l1() {
        return this.T0 == d4.SEARCH ? a4.SEARCH_PINS : a4.PIN_PRODUCT;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF88466k0() {
        return this.T0;
    }

    @Override // yq0.t
    public final v0 n8() {
        g41.a aVar = new g41.a(this, 6);
        getContext();
        PinterestLinearLayoutManager layoutManager = new PinterestLinearLayoutManager(aVar, 0, false);
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        return new b1(layoutManager);
    }

    @Override // p82.b, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Navigation navigation = this.I;
        Object i03 = navigation != null ? navigation.i0("com.pinterest.EXTRA_COMPLETE_THE_LOOK_STORY") : null;
        vh vhVar = i03 instanceof vh ? (vh) i03 : null;
        if (vhVar != null) {
            this.P0 = vhVar.f42865w.isEmpty();
            b e93 = e9();
            Navigation navigation2 = this.I;
            String v03 = navigation2 != null ? navigation2.v0("com.pinterest.CLIENT_TRACKING_PARAMETER") : null;
            if (v03 == null) {
                v03 = "";
            }
            e93.j(vhVar, v03, this.P0);
            Navigation navigation3 = this.I;
            Object i04 = navigation3 != null ? navigation3.i0("com.pinterest.EXTRA_WAYS_TO_STYLE_PARENT_VIEW") : null;
            d4 d4Var = i04 instanceof d4 ? (d4) i04 : null;
            if (d4Var == null) {
                d4Var = d4.PIN;
            }
            this.T0 = d4Var;
        }
    }

    @Override // o82.i3, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(f62.c.saving_overlay_loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltSpinner gestaltSpinner = (GestaltSpinner) findViewById;
        s0.w(gestaltSpinner, new e(this, 0));
        this.Q0 = gestaltSpinner;
        return onCreateView;
    }

    @Override // p82.b, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        g0 g0Var = this.R0;
        if (g0Var != null) {
            A8(g0Var);
        }
        super.onDestroyView();
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        c listener = new c(this, 1);
        Intrinsics.checkNotNullParameter(listener, "listener");
        mm1.k kVar = this.E0;
        if (kVar == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        kVar.d(listener);
        int X = bs1.c.X(this, eo1.c.space_200);
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.f52531a.setPaddingRelative(pinterestRecyclerView.getPaddingStart(), pinterestRecyclerView.getPaddingTop(), pinterestRecyclerView.getPaddingEnd(), X);
        }
        a8(new eb2.k(bs1.c.X(this, eo1.c.space_100)));
        f nextState = f.f79244j;
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        mm1.k kVar2 = this.E0;
        if (kVar2 == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        kVar2.i().T(nextState);
        f nextState2 = f.f79245k;
        Intrinsics.checkNotNullParameter(nextState2, "nextState");
        mm1.k kVar3 = this.E0;
        if (kVar3 == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        kVar3.h().u(nextState2);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new i(this, null), 3);
    }
}
