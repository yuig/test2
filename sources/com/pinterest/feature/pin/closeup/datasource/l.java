package com.pinterest.feature.pin.closeup.datasource;

import android.view.View;
import androidx.recyclerview.widget.y2;
import b2.t;
import com.pinterest.api.model.hz;
import com.pinterest.api.model.vh;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.framework.multisection.datasource.pagedlist.j0;
import com.pinterest.repository.pin.PinService;
import dl1.s;
import ey.j3;
import ey.k3;
import ey.s1;
import i01.v0;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.z;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lh0.a0;
import lh0.a4;
import lh0.f4;
import lh0.g1;
import lh0.z3;
import org.json.JSONObject;
import qz.f0;
import tb0.p;
import uj2.q;
import w01.g0;
import w01.n0;
import w01.p0;
import x02.i2;
import xk2.v;
import xo0.o;
import z32.m0;
import zy.q0;

/* loaded from: classes5.dex */
public final class l extends com.pinterest.framework.multisection.datasource.pagedlist.c implements mz.g {
    public static final vo.i V = new vo.i(23, 0);
    public static final v W = xk2.m.b(b.f46929k);
    public final String L;
    public final Map M;
    public final a0 N;
    public final Function0 O;
    public final Function0 P;
    public final tb0.h Q;
    public final wk1.d R;
    public final mc.i S;
    public final k3 T;
    public final f0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String pinUid, v0 relatedPinsExtras, uk1.d presenterPinalytics, q networkStateStream, sq0.f imagePreFetcher, sq0.m mVar, yk1.v viewResources, wa2.i pinFeatureConfig, o bubbleImpressionLogger, g0 pinCloseupShoppingModulePresenterFactory, gx.o adsStlShoppingModuleViewModelFactory, b11.g monolithHeaderConfig, n0 pinCloseupUnifiedCommentsModulePresenterFactory, p0 pinCloseupUserBoardAttributionModulePresenterFactory, nr0.l viewBinderDelegate, ol1.d feedbackObservable, ze1.c apiParams, f4 experiments, a0 closeupExperiments, uk1.e presenterPinalyticsFactory, q0 unscopedPinalyticsSEPFactory, m60.g0 pageSizeProvider, RelatedModulesModelFilter modelFilter, w01.j shouldShowRelatedPins, w01.j commerceAuxData, PinCloseupPresenter remoteRequestListener, wk2.a pinCloseupSearchFilterQueriesModulePresenterProvider, i2 pinRepository, boolean z13, boolean z14, boolean z15, r prefsManagerUser, ni0.e adsCarouselPresenterFactory, cz.e anketManager, tb0.h crashReporting, wk1.d getViewForFeedback, mc.i pinCloseupRelatedModulesApiFieldsCache, hz hzVar, long j13, r01.a contextNearDupSigsTracker, lh0.o experimentHelper, k3 perfLogger) {
        super(a.a.p(new StringBuilder(PinService.PINS_URL), pinUid, "/related/modules/"), viewBinderDelegate, imagePreFetcher, mVar, feedbackObservable, null, modelFilter, null, remoteRequestListener, j13, new w01.q0(pageSizeProvider, experimentHelper), 928);
        boolean booleanValue;
        Collection M;
        w01.m shouldShowShoppingGrid = w01.m.f127058l;
        g1.g uiUpdates = new g1.g(0);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(relatedPinsExtras, "relatedPinsExtras");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(imagePreFetcher, "imagePreFetcher");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(bubbleImpressionLogger, "bubbleImpressionLogger");
        Intrinsics.checkNotNullParameter(pinCloseupShoppingModulePresenterFactory, "pinCloseupShoppingModulePresenterFactory");
        Intrinsics.checkNotNullParameter(adsStlShoppingModuleViewModelFactory, "adsStlShoppingModuleViewModelFactory");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        Intrinsics.checkNotNullParameter(pinCloseupUnifiedCommentsModulePresenterFactory, "pinCloseupUnifiedCommentsModulePresenterFactory");
        Intrinsics.checkNotNullParameter(pinCloseupUserBoardAttributionModulePresenterFactory, "pinCloseupUserBoardAttributionModulePresenterFactory");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(feedbackObservable, "feedbackObservable");
        Intrinsics.checkNotNullParameter(uiUpdates, "uiUpdates");
        Intrinsics.checkNotNullParameter(apiParams, "apiParams");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(closeupExperiments, "closeupExperiments");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(unscopedPinalyticsSEPFactory, "unscopedPinalyticsSEPFactory");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(modelFilter, "modelFilter");
        Intrinsics.checkNotNullParameter(shouldShowRelatedPins, "shouldShowRelatedPins");
        Intrinsics.checkNotNullParameter(commerceAuxData, "commerceAuxData");
        Intrinsics.checkNotNullParameter(remoteRequestListener, "remoteRequestListener");
        Intrinsics.checkNotNullParameter(shouldShowShoppingGrid, "shouldShowShoppingGrid");
        Intrinsics.checkNotNullParameter(pinCloseupSearchFilterQueriesModulePresenterProvider, "pinCloseupSearchFilterQueriesModulePresenterProvider");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(adsCarouselPresenterFactory, "adsCarouselPresenterFactory");
        Intrinsics.checkNotNullParameter(anketManager, "anketManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(getViewForFeedback, "getViewForFeedback");
        Intrinsics.checkNotNullParameter(pinCloseupRelatedModulesApiFieldsCache, "pinCloseupRelatedModulesApiFieldsCache");
        Intrinsics.checkNotNullParameter(contextNearDupSigsTracker, "contextNearDupSigsTracker");
        Intrinsics.checkNotNullParameter(experimentHelper, "experimentHelper");
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.L = pinUid;
        this.M = uiUpdates;
        this.N = closeupExperiments;
        this.O = shouldShowRelatedPins;
        this.P = shouldShowShoppingGrid;
        this.Q = crashReporting;
        this.R = getViewForFeedback;
        this.S = pinCloseupRelatedModulesApiFieldsCache;
        this.T = perfLogger;
        switch (V.f126366a) {
            case 22:
                booleanValue = ((Boolean) c.R.getValue()).booleanValue();
                break;
            default:
                booleanValue = ((Boolean) W.getValue()).booleanValue();
                break;
        }
        f0 a13 = h.a(pageSizeProvider, booleanValue);
        String str = relatedPinsExtras.f70699a;
        if (str == null || str.length() == 0) {
            a13.e("source", "unknown");
        } else {
            String str2 = relatedPinsExtras.f70699a;
            Intrinsics.f(str2);
            a13.e("source", str2);
        }
        String str3 = relatedPinsExtras.f70700b;
        String str4 = relatedPinsExtras.f70702d;
        if (str3 != null && str3.length() != 0 && Intrinsics.d("search", str4)) {
            a13.e("search_query", str3);
        }
        if (str4 != null && str4.length() != 0) {
            a13.e("top_level_source", str4);
        }
        Integer num = relatedPinsExtras.f70703e;
        if (num != null) {
            a13.c(num.intValue(), "top_level_source_depth");
        }
        if (hzVar != null) {
            a13.d(new JSONObject(z0.g(new Pair("utm_source", hzVar.f38570a), new Pair("message_type", hzVar.f38571b), new Pair("tracking_id", hzVar.f38572c))), "landing_context");
        }
        List list = relatedPinsExtras.f70701c;
        if (list != null && list.size() > 0) {
            a13.e("context_pin_ids", CollectionsKt.Z(CollectionsKt.z0(5, list), ",", null, null, 0, null, null, 62));
        }
        if (contextNearDupSigsTracker.f105692b) {
            LinkedList linkedList = contextNearDupSigsTracker.f105693c;
            boolean z16 = linkedList.size() == CollectionsKt.M(linkedList).size();
            p pVar = p.RELATED_PINS;
            m60.f0 f0Var = contextNearDupSigsTracker.f105691a;
            f0Var.R(z16, "We expect the list already has distinct elements", pVar, new Object[0]);
            LinkedList linkedList2 = contextNearDupSigsTracker.f105695e;
            f0Var.R(linkedList2.size() == CollectionsKt.M(linkedList2).size(), "We expect the list already has distinct elements", pVar, new Object[0]);
            M = CollectionsKt.M(CollectionsKt.l0(CollectionsKt.z0(contextNearDupSigsTracker.f105697g, linkedList2), CollectionsKt.z0(5, linkedList)));
        } else {
            M = kotlin.collections.q0.f80391a;
        }
        if (!M.isEmpty()) {
            a13.e("context_near_dup_image_sigs", CollectionsKt.Z(M, ",", null, null, 0, null, null, 62));
        }
        this.U = a13;
        h.b(this, pinUid, presenterPinalytics, networkStateStream, viewResources, pinFeatureConfig, apiParams, experiments, closeupExperiments, presenterPinalyticsFactory, unscopedPinalyticsSEPFactory, commerceAuxData, pinCloseupSearchFilterQueriesModulePresenterProvider, pinRepository, adsStlShoppingModuleViewModelFactory, pinCloseupShoppingModulePresenterFactory, monolithHeaderConfig, pinCloseupUnifiedCommentsModulePresenterFactory, pinCloseupUserBoardAttributionModulePresenterFactory, bubbleImpressionLogger, z13, z14, z15, prefsManagerUser, adsCarouselPresenterFactory, anketManager, this);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.h0, nr0.a
    public final gb2.l[] E(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Object[] E = super.E(uid);
        Object obj = this.M.get(uid);
        if (obj != null) {
            if (E == null) {
                E = new gb2.l[]{obj};
            } else if (!c0.y(E, obj)) {
                E = z.t(E, obj);
            }
        }
        return (gb2.l[]) E;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final com.pinterest.hairball.network.e M(kotlin.jvm.internal.r requestState) {
        Intrinsics.checkNotNullParameter(requestState, "requestState");
        boolean z13 = requestState instanceof j0;
        LinkedHashMap linkedHashMap = this.f49120j;
        if (z13) {
            linkedHashMap.putAll(j3.f(j3.f60510a, this.T, ry.i.f110212a, null, 12).f60495b);
            ArrayDeque arrayDeque = s1.f60573a;
        } else {
            linkedHashMap.remove("X-B3-TraceId");
            linkedHashMap.remove("X-B3-SpanId");
            linkedHashMap.remove("X-B3-ParentSpanId");
            linkedHashMap.remove("X-B3-Flags");
        }
        a0 a0Var = this.N;
        a0Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) a0Var.f83294a;
        if (!g1Var.o("android_related_modules_pwt_regression_analysis", "enabled", z3Var) && !g1Var.l("android_related_modules_pwt_regression_analysis")) {
            return super.M(requestState);
        }
        return new RelatedModulesPagedRemoteRequest(this.f49132v, this.f49116f, this.f49117g, this.f49115e, linkedHashMap);
    }

    @Override // mz.g
    public final y2 M1(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.R.x(view);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final f0 N() {
        f0 f0Var = this.U;
        if (f0Var == null) {
            return null;
        }
        h.c(f0Var, this.Q, this.S);
        return f0Var;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean e(int i13) {
        int itemViewType;
        s item = getItem(i13);
        if (((item instanceof vh) && c0.y(new m0[]{m0.RELATED_MODULE_CAROUSEL, m0.RELATED_MODULE_CAPPED_GRID, m0.SIMPLE_FOOTER, m0.PINS_PORTAL}, ((vh) item).f42868z)) || (itemViewType = getItemViewType(i13)) == -2 || itemViewType == -1) {
            return false;
        }
        return this.E.e(i13);
    }

    public final void f0(Object obj, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        f0 N = N();
        if (N != null) {
            N.e(key, String.valueOf(obj));
        }
    }

    public final void g0(HashMap paramMap) {
        Intrinsics.checkNotNullParameter(paramMap, "paramMap");
        f0 N = N();
        if (N != null) {
            N.f(paramMap);
        }
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        s item = getItem(i13);
        if (!(item instanceof vh)) {
            return this.E.getItemViewType(i13);
        }
        return h.d((vh) item, this.N, new t(this, i13, 5));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean h(int i13) {
        if (((Boolean) this.P.invoke()).booleanValue() && i13 == G()) {
            return false;
        }
        return this.E.h(i13);
    }

    public final void h0() {
        Intrinsics.checkNotNullParameter("is_ad_closeup_rp", "key");
        f0 N = N();
        if (N != null) {
            N.h("is_ad_closeup_rp");
        }
    }

    @Override // wt1.b
    public final boolean i() {
        Object d03 = CollectionsKt.d0(d());
        vh vhVar = d03 instanceof vh ? (vh) d03 : null;
        return !Intrinsics.d(vhVar != null ? vhVar.q() : null, "related_products_button_footer") && ((Boolean) this.O.invoke()).booleanValue();
    }

    @Override // mz.g
    public final mz.b l0() {
        return new mz.b(this.L, 1);
    }
}
