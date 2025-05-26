package wk1;

import android.os.Bundle;
import hl0.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import oh1.u;
import org.jetbrains.annotations.NotNull;
import sq0.a0;
import sq0.c0;
import sq0.d0;
import sq0.f0;
import sq0.w;
import wt1.y;
import wt1.z;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public abstract class q extends t implements a0, w {

    @NotNull
    private final i dataSourceRegistry;

    @NotNull
    private final xj2.b pagedListDisposables;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(uk1.d pinalytics, uj2.q networkStateStream) {
        super(pinalytics, networkStateStream);
        i dataSourceRegistry = new i();
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(dataSourceRegistry, "dataSourceRegistry");
        this.dataSourceRegistry = dataSourceRegistry;
        this.pagedListDisposables = new xj2.b();
    }

    public static final /* synthetic */ c0 access$getView(q qVar) {
        return (c0) qVar.getView();
    }

    public abstract void addDataSources(vq0.a aVar);

    public d0 getAdapter() {
        c0 c0Var = (c0) getViewIfBound();
        if (c0Var != null) {
            return c0Var.getRecyclerAdapter();
        }
        return null;
    }

    public final sq0.o getDataSourceAndLocalPositionFromGlobalPosition(int i13) {
        return this.dataSourceRegistry.r(i13);
    }

    @NotNull
    public final f0 getDataSourceProvider() {
        return this.dataSourceRegistry;
    }

    @NotNull
    public final i getDataSourceRegistry() {
        return this.dataSourceRegistry;
    }

    @NotNull
    public final List<e> getDataSources() {
        return CollectionsKt.F0(CollectionsKt.F0(this.dataSourceRegistry.f130156a));
    }

    public final int getGlobalPositionFromDataSourceAndLocalPosition(@NotNull vq0.e dataSource, int i13) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        int W = CollectionsKt.W(dataSource, getDataSources());
        if (W < 0) {
            throw new IllegalArgumentException("Data source " + dataSource + " cannot be found in the data source registry");
        }
        Iterator it = yn2.c0.r(CollectionsKt.K(getDataSources()), W).iterator();
        int i14 = 0;
        while (it.hasNext()) {
            i14 += ((e) it.next()).a();
        }
        return i14 + i13;
    }

    public void loadData() {
        Object obj;
        Iterator it = this.dataSourceRegistry.f130156a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            e eVar = (e) obj;
            if (eVar.i() && !eVar.s()) {
                break;
            }
        }
        e eVar2 = (e) obj;
        if (eVar2 != null) {
            eVar2.n();
        }
    }

    public void loadMoreData() {
        this.dataSourceRegistry.c();
    }

    @Override // yk1.b
    public void onActivate() {
        p3();
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public void r3(c0 view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        view.initializeMultiSourceAdapter(this.dataSourceRegistry);
        view.setLoadMoreListener(this);
        view.setRefreshListener(this);
        i iVar = this.dataSourceRegistry;
        Iterator it = iVar.f130156a.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.E2();
            Iterator it2 = eVar.X1().iterator();
            while (it2.hasNext()) {
                iVar.f130157b.put(Integer.valueOf(((Number) it2.next()).intValue()), eVar);
            }
        }
        this.dataSourceRegistry.f130159d = new p(view);
        this.pagedListDisposables.d();
        for (e eVar2 : CollectionsKt.F0(this.dataSourceRegistry.f130156a)) {
            this.pagedListDisposables.a(eVar2.m().F(new l(2, new u(20, this, eVar2)), new l(3, new bi1.a0(this, 18)), ck2.i.f27923c, ck2.i.f27924d));
            if (eVar2 instanceof xj2.c) {
                this.pagedListDisposables.a((xj2.c) eVar2);
            }
        }
        if (shouldLoadDataOnBind()) {
            loadData();
        } else if (this.dataSourceRegistry.a() > 0) {
            view.setLoadState(yk1.i.LOADED);
            view.onLoadMoreComplete();
        }
    }

    @Override // yk1.b
    public void onCreate() {
        addDataSources(this.dataSourceRegistry);
    }

    @Override // yk1.b
    public void onDestroy() {
        i iVar = this.dataSourceRegistry;
        ArrayList arrayList = iVar.f130156a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar instanceof xj2.c) {
                ((xj2.c) eVar).dispose();
            }
        }
        arrayList.clear();
        iVar.f130157b.clear();
        iVar.f130158c.d();
    }

    @Override // yk1.p
    public void onNetworkLost() {
        p3();
    }

    @Override // yk1.p
    public void onNetworkRegained() {
        ((c0) getView()).makeScrollListenerReadyToLoadMore();
        p3();
    }

    public void onRecyclerRefresh() {
        ((c0) getView()).resetRecyclerScrollListener();
        this.dataSourceRegistry.d();
    }

    @Override // yk1.b
    public void onRestoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            List F0 = CollectionsKt.F0(this.dataSourceRegistry.f130156a);
            ArrayList arrayList = new ArrayList();
            for (Object obj : F0) {
                if (obj instanceof wt1.c) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((wt1.c) it.next()).b(bundle);
            }
        }
    }

    @Override // yk1.b
    public void onSaveInstance(Bundle bundle) {
        if (bundle != null) {
            List F0 = CollectionsKt.F0(this.dataSourceRegistry.f130156a);
            ArrayList arrayList = new ArrayList();
            for (Object obj : F0) {
                if (obj instanceof wt1.c) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((wt1.c) it.next()).l(bundle);
            }
        }
    }

    public void onStateUpdated(wt1.c0 state, wt1.d0 remoteList) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(remoteList, "remoteList");
        if ((state instanceof wt1.j) || (state instanceof z)) {
            ((c0) getView()).triggerLoadMoreCheck();
            return;
        }
        if ((state instanceof wt1.k) || (state instanceof wt1.n)) {
            if (shouldShowFullScreenLoadingSpinner() && this.dataSourceRegistry.a() == 0) {
                ((c0) getView()).setShowPaginationSpinner(false);
                ((c0) getView()).setLoadState(yk1.i.LOADING);
                return;
            } else {
                ((c0) getView()).setLoadState(yk1.i.LOADED);
                ((c0) getView()).setShowPaginationSpinner(true);
                return;
            }
        }
        if (state instanceof wt1.i) {
            ((c0) getView()).setShowPaginationSpinner(false);
            ((c0) getView()).setLoadState(yk1.i.ERROR);
            ((c0) getView()).displayError(((wt1.i) state).f131121c);
            return;
        }
        if ((state instanceof wt1.m) || (state instanceof y) || (state instanceof wt1.p)) {
            ArrayList arrayList = this.dataSourceRegistry.f130156a;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.i() && eVar.t0() && !eVar.s()) {
                        if (this.dataSourceRegistry.a() > 0) {
                            ((c0) getView()).setLoadState(yk1.i.LOADED);
                        }
                        ((c0) getView()).onLoadMoreComplete();
                    }
                }
            }
            ((c0) getView()).setShowPaginationSpinner(false);
            ((c0) getView()).setLoadState(yk1.i.LOADED);
            ((c0) getView()).onLoadMoreComplete();
        }
    }

    @Override // yk1.p, yk1.b
    public void onUnbind() {
        ((c0) getView()).setLoadMoreListener(null);
        ((c0) getView()).setRefreshListener(null);
        Iterator it = this.dataSourceRegistry.f130156a.iterator();
        while (it.hasNext()) {
            ((e) it.next()).onUnbind();
        }
        this.dataSourceRegistry.f130159d = null;
        this.pagedListDisposables.d();
        ((c0) getView()).releaseAdapter();
        super.onUnbind();
    }

    public final void p3() {
        if (isBound()) {
            ((c0) getView()).mvpMaybeToggleOfflineEmptyStateVisibility();
        }
    }

    public void q3() {
        onRecyclerRefresh();
    }

    public void r3() {
        onRecyclerRefresh();
    }

    public void s3() {
        onRecyclerRefresh();
    }

    public boolean shouldLoadDataOnBind() {
        return !(this instanceof v);
    }

    public boolean shouldShowFullScreenLoadingSpinner() {
        return true;
    }
}
