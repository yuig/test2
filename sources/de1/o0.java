package de1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kh2.g3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class o0 extends a0 implements f0 {

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f54612p;

    /* renamed from: q, reason: collision with root package name */
    public final xk2.v f54613q;

    /* renamed from: r, reason: collision with root package name */
    public final a71.c f54614r;

    /* renamed from: s, reason: collision with root package name */
    public String f54615s;

    /* renamed from: t, reason: collision with root package name */
    public String f54616t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f54617u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f54618v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f54619w;

    /* renamed from: x, reason: collision with root package name */
    public String f54620x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f54621y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(uk1.d presenterPinalytics, uj2.q networkStateStream, ArrayList originalFilterList, e eVar, String pinId, yk1.v viewResources, zd1.p filterSource, String str) {
        super(presenterPinalytics, networkStateStream, originalFilterList, eVar, pinId, viewResources, filterSource, str, true);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(originalFilterList, "originalFilterList");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(filterSource, "filterSource");
        this.f54612p = xk2.m.b(new h81.b(this, 28));
        this.f54613q = xk2.m.b(new h81.b(eVar, 29));
        this.f54614r = new a71.c(getPinalytics(), 3);
    }

    public static t32.f N3(String str) {
        t32.d dVar = t32.f.Companion;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        int intValue = intOrNull != null ? intOrNull.intValue() : -1;
        dVar.getClass();
        return t32.d.a(intValue);
    }

    public final void K3(ge1.b bVar) {
        HashMap hashMap = this.f54567k;
        Collection values = hashMap.values();
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((zd1.g) it.next()).f141715f);
        }
        Collection values2 = hashMap.values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = values2.iterator();
        while (it2.hasNext()) {
            String str = ((zd1.g) it2.next()).f141724o;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        pp2.a.h(bVar, null, null, arrayList, arrayList2, null, null, this.f54620x, 51);
    }

    public final void L3(ge1.c cVar) {
        HashMap hashMap = this.f54567k;
        Collection values = hashMap.values();
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((zd1.g) it.next()).f141715f);
        }
        Collection values2 = hashMap.values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = values2.iterator();
        while (it2.hasNext()) {
            String str = ((zd1.g) it2.next()).f141724o;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        pp2.a.i(cVar, null, null, arrayList, arrayList2, null, null, this.f54620x, 51);
    }

    public final HashMap M3() {
        HashMap hashMap = new HashMap();
        pp2.a.J0(hashMap, "module_id", this.f54620x);
        pp2.a.J0(hashMap, "filter_type", pp2.a.x(t32.f.PRODUCT_PRICE));
        return hashMap;
    }

    @Override // fe1.h
    public final void P2(String filterId, int i13, String minId, int i14, String maxId) {
        Object obj;
        List filterOptionList;
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        Intrinsics.checkNotNullParameter(minId, "minId");
        Intrinsics.checkNotNullParameter(maxId, "maxId");
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        Intrinsics.checkNotNullParameter(minId, "minId");
        Intrinsics.checkNotNullParameter(maxId, "maxId");
        Iterator it = this.f54566j.getFilterSpecs().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.d(((zd1.w) obj).getFilterId(), filterId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        zd1.w wVar = (zd1.w) obj;
        if (wVar != null && (filterOptionList = wVar.getFilterOptionList()) != null) {
            filterOptionList.clear();
            filterOptionList.addAll(kotlin.collections.f0.j(new zd1.z(minId, i13, null), new zd1.z(maxId, i14, null)));
        }
        ArrayList arrayList = this.f54565i;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof zd1.r) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (Intrinsics.d(((zd1.r) next).f141754i, filterId)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            zd1.r rVar = (zd1.r) it3.next();
            rVar.f141751f = i13;
            rVar.f141752g = i14;
        }
        H3();
        this.f54618v = Integer.valueOf(i13);
        this.f54619w = Integer.valueOf(i14);
        this.f54617u = false;
    }

    public final h32.g0 Q3() {
        t32.f N3;
        String str = this.f54615s;
        if (str == null || (N3 = N3(str)) == null) {
            return null;
        }
        int i13 = n0.f54609a[N3.ordinal()];
        if (i13 == 1) {
            return h32.g0.RANGE_FILTER;
        }
        if (i13 == 2) {
            return h32.g0.MERCHANT_MULTI_SELECT;
        }
        if (i13 != 3) {
            return null;
        }
        return h32.g0.BRAND_MULTI_SELECT;
    }

    public final void R3() {
        Object obj;
        String str = this.f54615s;
        t32.f N3 = str != null ? N3(str) : null;
        int i13 = N3 == null ? -1 : n0.f54609a[N3.ordinal()];
        if (i13 != 1) {
            a71.c cVar = this.f54614r;
            if (i13 == 2) {
                ge1.c cVar2 = ge1.c.MERCHANT_FILTER_APPLY_BUTTON_TAPPED;
                L3(cVar2);
                cVar.f(cVar2);
                return;
            } else {
                if (i13 != 3) {
                    return;
                }
                ge1.b bVar = ge1.b.BRAND_FILTER_APPLY_BUTTON_TAPPED;
                K3(bVar);
                cVar.b(bVar);
                return;
            }
        }
        nx.d0 pinalytics = getPinalytics();
        f1 f1Var = f1.TAP;
        u0 u0Var = u0.FILTER_SUBMIT_BUTTON;
        h32.g0 Q3 = Q3();
        g3.H(this.f54565i, t32.i.PINS);
        nm.u uVar = new nm.u();
        uVar.u(zd1.p.PRODUCT_FILTER_SOURCE.getSource(), this.f54562f.getSource());
        HashMap hashMap = new HashMap();
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        hashMap.put("commerce_data", sVar);
        hashMap.put("pin_id", this.f54561e);
        ArrayList arrayList = this.f54565i;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        HashMap hashMap2 = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (obj2 instanceof zd1.r) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                zd1.r rVar = (zd1.r) it.next();
                if (rVar.f141750e <= rVar.f141752g) {
                    if (rVar.f141748c != rVar.f141751f) {
                    }
                }
                linkedHashSet.add(t32.f.PRODUCT_PRICE);
                String str2 = rVar.f141758m;
                if (str2 != null) {
                    linkedHashSet2.add(str2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (obj3 instanceof zd1.g) {
                    arrayList3.add(obj3);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                zd1.g gVar = (zd1.g) it2.next();
                if (gVar.f141719j) {
                    String str3 = gVar.f141726q;
                    if (str3 != null) {
                        linkedHashSet2.add(str3);
                    }
                    t32.f fVar = gVar.f141710a;
                    if (fVar != null) {
                        linkedHashSet.add(fVar);
                    }
                }
            }
            hashMap2.put("filter_types", CollectionsKt.Z(linkedHashSet, null, null, null, 0, null, zd1.k.f141734l, 31));
            hashMap2.put("module_ids", CollectionsKt.Z(linkedHashSet2, null, null, null, 0, null, null, 63));
        }
        hashMap.putAll(hashMap2);
        String str4 = this.f54615s;
        if (str4 == null || (obj = N3(str4)) == null) {
            obj = -1;
        }
        if (obj == t32.f.PRODUCT_PRICE) {
            Object[] objArr = {this.f54618v, this.f54619w, this.f54616t};
            int i14 = 0;
            while (true) {
                if (i14 >= 3) {
                    ArrayList A = kotlin.collections.c0.A(objArr);
                    Object obj4 = A.get(0);
                    Object obj5 = A.get(1);
                    Object obj6 = A.get(2);
                    hashMap.put("price_range_min", obj4.toString());
                    hashMap.put("price_range_max", obj5.toString());
                    hashMap.put("currency", obj6.toString());
                    hashMap.putAll(M3());
                    break;
                }
                if (objArr[i14] == null) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : Q3, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public final void S3(a filterAction, int i13) {
        Intrinsics.checkNotNullParameter(filterAction, "filterAction");
        if (this.f54621y && !this.f54617u) {
            e eVar = this.f54560d;
            if (eVar != null) {
                eVar.g2(this.f54566j, this.f54565i, i13, filterAction);
                return;
            }
            return;
        }
        d0 d0Var = (d0) this.f54613q.getValue();
        if (d0Var != null) {
            ArrayList arrayList = this.f54565i;
            boolean z13 = !this.f54621y;
            String str = this.f54615s;
            d0.b3(d0Var, arrayList, i13, filterAction, z13, str != null ? N3(str) : null, 32);
        }
    }

    @Override // de1.h
    public final void V() {
        if (!this.f54617u) {
            if (isBound()) {
                R3();
                int H = g3.H(this.f54565i, null);
                a aVar = a.APPLY;
                if (H == 0) {
                    G3();
                    aVar = a.CLEAR;
                } else {
                    J3(this.f54565i);
                }
                S3(aVar, H);
                Unit unit = Unit.f80348a;
                m60.u.f85943a.d(new jc0.q(true));
                return;
            }
            return;
        }
        zd1.c0 c0Var = new zd1.c0(new ArrayList());
        Intrinsics.checkNotNullParameter(c0Var, "<set-?>");
        this.f54566j = c0Var;
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.f54565i = arrayList;
        S3(a.CLEAR, 0);
        m60.u.f85943a.d(new jc0.q(true));
        d0 d0Var = (d0) this.f54613q.getValue();
        if (d0Var != null) {
            String str = this.f54615s;
            if (str == null) {
                str = ph.a.c0(t32.f.PRODUCT_CONTENT_TYPE);
            }
            d0Var.b5(str);
        }
        R3();
        G3();
    }

    @Override // be1.a
    public final void Z2(zd1.g multiSelectFilter, boolean z13) {
        String str;
        Object obj;
        zd1.a0 a0Var;
        t32.f fVar;
        zd1.a0 a0Var2;
        Object obj2;
        Intrinsics.checkNotNullParameter(multiSelectFilter, "multiSelectFilterData");
        t32.f fVar2 = t32.f.PRODUCT_MERCHANT;
        HashMap hashMap = this.f54567k;
        t32.f fVar3 = multiSelectFilter.f141710a;
        a71.c cVar = this.f54614r;
        if (fVar3 == fVar2) {
            ge1.c cVar2 = multiSelectFilter.f141719j ? ge1.c.MERCHANT_FILTER_OPTION_SELECTED : ge1.c.MERCHANT_FILTER_OPTION_UNSELECTED;
            Collection values = hashMap.values();
            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(values, 10));
            Iterator it = values.iterator();
            while (it.hasNext()) {
                arrayList.add(((zd1.g) it.next()).f141715f);
            }
            Collection values2 = hashMap.values();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = values2.iterator();
            while (it2.hasNext()) {
                String str2 = ((zd1.g) it2.next()).f141724o;
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            pp2.a.i(cVar2, multiSelectFilter.f141715f, multiSelectFilter.f141724o, null, null, arrayList, arrayList2, multiSelectFilter.f141726q, 12);
            cVar.f(cVar2);
        } else if (fVar3 == t32.f.PRODUCT_BRAND) {
            ge1.b bVar = multiSelectFilter.f141719j ? ge1.b.BRAND_FILTER_OPTION_SELECTED : ge1.b.BRAND_FILTER_OPTION_UNSELECTED;
            Collection values3 = hashMap.values();
            ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(values3, 10));
            Iterator it3 = values3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((zd1.g) it3.next()).f141715f);
            }
            Collection values4 = hashMap.values();
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = values4.iterator();
            while (it4.hasNext()) {
                String str3 = ((zd1.g) it4.next()).f141724o;
                if (str3 != null) {
                    arrayList4.add(str3);
                }
            }
            pp2.a.h(bVar, multiSelectFilter.f141715f, multiSelectFilter.f141724o, null, null, arrayList3, arrayList4, multiSelectFilter.f141726q, 12);
            cVar.b(bVar);
        }
        this.f54617u = false;
        Intrinsics.checkNotNullParameter(multiSelectFilter, "multiSelectFilterData");
        if (multiSelectFilter.f141721l) {
            if (multiSelectFilter.f141719j) {
                this.f54571o = multiSelectFilter.f141712c;
                int i13 = 0;
                for (Object obj3 : this.f54565i) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    zd1.h hVar = (zd1.h) obj3;
                    if (g3.d2(multiSelectFilter, hVar)) {
                        zd1.g gVar = hVar instanceof zd1.g ? (zd1.g) hVar : null;
                        if (gVar != null) {
                            gVar.f141719j = false;
                            dl2.b.u(hashMap).remove(gVar.f141713d);
                        }
                    }
                    if (!Intrinsics.d(hVar, multiSelectFilter)) {
                        fc0.e.f61694b.post(new v.j(this, i13, hVar, 13));
                    }
                    i13 = i14;
                }
            } else {
                Iterator it5 = this.f54565i.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj2 = it5.next();
                        if (g3.d2(multiSelectFilter, (zd1.h) obj2)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                if (((zd1.h) obj2) == null) {
                    multiSelectFilter.f141719j = true;
                    fc0.e.f61694b.post(new a11.p(15, this, multiSelectFilter));
                }
            }
        }
        boolean z14 = multiSelectFilter.f141719j;
        String str4 = multiSelectFilter.f141713d;
        if (z14) {
            if (str4 != null) {
            }
        } else if (!z14 && str4 != null) {
        }
        t32.i iVar = multiSelectFilter.f141718i;
        if (!z13) {
            Intrinsics.checkNotNullParameter(multiSelectFilter, "multiSelectFilter");
            if (this.f54564h && iVar != null && multiSelectFilter.f141719j) {
                ((i) getView()).f1();
            }
        }
        Iterator it6 = this.f54566j.getFilterSpecs().iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            str = multiSelectFilter.f141714e;
            if (hasNext) {
                obj = it6.next();
                if (Intrinsics.d(((zd1.w) obj).getFilterId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        zd1.w wVar = (zd1.w) obj;
        if (wVar == null) {
            String[] strArr = {str, str4};
            int i15 = 0;
            while (true) {
                if (i15 >= 2) {
                    ArrayList A = kotlin.collections.c0.A(strArr);
                    String str5 = (String) A.get(0);
                    String str6 = (String) A.get(1);
                    if (iVar != null) {
                        fVar = t32.f.PRODUCT_CONTENT_TYPE;
                        a0Var2 = new zd1.b0(str6, iVar);
                    } else {
                        Integer num = multiSelectFilter.f141725p;
                        if (num != null) {
                            a0Var2 = new zd1.z(str6, num.intValue(), null);
                            fVar = null;
                        } else {
                            String str7 = multiSelectFilter.f141724o;
                            if (str7 != null) {
                                t32.f fVar4 = t32.f.PRODUCT_MERCHANT;
                                a0Var2 = new zd1.y(str6, str7);
                                fVar = fVar4;
                            } else {
                                fVar = null;
                                a0Var2 = null;
                            }
                            if (a0Var2 == null) {
                                a0Var2 = new zd1.x(str6);
                            }
                        }
                    }
                    this.f54566j.getFilterSpecs().add(new zd1.w(str5, kotlin.collections.f0.l(a0Var2), fVar != null ? Integer.valueOf(fVar.getValue()) : null));
                } else if (strArr[i15] == null) {
                    break;
                } else {
                    i15++;
                }
            }
        } else {
            List filterOptionList = wVar.getFilterOptionList();
            filterOptionList.clear();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (Intrinsics.d(((zd1.g) entry.getValue()).f141714e, wVar.getFilterId())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
            Iterator it7 = linkedHashMap.entrySet().iterator();
            while (it7.hasNext()) {
                arrayList5.add((zd1.g) ((Map.Entry) it7.next()).getValue());
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it8 = arrayList5.iterator();
            while (it8.hasNext()) {
                zd1.g gVar2 = (zd1.g) it8.next();
                String str8 = gVar2.f141713d;
                if (str8 != null) {
                    t32.i iVar2 = gVar2.f141718i;
                    if (iVar2 != null) {
                        a0Var = new zd1.b0(str8, iVar2);
                    } else {
                        Integer num2 = gVar2.f141725p;
                        if (num2 != null) {
                            a0Var = new zd1.z(str8, num2.intValue(), null);
                        } else {
                            String str9 = gVar2.f141724o;
                            a0Var = str9 != null ? new zd1.y(str8, str9) : null;
                            if (a0Var == null) {
                                a0Var = new zd1.x(str8);
                            }
                        }
                    }
                } else {
                    a0Var = null;
                }
                if (a0Var != null) {
                    arrayList6.add(a0Var);
                }
            }
            filterOptionList.addAll(arrayList6);
        }
        H3();
    }

    @Override // de1.h
    public final void i() {
        String str = this.f54615s;
        t32.f N3 = str != null ? N3(str) : null;
        int i13 = N3 == null ? -1 : n0.f54609a[N3.ordinal()];
        if (i13 != 1) {
            a71.c cVar = this.f54614r;
            if (i13 == 2) {
                cVar.f(ge1.c.MERCHANT_FILTER_BOTTOM_SHEET_CLOSED);
            } else if (i13 == 3) {
                cVar.b(ge1.b.BRAND_FILTER_BOTTOM_SHEET_CLOSED);
            }
        } else {
            nx.d0 pinalytics = getPinalytics();
            f1 f1Var = f1.TAP;
            u0 u0Var = u0.CLOSE_BUTTON;
            h32.g0 Q3 = Q3();
            HashMap hashMap = new HashMap();
            hashMap.putAll(M3());
            Unit unit = Unit.f80348a;
            pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : Q3, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
        m60.u.f85943a.d(new jc0.q(true));
    }

    @Override // de1.h
    public final void i3() {
        String str = this.f54615s;
        t32.f N3 = str != null ? N3(str) : null;
        int i13 = N3 == null ? -1 : n0.f54609a[N3.ordinal()];
        if (i13 != 1) {
            a71.c cVar = this.f54614r;
            if (i13 == 2) {
                ge1.c cVar2 = ge1.c.MERCHANT_FILTER_RESET_BUTTON_TAPPED;
                L3(cVar2);
                cVar.f(cVar2);
            } else if (i13 == 3) {
                ge1.b bVar = ge1.b.BRAND_FILTER_RESET_BUTTON_TAPPED;
                K3(bVar);
                cVar.b(bVar);
            }
        } else {
            getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.FILTER_CLEAR_BUTTON, (r18 & 4) != 0 ? null : Q3(), (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : M3(), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
        G3();
        if (this.f54621y) {
            this.f54617u = true;
            V();
            return;
        }
        d0 d0Var = (d0) this.f54613q.getValue();
        if (d0Var != null) {
            String str2 = this.f54615s;
            if (str2 == null) {
                str2 = ph.a.c0(t32.f.PRODUCT_CONTENT_TYPE);
            }
            d0Var.L(str2);
        }
        g0 g0Var = (g0) this.f54612p.getValue();
        if (g0Var != null) {
            ((l0) g0Var).o6(true);
        }
    }
}
