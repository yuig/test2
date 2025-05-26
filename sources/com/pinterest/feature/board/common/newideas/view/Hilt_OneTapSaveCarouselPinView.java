package com.pinterest.feature.board.common.newideas.view;

import android.content.Context;
import ao2.j0;
import com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView;
import gh0.b;
import java.util.List;
import n21.j;
import ni1.t2;
import nx.d0;
import ro1.c;
import so.jb;
import so.oa;
import so.s8;
import tj0.y;
import uj2.q;
import uk1.e;
import ur.a;
import yk1.i;

/* loaded from: classes.dex */
public abstract class Hilt_OneTapSaveCarouselPinView extends SingleColumnCarouselPinView {
    private boolean injected;

    public Hilt_OneTapSaveCarouselPinView(Context context, j0 j0Var, d0 d0Var, q<Boolean> qVar) {
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
    public /* bridge */ /* synthetic */ int getZ0() {
        return 1;
    }

    @Override // com.pinterest.feature.pincarouselads.view.g, hb2.h
    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        OneTapSaveCarouselPinView oneTapSaveCarouselPinView = (OneTapSaveCarouselPinView) this;
        jb jbVar = (jb) ((y) generatedComponent());
        oneTapSaveCarouselPinView.videoViewabilityRecyclerListenerProvider = jbVar.f113494l;
        oneTapSaveCarouselPinView.pinCarouselAdsLibraryExperiments = jbVar.f();
        oa oaVar = jbVar.f113483a;
        oneTapSaveCarouselPinView.presenterPinalyticsFactory = (e) oaVar.f113702ga.get();
        oneTapSaveCarouselPinView.singleColumnCarouselPinPresenterFactory = (j) jbVar.f113500r.get();
        oneTapSaveCarouselPinView.deepLinkAdUtil = (c) oaVar.f113666ea.get();
        oneTapSaveCarouselPinView.pinGridCellFactory = oaVar.v2();
        oneTapSaveCarouselPinView.pinRepViewModelFactory = (t2) oaVar.f113950uc.get();
        oneTapSaveCarouselPinView.vmStateConverterFactory = (ni1.d0) oaVar.Gb.get();
        oneTapSaveCarouselPinView.adsSalesDealsDisplay = oa.h0(oaVar);
        oneTapSaveCarouselPinView.ads = (a) oaVar.Kb.get();
        b.Y(oneTapSaveCarouselPinView, s8.e(jbVar.f113485c));
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
