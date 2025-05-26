package com.pinterest.feature.pincarouselads.view;

import ni1.d0;
import ni1.t2;
import so.jb;
import so.oa;

/* loaded from: classes2.dex */
public abstract class g extends BaseRecyclerCellView {
    private boolean injected;

    @Override // hb2.h
    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        SingleColumnCarouselPinView singleColumnCarouselPinView = (SingleColumnCarouselPinView) this;
        jb jbVar = (jb) ((y) generatedComponent());
        singleColumnCarouselPinView.videoViewabilityRecyclerListenerProvider = jbVar.f113494l;
        singleColumnCarouselPinView.pinCarouselAdsLibraryExperiments = jbVar.f();
        oa oaVar = jbVar.f113483a;
        singleColumnCarouselPinView.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        singleColumnCarouselPinView.singleColumnCarouselPinPresenterFactory = (n21.j) jbVar.f113500r.get();
        singleColumnCarouselPinView.deepLinkAdUtil = (ro1.c) oaVar.f113666ea.get();
        singleColumnCarouselPinView.pinGridCellFactory = oaVar.v2();
        singleColumnCarouselPinView.pinRepViewModelFactory = (t2) oaVar.f113950uc.get();
        singleColumnCarouselPinView.vmStateConverterFactory = (d0) oaVar.Gb.get();
        singleColumnCarouselPinView.adsSalesDealsDisplay = oa.h0(oaVar);
        singleColumnCarouselPinView.ads = (ur.a) oaVar.Kb.get();
    }
}
