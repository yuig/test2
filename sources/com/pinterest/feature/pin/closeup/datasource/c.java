package com.pinterest.feature.pin.closeup.datasource;

import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.repository.pin.PinService;
import dl1.s;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import nm.p;
import p01.n;
import qz.f0;
import xk2.v;

/* loaded from: classes5.dex */
public final class c extends com.pinterest.framework.multisection.datasource.pagedlist.c {
    public static final vo.i Q = new vo.i(22, 0);
    public static final v R = xk2.m.b(b.f46928j);
    public final tb0.h L;
    public final n M;
    public final mc.i N;
    public final p01.f O;
    public final f0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String pinUid, sq0.f imagePreFetcher, sq0.m mVar, nr0.l viewBinderDelegate, ol1.d feedbackObservable, g0 pageSizeProvider, PinCloseupPresenter remoteRequestListener, RelatedModulesModelFilter modelFilter, tb0.h crashReporting, n relatedPinsFilteringDataManager, mc.i pinCloseupRelatedModulesApiFieldsCache, p01.f oneBarFilteringDataManager) {
        super(a.a.p(new StringBuilder(PinService.PINS_URL), pinUid, "/related/pins/filter/"), viewBinderDelegate, imagePreFetcher, mVar, feedbackObservable, null, modelFilter, null, remoteRequestListener, 0L, null, 7072);
        boolean booleanValue;
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(imagePreFetcher, "imagePreFetcher");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(feedbackObservable, "feedbackObservable");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(remoteRequestListener, "remoteRequestListener");
        Intrinsics.checkNotNullParameter(modelFilter, "modelFilter");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(relatedPinsFilteringDataManager, "relatedPinsFilteringDataManager");
        Intrinsics.checkNotNullParameter(pinCloseupRelatedModulesApiFieldsCache, "pinCloseupRelatedModulesApiFieldsCache");
        Intrinsics.checkNotNullParameter(oneBarFilteringDataManager, "oneBarFilteringDataManager");
        this.L = crashReporting;
        this.M = relatedPinsFilteringDataManager;
        this.N = pinCloseupRelatedModulesApiFieldsCache;
        this.O = oneBarFilteringDataManager;
        switch (Q.f126366a) {
            case 22:
                booleanValue = ((Boolean) R.getValue()).booleanValue();
                break;
            default:
                booleanValue = ((Boolean) l.W.getValue()).booleanValue();
                break;
        }
        this.P = h.a(pageSizeProvider, booleanValue);
        o(12123189, new a(this, 0));
        o(12982281, new a(this, 1));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final f0 N() {
        f0 f0Var = this.P;
        if (f0Var == null) {
            return null;
        }
        h.c(f0Var, this.L, this.N);
        return f0Var;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean f(int i13) {
        if (i13 == 12123189 || i13 == 12982281) {
            return true;
        }
        return this.E.f(i13);
    }

    public final void f0(LinkedHashMap linkedHashMap) {
        f0 N = N();
        if (N != null) {
            String k13 = new p().a().k(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(k13, "toJson(...)");
            N.e("related_pins_tabs_selections", k13);
        }
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        s item = getItem(i13);
        if (item instanceof o01.h) {
            return 12123189;
        }
        if (item instanceof o01.d) {
            return 12982281;
        }
        return this.E.getItemViewType(i13);
    }

    @Override // wt1.b
    public final boolean i() {
        return (this.M.f98392h.isEmpty() ^ true) || this.O.f98367g == p01.a.FILTERED;
    }
}
