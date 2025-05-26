package de1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh2.g3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends vq0.b implements h, be1.a, fe1.h, ae1.b, ae1.a, k, m {

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f54662c;

    /* renamed from: d, reason: collision with root package name */
    public final c f54663d;

    /* renamed from: e, reason: collision with root package name */
    public final String f54664e;

    /* renamed from: f, reason: collision with root package name */
    public zd1.p f54665f;

    /* renamed from: g, reason: collision with root package name */
    public final String f54666g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f54667h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f54668i;

    /* renamed from: j, reason: collision with root package name */
    public zd1.u f54669j;

    /* renamed from: k, reason: collision with root package name */
    public HashMap f54670k;

    /* renamed from: l, reason: collision with root package name */
    public final zd1.c0 f54671l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f54672m;

    /* renamed from: n, reason: collision with root package name */
    public List f54673n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(uk1.d presenterPinalytics, uj2.q networkStateStream, ArrayList originalProductFilterList, c cVar, String pinId, yk1.v viewResources, zd1.p filterSource, String str) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(originalProductFilterList, "originalProductFilterList");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(filterSource, "filterSource");
        this.f54662c = originalProductFilterList;
        this.f54663d = cVar;
        this.f54664e = pinId;
        this.f54665f = filterSource;
        this.f54666g = str;
        this.f54668i = new HashMap();
        new HashSet();
        this.f54669j = zd1.u.MOST_RELEVANT;
        this.f54670k = new HashMap();
        this.f54671l = new zd1.c0(new ArrayList());
        this.f54672m = new HashSet();
        this.f54667h = g3.N(this.f54662c);
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER, new fe1.g(viewResources, new u(this, 0)));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM, new tj0.w((be1.a) this, new v(this, 0), new u(this, 1)));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM, new tj0.w((fe1.h) this, new v(this, 1), new u(this, 2)));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER, new ni0.f(this, new v(this, 2), new u(this, 3)));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER, new xv.g(presenterPinalytics, networkStateStream, this, new u(this, 4)));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM, new yi0.a(this, new u(this, 5)));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM, new h90.m(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void D3(de1.x r11, int r12) {
        /*
            int r0 = r12 + (-1)
            java.lang.Object r0 = r11.getItem(r0)
            zd1.h r0 = (zd1.h) r0
            r1 = 0
            if (r0 == 0) goto L10
            zd1.q r0 = r0.b()
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.Object r2 = r11.getItem(r12)
            zd1.h r2 = (zd1.h) r2
            if (r2 == 0) goto L1e
            zd1.q r2 = r2.b()
            goto L1f
        L1e:
            r2 = r1
        L1f:
            java.lang.Object r3 = r11.getItem(r12)
            zd1.h r3 = (zd1.h) r3
            r4 = 1
            if (r12 < r4) goto L2e
            zd1.q r5 = zd1.q.FILTER_HEADER
            if (r0 != r5) goto L2e
            if (r2 != r5) goto L34
        L2e:
            if (r12 != 0) goto L89
            zd1.q r0 = zd1.q.FILTER_HEADER
            if (r2 == r0) goto L89
        L34:
            java.util.HashSet r0 = r11.f54672m
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            boolean r5 = r0.contains(r5)
            if (r5 != 0) goto L89
            if (r3 == 0) goto L47
            t32.f r3 = r3.c()
            goto L48
        L47:
            r3 = r1
        L48:
            if (r2 != 0) goto L4c
            r2 = -1
            goto L54
        L4c:
            int[] r5 = de1.w.f54661a
            int r2 = r2.ordinal()
            r2 = r5[r2]
        L54:
            r5 = 2
            if (r2 == r5) goto L6d
            r5 = 3
            if (r2 == r5) goto L6a
            r5 = 4
            if (r2 == r5) goto L67
            r5 = 8
            if (r2 == r5) goto L63
            r7 = r1
            goto L70
        L63:
            h32.g0 r2 = h32.g0.SHOPPING_CATEGORY_FILTER
        L65:
            r7 = r2
            goto L70
        L67:
            h32.g0 r2 = h32.g0.SHOPPING_SORT_FILTER
            goto L65
        L6a:
            h32.g0 r2 = h32.g0.SHOPPING_BRAND_FILTER
            goto L65
        L6d:
            h32.g0 r2 = h32.g0.SHOPPING_PRICE_FILTER
            goto L65
        L70:
            if (r7 == 0) goto L82
            nx.d0 r5 = r11.getPinalytics()
            h32.f1 r6 = h32.f1.RENDER
            java.util.HashMap r9 = F3(r11, r1, r3, r4)
            r10 = 20
            r8 = 0
            nx.d0.B(r5, r6, r7, r8, r9, r10)
        L82:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r0.add(r11)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de1.x.D3(de1.x, int):void");
    }

    public static HashMap F3(x xVar, String str, t32.f fVar, int i13) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            fVar = null;
        }
        xVar.getClass();
        nm.u uVar = new nm.u();
        uVar.u(zd1.p.PRODUCT_FILTER_SOURCE.getSource(), xVar.f54665f.getSource());
        HashMap hashMap = new HashMap();
        if (fVar != null) {
            hashMap.put("filter_type", String.valueOf(fVar.getValue()));
        }
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        hashMap.put("commerce_data", sVar);
        if (str == null) {
            str = "";
        }
        hashMap.put("query", str);
        hashMap.put("pin_id", xVar.f54664e);
        return hashMap;
    }

    @Override // ae1.a
    public final void G(zd1.c colorFilter) {
        Object obj;
        Intrinsics.checkNotNullParameter(colorFilter, "colorFilter");
        ArrayList arrayList = this.f54667h;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof zd1.c) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (((zd1.c) obj).f141697h == colorFilter.f141697h) {
                    break;
                }
            }
        }
        zd1.c cVar = (zd1.c) obj;
        if (cVar == null) {
            return;
        }
        cVar.f141696g = colorFilter.f141696g;
    }

    public final void G3(zd1.g gVar, t32.f fVar) {
        h32.g0 g0Var = h32.g0.SHOPPING_BRAND_FILTER;
        nx.d0 pinalytics = getPinalytics();
        u0 u0Var = u0.SHOPPING_BRAND_FILTER_TABLE_CELL;
        nm.u uVar = new nm.u();
        uVar.t("select", Boolean.valueOf(gVar.f141719j));
        uVar.u("domain", gVar.f141716g);
        HashMap hashMap = new HashMap();
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        hashMap.put("commerce_data", sVar);
        hashMap.put("pin_id", this.f54664e);
        if (fVar != null) {
            hashMap.put("filter_type", String.valueOf(fVar.getValue()));
        }
        pinalytics.h(g0Var, u0Var, hashMap);
    }

    @Override // vq0.g
    /* renamed from: H3, reason: merged with bridge method [inline-methods] */
    public final void r3(i view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        view.E(this);
        K3(this.f54667h, this.f54665f);
        nx.d0.B(getPinalytics(), f1.VIEW, null, null, F3(this, this.f54666g, null, 2), 22);
    }

    public final void I3() {
        this.f54670k = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f54667h = arrayList;
        c cVar = this.f54663d;
        if (cVar != null) {
            cVar.g2(this.f54670k, arrayList, 0, a.CLEAR);
        }
        m60.u.f85943a.d(new jc0.q(true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r7.f141719j == ((zd1.g) r5).f141719j) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r7.f141752g == ((zd1.r) r5).f141752g) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J3() {
        /*
            r10 = this;
            java.util.ArrayList r0 = r10.f54662c
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
            r2 = 0
            r3 = r1
            r4 = r2
        La:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L73
            java.lang.Object r5 = r0.next()
            int r6 = r4 + 1
            r7 = 0
            if (r4 < 0) goto L6f
            zd1.h r5 = (zd1.h) r5
            java.util.ArrayList r8 = r10.f54667h
            java.lang.Object r4 = r8.get(r4)
            java.lang.String r8 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r8)
            zd1.h r4 = (zd1.h) r4
            boolean r8 = r5 instanceof zd1.g
            if (r8 == 0) goto L43
            if (r3 == 0) goto L41
            boolean r3 = r4 instanceof zd1.g
            if (r3 == 0) goto L35
            r7 = r4
            zd1.g r7 = (zd1.g) r7
        L35:
            if (r7 == 0) goto L41
            boolean r3 = r7.f141719j
            zd1.g r5 = (zd1.g) r5
            boolean r4 = r5.f141719j
            if (r3 != r4) goto L41
        L3f:
            r3 = r1
            goto L6d
        L41:
            r3 = r2
            goto L6d
        L43:
            boolean r8 = r5 instanceof zd1.r
            if (r8 == 0) goto L6d
            if (r3 == 0) goto L41
            boolean r3 = r4 instanceof zd1.r
            if (r3 == 0) goto L51
            r8 = r4
            zd1.r r8 = (zd1.r) r8
            goto L52
        L51:
            r8 = r7
        L52:
            if (r8 == 0) goto L41
            int r8 = r8.f141751f
            r9 = r5
            zd1.r r9 = (zd1.r) r9
            int r9 = r9.f141751f
            if (r8 != r9) goto L41
            if (r3 == 0) goto L62
            r7 = r4
            zd1.r r7 = (zd1.r) r7
        L62:
            if (r7 == 0) goto L41
            int r3 = r7.f141752g
            zd1.r r5 = (zd1.r) r5
            int r4 = r5.f141752g
            if (r3 != r4) goto L41
            goto L3f
        L6d:
            r4 = r6
            goto La
        L6f:
            kotlin.collections.f0.p()
            throw r7
        L73:
            yk1.n r0 = r10.getView()
            de1.i r0 = (de1.i) r0
            r2 = r3 ^ 1
            r0.k6(r2)
            yk1.n r0 = r10.getView()
            de1.i r0 = (de1.i) r0
            r1 = r1 ^ r3
            r0.o6(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de1.x.J3():void");
    }

    public final void K3(ArrayList productFilters, zd1.p productFilterSource) {
        Intrinsics.checkNotNullParameter(productFilters, "productFilters");
        Intrinsics.checkNotNullParameter(productFilterSource, "productFilterSource");
        this.f54665f = productFilterSource;
        if (this.f54662c.isEmpty()) {
            this.f54667h = g3.N(productFilters);
            this.f54662c = productFilters;
        }
        if ((!productFilters.isEmpty()) && d().isEmpty()) {
            x3(this.f54667h);
            ArrayList arrayList = this.f54667h;
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof zd1.r) {
                        arrayList2.add(next);
                    }
                }
                zd1.r rVar = (zd1.r) CollectionsKt.firstOrNull(arrayList2);
                if (rVar != null) {
                    this.f54670k.put("price_min", String.valueOf(rVar.f141751f));
                    this.f54670k.put("price_max", String.valueOf(rVar.f141752g));
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (next2 instanceof zd1.g) {
                        arrayList3.add(next2);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    if (((zd1.g) next3).f141719j) {
                        arrayList4.add(next3);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    this.f54670k.put("domains", CollectionsKt.Z(arrayList4, null, null, null, 0, null, null, 63));
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    Object next4 = it4.next();
                    if (next4 instanceof zd1.a) {
                        arrayList5.add(next4);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    Object next5 = it5.next();
                    if (((zd1.a) next5).f141681d) {
                        arrayList6.add(next5);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    this.f54670k.put("categories", CollectionsKt.Z(arrayList6, null, null, null, 0, null, null, 63));
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    Object next6 = it6.next();
                    if (next6 instanceof zd1.s) {
                        arrayList7.add(next6);
                    }
                }
                zd1.s sVar = (zd1.s) CollectionsKt.firstOrNull(arrayList7);
                if (sVar != null) {
                    this.f54670k.put("sort_type", String.valueOf(sVar.f141763d.getIndex()));
                }
            }
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

    @Override // fe1.h
    public final void P1(int i13, int i14) {
        this.f54670k.put("price_min", String.valueOf(i13));
        this.f54670k.put("price_max", String.valueOf(i14));
        ArrayList arrayList = this.f54667h;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof zd1.r) {
                arrayList2.add(next);
            }
        }
        zd1.r rVar = (zd1.r) CollectionsKt.firstOrNull(arrayList2);
        if (rVar != null) {
            rVar.f141751f = i13;
            rVar.f141752g = i14;
        }
    }

    @Override // fe1.h
    public final void P2(String filterId, int i13, String minId, int i14, String maxId) {
        Object obj;
        List filterOptionList;
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        Intrinsics.checkNotNullParameter(minId, "minId");
        Intrinsics.checkNotNullParameter(maxId, "maxId");
        Iterator it = this.f54671l.getFilterSpecs().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((zd1.w) obj).getFilterId(), filterId)) {
                    break;
                }
            }
        }
        zd1.w wVar = (zd1.w) obj;
        if (wVar != null && (filterOptionList = wVar.getFilterOptionList()) != null) {
            filterOptionList.clear();
            filterOptionList.addAll(kotlin.collections.f0.j(new zd1.z(minId, i13, null), new zd1.z(maxId, i14, null)));
        }
        ArrayList arrayList = this.f54667h;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof zd1.r) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (Intrinsics.d(((zd1.r) next2).f141754i, filterId)) {
                arrayList3.add(next2);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            zd1.r rVar = (zd1.r) it4.next();
            rVar.f141751f = i13;
            rVar.f141752g = i14;
        }
        J3();
    }

    @Override // de1.m
    public final void R(zd1.v standardListFilter) {
        Object obj;
        Intrinsics.checkNotNullParameter(standardListFilter, "standardListFilter");
        ArrayList arrayList = this.f54667h;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof zd1.v) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (Intrinsics.d(((zd1.v) obj).f141768c, standardListFilter.f141768c)) {
                    break;
                }
            }
        }
        zd1.v vVar = (zd1.v) obj;
        if (vVar == null) {
            return;
        }
        vVar.f141771f = standardListFilter.f141771f;
    }

    @Override // de1.h
    public final void V() {
        if (isBound()) {
            nx.d0 pinalytics = getPinalytics();
            u0 u0Var = u0.SHOPPING_FILTER_SUBMIT_BUTTON;
            nm.u uVar = new nm.u();
            uVar.u(zd1.p.PRODUCT_FILTER_SOURCE.getSource(), this.f54665f.getSource());
            HashMap hashMap = new HashMap();
            String sVar = uVar.toString();
            Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
            hashMap.put("commerce_data", sVar);
            hashMap.put("pin_id", this.f54664e);
            pinalytics.Z(u0Var, hashMap);
            int H = g3.H(this.f54667h, null);
            a aVar = a.APPLY;
            if (H == 0) {
                I3();
                aVar = a.CLEAR;
            }
            c cVar = this.f54663d;
            if (cVar != null) {
                cVar.g2(this.f54670k, this.f54667h, H, aVar);
            }
            m60.u.f85943a.d(new jc0.q(true));
        }
    }

    @Override // be1.a
    public final void Z2(zd1.g multiSelectFilterData, boolean z13) {
        String str;
        Object obj;
        zd1.a0 a0Var;
        Object obj2;
        Intrinsics.checkNotNullParameter(multiSelectFilterData, "multiSelectFilterData");
        boolean z14 = multiSelectFilterData.f141721l;
        HashMap hashMap = this.f54668i;
        if (z14) {
            if (multiSelectFilterData.f141719j) {
                this.f54673n = multiSelectFilterData.f141712c;
                Iterator it = this.f54667h.iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    zd1.h hVar = (zd1.h) next;
                    if (g3.d2(multiSelectFilterData, hVar)) {
                        zd1.g gVar = hVar instanceof zd1.g ? (zd1.g) hVar : null;
                        if (gVar != null) {
                            gVar.f141719j = false;
                            dl2.b.u(hashMap).remove(gVar.f141713d);
                        }
                    }
                    if (!Intrinsics.d(hVar, multiSelectFilterData)) {
                        fc0.e.f61694b.post(new v.j(this, i13, hVar, 12));
                    }
                    i13 = i14;
                }
            } else {
                Iterator it2 = this.f54667h.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (g3.d2(multiSelectFilterData, (zd1.h) obj2)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                if (((zd1.h) obj2) == null) {
                    multiSelectFilterData.f141719j = true;
                    fc0.e.f61694b.post(new a11.p(14, this, multiSelectFilterData));
                }
            }
        }
        boolean z15 = multiSelectFilterData.f141719j;
        String str2 = multiSelectFilterData.f141713d;
        if (z15) {
            if (str2 != null) {
            }
        } else if (!z15 && str2 != null) {
        }
        if (!z13) {
            G3(multiSelectFilterData, multiSelectFilterData.f141710a);
        }
        zd1.c0 c0Var = this.f54671l;
        Iterator it3 = c0Var.getFilterSpecs().iterator();
        while (true) {
            boolean hasNext = it3.hasNext();
            str = multiSelectFilterData.f141714e;
            if (hasNext) {
                obj = it3.next();
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
            String[] strArr = {str, str2};
            int i15 = 0;
            while (true) {
                if (i15 >= 2) {
                    ArrayList A = kotlin.collections.c0.A(strArr);
                    String str3 = (String) A.get(0);
                    String str4 = (String) A.get(1);
                    t32.i iVar = multiSelectFilterData.f141718i;
                    c0Var.getFilterSpecs().add(new zd1.w(str3, kotlin.collections.f0.l(iVar != null ? new zd1.b0(str4, iVar) : new zd1.x(str4)), null));
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
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it4 = linkedHashMap.entrySet().iterator();
            while (it4.hasNext()) {
                arrayList.add((zd1.g) ((Map.Entry) it4.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                zd1.g gVar2 = (zd1.g) it5.next();
                String str5 = gVar2.f141713d;
                if (str5 != null) {
                    t32.i iVar2 = gVar2.f141718i;
                    a0Var = iVar2 != null ? new zd1.b0(str5, iVar2) : new zd1.x(str5);
                } else {
                    a0Var = null;
                }
                if (a0Var != null) {
                    arrayList2.add(a0Var);
                }
            }
            filterOptionList.addAll(arrayList2);
        }
        J3();
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        zd1.h hVar = (zd1.h) getItem(i13);
        if (hVar == null) {
            return -2;
        }
        switch (w.f54661a[hVar.b().ordinal()]) {
        }
        return -2;
    }

    @Override // de1.h
    public final void i() {
        c cVar = this.f54663d;
        if (cVar != null) {
            cVar.i();
        }
        m60.u.f85943a.d(new jc0.q(true));
    }

    @Override // de1.h
    public final void i3() {
        I3();
        getPinalytics().X(u0.SHOPPING_FILTER_CLEAR_BUTTON);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ae1.b
    public final void m3(zd1.b colorFilter) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(colorFilter, "colorFilter");
        ArrayList arrayList2 = this.f54667h;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof zd1.d) {
                arrayList3.add(next);
            }
        }
        zd1.d dVar = (zd1.d) CollectionsKt.firstOrNull(arrayList3);
        zd1.b bVar = null;
        if (dVar != null && (arrayList = dVar.f141703c) != null) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((zd1.b) next2).f141687f == colorFilter.f141687f) {
                    bVar = next2;
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
        this.f54669j = uVar;
        if (!z13) {
            nx.d0 pinalytics = getPinalytics();
            h32.g0 g0Var = h32.g0.SHOPPING_SORT_FILTER;
            u0 u0Var = u0.SHOPPING_SORT_FILTER_TABLE_CELL;
            nm.u uVar2 = new nm.u();
            uVar2.t("select", Boolean.valueOf(uVar == this.f54669j));
            uVar2.u("sort_type", sortFilter.f141764a);
            uVar2.u(zd1.p.PRODUCT_FILTER_SOURCE.getSource(), this.f54665f.getSource());
            HashMap hashMap = new HashMap();
            String sVar = uVar2.toString();
            Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
            hashMap.put("commerce_data", sVar);
            hashMap.put("pin_id", this.f54664e);
            pinalytics.h(g0Var, u0Var, hashMap);
        }
        this.f54670k.put("sort_type", String.valueOf(this.f54669j.getIndex()));
        ArrayList arrayList = this.f54667h;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof zd1.s) {
                arrayList2.add(next);
            }
        }
        zd1.s sVar2 = (zd1.s) CollectionsKt.firstOrNull(arrayList2);
        if (sVar2 == null) {
            return;
        }
        zd1.u uVar3 = this.f54669j;
        Intrinsics.checkNotNullParameter(uVar3, "<set-?>");
        sVar2.f141763d = uVar3;
    }

    @Override // be1.a
    public final void z(zd1.g multiSelectFilter, boolean z13) {
        Object obj;
        Intrinsics.checkNotNullParameter(multiSelectFilter, "multiSelectFilter");
        boolean z14 = multiSelectFilter.f141719j;
        HashMap hashMap = this.f54668i;
        String str = multiSelectFilter.f141716g;
        if (z14) {
            hashMap.putIfAbsent(str, multiSelectFilter);
        } else if (!z14) {
            hashMap.remove(str);
        }
        if (!z13) {
            G3(multiSelectFilter, multiSelectFilter.f141710a);
        }
        this.f54670k.put("domains", CollectionsKt.Z(hashMap.values(), null, null, null, 0, null, p.f54625m, 31));
        ArrayList arrayList = this.f54667h;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof zd1.g) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
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
