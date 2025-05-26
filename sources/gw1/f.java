package gw1;

import ha2.b0;
import ha2.c0;
import ha2.d0;
import ha2.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jc0.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import mw1.m;
import u80.s;
import yq1.u1;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66226a;

    /* renamed from: b, reason: collision with root package name */
    public final w f66227b;

    public f(w eventManager, int i13) {
        this.f66226a = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            this.f66227b = eventManager;
        } else if (i13 == 2) {
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            this.f66227b = eventManager;
        } else if (i13 != 3) {
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            this.f66227b = eventManager;
        } else {
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            this.f66227b = eventManager;
        }
    }

    public static b0 e(ww1.b metric, ww1.c cVar, List list, i iVar) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(metric, "metric");
        int i13 = ww1.d.f131195a[metric.ordinal()];
        if (i13 == 1) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                ww1.c cVar2 = (ww1.c) obj;
                if (!cVar2.isAVideoMetric() && !cVar2.isProductTagMetric()) {
                    arrayList.add(obj);
                }
            }
        } else if (i13 == 2) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((ww1.c) obj2).isAVideoMetric()) {
                    arrayList.add(obj2);
                }
            }
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (((ww1.c) obj3).isProductTagMetric()) {
                    arrayList.add(obj3);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
        int i14 = 0;
        for (Object obj4 : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                f0.p();
                throw null;
            }
            ww1.c cVar3 = (ww1.c) obj4;
            arrayList2.add(new c0(cVar3.getDescription(), i14, null, cVar3 == cVar, false, null, null, null, null, null, 4084));
            i14 = i15;
        }
        if ((true ^ arrayList2.isEmpty() ? arrayList2 : null) != null) {
            return new b0(new x(metric.getLabel(), null, null, null, null, 30), arrayList2, new fn1.k(iVar, list, arrayList, 9));
        }
        return null;
    }

    public final void a(List metricTypes) {
        Intrinsics.checkNotNullParameter(metricTypes, "metricTypes");
        u1 u1Var = new u1(this, 24);
        ArrayList arrayList = new ArrayList();
        List list = metricTypes;
        ArrayList arrayList2 = new ArrayList(g0.q(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            ww1.c cVar = (ww1.c) obj;
            arrayList2.add(new c0(cVar.getDescription(), i13, null, false, false, null, null, Integer.valueOf(cVar.getMetricInfo()), null, null, 3956));
            i13 = i14;
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new b0(null, arrayList2, new s(14, metricTypes, u1Var)));
        }
        Integer valueOf = Integer.valueOf(com.pinterest.partnerAnalytics.g.more_info_modal_title);
        int i15 = eo1.c.space_400;
        this.f66227b.d(new v(new lp.k(new ha2.a((List) arrayList, false, valueOf, new d0(i15, eo1.c.space_0, i15, eo1.c.space_900))), false, 0L, 30));
    }

    public final void b(m splitSelected, List splitTypes, ow1.f action) {
        Intrinsics.checkNotNullParameter(splitSelected, "splitSelected");
        Intrinsics.checkNotNullParameter(splitTypes, "splitTypes");
        Intrinsics.checkNotNullParameter(action, "action");
        i iVar = new i(5, action, this);
        List list = splitTypes;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        int i13 = 0;
        while (true) {
            Integer num = null;
            if (!it.hasNext()) {
                this.f66227b.d(new v(new lp.k(new ha2.a(e0.b(new b0(new x(com.pinterest.partnerAnalytics.g.split_title, null, null, null, null, 30), arrayList, iVar)), false, num, 14)), false, 0L, 30));
                return;
            }
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            m mVar = (m) next;
            arrayList.add(new c0(mVar.f88443b, i13, null, Intrinsics.d(splitSelected, mVar), false, null, null, null, null, null, 4084));
            i13 = i14;
        }
    }

    public final void c(ww1.c selectedMetricType, List metricTypes, Function1 action) {
        int i13 = this.f66226a;
        w wVar = this.f66227b;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(selectedMetricType, "selectedMetricType");
                Intrinsics.checkNotNullParameter(metricTypes, "metricTypes");
                Intrinsics.checkNotNullParameter(action, "action");
                wVar.d(new v(new lp.k(d(selectedMetricType, metricTypes, new i(0, action, this))), false, 0L, 30));
                break;
            default:
                Intrinsics.checkNotNullParameter(selectedMetricType, "selectedMetricType");
                Intrinsics.checkNotNullParameter(metricTypes, "metricTypes");
                Intrinsics.checkNotNullParameter(action, "action");
                wVar.d(new v(new lp.k(d(selectedMetricType, metricTypes, new i(4, action, this))), false, 0L, 30));
                break;
        }
    }

    public final ha2.a d(ww1.c selectedMetricType, List metricTypes, i action) {
        boolean z13 = false;
        Integer num = null;
        switch (this.f66226a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                List list = metricTypes;
                int i13 = 10;
                ArrayList arrayList2 = new ArrayList(g0.q(list, 10));
                int i14 = 0;
                for (Object obj : list) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    ww1.c cVar = (ww1.c) obj;
                    arrayList2.add(new c0(cVar.getDescription(), i14, null, cVar == selectedMetricType ? true : z13, false, null, null, null, null, null, 4084));
                    i14 = i15;
                    z13 = false;
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new b0(null, arrayList2, new s(15, metricTypes, action)));
                }
                return new ha2.a((List) arrayList, false, Integer.valueOf(com.pinterest.partnerAnalytics.g.metric_definition_title), i13);
            default:
                Intrinsics.checkNotNullParameter(selectedMetricType, "selectedMetricType");
                Intrinsics.checkNotNullParameter(metricTypes, "metricTypes");
                Intrinsics.checkNotNullParameter(action, "action");
                b0 e13 = e(ww1.b.OVERALL_METRICS, selectedMetricType, metricTypes, action);
                b0 e14 = e(ww1.b.VIDEO_METRICS, selectedMetricType, metricTypes, action);
                b0 e15 = e(ww1.b.PRODUCT_TAG_METRICS, selectedMetricType, metricTypes, action);
                ArrayList arrayList3 = new ArrayList();
                if (e13 != null) {
                    arrayList3.add(e13);
                }
                if (e14 != null) {
                    arrayList3.add(e14);
                }
                if (e15 != null) {
                    arrayList3.add(e15);
                }
                return new ha2.a(arrayList3, z13, num, 14);
        }
    }
}
