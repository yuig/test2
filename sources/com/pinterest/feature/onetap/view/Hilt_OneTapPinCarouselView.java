package com.pinterest.feature.onetap.view;

import android.content.Context;
import ao2.j0;
import com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView;
import ez0.e;
import java.util.List;
import n21.j;
import ni1.t2;
import nx.d0;
import ro1.c;
import so.jb;
import so.oa;
import uj2.q;
import ur.a;
import yk1.i;

/* loaded from: classes.dex */
public abstract class Hilt_OneTapPinCarouselView extends SingleColumnCarouselPinView {
    private boolean injected;

    public Hilt_OneTapPinCarouselView(Context context, j0 j0Var, d0 d0Var, q<Boolean> qVar) {
        super(context, j0Var, d0Var, qVar);
        inject();
    }

    @Override // com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, y92.g
    public /* bridge */ /* synthetic */ int getAllowedHeightChange(int i13) {
        return super.getAllowedHeightChange(i13);
    }

    @Override // com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, nx.v
    public /* bridge */ /* synthetic */ List getChildImpressionViews() {
        return null;
    }

    @Override // com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, sq0.b0
    /* renamed from: getNumColumns */
    public /* bridge */ /* synthetic */ int getT0() {
        return 1;
    }

    @Override // com.pinterest.feature.pincarouselads.view.g, hb2.h
    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        OneTapPinCarouselView oneTapPinCarouselView = (OneTapPinCarouselView) this;
        jb jbVar = (jb) ((e) generatedComponent());
        oneTapPinCarouselView.videoViewabilityRecyclerListenerProvider = jbVar.f113494l;
        oneTapPinCarouselView.pinCarouselAdsLibraryExperiments = jbVar.f();
        oa oaVar = jbVar.f113483a;
        oneTapPinCarouselView.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        oneTapPinCarouselView.singleColumnCarouselPinPresenterFactory = (j) jbVar.f113500r.get();
        oneTapPinCarouselView.deepLinkAdUtil = (c) oaVar.f113666ea.get();
        oneTapPinCarouselView.pinGridCellFactory = oaVar.v2();
        oneTapPinCarouselView.pinRepViewModelFactory = (t2) oaVar.f113950uc.get();
        oneTapPinCarouselView.vmStateConverterFactory = (ni1.d0) oaVar.Gb.get();
        oneTapPinCarouselView.adsSalesDealsDisplay = oa.h0(oaVar);
        oneTapPinCarouselView.ads = (a) oaVar.Kb.get();
    }

    @Override // com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, sq0.b0
    public /* bridge */ /* synthetic */ void mvpMaybeToggleOfflineEmptyStateVisibility() {
    }

    @Override // com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, qa2.f0, y92.i
    public /* bridge */ /* synthetic */ void onViewDetached() {
        super.onViewDetached();
    }

    @Override // com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, yk1.n
    public /* bridge */ /* synthetic */ void setLoadState(i iVar) {
    }

    @Override // com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView
    public /* bridge */ /* synthetic */ void triggerEmptyStateCheck() {
    }

    @Override // com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView, sq0.b0
    public /* bridge */ /* synthetic */ void triggerLoadMoreCheck() {
    }
}
