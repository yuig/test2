package lv0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.ui.grid.PinterestRecyclerView;
import dl1.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import ku1.k;
import kv0.m;
import kv0.n;
import kv0.o;
import m60.g0;
import m60.w;
import mv0.r;
import nx.b0;
import nx.d0;
import oa2.p;
import qz.f0;
import so.n6;
import x02.i2;
import yk1.v;
import zd1.l;

/* loaded from: classes5.dex */
public final class g extends id1.g implements p21.b, l, cg1.a {

    /* renamed from: j, reason: collision with root package name */
    public final Context f85008j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f85009k;

    /* renamed from: l, reason: collision with root package name */
    public final Resources f85010l;

    /* renamed from: m, reason: collision with root package name */
    public final String f85011m;

    /* renamed from: n, reason: collision with root package name */
    public final k f85012n;

    /* renamed from: o, reason: collision with root package name */
    public final ag1.b f85013o;

    /* renamed from: p, reason: collision with root package name */
    public final w f85014p;

    /* renamed from: q, reason: collision with root package name */
    public final t f85015q;

    /* renamed from: r, reason: collision with root package name */
    public String f85016r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f85017s;

    /* renamed from: t, reason: collision with root package name */
    public final HashSet f85018t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f85019u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f85020v;

    /* renamed from: w, reason: collision with root package name */
    public final m f85021w;

    /* renamed from: x, reason: collision with root package name */
    public final n f85022x;

    /* renamed from: y, reason: collision with root package name */
    public final o f85023y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, boolean z13, id1.h presenterParams, wk1.c params, g0 pageSizeProvider, String apiEndpoint, HashMap apiParamMap, k81.k kVar, Resources resources, i2 pinRepository, String str, k screenNavigator, ag1.b dataManager, w eventManager, t storyPinLocalDataRepository, nr0.m dynamicGridViewBinderDelegateFactory, p legoUserRepPresenterFactory, b60.b activeUserManager, b0 pinAuxHelper) {
        super(presenterParams, dynamicGridViewBinderDelegateFactory, legoUserRepPresenterFactory);
        o oVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(presenterParams, "presenterParams");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(apiEndpoint, "apiEndpoint");
        Intrinsics.checkNotNullParameter(apiParamMap, "apiParamMap");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f85008j = context;
        this.f85009k = z13;
        this.f85010l = resources;
        this.f85011m = str;
        this.f85012n = screenNavigator;
        this.f85013o = dataManager;
        this.f85014p = eventManager;
        this.f85015q = storyPinLocalDataRepository;
        this.f85017s = new LinkedHashMap();
        this.f85018t = new HashSet();
        this.f85019u = new ArrayList();
        d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        uk1.d presenterPinalytics = getPresenterPinalytics();
        qa2.n nVar = params.f130131b;
        this.f85021w = new m(d0Var, apiParamMap, pageSizeProvider, apiEndpoint, params.f130137h, ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics, nVar.f103320a, nVar, params.f130137h), kVar, screenNavigator, this, activeUserManager, pinAuxHelper);
        d0 pinalytics = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(pinalytics, "getPinalytics(...)");
        hd1.c listParams = w3();
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(listParams, "listParams");
        v viewResources = params.f130137h;
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        Intrinsics.checkNotNullParameter(this, "productTaggingListener");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        n nVar2 = new n(listParams, null, 14);
        nVar2.o(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL, new dg1.c(pinalytics, viewResources, screenNavigator, activeUserManager, null, null, this, pinAuxHelper, 1008));
        this.f85022x = nVar2;
        if (str != null) {
            d0 d0Var2 = getPresenterPinalytics().f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
            oVar = new o(d0Var2, str, pinRepository, params.f130137h, screenNavigator, this, activeUserManager, pinAuxHelper);
        } else {
            oVar = null;
        }
        this.f85023y = oVar;
    }

    public final void B3(LinkedHashMap multiSelectItemMap) {
        Intrinsics.checkNotNullParameter(multiSelectItemMap, "multiSelectItemMap");
        String str = this.f85016r;
        if (str != null && str.length() > 0) {
            new Handler(Looper.getMainLooper()).post(new vs0.b(this, 6));
        }
        if (multiSelectItemMap.isEmpty() || this.f85020v) {
            return;
        }
        ArrayList filters = this.f85019u;
        filters.clear();
        filters.addAll(multiSelectItemMap.values());
        yk1.n viewIfBound = getViewIfBound();
        jv0.b bVar = viewIfBound instanceof jv0.b ? (jv0.b) viewIfBound : null;
        if (bVar != null) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            new Handler(Looper.getMainLooper()).post(new dp.a(27, (r) bVar, filters));
        }
    }

    public final void D3(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f85020v = false;
        this.f85018t.clear();
        this.f85016r = query;
        int length = query.length();
        m mVar = this.f85021w;
        n nVar = this.f85022x;
        if (length > 0) {
            mVar.M = false;
            mVar.Z();
            o oVar = this.f85023y;
            if (oVar != null) {
                oVar.f80993m = false;
            }
            if (oVar != null) {
                oVar.clear();
            }
            HashMap paramMap = z0.f(new Pair("commerce_only", "true"), new Pair("enable_promoted_pins", "false"), new Pair("rs", "product_tagging"), new Pair("fields", n00.b.a(n00.c.STORY_PINS_PRODUCT_FEED_FIELDS)), new Pair("query", query));
            nVar.getClass();
            Intrinsics.checkNotNullParameter(paramMap, "paramMap");
            f0 f0Var = nVar.f49121k;
            if (f0Var != null) {
                f0Var.f(paramMap);
            } else {
                HashMap hashMap = nVar.L.f68884a;
                hashMap.putAll(paramMap);
                nVar.f0(hashMap);
            }
            nVar.R = true;
            nVar.Z();
            nVar.n();
        } else {
            yk1.n view = getView();
            Intrinsics.g(view, "null cannot be cast to non-null type com.pinterest.feature.ideaPinCreation.producttagging.IdeaPinProductSearchContract.IdeaPinProductSearchView<*>");
            PinterestRecyclerView pinterestRecyclerView = ((r) ((jv0.b) view)).f88399k1;
            if (pinterestRecyclerView == null) {
                Intrinsics.r("brandRecyclerView");
                throw null;
            }
            pinterestRecyclerView.setVisibility(8);
            nVar.R = false;
            nVar.Z();
            mVar.M = true;
            mVar.n();
        }
        ((yq0.t) ((gd1.c) getView())).setLoadState(yk1.i.LOADING);
        onRecyclerRefresh();
    }

    @Override // id1.g, wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        o oVar = this.f85023y;
        if (oVar != null) {
            ((wk1.i) dataSources).b(oVar);
        }
        com.pinterest.framework.multisection.datasource.pagedlist.f fVar = new com.pinterest.framework.multisection.datasource.pagedlist.f(this.f85021w, 14);
        fVar.k(RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER);
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(fVar);
        iVar.b(this.f85022x);
    }

    @Override // id1.g, wk1.n, wk1.q, yk1.p
    /* renamed from: x3, reason: merged with bridge method [inline-methods] */
    public final void r3(gd1.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        np0.h eventHandler = new np0.h(this, 13);
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        GestaltStaticSearchBar gestaltStaticSearchBar = ((r) ((jv0.b) view)).f88397i1;
        if (gestaltStaticSearchBar != null) {
            gestaltStaticSearchBar.k0(eventHandler);
        } else {
            Intrinsics.r("searchBar");
            throw null;
        }
    }
}
