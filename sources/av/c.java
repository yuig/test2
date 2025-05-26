package av;

import es.h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import lh0.g;
import m60.w;
import nx.b0;
import nx.d1;
import ps.l;
import so.oa;
import so.r8;
import so.s0;
import so.s8;
import uj2.q;
import x02.i2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c extends p implements Function2 {
    public c(s0 s0Var) {
        super(2, s0Var, s0.class, "create", "create(Ljava/lang/String;Lcom/pinterest/ads/OneTapPinalytics;)Lcom/pinterest/ads/feature/owc/presenter/story/AdsStoryPresenter;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        l pinAnalytics = (l) obj2;
        Intrinsics.checkNotNullParameter(pinAnalytics, "p1");
        r8 r8Var = ((s0) this.receiver).f114201a;
        w eventManager = (w) r8Var.f114090a.f113885r0.get();
        oa oaVar = r8Var.f114090a;
        i2 pinRepository = (i2) oaVar.F3.get();
        q networkStateStream = (q) oaVar.f113947u9.get();
        ro1.c deepLinkAdUtil = (ro1.c) oaVar.f113666ea.get();
        j80.b carouselUtil = (j80.b) oaVar.O6.get();
        d1 trackingParamAttacher = (d1) oaVar.f113730i2.get();
        g adsExperiments = oaVar.p2();
        xr.a attributionReporting = (xr.a) oaVar.f113756jc.get();
        sg0.f afterActionPlacementManager = s8.c(r8Var.f114091b);
        es.a adFormats = (es.a) oaVar.P6.get();
        b0 pinAuxHelper = (b0) oaVar.R8.get();
        ur.a adsDependencies = (ur.a) oaVar.Kb.get();
        h adsCommonDisplay = (h) oaVar.f113735i7.get();
        Intrinsics.checkNotNullParameter(pinAnalytics, "pinAnalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(adsExperiments, "adsExperiments");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(afterActionPlacementManager, "afterActionPlacementManager");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        return new bu.b(adsDependencies, attributionReporting, adFormats, adsCommonDisplay, pinAnalytics, pinAuxHelper, trackingParamAttacher, eventManager, carouselUtil, afterActionPlacementManager, adsExperiments, deepLinkAdUtil, pinRepository, networkStateStream, (String) obj);
    }
}
