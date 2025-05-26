package tq0;

import h32.c3;
import h32.f1;
import h32.g0;
import h32.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.o0;

/* loaded from: classes5.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f118990c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f118991d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f118992e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f118993f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f118994g;

    public /* synthetic */ c(pb0.a aVar, d0 d0Var, o0 o0Var, g0 g0Var, dx0.d dVar, int i13) {
        this(aVar, d0Var, o0Var, (i13 & 8) != 0 ? null : g0Var, (i13 & 16) != 0 ? null : dVar);
    }

    @Override // tq0.b
    public final void i() {
        ArrayList arrayList = this.f118991d;
        switch (this.f118990c) {
            case 0:
                arrayList.clear();
                break;
            default:
                arrayList.clear();
                break;
        }
    }

    @Override // tq0.b
    public final void l(Object impression) {
        ArrayList arrayList = this.f118991d;
        switch (this.f118990c) {
            case 0:
                Intrinsics.checkNotNullParameter(impression, "impression");
                boolean z13 = impression instanceof t;
                if (z13 || (impression instanceof nx.e)) {
                    if (impression instanceof nx.e) {
                        nx.e eVar = (nx.e) impression;
                        arrayList.add(nx.e.a(eVar, r(eVar)));
                    } else if (z13) {
                        arrayList.add(new nx.e((t) impression, null));
                    }
                    if (!arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((nx.e) it.next()).f92388a);
                        }
                        ((o0) this.f118992e).g(arrayList2);
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(impression, "impression");
                if (impression instanceof c3) {
                    arrayList.add(impression);
                    break;
                }
                break;
        }
    }

    @Override // tq0.b
    public final void m(Object impression) {
        switch (this.f118990c) {
            case 0:
                Intrinsics.checkNotNullParameter(impression, "impression");
                boolean z13 = impression instanceof t;
                if (z13 || (impression instanceof nx.e)) {
                    if (!(impression instanceof nx.e)) {
                        if (z13) {
                            o0 o0Var = (o0) this.f118992e;
                            t boardImpression = (t) impression;
                            o0Var.getClass();
                            Intrinsics.checkNotNullParameter(boardImpression, "boardImpression");
                            String str = boardImpression.f67244a;
                            if (str != null && str.length() != 0) {
                                ArrayList arrayList = o0Var.f92442e;
                                if (!arrayList.contains(str)) {
                                    arrayList.add(str);
                                    break;
                                }
                            }
                        }
                    } else {
                        o0 o0Var2 = (o0) this.f118992e;
                        t boardImpression2 = ((nx.e) impression).f92388a;
                        o0Var2.getClass();
                        Intrinsics.checkNotNullParameter(boardImpression2, "boardImpression");
                        String str2 = boardImpression2.f67244a;
                        if (str2 != null && str2.length() != 0) {
                            ArrayList arrayList2 = o0Var2.f92442e;
                            if (!arrayList2.contains(str2)) {
                                arrayList2.add(str2);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                super.m(impression);
                break;
        }
    }

    @Override // tq0.b
    public final void n(ArrayList impressions) {
        switch (this.f118990c) {
            case 0:
                Intrinsics.checkNotNullParameter(impressions, "impressions");
                if (!impressions.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : impressions) {
                        if ((obj instanceof nx.e) || (obj instanceof t)) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ArrayList arrayList2 = this.f118991d;
                            if (hasNext) {
                                Object next = it.next();
                                if (next instanceof nx.e) {
                                    nx.e eVar = (nx.e) next;
                                    arrayList2.add(nx.e.a(eVar, r(eVar)));
                                } else if (next instanceof t) {
                                    arrayList2.add(new nx.e((t) next, null));
                                }
                            } else if (!arrayList2.isEmpty()) {
                                ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(arrayList2, 10));
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(((nx.e) it2.next()).f92388a);
                                }
                                ((o0) this.f118992e).g(arrayList3);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                super.n(impressions);
                break;
        }
    }

    @Override // tq0.b
    public final void o(ArrayList impressions) {
        switch (this.f118990c) {
            case 0:
                Intrinsics.checkNotNullParameter(impressions, "impressions");
                if (!impressions.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : impressions) {
                        if ((obj instanceof nx.e) || (obj instanceof t)) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (next instanceof nx.e) {
                                arrayList2.add(next);
                            } else if (next instanceof t) {
                                arrayList2.add(new nx.e((t) next, null));
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            ArrayList arrayList3 = this.f118991d;
                            ArrayList impressions2 = new ArrayList(kotlin.collections.g0.q(arrayList3, 10));
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                impressions2.add(((nx.e) it2.next()).f92388a);
                            }
                            o0 o0Var = (o0) this.f118992e;
                            o0Var.getClass();
                            Intrinsics.checkNotNullParameter(impressions2, "impressions");
                            Iterator it3 = impressions2.iterator();
                            while (it3.hasNext()) {
                                String str = ((t) it3.next()).f67244a;
                                if (str != null && str.length() != 0) {
                                    ArrayList arrayList4 = o0Var.f92442e;
                                    if (!arrayList4.contains(str)) {
                                        arrayList4.add(str);
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                super.o(impressions);
                break;
        }
    }

    @Override // tq0.b
    public final void p() {
        ArrayList arrayList = this.f118991d;
        d0 d0Var = this.f118989b;
        switch (this.f118990c) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    nx.e eVar = (nx.e) it.next();
                    d0Var.r((g0) this.f118993f, f1.BOARD_IMPRESSION_ONE_PIXEL, eVar.f92389b, f0.l(eVar.f92388a));
                }
                break;
            default:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    c3 c3Var = (c3) it2.next();
                    Boolean bool = (Boolean) ((HashMap) this.f118994g).get(c3Var.f66936e);
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    HashMap hashMap = (HashMap) this.f118992e;
                    hashMap.put("grid_index", String.valueOf(c3Var.f66935d));
                    String str = c3Var.f66936e;
                    bs1.c.G1("today_article_id", str, hashMap);
                    if (CollectionsKt.L((ArrayList) this.f118993f, str)) {
                        hashMap.put("is_video", "true");
                    } else {
                        hashMap.put("is_video", "false");
                    }
                    d0Var.y(booleanValue ? g0.CURATED_ARTICLE : g0.TODAY_ARTICLE, f1.TODAY_ARTICLE_IMPRESSION_ONE_PIXEL, (HashMap) this.f118992e, f0.d(c3Var));
                }
                break;
        }
    }

    public final HashMap r(nx.e eVar) {
        Function1 function1;
        HashMap hashMap;
        String str = eVar.f92388a.f67244a;
        HashMap hashMap2 = eVar.f92389b;
        if (str == null || (function1 = (Function1) this.f118994g) == null || (hashMap = (HashMap) function1.invoke(str)) == null) {
            return hashMap2;
        }
        HashMap o13 = bs1.c.o(new Pair[0]);
        bs1.c.E1(o13, hashMap);
        if (hashMap2 != null) {
            o13.putAll(hashMap2);
        }
        return o13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pb0.a clock, d0 pinalytics, o0 pinalyticsManager, g0 g0Var, Function1 function1) {
        super(clock, pinalytics);
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        this.f118992e = pinalyticsManager;
        this.f118993f = g0Var;
        this.f118994g = function1;
        this.f118991d = new ArrayList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pb0.g clock, d0 pinalytics) {
        super(clock, pinalytics);
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f118991d = new ArrayList();
        this.f118992e = new HashMap();
        this.f118993f = new ArrayList();
        this.f118994g = new HashMap();
    }
}
