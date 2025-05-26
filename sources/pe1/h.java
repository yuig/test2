package pe1;

import androidx.appcompat.widget.c2;
import kotlin.jvm.internal.Intrinsics;
import lh0.f4;
import m60.w;
import nx.b0;
import nx.d1;
import nx.f0;
import xk2.v;

/* loaded from: classes5.dex */
public final class h extends t {

    /* renamed from: p, reason: collision with root package name */
    public final a11.d f99951p;

    /* renamed from: q, reason: collision with root package name */
    public final d1 f99952q;

    /* renamed from: r, reason: collision with root package name */
    public final w f99953r;

    /* renamed from: s, reason: collision with root package name */
    public final il1.a f99954s;

    /* renamed from: t, reason: collision with root package name */
    public final com.pinterest.feature.pin.r f99955t;

    /* renamed from: u, reason: collision with root package name */
    public final c2 f99956u;

    /* renamed from: v, reason: collision with root package name */
    public final k11.c f99957v;

    /* renamed from: w, reason: collision with root package name */
    public final v f99958w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(id1.h presenterParams, nr0.m dynamicGridViewBinderDelegateFactory, a11.d clickThroughHelperFactory, d1 trackingParamAttacher, w eventManager, il1.a fragmentFactory, com.pinterest.feature.pin.r repinAnimationUtil, c2 repinToastHelper, k11.c easyGiftGuideUpsellUtilFactory, oa2.p legoUserRepPresenterFactory, lb0.q prefsManagerPersisted, f4 sfExperiments, f0 pinalyticsFactory, lb0.r prefsManagerUser, b0 pinAuxHelper) {
        super(dynamicGridViewBinderDelegateFactory, presenterParams, clickThroughHelperFactory, trackingParamAttacher, eventManager, fragmentFactory, repinAnimationUtil, legoUserRepPresenterFactory, pinAuxHelper);
        Intrinsics.checkNotNullParameter(presenterParams, "presenterParams");
        Intrinsics.checkNotNullParameter("feed_holiday_finds", "trafficSource");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(clickThroughHelperFactory, "clickThroughHelperFactory");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(repinToastHelper, "repinToastHelper");
        Intrinsics.checkNotNullParameter(easyGiftGuideUpsellUtilFactory, "easyGiftGuideUpsellUtilFactory");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(sfExperiments, "sfExperiments");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f99951p = clickThroughHelperFactory;
        this.f99952q = trackingParamAttacher;
        this.f99953r = eventManager;
        this.f99954s = fragmentFactory;
        this.f99955t = repinAnimationUtil;
        this.f99956u = repinToastHelper;
        this.f99957v = easyGiftGuideUpsellUtilFactory;
        prefsManagerPersisted.i("PREF_HOLIDAY_FINDS_QUICK_SAVE_ICON", presenterParams.f72178q.getValue());
        this.f99958w = xk2.m.b(new w01.t(this, presenterParams, "feed_holiday_finds", sfExperiments, pinalyticsFactory, prefsManagerUser, pinAuxHelper, 2));
    }

    @Override // wk1.q, yk1.b
    public final void onActivate() {
        p3();
        if (v3().f49127q.size() == 0) {
            loadData();
        }
    }

    @Override // wk1.q
    public final boolean shouldLoadDataOnBind() {
        return false;
    }

    @Override // id1.g
    public final void subscribeToUiUpdates() {
    }

    @Override // pe1.t, id1.g
    public final hd1.b v3() {
        return (hd1.b) this.f99958w.getValue();
    }
}
