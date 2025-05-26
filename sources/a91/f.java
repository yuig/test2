package a91;

import d91.j;
import de1.t;
import id1.g;
import id1.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jc0.s;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import ku1.k;
import m60.g0;
import m60.w;
import m60.x0;
import nr0.m;
import nx.b0;
import nx.d0;
import oa2.p;
import qa2.n;
import so.n6;
import wk1.i;
import x02.i2;
import yk1.v;
import zd1.o;

/* loaded from: classes5.dex */
public final class f extends g implements p21.a {

    /* renamed from: j, reason: collision with root package name */
    public final o f1576j;

    /* renamed from: k, reason: collision with root package name */
    public final o f1577k;

    /* renamed from: l, reason: collision with root package name */
    public final o f1578l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1579m;

    /* renamed from: n, reason: collision with root package name */
    public List f1580n;

    /* renamed from: o, reason: collision with root package name */
    public List f1581o;

    /* renamed from: p, reason: collision with root package name */
    public List f1582p;

    /* renamed from: q, reason: collision with root package name */
    public c91.g f1583q;

    /* renamed from: r, reason: collision with root package name */
    public final z81.b f1584r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h presenterParams, wk1.c params, HashMap apiParamMap, o oVar, o oVar2, o oVar3, k screenNavigator, g0 pageSizeProvider, b60.b activeUserManager, i2 pinRepository, w eventManager, m dynamicGridViewBinderDelegateFactory, p legoUserRepPresenterFactory, b0 pinAuxHelper) {
        super(presenterParams, dynamicGridViewBinderDelegateFactory, legoUserRepPresenterFactory);
        Intrinsics.checkNotNullParameter(presenterParams, "presenterParams");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter("visual_search/virtual_try_on/makeup_products/", "apiEndpoint");
        Intrinsics.checkNotNullParameter(apiParamMap, "apiParamMap");
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f1576j = oVar;
        this.f1577k = oVar2;
        this.f1578l = oVar3;
        k81.k kVar = new k81.k(this, 3);
        d0 pinalytics = getPinalytics();
        int i13 = x0.idea_pin_vto_tag_button_preview_text;
        v vVar = params.f130137h;
        dg1.c cVar = new dg1.c(pinalytics, vVar, screenNavigator, activeUserManager, ((yk1.a) vVar).f139224a.getString(i13), a42.f.VIRTUAL_TRY_ON_MAKEUP_STICKER, null, pinAuxHelper, 1136);
        d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        uk1.d presenterPinalytics = getPresenterPinalytics();
        n nVar = params.f130131b;
        this.f1584r = new z81.b(d0Var, apiParamMap, pageSizeProvider, cVar, ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics, nVar.f103320a, nVar, params.f130137h), kVar);
    }

    public final void B3() {
        this.f1583q = null;
    }

    public final void D3(c91.g vtoFilterType) {
        j jVar;
        t tVar;
        Intrinsics.checkNotNullParameter(vtoFilterType, "vtoFilterType");
        this.f1583q = vtoFilterType;
        yk1.n view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type com.pinterest.feature.search.visual.tryon.ProductTaggingTryOnContract.VTOProductTaggingView<*>");
        x81.f fVar = (x81.f) view;
        int i13 = e.f1575a[vtoFilterType.ordinal()];
        if (i13 == 1) {
            j jVar2 = (j) fVar;
            t tVar2 = jVar2.f54091o1;
            if (tVar2 != null) {
                kg.p.S(jVar2.s7(), jVar2.f7(), tVar2);
                return;
            }
            return;
        }
        if (i13 != 2) {
            if (i13 == 3 && (tVar = (jVar = (j) fVar).f54089m1) != null) {
                kg.p.S(jVar.s7(), jVar.f7(), tVar);
                return;
            }
            return;
        }
        j jVar3 = (j) fVar;
        t tVar3 = jVar3.f54090n1;
        if (tVar3 != null) {
            kg.p.S(jVar3.s7(), jVar3.f7(), tVar3);
        }
    }

    @Override // id1.g, wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f1584r);
    }

    @Override // de1.g
    public final void i() {
        yk1.n view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type com.pinterest.feature.search.visual.tryon.ProductTaggingTryOnContract.VTOProductTaggingView<*>");
        j jVar = (j) ((x81.f) view);
        jVar.f7().f(new s(false));
        f fVar = jVar.f54088l1;
        if (fVar != null) {
            fVar.B3();
        }
    }

    @Override // id1.g, de1.g
    /* renamed from: z3, reason: merged with bridge method [inline-methods] */
    public final void g2(HashMap filterApiSpec, ArrayList selectedProductFilters, int i13, de1.a filterAction) {
        List list;
        List list2;
        Intrinsics.checkNotNullParameter(filterApiSpec, "filterApiSpec");
        Intrinsics.checkNotNullParameter(selectedProductFilters, "selectedProductFilters");
        Intrinsics.checkNotNullParameter(filterAction, "filterAction");
        c91.g gVar = this.f1583q;
        int i14 = gVar == null ? -1 : e.f1575a[gVar.ordinal()];
        if (i14 == 1) {
            o oVar = this.f1578l;
            if (oVar != null) {
                oVar.f(selectedProductFilters);
            }
            if (filterAction == de1.a.CLEAR && (list = this.f1580n) != null) {
                list.clear();
            }
        } else if (i14 == 2) {
            o oVar2 = this.f1577k;
            if (oVar2 != null) {
                oVar2.f(selectedProductFilters);
            }
            if (filterAction == de1.a.CLEAR && (list2 = this.f1581o) != null) {
                list2.clear();
            }
        } else if (i14 == 3) {
            o oVar3 = this.f1576j;
            if (oVar3 != null) {
                oVar3.f(selectedProductFilters);
            }
            List list3 = this.f1582p;
            if (list3 != null) {
                list3.clear();
            }
        }
        ArrayList colorListFilters = new ArrayList();
        for (Object obj : selectedProductFilters) {
            if (obj instanceof zd1.c) {
                colorListFilters.add(obj);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : selectedProductFilters) {
            if (obj2 instanceof zd1.v) {
                arrayList.add(obj2);
            }
        }
        Intrinsics.checkNotNullParameter(colorListFilters, "colorListFilters");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = colorListFilters.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((zd1.c) next).f141696g) {
                arrayList3.add(next);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((zd1.c) it2.next()).f141697h));
        }
        String Z = CollectionsKt.Z(arrayList2, null, null, null, 0, null, null, 63);
        if (Z.length() == 0) {
            List list4 = this.f1580n;
            Z = list4 != null ? CollectionsKt.Z(list4, null, null, null, 0, null, null, 63) : null;
        }
        String z13 = kg.p.z(arrayList);
        if (z13.length() == 0) {
            List list5 = this.f1581o;
            z13 = list5 != null ? CollectionsKt.Z(list5, null, null, null, 0, null, null, 63) : null;
        }
        String y13 = kg.p.y(arrayList);
        if (y13.length() == 0) {
            List list6 = this.f1582p;
            y13 = list6 != null ? CollectionsKt.Z(list6, null, null, null, 0, null, null, 63) : null;
        }
        f42.o oVar4 = f42.o.FILTERS_SELECTED;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("enable_product_filters", "true");
        pairArr[1] = new Pair("product_filter_request_type", String.valueOf(oVar4.getValue()));
        if (Z == null) {
            Z = "";
        }
        pairArr[2] = new Pair("color_swatch_filters", Z);
        if (z13 == null) {
            z13 = "";
        }
        pairArr[3] = new Pair("price_bucket_filters", z13);
        if (y13 == null) {
            y13 = "";
        }
        pairArr[4] = new Pair("brand_name_filters", y13);
        pairArr[5] = new Pair("feed_source", String.valueOf(f42.i.PRODUCT_TAGGING.getValue()));
        HashMap f13 = z0.f(pairArr);
        z81.b bVar = this.f1584r;
        bVar.f0(f13);
        bVar.M = true;
        bVar.Z();
        bVar.n();
        ((yq0.t) ((gd1.c) getView())).setLoadState(yk1.i.LOADING);
        onRecyclerRefresh();
        yk1.n view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type com.pinterest.feature.search.visual.tryon.ProductTaggingTryOnContract.VTOProductTaggingView<*>");
        j jVar = (j) ((x81.f) view);
        jVar.f7().f(new s(false));
        f fVar = jVar.f54088l1;
        if (fVar != null) {
            fVar.B3();
        }
    }
}
