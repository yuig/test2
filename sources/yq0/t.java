package yq0;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.m2;
import androidx.recyclerview.widget.o2;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.ui.grid.PinterestRecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z3;
import m60.t0;
import m60.v0;
import m60.x0;
import nx.n0;
import nx.o0;
import nx.r0;
import o82.q2;
import qa2.s1;
import qa2.t1;
import so.oa;
import sq0.e0;
import yq0.m;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0010\b\u0001\u0010\u0004*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u00020\u00052\b\u0012\u0004\u0012\u00028\u00000\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f:\u0003\u000f\u0010\u0011B\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lyq0/t;", "Lsq0/e0;", "D", "Lyq0/m;", "A", "Lyk1/k;", "Lsq0/b0;", "Lse0/k;", "Lar0/t;", "Lar0/j;", "Lml1/q;", "Loc2/j;", "Lec2/o;", "<init>", "()V", "vb0/i", "yq0/o", "a7/e", "recyclerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class t<D extends sq0.e0, A extends m> extends yk1.k implements sq0.b0, se0.k, ar0.t, ar0.j, ml1.q, oc2.j, ec2.o {

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f139730t0 = 0;

    /* renamed from: f0, reason: collision with root package name */
    public m f139732f0;

    /* renamed from: g0, reason: collision with root package name */
    public PinterestEmptyStateLayout f139733g0;

    /* renamed from: h0, reason: collision with root package name */
    public PinterestSwipeRefreshLayout f139734h0;

    /* renamed from: i0, reason: collision with root package name */
    public PinterestLoadingLayout f139735i0;

    /* renamed from: j0, reason: collision with root package name */
    public PinterestRecyclerView f139736j0;

    /* renamed from: k0, reason: collision with root package name */
    public ar0.g f139737k0;

    /* renamed from: l0, reason: collision with root package name */
    public sq0.a0 f139738l0;

    /* renamed from: m0, reason: collision with root package name */
    public o f139739m0;

    /* renamed from: n0, reason: collision with root package name */
    public ar0.n f139740n0;

    /* renamed from: r0, reason: collision with root package name */
    public cl1.c f139744r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f139745s0;

    /* renamed from: e0, reason: collision with root package name */
    public final xk2.v f139731e0 = xk2.m.b(new r0(this, 10));

    /* renamed from: o0, reason: collision with root package name */
    public final xk2.v f139741o0 = xk2.m.b(q.f139723i);

    /* renamed from: p0, reason: collision with root package name */
    public final LinkedHashSet f139742p0 = new LinkedHashSet();

    /* renamed from: q0, reason: collision with root package name */
    public final boolean f139743q0 = d7.b.f53785b;

    public t() {
        s92.g gVar = s92.i.Companion;
    }

    public final void A8(o2 onScrollListener) {
        Intrinsics.checkNotNullParameter(onScrollListener, "onScrollListener");
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.e(onScrollListener);
        }
    }

    public final void B8(ar0.s lifecycleListener) {
        Intrinsics.checkNotNullParameter(lifecycleListener, "listener");
        ar0.n q83 = q8();
        Intrinsics.checkNotNullParameter(lifecycleListener, "listener");
        ar0.n q84 = q8();
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.f52532b.remove(q84);
        }
        Intrinsics.checkNotNullParameter(lifecycleListener, "focusChangeListener");
        q84.f20400d.remove(lifecycleListener);
        q83.n(lifecycleListener);
        Intrinsics.checkNotNullParameter(lifecycleListener, "attachStateListener");
        q83.f20399c.remove(lifecycleListener);
        Intrinsics.checkNotNullParameter(lifecycleListener, "scrollListener");
        q83.f20398b.remove(lifecycleListener);
        Intrinsics.checkNotNullParameter(lifecycleListener, "lifecycleListener");
        q83.f20397a.remove(lifecycleListener);
    }

    public final void C8(ar0.y scrollListener) {
        Intrinsics.checkNotNullParameter(scrollListener, "listener");
        ar0.n q83 = q8();
        Intrinsics.checkNotNullParameter(scrollListener, "scrollListener");
        q83.f20398b.remove(scrollListener);
        if (scrollListener instanceof xy.b) {
            m60.u.f85943a.j(((xy.b) scrollListener).f136141c);
        }
    }

    public int D2() {
        return p8();
    }

    public final void D8() {
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.h(0, true);
        }
    }

    public final void E8(int i13, boolean z13) {
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.h(i13, z13);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.pinterest.design.brio.widget.voice.PinterestVoiceLayout, ve0.c] */
    public final void F8(String str) {
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        if (pinterestEmptyStateLayout != null) {
            Intrinsics.f(str);
            pinterestEmptyStateLayout.f44850b.a(str);
        }
        PinterestEmptyStateLayout pinterestEmptyStateLayout2 = this.f139733g0;
        if (pinterestEmptyStateLayout2 != null) {
            pinterestEmptyStateLayout2.e(pinterestEmptyStateLayout2.f44852d);
        }
    }

    public final void G8(int i13) {
        View view;
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        if (pinterestEmptyStateLayout == null || (view = pinterestEmptyStateLayout.f44851c) == null || !(view.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pinterestEmptyStateLayout.f44851c.getLayoutParams();
        int i14 = layoutParams.leftMargin;
        if (i13 == Integer.MIN_VALUE) {
            i13 = layoutParams.topMargin;
        }
        com.bumptech.glide.c.a1(layoutParams, i14, i13, layoutParams.rightMargin, layoutParams.bottomMargin);
        pinterestEmptyStateLayout.f44851c.setLayoutParams(layoutParams);
    }

    public final void H8(int i13, int i14, int i15, int i16) {
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.f52531a.setPaddingRelative(i13, i14, i15, i16);
        }
    }

    public final void I8(boolean z13) {
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        if (pinterestEmptyStateLayout != null) {
            pinterestEmptyStateLayout.g();
        }
        M8(!z13);
        this.f139745s0 = z13;
    }

    public final void J8(l2 layoutManager) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView == null) {
            return;
        }
        pinterestRecyclerView.l(layoutManager);
    }

    @Override // yk1.k, nl1.d
    public void K7() {
        ar0.n nVar;
        super.K7();
        RecyclerView g83 = g8();
        if (g83 == null || (nVar = this.f139740n0) == null) {
            return;
        }
        nVar.h(g83);
    }

    public final void K8(t1 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z13 = state == t1.STATE_LOADING;
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        if (pinterestEmptyStateLayout != null) {
            if (z13) {
                Intrinsics.f(pinterestEmptyStateLayout);
                pinterestEmptyStateLayout.f(false);
            } else {
                Intrinsics.f(pinterestEmptyStateLayout);
                pinterestEmptyStateLayout.g();
            }
        }
        M8(z13);
    }

    @Override // yk1.k, nl1.d
    public void L7() {
        ar0.n nVar;
        RecyclerView g83 = g8();
        if (g83 != null && (nVar = this.f139740n0) != null) {
            nVar.a(g83);
        }
        o0 o0Var = o0.f92437i;
        o0.b(o0Var.f92441d, n0.TYPE_PINS);
        o0.b(o0Var.f92442e, n0.TYPE_BOARDS);
        o0.b(o0Var.f92443f, n0.TYPE_RELATED_PINS_FILTER);
        super.L7();
    }

    public final void L8() {
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f139734h0;
        if (pinterestSwipeRefreshLayout == null) {
            return;
        }
        pinterestSwipeRefreshLayout.setEnabled(false);
    }

    public void M8(boolean z13) {
        se0.c f83 = f8();
        if (f83 != null) {
            f83.showLoadingSpinner(z13);
        }
    }

    public final void N8(boolean z13) {
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.m(z13);
        }
    }

    public final void O8(View emptyStateView, int i13) {
        Intrinsics.checkNotNullParameter(emptyStateView, "emptyStateView");
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        if (pinterestEmptyStateLayout != null) {
            pinterestEmptyStateLayout.h(emptyStateView, i13);
        }
    }

    public final void P8() {
        ar0.g gVar;
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView == null || (gVar = this.f139737k0) == null) {
            return;
        }
        gVar.m(pinterestRecyclerView.f52535e);
    }

    public Set S0() {
        return this.f139742p0;
    }

    @Override // androidx.fragment.app.Fragment, oc2.j
    public View T() {
        return this.f139736j0;
    }

    @Override // ar0.j
    public final Set U4() {
        return this.f139742p0;
    }

    public void V1() {
        sq0.a0 a0Var = this.f139738l0;
        if (a0Var != null) {
            a0Var.onRecyclerRefresh();
        }
    }

    public final void Y7(ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f139742p0.add(view);
    }

    public final void Z7(m2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.f52531a.n(listener);
        }
    }

    public final void a8(h2 itemDecoration) {
        Intrinsics.checkNotNullParameter(itemDecoration, "itemDecoration");
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.a(itemDecoration);
        }
    }

    @Override // sq0.b0
    public final void addItemVisibilityChangeListener(sq0.z listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        RecyclerView g83 = g8();
        if (g83 == null) {
            return;
        }
        if (this.f139739m0 == null) {
            o oVar = new o(g83);
            this.f139739m0 = oVar;
            Z7(oVar);
        }
        o oVar2 = this.f139739m0;
        if (oVar2 != null) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            oVar2.f139720b.add(listener);
        }
    }

    @Override // ar0.t
    public final void addRecyclerViewEventListener(ar0.s focusChangeListener) {
        Intrinsics.checkNotNullParameter(focusChangeListener, "listener");
        ar0.n q83 = q8();
        Intrinsics.checkNotNullParameter(focusChangeListener, "lifecycleListener");
        q83.f20397a.add(focusChangeListener);
        q83.k(focusChangeListener);
        Intrinsics.checkNotNullParameter(focusChangeListener, "attachStateListener");
        q83.f20399c.add(focusChangeListener);
        q83.l(focusChangeListener);
        Intrinsics.checkNotNullParameter(focusChangeListener, "listener");
        ar0.n q84 = q8();
        Intrinsics.checkNotNullParameter(focusChangeListener, "focusChangeListener");
        q84.f20400d.add(focusChangeListener);
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.f52532b.add(q84);
        }
    }

    @Override // ar0.t
    public final void addScrollListener(ar0.y listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        q8().k(listener);
    }

    public final void b8(o2 onScrollListener) {
        Intrinsics.checkNotNullParameter(onScrollListener, "onScrollListener");
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.b(onScrollListener);
        }
    }

    public final void c8(os.b creator) {
        os.f fVar;
        Intrinsics.checkNotNullParameter(creator, "creator");
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView == null || (fVar = pinterestRecyclerView.f52533c) == null) {
            return;
        }
        if (fVar.f97480f == null) {
            fVar.f97480f = new ArrayList();
            fVar.f97481g = new ArrayList();
        }
        fVar.f97480f.add(creator);
        fVar.f97481g.add(creator);
        fVar.j(fVar.f97480f.size() - 1);
    }

    public abstract m d8(sq0.e0 e0Var);

    @Override // sq0.b0
    public final void displayError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (this.f139736j0 != null) {
            if (!qb0.d.f103396a.c()) {
                K8(t1.STATE_ERROR);
                return;
            }
            String string = getString(x0.oops_something_went_wrong);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            F8(string);
            PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
            if (pinterestRecyclerView == null || !pinterestRecyclerView.isEmpty()) {
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().e(string);
            }
            K8(t1.STATE_ERROR);
        }
    }

    public void e3() {
    }

    public m e8(wk1.i dataSourceProvider) {
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        throw new IllegalStateException("createMultiSourceAdapter must be overridden");
    }

    public se0.c f8() {
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout;
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            os.f fVar = pinterestRecyclerView.f52533c;
            if ((fVar != null && fVar.f97479e) && ((pinterestSwipeRefreshLayout = this.f139734h0) == null || !pinterestSwipeRefreshLayout.f44879m)) {
                return null;
            }
        }
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout2 = this.f139734h0;
        return pinterestSwipeRefreshLayout2 != null ? pinterestSwipeRefreshLayout2 : this.f139735i0;
    }

    public final RecyclerView g8() {
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            return pinterestRecyclerView.f52531a;
        }
        return null;
    }

    @Override // sq0.b0
    public final sq0.d0 getRecyclerAdapter() {
        return this.f139732f0;
    }

    public final String h8() {
        return (String) this.f139731e0.getValue();
    }

    /* renamed from: i8, reason: from getter */
    public final PinterestEmptyStateLayout getF139733g0() {
        return this.f139733g0;
    }

    @Override // sq0.b0
    public final void initializeAdapter(sq0.e0 dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        if (this.f139732f0 != null) {
            throw new IllegalStateException("Adapter has already been initialized".toString());
        }
        m d83 = d8(dataSource);
        this.f139732f0 = d83;
        s8(d83);
        x8(d83, dataSource);
    }

    @Override // sq0.b0
    public final void initializeMultiSourceAdapter(sq0.f0 dataSourceProvider) {
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        if (this.f139732f0 != null) {
            throw new IllegalStateException("Adapter has already been initialized".toString());
        }
        wk1.i iVar = (wk1.i) dataSourceProvider;
        m e83 = e8(iVar);
        this.f139732f0 = e83;
        s8(e83);
        y8(e83, iVar);
    }

    /* renamed from: j8, reason: from getter */
    public boolean getQ0() {
        return this.f139743q0;
    }

    public void k5() {
        RecyclerView g83 = g8();
        if (g83 != null) {
            q8().i(g83);
        }
    }

    public mj.m k8() {
        return null;
    }

    public g2 l8() {
        return new androidx.recyclerview.widget.s();
    }

    public a7.e m8() {
        a7.e eVar = new a7.e(v0.pinterest_recycler_swipe_refresh, t0.p_recycler_view);
        eVar.f979c = t0.empty_state_container;
        eVar.c(t0.swipe_container);
        return eVar;
    }

    @Override // sq0.b0
    public final void makeScrollListenerReadyToLoadMore() {
        ar0.g gVar = this.f139737k0;
        if (gVar != null) {
            gVar.f20375b = false;
        }
    }

    @Override // sq0.b0
    public final void mvpMaybeToggleOfflineEmptyStateVisibility() {
        boolean c13 = qb0.d.f103396a.c();
        m mVar = this.f139732f0;
        boolean z13 = mVar != null && mVar.e() == 0;
        if (!c13 && z13) {
            w8();
            return;
        }
        if (this.f139733g0 == null || !this.f139745s0) {
            return;
        }
        I8(false);
        V1();
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        if (pinterestEmptyStateLayout != null) {
            pinterestEmptyStateLayout.d();
        }
    }

    public androidx.recyclerview.widget.v0 n8() {
        n nVar = new n(this, 1);
        getContext();
        PinterestLinearLayoutManager layoutManager = new PinterestLinearLayoutManager(nVar);
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        return new b1(layoutManager);
    }

    public boolean o4() {
        return u8();
    }

    public ar0.f o8() {
        return new bk.f();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        a7.e m83 = m8();
        this.E = m83.f977a;
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        PinterestRecyclerView t83 = t8(onCreateView);
        this.f139736j0 = t83;
        if (t83 != null) {
            t83.f52534d = k8();
        }
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.l(n8().f19650a);
        }
        PinterestRecyclerView pinterestRecyclerView2 = this.f139736j0;
        if (pinterestRecyclerView2 != null) {
            pinterestRecyclerView2.k(l8());
        }
        int i13 = m83.f979c;
        m60.f0 f0Var = vb0.j.f125466a;
        if (i13 != 0) {
            PinterestEmptyStateLayout pinterestEmptyStateLayout = (PinterestEmptyStateLayout) onCreateView.findViewById(i13);
            this.f139733g0 = pinterestEmptyStateLayout;
            f0Var.M(pinterestEmptyStateLayout, "Missing empty state container", tb0.p.UNSPECIFIED, new Object[0]);
        }
        int i14 = m83.f980d;
        if (i14 != 0) {
            PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = (PinterestSwipeRefreshLayout) onCreateView.findViewById(i14);
            this.f139734h0 = pinterestSwipeRefreshLayout;
            f0Var.M(pinterestSwipeRefreshLayout, "Missing swipe refresh layout", tb0.p.UNSPECIFIED, new Object[0]);
        }
        int i15 = m83.f981e;
        if (i15 != 0) {
            PinterestLoadingLayout pinterestLoadingLayout = (PinterestLoadingLayout) onCreateView.findViewById(i15);
            this.f139735i0 = pinterestLoadingLayout;
            f0Var.M(pinterestLoadingLayout, "Missing loading container", tb0.p.UNSPECIFIED, new Object[0]);
        }
        if (getQ0() && this.f139744r0 == null) {
            cl1.c cVar = new cl1.c(f7(), new ir.g(this, 1), new k(this, 2));
            addRecyclerViewEventListener(cVar);
            this.f139744r0 = cVar;
        }
        n1 c13 = n1.f83436b.c();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) c13.f83439a;
        if (g1Var.o("android_lifecycle_aware_grid_view_to_all_surfaces", "enabled", z3Var) || g1Var.l("android_lifecycle_aware_grid_view_to_all_surfaces")) {
            addRecyclerViewEventListener(new zq0.a());
        }
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        ar0.n nVar;
        RecyclerView g83 = g8();
        if (g83 != null && (nVar = this.f139740n0) != null) {
            nVar.f(g83);
        }
        super.onDestroy();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ar0.e eVar;
        ArrayList arrayList;
        ar0.n nVar = this.f139740n0;
        if (nVar != null) {
            RecyclerView g83 = g8();
            if (g83 != null) {
                nVar.f(g83);
            }
            PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
            if (pinterestRecyclerView != null) {
                pinterestRecyclerView.f52532b.remove(nVar);
            }
            this.f139740n0 = null;
        }
        o listener = this.f139739m0;
        if (listener != null) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            PinterestRecyclerView pinterestRecyclerView2 = this.f139736j0;
            if (pinterestRecyclerView2 != null && (arrayList = pinterestRecyclerView2.f52531a.C) != null) {
                arrayList.remove(listener);
            }
            LinkedHashSet linkedHashSet = listener.f139720b;
            if (!qb0.b.o(linkedHashSet)) {
                linkedHashSet.clear();
            }
            this.f139739m0 = null;
        }
        ((Handler) this.f139741o0.getValue()).removeCallbacksAndMessages(null);
        PinterestRecyclerView pinterestRecyclerView3 = this.f139736j0;
        if (pinterestRecyclerView3 != null) {
            os.f fVar = pinterestRecyclerView3.f52533c;
            if (fVar != null) {
                ((s1) fVar.f97495d).D();
            }
            ArrayList arrayList2 = pinterestRecyclerView3.f52531a.f19233i0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            ArrayList arrayList3 = pinterestRecyclerView3.f52531a.C;
            if (arrayList3 != null) {
                arrayList3.clear();
            }
            pinterestRecyclerView3.f52532b.clear();
        }
        PinterestRecyclerView pinterestRecyclerView4 = this.f139736j0;
        ViewParent parent = pinterestRecyclerView4 != null ? pinterestRecyclerView4.getParent() : null;
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.ViewManager");
        ((ViewManager) parent).removeView(this.f139736j0);
        this.f139736j0 = null;
        ar0.g gVar = this.f139737k0;
        if (gVar != null) {
            gVar.f20374a = 0;
            gVar.f20375b = true;
            gVar.f20379f = null;
            Handler handler = gVar.f20382i;
            if (handler != null && (eVar = gVar.f20380g) != null) {
                handler.removeCallbacks(eVar);
                gVar.f20380g = null;
                gVar.f20382i = null;
            }
        }
        this.f139737k0 = null;
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        if (pinterestEmptyStateLayout != null) {
            pinterestEmptyStateLayout.f44856h.clear();
        }
        this.f139733g0 = null;
        this.f139734h0 = null;
        this.f139742p0.clear();
        super.onDestroyView();
    }

    public void onLoadMoreComplete() {
        ar0.g gVar = this.f139737k0;
        if (gVar != null) {
            gVar.l();
        }
    }

    @Override // yk1.k, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        l2 l2Var;
        Parcelable A0;
        Intrinsics.checkNotNullParameter(outState, "outState");
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null && (l2Var = pinterestRecyclerView.f52535e) != null && (A0 = l2Var.A0()) != null) {
            outState.putParcelable("PinterestRecyclerView.LAYOUT_MANAGER_SAVED_STATE_KEY", A0);
        }
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f139734h0;
        if (pinterestSwipeRefreshLayout != null) {
            pinterestSwipeRefreshLayout.m(outState);
        }
        super.onSaveInstanceState(outState);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View v13, Bundle bundle) {
        PinterestRecyclerView pinterestRecyclerView;
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout;
        Intrinsics.checkNotNullParameter(v13, "v");
        if (bundle != null && (pinterestSwipeRefreshLayout = this.f139734h0) != null) {
            pinterestSwipeRefreshLayout.l(bundle);
        }
        super.onViewCreated(v13, bundle);
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout2 = this.f139734h0;
        if (pinterestSwipeRefreshLayout2 != null) {
            pinterestSwipeRefreshLayout2.f44880n = new l(this, s7());
        }
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout3 = this.f139734h0;
        if (pinterestSwipeRefreshLayout3 != null) {
            pinterestSwipeRefreshLayout3.f44881o = new com.google.firebase.messaging.a0(this, 17);
        }
        if (bundle != null && (pinterestRecyclerView = this.f139736j0) != null) {
            pinterestRecyclerView.f(bundle);
        }
        yh1.a aVar = new yh1.a(P0());
        Intrinsics.checkNotNullParameter(this, "observable");
        addRecyclerViewEventListener(aVar);
    }

    public final int p8() {
        os.f fVar;
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView == null || (fVar = pinterestRecyclerView.f52533c) == null) {
            return 0;
        }
        return fVar.K();
    }

    public final ar0.n q8() {
        ar0.n nVar = this.f139740n0;
        if (nVar != null) {
            return nVar;
        }
        ar0.n nVar2 = new ar0.n(this);
        this.f139740n0 = nVar2;
        b8(nVar2);
        Z7(nVar2);
        return nVar2;
    }

    @Override // nl1.d
    public List r7() {
        String pinUid;
        ArrayList arrayList = new ArrayList();
        RecyclerView g83 = g8();
        if (g83 != null) {
            int childCount = g83.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                KeyEvent.Callback childAt = g83.getChildAt(i13);
                if ((childAt instanceof qa2.f0) && (pinUid = ((qa2.f0) childAt).getInternalCell().getPinUid()) != null && pinUid.length() != 0) {
                    arrayList.add(pinUid);
                }
            }
        }
        return arrayList;
    }

    public androidx.recyclerview.widget.t0 r8() {
        return new n(this, 0);
    }

    @Override // sq0.b0
    public final void releaseAdapter() {
        this.f139732f0 = null;
    }

    @Override // sq0.b0
    public final void resetRecyclerScrollListener() {
        ar0.g gVar = this.f139737k0;
        if (gVar != null) {
            gVar.f20374a = 0;
            gVar.f20375b = true;
        }
    }

    public final void s8(m mVar) {
        PinterestRecyclerView pinterestRecyclerView;
        PinterestRecyclerView pinterestRecyclerView2 = this.f139736j0;
        ar0.g gVar = pinterestRecyclerView2 != null ? new ar0.g(pinterestRecyclerView2.f52535e, o8()) : null;
        this.f139737k0 = gVar;
        if (gVar != null && (pinterestRecyclerView = this.f139736j0) != null) {
            pinterestRecyclerView.b(gVar);
        }
        PinterestRecyclerView pinterestRecyclerView3 = this.f139736j0;
        if (pinterestRecyclerView3 != null) {
            pinterestRecyclerView3.f52534d = k8();
        }
        PinterestRecyclerView pinterestRecyclerView4 = this.f139736j0;
        if (pinterestRecyclerView4 != null) {
            pinterestRecyclerView4.j(mVar);
        }
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        if (pinterestEmptyStateLayout != null) {
            pinterestEmptyStateLayout.f44855g = this.f139736j0;
            pinterestEmptyStateLayout.g();
        }
    }

    @Override // sq0.b0
    public final void setLoadMoreListener(sq0.w wVar) {
        ar0.g gVar = this.f139737k0;
        if (gVar != null) {
            gVar.f20379f = wVar;
        }
    }

    public void setLoadState(yk1.i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i13 = p.f139722a[state.ordinal()];
        K8(i13 != 1 ? i13 != 2 ? t1.STATE_LOADED : t1.STATE_ERROR : t1.STATE_LOADING);
    }

    @Override // sq0.b0
    public final void setRefreshListener(sq0.a0 a0Var) {
        this.f139738l0 = a0Var;
    }

    @Override // sq0.b0
    public final void setRefreshing(boolean z13) {
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f139734h0;
        if (pinterestSwipeRefreshLayout == null) {
            return;
        }
        pinterestSwipeRefreshLayout.n(z13);
    }

    @Override // sq0.b0
    public final void setShowPaginationSpinner(boolean z13) {
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.m(z13);
        }
    }

    public PinterestRecyclerView t8(View parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        View findViewById = parentView.findViewById(m8().f978b);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        return (PinterestRecyclerView) findViewById;
    }

    @Override // sq0.b0
    public final void triggerLoadMoreCheck() {
        ar0.g gVar;
        RecyclerView g83 = g8();
        if (g83 == null || (gVar = this.f139737k0) == null) {
            return;
        }
        gVar.j(g83, 0, 0);
    }

    public final boolean u8() {
        os.f fVar;
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null && pinterestRecyclerView != null && (fVar = pinterestRecyclerView.f52533c) != null && fVar.f97479e && pinterestRecyclerView != null) {
            int c13 = eb2.j.c(pinterestRecyclerView.f52531a.f19242n, null);
            os.f fVar2 = pinterestRecyclerView.f52533c;
            if (fVar2 != null && c13 != -1 && fVar2.f97479e && c13 == fVar2.e() - 1) {
                return true;
            }
        }
        return false;
    }

    public final void v8() {
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            g2 g2Var = pinterestRecyclerView.f52531a.M;
            if (g2Var instanceof androidx.recyclerview.widget.s) {
                Intrinsics.g(g2Var, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
                ((androidx.recyclerview.widget.s) g2Var).f19618g = false;
            }
        }
    }

    public void w() {
        D8();
    }

    public final void w8() {
        if (this.f139733g0 != null) {
            View inflate = LayoutInflater.from(getContext()).inflate(v0.view_empty_no_connection, (ViewGroup) this.f139733g0, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            O8(inflate, 16);
            I8(true);
        }
    }

    public void x8(m adapter, sq0.e0 dataSource) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
    }

    public void y8(m adapter, wk1.i dataSourceProvider) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
    }

    public void z8(q2 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }
}
