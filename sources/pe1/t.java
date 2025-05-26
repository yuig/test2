package pe1;

import android.content.Context;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.shopping.shoppingstories.feed.emptystate.StructuredFeedEmptyStateView;
import de1.d0;
import java.util.ArrayList;
import java.util.HashMap;
import kh2.g3;
import kh2.u2;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lh0.f4;
import m60.w;
import nx.b0;
import nx.d1;
import qz.f0;
import s7.z;
import xk2.v;
import zd1.c0;
import zd1.e0;

/* loaded from: classes5.dex */
public class t extends id1.g implements d0, xt1.d, ee1.f {

    /* renamed from: j, reason: collision with root package name */
    public final a11.d f99991j;

    /* renamed from: k, reason: collision with root package name */
    public final d1 f99992k;

    /* renamed from: l, reason: collision with root package name */
    public final w f99993l;

    /* renamed from: m, reason: collision with root package name */
    public final il1.a f99994m;

    /* renamed from: n, reason: collision with root package name */
    public final com.pinterest.feature.pin.r f99995n;

    /* renamed from: o, reason: collision with root package name */
    public final v f99996o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(nr0.m dynamicGridViewBinderDelegateFactory, id1.h presenterParams, a11.d clickThroughHelperFactory, d1 trackingParamAttacher, w eventManager, il1.a fragmentFactory, com.pinterest.feature.pin.r repinAnimationUtil, oa2.p legoUserRepPresenterFactory, b0 pinAuxHelper) {
        super(presenterParams, dynamicGridViewBinderDelegateFactory, legoUserRepPresenterFactory);
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(presenterParams, "presenterParams");
        Intrinsics.checkNotNullParameter(clickThroughHelperFactory, "clickThroughHelperFactory");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f99991j = clickThroughHelperFactory;
        this.f99992k = trackingParamAttacher;
        this.f99993l = eventManager;
        this.f99994m = fragmentFactory;
        this.f99995n = repinAnimationUtil;
        this.f99996o = xk2.m.b(new px0.g(this, presenterParams, pinAuxHelper, 13));
    }

    @Override // ee1.f
    public final void H2(t32.f fVar, int i13) {
    }

    @Override // de1.d0
    public final void Z(ArrayList appliedProductFilters) {
        Intrinsics.checkNotNullParameter(appliedProductFilters, "appliedProductFilters");
        hd1.b v33 = v3();
        r rVar = v33 instanceof r ? (r) v33 : null;
        c0 c0Var = new c0(new ArrayList());
        g3.D2(c0Var, appliedProductFilters, true, true);
        if (!c0Var.getFilterSpecs().isEmpty()) {
            if (rVar != null) {
                HashMap paramMap = z0.f(new Pair("applied_unified_filters", c0Var.a()));
                Intrinsics.checkNotNullParameter(paramMap, "paramMap");
                f0 f0Var = rVar.f49121k;
                if (f0Var != null) {
                    f0Var.f(paramMap);
                } else {
                    HashMap hashMap = rVar.L.f68884a;
                    hashMap.putAll(paramMap);
                    rVar.f0(hashMap);
                }
            }
        } else if (rVar != null) {
            Intrinsics.checkNotNullParameter("applied_unified_filters", "paramKey");
            f0 f0Var2 = rVar.f49121k;
            if (f0Var2 != null) {
                f0Var2.h("applied_unified_filters");
            }
        }
        u3();
    }

    @Override // xd1.a, xt1.d
    public final void afterParseResponse(bl1.a aVar) {
        vd0.c cVar;
        vd0.a c13;
        ArrayList C2;
        super.afterParseResponse(aVar);
        if (aVar == null || (cVar = aVar.f23479b) == null || (c13 = cVar.c("one_bar_modules")) == null || (C2 = c0.d.C2(c13)) == null) {
            return;
        }
        kotlin.jvm.internal.j.z(getScope(), null, null, new s(this, C2, null), 3);
    }

    @Override // wk1.q, sq0.a0
    public final void onRecyclerRefresh() {
        super.onRecyclerRefresh();
        u3();
    }

    @Override // wk1.q
    public final void onStateUpdated(wt1.c0 state, wt1.d0 remoteList) {
        tl1.i iVar;
        e0 e0Var;
        PinterestEmptyStateLayout pinterestEmptyStateLayout;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(remoteList, "remoteList");
        super.onStateUpdated(state, remoteList);
        if (Intrinsics.d(remoteList, v3()) && (state instanceof wt1.p) && v3().f49127q.size() == 0 && (iVar = state.f131096b) != null && iVar.f118095a == 0 && isBound()) {
            yk1.n viewIfBound = getViewIfBound();
            u uVar = viewIfBound instanceof u ? (u) viewIfBound : null;
            if (uVar != null) {
                uk1.d presenterPinalytics = getPresenterPinalytics();
                p pVar = (p) uVar;
                Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
                Intrinsics.checkNotNullParameter(this, "listener");
                ov1.k kVar = pVar.f99981s1;
                if (kVar != null && (e0Var = kVar.f97749q) != null && e0Var.f141708c.size() > 0) {
                    Context context = pVar.getContext();
                    ov1.k kVar2 = pVar.f99981s1;
                    e0 e0Var2 = kVar2 != null ? kVar2.f97749q : null;
                    if (context == null || e0Var2 == null || (pinterestEmptyStateLayout = pVar.f139733g0) == null) {
                        return;
                    }
                    uj2.q p73 = pVar.p7();
                    yk1.v vVar = pVar.f99979q1;
                    if (vVar != null) {
                        gi2.b.U(pinterestEmptyStateLayout, context, e0Var2, presenterPinalytics, p73, vVar, this, pVar.s7(), null, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
                        return;
                    } else {
                        Intrinsics.r("viewResources");
                        throw null;
                    }
                }
                f4 f4Var = pVar.f99975m1;
                if (f4Var == null) {
                    Intrinsics.r("structuredFeedExperiments");
                    throw null;
                }
                if (u2.K0(f4Var)) {
                    Context context2 = pVar.getContext();
                    PinterestEmptyStateLayout pinterestEmptyStateLayout2 = pVar.f139733g0;
                    if (context2 == null || pinterestEmptyStateLayout2 == null) {
                        return;
                    }
                    StructuredFeedEmptyStateView structuredFeedEmptyStateView = new StructuredFeedEmptyStateView(context2);
                    structuredFeedEmptyStateView.a(pVar);
                    nx.d0 s73 = pVar.s7();
                    yk1.v vVar2 = pVar.f99979q1;
                    if (vVar2 == null) {
                        Intrinsics.r("viewResources");
                        throw null;
                    }
                    new z(structuredFeedEmptyStateView, s73, vVar2, false).a();
                    pinterestEmptyStateLayout2.h(structuredFeedEmptyStateView, 17);
                }
            }
        }
    }

    @Override // id1.g
    public hd1.b v3() {
        return (hd1.b) this.f99996o.getValue();
    }

    @Override // id1.g, wk1.n, wk1.q, yk1.p
    /* renamed from: x3, reason: merged with bridge method [inline-methods] */
    public final void r3(gd1.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        u uVar = view instanceof u ? (u) view : null;
        if (uVar != null) {
            nr0.g v33 = v3();
            Intrinsics.g(v33, "null cannot be cast to non-null type com.pinterest.feature.shopping.shoppingstories.feed.StructuredFeedLandingFragment.PinSaveOverlayListener");
            l listener = (l) v33;
            Intrinsics.checkNotNullParameter(listener, "listener");
            ((p) uVar).f99980r1 = listener;
        }
    }

    @Override // ee1.f
    public final void y0() {
    }
}
