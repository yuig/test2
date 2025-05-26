package sq0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface b0 extends yk1.r {
    void addItemVisibilityChangeListener(z zVar);

    void displayError(Throwable th3);

    /* renamed from: getNumColumns */
    default int getZ0() {
        return 1;
    }

    d0 getRecyclerAdapter();

    void initializeAdapter(e0 e0Var);

    default void initializeMultiSourceAdapter(f0 dataSourceProvider) {
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
    }

    default void makeScrollListenerReadyToLoadMore() {
    }

    default void mvpMaybeToggleOfflineEmptyStateVisibility() {
    }

    default void onLoadMoreComplete() {
    }

    default void releaseAdapter() {
    }

    void resetRecyclerScrollListener();

    void setLoadMoreListener(w wVar);

    void setRefreshListener(a0 a0Var);

    void setRefreshing(boolean z13);

    void setShowPaginationSpinner(boolean z13);

    default void triggerLoadMoreCheck() {
    }
}
