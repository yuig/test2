package com.pinterest.feature.pin.closeup.datasource;

import android.view.View;
import androidx.recyclerview.widget.y2;
import b2.t;
import com.pinterest.api.model.vh;
import dl1.s;
import gx.o;
import jk2.i1;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lh0.a0;
import lh0.f4;
import uj2.q;
import w01.g0;
import w01.n0;
import w01.p0;
import x02.i2;
import yk1.v;
import z32.m0;
import zy.q0;

/* loaded from: classes5.dex */
public final class k extends xk1.c implements nr0.j, nr0.a, mz.g {

    /* renamed from: k, reason: collision with root package name */
    public final String f46949k;

    /* renamed from: l, reason: collision with root package name */
    public final nr0.k f46950l;

    /* renamed from: m, reason: collision with root package name */
    public final wk1.d f46951m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String pinUid, uk1.d presenterPinalytics, q networkStateStream, v viewResources, wa2.i pinFeatureConfig, ze1.c apiParams, f4 experiments, a0 closeupExperiments, uk1.e presenterPinalyticsFactory, q0 unscopedPinalyticsSEPFactory, w01.j commerceAuxData, wk2.a pinCloseupSearchFilterQueriesModulePresenterProvider, i2 pinRepository, g0 pinCloseupShoppingModulePresenterFactory, o adsStlShoppingModuleViewModelFactory, b11.g monolithHeaderConfig, n0 pinCloseupUnifiedCommentsModulePresenterFactory, p0 pinCloseupUserBoardAttributionModulePresenterFactory, xo0.o bubbleImpressionLogger, boolean z13, boolean z14, boolean z15, nr0.l dynamicGridViewBinderDelegate, r prefsManagerUser, ni0.e adsCarouselPresenterFactory, cz.e anketManager, wk1.d getViewForFeedback) {
        super(null);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(apiParams, "apiParams");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(closeupExperiments, "closeupExperiments");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(unscopedPinalyticsSEPFactory, "unscopedPinalyticsSEPFactory");
        Intrinsics.checkNotNullParameter(commerceAuxData, "commerceAuxData");
        Intrinsics.checkNotNullParameter(pinCloseupSearchFilterQueriesModulePresenterProvider, "pinCloseupSearchFilterQueriesModulePresenterProvider");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pinCloseupShoppingModulePresenterFactory, "pinCloseupShoppingModulePresenterFactory");
        Intrinsics.checkNotNullParameter(adsStlShoppingModuleViewModelFactory, "adsStlShoppingModuleViewModelFactory");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        Intrinsics.checkNotNullParameter(pinCloseupUnifiedCommentsModulePresenterFactory, "pinCloseupUnifiedCommentsModulePresenterFactory");
        Intrinsics.checkNotNullParameter(pinCloseupUserBoardAttributionModulePresenterFactory, "pinCloseupUserBoardAttributionModulePresenterFactory");
        Intrinsics.checkNotNullParameter(bubbleImpressionLogger, "bubbleImpressionLogger");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegate, "dynamicGridViewBinderDelegate");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(adsCarouselPresenterFactory, "adsCarouselPresenterFactory");
        Intrinsics.checkNotNullParameter(anketManager, "anketManager");
        Intrinsics.checkNotNullParameter(getViewForFeedback, "getViewForFeedback");
        this.f46949k = pinUid;
        this.f46950l = dynamicGridViewBinderDelegate;
        this.f46951m = getViewForFeedback;
        h.b(this, pinUid, presenterPinalytics, networkStateStream, viewResources, pinFeatureConfig, apiParams, experiments, closeupExperiments, presenterPinalyticsFactory, unscopedPinalyticsSEPFactory, commerceAuxData, pinCloseupSearchFilterQueriesModulePresenterProvider, pinRepository, adsStlShoppingModuleViewModelFactory, pinCloseupShoppingModulePresenterFactory, monolithHeaderConfig, pinCloseupUnifiedCommentsModulePresenterFactory, pinCloseupUserBoardAttributionModulePresenterFactory, bubbleImpressionLogger, z13, z14, z15, prefsManagerUser, adsCarouselPresenterFactory, anketManager, this);
        dynamicGridViewBinderDelegate.F(this);
    }

    @Override // nr0.a
    public final gb2.l[] E(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        return null;
    }

    @Override // mz.g
    public final y2 M1(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.f46951m.x(view);
    }

    @Override // vq0.f, nr0.a
    public final void c(int[] ids, vq0.h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        super.c(ids, viewBinderInstance);
    }

    @Override // nr0.a
    public final boolean d2(int i13) {
        return i13 >= 0 && i13 < CollectionsKt.F0(this.f135191h).size();
    }

    @Override // nr0.g
    public final boolean e(int i13) {
        int itemViewType;
        s sVar = (s) getItem(i13);
        if (((sVar instanceof vh) && c0.y(new m0[]{m0.RELATED_MODULE_CAROUSEL, m0.RELATED_MODULE_CAPPED_GRID, m0.SIMPLE_FOOTER, m0.PINS_PORTAL}, ((vh) sVar).f42868z)) || (itemViewType = getItemViewType(i13)) == -2 || itemViewType == -1) {
            return false;
        }
        return this.f46950l.e(i13);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        s sVar = (s) getItem(i13);
        return sVar instanceof vh ? h.d((vh) sVar, null, new t(this, i13, 4)) : this.f46950l.getItemViewType(i13);
    }

    @Override // wt1.b
    public final boolean i() {
        return !CollectionsKt.F0(this.f135191h).isEmpty();
    }

    @Override // xk1.c
    public final q k() {
        i1 y13 = q.y(CollectionsKt.F0(this.f135191h));
        Intrinsics.checkNotNullExpressionValue(y13, "just(...)");
        return y13;
    }

    @Override // mz.g
    public final mz.b l0() {
        return new mz.b(this.f46949k, 1);
    }
}
