package vq0;

import a7.o;
import g1.p0;
import kotlin.jvm.internal.Intrinsics;
import nx.r0;
import sq0.b0;
import sq0.d0;
import sq0.e0;
import sq0.g0;
import sq0.w;
import uj2.q;
import yk1.m;
import yk1.n;
import yk1.p;
import yk1.r;
import yq0.a0;

/* loaded from: classes.dex */
public abstract class g extends p implements a0, sq0.a0, w {

    /* renamed from: a, reason: collision with root package name */
    public final o f126436a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(uk1.d pinalytics, q networkStateStream) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f126436a = new o(true);
    }

    public final void I0(int i13, r0 provide) {
        o oVar = this.f126436a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(provide, "provide");
        ((p0) oVar.f1155b).j(i13, new g0(provide));
    }

    public m S(int i13) {
        h hVar = (h) this.f126436a.g(i13);
        if (hVar != null) {
            return hVar.f();
        }
        return null;
    }

    public final void c(int[] iArr, h hVar) {
        for (int i13 : iArr) {
            o(i13, hVar);
        }
    }

    public final d0 getAdapter() {
        b0 b0Var = (b0) getViewIfBound();
        if (b0Var != null) {
            return b0Var.getRecyclerAdapter();
        }
        return null;
    }

    public void loadData() {
        ((b0) getView()).resetRecyclerScrollListener();
    }

    public /* bridge */ /* synthetic */ void loadMoreData() {
    }

    public void o(int i13, h hVar) {
        this.f126436a.j(i13, hVar);
    }

    @Override // yk1.b
    public void onActivate() {
        q3();
    }

    @Override // yk1.p
    public final void onNetworkLost() {
        q3();
    }

    @Override // yk1.p
    public final void onNetworkRegained() {
        ((b0) getView()).makeScrollListenerReadyToLoadMore();
        q3();
    }

    public void onRecyclerRefresh() {
        loadData();
    }

    @Override // yk1.p, yk1.b
    public void onUnbind() {
        b0 b0Var = (b0) getViewIfBound();
        if (b0Var != null) {
            b0Var.setLoadMoreListener(null);
        }
        b0 b0Var2 = (b0) getViewIfBound();
        if (b0Var2 != null) {
            b0Var2.setRefreshListener(null);
        }
        b0 b0Var3 = (b0) getViewIfBound();
        if (b0Var3 != null) {
            b0Var3.releaseAdapter();
        }
        super.onUnbind();
    }

    public void p(int i13, n nVar) {
        h hVar = (h) this.f126436a.g(getItemViewType(i13));
        if (hVar != null) {
            hVar.c(nVar, ((e) p3()).getItem(i13), i13);
        }
    }

    public abstract e0 p3();

    public final void q3() {
        if (isBound()) {
            ((b0) getView()).mvpMaybeToggleOfflineEmptyStateVisibility();
        }
    }

    @Override // yk1.p
    public void r3(b0 view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        view.initializeAdapter(p3());
        view.setLoadMoreListener(this);
        view.setRefreshListener(this);
        if (t3()) {
            loadData();
        } else if (p3().a() > 0) {
            view.setLoadState(yk1.i.LOADED);
            view.onLoadMoreComplete();
        }
    }

    public void s3(boolean z13) {
        if (isBound()) {
            ((b0) getView()).setRefreshing(false);
            ((b0) getView()).onLoadMoreComplete();
        }
    }

    public abstract boolean t3();
}
