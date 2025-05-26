package p01;

import com.pinterest.framework.multisection.datasource.pagedlist.h0;

/* loaded from: classes5.dex */
public interface o {
    void addDisposableToTrack(xj2.c cVar);

    com.pinterest.feature.pin.closeup.datasource.c getFilteredRelatedPinsPagedList();

    h0 getRelatedPinsPagedList();

    boolean isBoundToView();

    void onPinsLoadStartedAfterFilterUpdate();

    void onPinsLoadedAfterFilterUpdate(h0 h0Var);

    void resetAllInlineOneBarFilters();

    void setActiveRelatedPagedList(h0 h0Var);

    void updatePriceVisibilityOnGrid(boolean z13);
}
