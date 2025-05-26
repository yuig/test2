package de1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kh2.g3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class a0 extends vq0.b implements h, be1.a, fe1.h, b0, ae1.b, ae1.a, k, m {

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f54559c;

    /* renamed from: d, reason: collision with root package name */
    public final e f54560d;

    /* renamed from: e, reason: collision with root package name */
    public final String f54561e;

    /* renamed from: f, reason: collision with root package name */
    public zd1.p f54562f;

    /* renamed from: g, reason: collision with root package name */
    public final String f54563g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f54564h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f54565i;

    /* renamed from: j, reason: collision with root package name */
    public zd1.c0 f54566j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f54567k;

    /* renamed from: l, reason: collision with root package name */
    public zd1.u f54568l;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f54569m;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f54570n;

    /* renamed from: o, reason: collision with root package name */
    public List f54571o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(uk1.d presenterPinalytics, uj2.q networkStateStream, ArrayList originalProductFilterList, e eVar, String pinId, yk1.v viewResources, zd1.p filterSource, String str, boolean z13) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(originalProductFilterList, "originalProductFilterList");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(filterSource, "filterSource");
        this.f54559c = originalProductFilterList;
        this.f54560d = eVar;
        this.f54561e = pinId;
        this.f54562f = filterSource;
        this.f54563g = str;
        this.f54564h = z13;
        this.f54566j = new zd1.c0(new ArrayList());
        this.f54567k = new HashMap();
        new HashSet();
        this.f54568l = zd1.u.MOST_RELEVANT;
        this.f54569m = new HashMap();
        this.f54570n = new HashSet();
        this.f54565i = g3.N(this.f54559c);
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER, new fe1.g(viewResources, new u(this, 9)));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM, new tj0.w((be1.a) this, true, (Function1) new v(this, 3), (Function0) new u(this, 10), (Function0) new u(this, 11)));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM, new tj0.w((fe1.h) this, true, new v(this, 4), (Function0) new u(this, 12), (Function0) new u(this, 13)));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER, new ni0.f(this, new v(this, 5), new u(this, 14)));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER, new xv.g(presenterPinalytics, networkStateStream, this, new u(this, 6)));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM, new yi0.a(this, new u(this, 7)));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM, new h90.m(this));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_PRODUCT_FILTER_DIVIDER, new pk0.a(2, new u(this, 8)));
    }

    public static final void D3(a0 a0Var, int i13) {
        h32.g0 componentType;
        zd1.q qVar;
        zd1.h hVar = (zd1.h) a0Var.getItem(i13 - 1);
        zd1.q b13 = hVar != null ? hVar.b() : null;
        zd1.h hVar2 = (zd1.h) a0Var.getItem(i13);
        zd1.q b14 = hVar2 != null ? hVar2.b() : null;
        zd1.h hVar3 = (zd1.h) a0Var.getItem(i13);
        if ((i13 < 1 || b13 != (qVar = zd1.q.FILTER_HEADER) || b14 == qVar) && (i13 != 0 || b14 == zd1.q.FILTER_HEADER)) {
            return;
        }
        HashSet hashSet = a0Var.f54570n;
        if (hashSet.contains(Integer.valueOf(i13))) {
            return;
        }
        int i14 = b14 == null ? -1 : z.f54674a[b14.ordinal()];
        if (i14 == 2) {
            componentType = h32.g0.RANGE_FILTER;
        } else if (i14 != 3) {
            componentType = i14 != 4 ? i14 != 9 ? null : h32.g0.MULTI_SELECT_FILTER : h32.g0.SINGLE_SELECT_FILTER;
        } else {
            zd1.g gVar = hVar3 instanceof zd1.g ? (zd1.g) hVar3 : null;
            componentType = (gVar == null || !gVar.f141721l) ? h32.g0.MULTI_SELECT_FILTER : h32.g0.SINGLE_SELECT_FILTER;
        }
        if (componentType != null) {
            o0 o0Var = (o0) a0Var;
            Intrinsics.checkNotNullParameter(componentType, "componentType");
            String str = o0Var.f54615s;
            t32.f N3 = str != null ? o0.N3(str) : null;
            int i15 = N3 != null ? n0.f54609a[N3.ordinal()] : -1;
            if (i15 != 1) {
                a71.c cVar = o0Var.f54614r;
                if (i15 == 2) {
                    cVar.f(ge1.c.MERCHANT_FILTER_OPTION_VIEWED);
                } else if (i15 == 3) {
                    cVar.b(ge1.b.BRAND_FILTER_OPTION_VIEWED);
                }
            } else {
                nx.d0 pinalytics = o0Var.getPinalytics();
                f1 f1Var = f1.VIEW;
                h32.g0 Q3 = o0Var.Q3();
                HashMap hashMap = new HashMap();
                hashMap.put("filter_type", ph.a.c0(t32.f.PRODUCT_PRICE));
                Unit unit = Unit.f80348a;
                nx.d0.B(pinalytics, f1Var, Q3, null, hashMap, 20);
            }
        }
        hashSet.add(Integer.valueOf(i13));
    }

    @Override // vq0.g
    /* renamed from: F3, reason: merged with bridge method [inline-methods] */
    public final void r3(i view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        view.E(this);
        view.k6(false);
        I3(this.f54565i, this.f54562f);
        nx.d0 pinalytics = getPinalytics();
        f1 f1Var = f1.VIEW;
        nm.u uVar = new nm.u();
        uVar.u(zd1.p.PRODUCT_FILTER_SOURCE.getSource(), this.f54562f.getSource());
        HashMap hashMap = new HashMap();
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        hashMap.put("commerce_data", sVar);
        String str = this.f54563g;
        if (str == null) {
            str = "";
        }
        hashMap.put("query", str);
        hashMap.put("pin_id", this.f54561e);
        nx.d0.B(pinalytics, f1Var, null, null, hashMap, 22);
    }

    @Override // ae1.a
    public final void G(zd1.c colorFilter) {
        Object obj;
        Intrinsics.checkNotNullParameter(colorFilter, "colorFilter");
        ArrayList arrayList = this.f54565i;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof zd1.c) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((zd1.c) obj).f141697h == colorFilter.f141697h) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        zd1.c cVar = (zd1.c) obj;
        if (cVar == null) {
            return;
        }
        cVar.f141696g = colorFilter.f141696g;
    }

    public final void G3() {
        this.f54565i = g3.N(this.f54559c);
        HashMap hashMap = this.f54567k;
        hashMap.clear();
        ArrayList arrayList = this.f54565i;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof zd1.g) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((zd1.g) next).f141719j) {
                arrayList3.add(next);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            zd1.g gVar = (zd1.g) it2.next();
            hashMap.putIfAbsent(gVar.f141716g, gVar);
        }
        this.f54566j = new zd1.c0(new ArrayList());
        J3(this.f54565i);
        x3(this.f54565i);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H3() {
        /*
            Method dump skipped, instructions count: 187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: de1.a0.H3():void");
    }

    public final void I3(ArrayList productFilters, zd1.p productFilterSource) {
        Intrinsics.checkNotNullParameter(productFilters, "productFilters");
        Intrinsics.checkNotNullParameter(productFilterSource, "productFilterSource");
        this.f54562f = productFilterSource;
        if (this.f54559c.isEmpty()) {
            this.f54565i = g3.N(productFilters);
            this.f54559c = productFilters;
        }
        if ((!productFilters.isEmpty()) && d().isEmpty()) {
            x3(this.f54565i);
            J3(this.f54565i);
        }
        i iVar = (i) getViewIfBound();
        if (iVar != null) {
            iVar.showLoadingSpinner(d().isEmpty());
        }
        i iVar2 = (i) getViewIfBound();
        if (iVar2 != null) {
            iVar2.G(!d().isEmpty());
        }
    }

    public final void J3(ArrayList filterList) {
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        g3.D2(this.f54566j, filterList, this instanceof f0, this.f54564h);
    }

    @Override // fe1.h
    public final void P1(int i13, int i14) {
        HashMap hashMap = this.f54569m;
        hashMap.put("price_min", String.valueOf(i13));
        hashMap.put("price_max", String.valueOf(i14));
        ArrayList arrayList = this.f54565i;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof zd1.r) {
                arrayList2.add(obj);
            }
        }
        zd1.r rVar = (zd1.r) CollectionsKt.firstOrNull(arrayList2);
        if (rVar != null) {
            rVar.f141751f = i13;
            rVar.f141752g = i14;
        }
    }

    @Override // de1.m
    public final void R(zd1.v standardListFilter) {
        Object obj;
        Intrinsics.checkNotNullParameter(standardListFilter, "standardListFilter");
        ArrayList arrayList = this.f54565i;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof zd1.v) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.d(((zd1.v) obj).f141768c, standardListFilter.f141768c)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        zd1.v vVar = (zd1.v) obj;
        if (vVar == null) {
            return;
        }
        vVar.f141771f = standardListFilter.f141771f;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        zd1.h hVar = (zd1.h) getItem(i13);
        if (hVar == null) {
            return -2;
        }
        switch (z.f54674a[hVar.b().ordinal()]) {
        }
        return -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ae1.b
    public final void m3(zd1.b colorFilter) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(colorFilter, "colorFilter");
        ArrayList arrayList2 = this.f54565i;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof zd1.d) {
                arrayList3.add(obj);
            }
        }
        zd1.d dVar = (zd1.d) CollectionsKt.firstOrNull(arrayList3);
        zd1.b bVar = null;
        if (dVar != null && (arrayList = dVar.f141703c) != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((zd1.b) next).f141687f == colorFilter.f141687f) {
                    bVar = next;
                    break;
                }
            }
            bVar = bVar;
        }
        if (bVar == null) {
            return;
        }
        bVar.f141686e = colorFilter.f141686e;
    }

    @Override // vq0.g
    public final sq0.e0 p3() {
        return this;
    }

    @Override // de1.k
    public final void x1(zd1.t sortFilter, boolean z13) {
        Intrinsics.checkNotNullParameter(sortFilter, "sortFilter");
        zd1.u uVar = sortFilter.f141765b;
        this.f54568l = uVar;
        if (!z13) {
            nx.d0 pinalytics = getPinalytics();
            h32.g0 g0Var = h32.g0.SHOPPING_SORT_FILTER;
            u0 u0Var = u0.SHOPPING_SORT_FILTER_TABLE_CELL;
            nm.u uVar2 = new nm.u();
            uVar2.t("select", Boolean.valueOf(uVar == this.f54568l));
            uVar2.u("sort_type", sortFilter.f141764a);
            uVar2.u(zd1.p.PRODUCT_FILTER_SOURCE.getSource(), this.f54562f.getSource());
            HashMap hashMap = new HashMap();
            String sVar = uVar2.toString();
            Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
            hashMap.put("commerce_data", sVar);
            hashMap.put("pin_id", this.f54561e);
            pinalytics.h(g0Var, u0Var, hashMap);
        }
        this.f54569m.put("sort_type", String.valueOf(this.f54568l.getIndex()));
        ArrayList arrayList = this.f54565i;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof zd1.s) {
                arrayList2.add(obj);
            }
        }
        zd1.s sVar2 = (zd1.s) CollectionsKt.firstOrNull(arrayList2);
        if (sVar2 == null) {
            return;
        }
        zd1.u uVar3 = this.f54568l;
        Intrinsics.checkNotNullParameter(uVar3, "<set-?>");
        sVar2.f141763d = uVar3;
    }

    @Override // be1.a
    public final void z(zd1.g multiSelectFilter, boolean z13) {
        Object obj;
        Intrinsics.checkNotNullParameter(multiSelectFilter, "multiSelectFilter");
        boolean z14 = multiSelectFilter.f141719j;
        HashMap hashMap = this.f54567k;
        String str = multiSelectFilter.f141716g;
        if (z14) {
            hashMap.putIfAbsent(str, multiSelectFilter);
        } else if (!z14) {
            hashMap.remove(str);
        }
        if (!z13) {
            Intrinsics.checkNotNullParameter(multiSelectFilter, "multiSelectFilter");
        }
        this.f54569m.put("domains", CollectionsKt.Z(hashMap.values(), null, null, null, 0, null, p.f54626n, 31));
        ArrayList arrayList = this.f54565i;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof zd1.g) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            zd1.g gVar = (zd1.g) obj;
            if (!(!kotlin.text.z.j(gVar.f141716g)) || !Intrinsics.d(gVar.f141716g, str)) {
                String str2 = gVar.f141715f;
                if ((!kotlin.text.z.j(str2)) && Intrinsics.d(str2, multiSelectFilter.f141715f)) {
                    break;
                }
            } else {
                break;
            }
        }
        zd1.g gVar2 = (zd1.g) obj;
        if (gVar2 == null) {
            return;
        }
        gVar2.f141719j = multiSelectFilter.f141719j;
    }
}
