package com.pinterest.feature.pin.closeup.datasource;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import i01.f1;
import i01.g0;
import i01.o0;
import jk2.j1;
import kh2.b0;
import kotlin.jvm.internal.Intrinsics;
import kp.n;
import lh0.a0;
import nx.d0;
import nx.f0;
import tb0.p;
import tj0.w;
import u01.r;
import uj2.q;
import w01.n0;
import w01.y;
import x02.i2;
import xo0.o;
import yk1.v;

/* loaded from: classes5.dex */
public final class j extends xk1.c implements nr0.j {

    /* renamed from: k, reason: collision with root package name */
    public final String f46941k;

    /* renamed from: l, reason: collision with root package name */
    public final i2 f46942l;

    /* renamed from: m, reason: collision with root package name */
    public final j01.b f46943m;

    /* renamed from: n, reason: collision with root package name */
    public final j01.b f46944n;

    /* renamed from: o, reason: collision with root package name */
    public final b11.g f46945o;

    /* renamed from: p, reason: collision with root package name */
    public final g0 f46946p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f46947q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f46948r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(uk1.d presenterPinalytics, jq.h pinchToZoomInteractionHandler, f1 transitionElementProvider, String pinId, i2 pinRepository, j01.b closeupConfig, j01.b pdpCloseupConfig, b11.g monolithHeaderConfig, g0 pinUpdateListener, boolean z13, o0 pinSpamParamsProvider, r01.c loadingGridStateProvider, uk1.e presenterPinalyticsFactory, n0 pinCloseupUnifiedCommentsModulePresenterFactory, y pinCloseupNewCommentsModulePresenterFactory, w01.g0 pinCloseupShoppingModulePresenterFactory, a0 experiments, q networkStateStream, ze1.c apiParams, o bubbleImpressionLogger, v viewResources, w01.j commerceAuxData, boolean z14, boolean z15, boolean z16) {
        super(new n(0));
        d0 d0Var;
        String str;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinchToZoomInteractionHandler, "pinchToZoomInteractionHandler");
        Intrinsics.checkNotNullParameter(transitionElementProvider, "transitionElementProvider");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(closeupConfig, "closeupConfig");
        Intrinsics.checkNotNullParameter(pdpCloseupConfig, "pdpCloseupConfig");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        Intrinsics.checkNotNullParameter(pinUpdateListener, "pinUpdateListener");
        Intrinsics.checkNotNullParameter(pinSpamParamsProvider, "pinSpamParamsProvider");
        Intrinsics.checkNotNullParameter(loadingGridStateProvider, "loadingGridStateProvider");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(pinCloseupUnifiedCommentsModulePresenterFactory, "pinCloseupUnifiedCommentsModulePresenterFactory");
        Intrinsics.checkNotNullParameter(pinCloseupNewCommentsModulePresenterFactory, "pinCloseupNewCommentsModulePresenterFactory");
        Intrinsics.checkNotNullParameter(pinCloseupShoppingModulePresenterFactory, "pinCloseupShoppingModulePresenterFactory");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(apiParams, "apiParams");
        Intrinsics.checkNotNullParameter(bubbleImpressionLogger, "bubbleImpressionLogger");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(commerceAuxData, "commerceAuxData");
        this.f46941k = pinId;
        this.f46942l = pinRepository;
        this.f46943m = closeupConfig;
        this.f46944n = pdpCloseupConfig;
        this.f46945o = monolithHeaderConfig;
        this.f46946p = pinUpdateListener;
        this.f46947q = z13;
        jq.j jVar = new jq.j(null, pinchToZoomInteractionHandler, transitionElementProvider, 1);
        o(87, new c11.c(experiments, presenterPinalytics, pinchToZoomInteractionHandler, transitionElementProvider, jVar, pinRepository));
        d0 d0Var2 = presenterPinalytics.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
        o(97, new c11.a(d0Var2, 3));
        d0 d0Var3 = presenterPinalytics.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var3, "getPinalytics(...)");
        o(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE, new c11.a(d0Var3, 5));
        Intrinsics.checkNotNullExpressionValue(d0Var3, "getPinalytics(...)");
        o(98, new c11.a(d0Var3, 9));
        Intrinsics.checkNotNullExpressionValue(d0Var3, "getPinalytics(...)");
        o(95, new c11.a(d0Var3, 7));
        o(901, new sz0.a(6));
        Intrinsics.checkNotNullExpressionValue(d0Var3, "getPinalytics(...)");
        o(789, new c11.a(d0Var3, 2));
        Intrinsics.checkNotNullExpressionValue(d0Var3, "getPinalytics(...)");
        o(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE, new c11.a(d0Var3, 8));
        Intrinsics.checkNotNullExpressionValue(d0Var3, "getPinalytics(...)");
        o(99, new c11.a(d0Var3, 4));
        if (experiments.q()) {
            Intrinsics.checkNotNullExpressionValue(d0Var3, "getPinalytics(...)");
            o(RecyclerViewTypes.VIEW_TYPE_BOARD_CONVERSATION_THREAD, new c11.a(d0Var3, 1));
        }
        Intrinsics.checkNotNullExpressionValue(d0Var3, "getPinalytics(...)");
        o(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE, new c11.a(d0Var3, 6));
        o(RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER, new d11.a(experiments, presenterPinalytics, transitionElementProvider, jVar, pinchToZoomInteractionHandler));
        if (z14) {
            d0Var = d0Var3;
            str = "getPinalytics(...)";
        } else {
            f0 f0Var = ((uk1.a) presenterPinalyticsFactory).f122378a;
            Intrinsics.f(d0Var3);
            d0Var = d0Var3;
            str = "getPinalytics(...)";
            o(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE, new c11.d(pinId, d0Var3, presenterPinalyticsFactory, pinCloseupShoppingModulePresenterFactory, f0Var, apiParams, networkStateStream, viewResources, bubbleImpressionLogger, commerceAuxData, pinRepository, false, 0));
        }
        d0 d0Var4 = d0Var;
        Intrinsics.checkNotNullExpressionValue(d0Var4, str);
        String str2 = str;
        o(94, new xv.g(d0Var4, presenterPinalyticsFactory, pinCloseupNewCommentsModulePresenterFactory, pinRepository));
        Intrinsics.checkNotNullExpressionValue(d0Var4, str2);
        o(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID, new yi0.a(d0Var4, loadingGridStateProvider));
        if (!z15) {
            Intrinsics.checkNotNullExpressionValue(d0Var4, str2);
            o(93, new w(d0Var4, presenterPinalyticsFactory, pinCloseupUnifiedCommentsModulePresenterFactory, pinRepository));
        }
        if (z16) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(d0Var4, str2);
        o(96, new c11.a(d0Var4, 0));
    }

    @Override // nr0.g
    public final boolean c3(int i13) {
        return true;
    }

    @Override // xk1.c, vq0.f
    public final void clear() {
        this.f46948r = false;
        super.clear();
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        return true;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        r rVar = (r) getItem(i13);
        Integer valueOf = rVar != null ? Integer.valueOf(rVar.getViewType()) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        vb0.j.f125466a.F("Unknown view type", p.CLOSEUP, new Object[0]);
        return -1;
    }

    @Override // xk1.c
    public final q k() {
        String str = this.f46945o.f20991d;
        n00.c cVar = n00.c.PIN_CLOSEUP_AD_PREVIEW;
        if (!this.f46947q) {
            cVar = null;
        }
        i2 i2Var = this.f46942l;
        b0.d2(i2Var, str, cVar);
        j1 j1Var = new j1(i2Var.Q(this.f46941k), new wv0.a(18, new dx0.d(this, 24)), 0);
        Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
        return j1Var;
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return true;
    }

    @Override // xk1.c, wk1.e
    public final void onUnbind() {
        this.f46948r = false;
        super.onUnbind();
    }
}
