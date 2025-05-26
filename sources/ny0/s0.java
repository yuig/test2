package ny0;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import la0.l1;
import o82.h1;
import o82.i2;
import o82.m1;
import o82.n1;
import o82.o1;
import o82.p1;
import o82.q1;

/* loaded from: classes5.dex */
public final class s0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f92622b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.h0 f92623c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.h0 f92624d;

    public s0(o82.i0 listTransformer, lt.j pinalyticsTransformer, lt.j impressionTransformer) {
        Intrinsics.checkNotNullParameter(listTransformer, "listTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsTransformer, "pinalyticsTransformer");
        Intrinsics.checkNotNullParameter(impressionTransformer, "impressionTransformer");
        this.f92622b = b(listTransformer, new kotlin.jvm.internal.d0() { // from class: ny0.o0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((f) obj).f92583a;
            }
        }, new kotlin.jvm.internal.d0() { // from class: ny0.p0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((t0) obj).f92627a;
            }
        }, n0.f92607k);
        this.f92623c = b(pinalyticsTransformer, new kotlin.jvm.internal.d0() { // from class: ny0.q0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((f) obj).f92586d;
            }
        }, new kotlin.jvm.internal.d0() { // from class: ny0.r0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((t0) obj).f92628b;
            }
        }, n0.f92608l);
        this.f92624d = b(impressionTransformer, new kotlin.jvm.internal.d0() { // from class: ny0.l0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((f) obj).f92587e;
            }
        }, new kotlin.jvm.internal.d0() { // from class: ny0.m0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((t0) obj).f92628b;
            }
        }, n0.f92606j);
    }

    public static boolean g(o82.y0 y0Var) {
        List list = y0Var.f93756a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((o82.u0) it.next()).f93721a instanceof a1) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void i(s0 s0Var, l82.e eVar, f1 f1Var, h32.u0 u0Var, nx.d dVar, int i13) {
        s0Var.h((i13 & 8) != 0 ? null : dVar, (i13 & 2) != 0 ? null : u0Var, f1Var, eVar, null);
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        t0 vmState = (t0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e resultBuilder = new l82.e(new f(new o82.a0(), f.f92582h, new bb2.e(0.0f, (bb2.f) null, 7), new zy.a0(), zy.b.f143058a, null), vmState, kotlin.collections.e0.b(d0.f92572a));
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        l82.h0 lens = this.f92622b;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        resultBuilder.a(a.f92549a);
        return resultBuilder.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        Map map;
        int i13;
        f30 f30Var;
        List list;
        o82.u0 u0Var;
        int i14 = 0;
        p event = (p) sVar;
        f priorDisplayState = (f) oVar;
        t0 priorVMState = (t0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        boolean z13 = event instanceof k;
        int i15 = -1;
        l82.h0 lens = this.f92622b;
        if (z13) {
            o82.g0 event2 = ((k) event).f92600a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(event2, "event");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(event2, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens.a(event2, resultBuilder);
            List list2 = ((f) resultBuilder.f82218a).f92583a.f93524a;
            boolean z14 = event2 instanceof o82.f0;
            if (z14) {
                o82.f0 f0Var = (o82.f0) event2;
                if (f0Var.f93580b instanceof m1) {
                    int i16 = f0Var.f93579a;
                    if (g((o82.y0) list2.get(i16)) || i16 == 0) {
                        resultBuilder.a(d0.f92572a);
                    }
                }
            }
            Integer num = ((t0) resultBuilder.f82219b).f92630d;
            if (num != null) {
                int intValue = num.intValue();
                if (z14) {
                    o82.f0 f0Var2 = (o82.f0) event2;
                    q1 q1Var = f0Var2.f93580b;
                    o82.f1 f1Var = q1Var instanceof o82.f1 ? (o82.f1) q1Var : null;
                    if (f1Var != null && f1Var.f93581a == 0 && intValue == f0Var2.f93579a) {
                        o82.y0 y0Var = (o82.y0) CollectionsKt.U(intValue, ((f) resultBuilder.f82218a).f92583a.f93524a);
                        l82.i0 i0Var2 = (y0Var == null || (list = y0Var.f93756a) == null || (u0Var = (o82.u0) CollectionsKt.firstOrNull(list)) == null) ? null : u0Var.f93721a;
                        a1 a1Var = i0Var2 instanceof a1 ? (a1) i0Var2 : null;
                        Iterator it = ((f) resultBuilder.f82218a).f92583a.e().f93756a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            l82.i0 i0Var3 = ((o82.u0) it.next()).f93721a;
                            a1 a1Var2 = i0Var3 instanceof a1 ? (a1) i0Var3 : null;
                            if (a1Var2 != null) {
                                if (Intrinsics.d(a1Var2.f92550a.getUid(), (a1Var == null || (f30Var = a1Var.f92550a) == null) ? null : f30Var.getUid()) && Intrinsics.d(a1Var2.f92552c, a1Var.f92552c)) {
                                    i15 = i14;
                                    break;
                                }
                            }
                            i14++;
                        }
                        resultBuilder.f(new zx0.d(i15, 2));
                        resultBuilder.h(d.f92569m);
                    }
                }
            }
        } else if (event instanceof j) {
            ll1.d event3 = ((j) event).f92598a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens2 = this.f92623c;
            Intrinsics.checkNotNullParameter(lens2, "lens");
            Intrinsics.checkNotNullParameter(event3, "event");
            Intrinsics.checkNotNullParameter(lens2, "$lens");
            Intrinsics.checkNotNullParameter(event3, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens2.a(event3, resultBuilder);
        } else if (event instanceof o) {
            zy.l event4 = ((o) event).f92610a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens3 = this.f92624d;
            Intrinsics.checkNotNullParameter(lens3, "lens");
            Intrinsics.checkNotNullParameter(event4, "event");
            Intrinsics.checkNotNullParameter(lens3, "$lens");
            Intrinsics.checkNotNullParameter(event4, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens3.a(event4, resultBuilder);
        } else if (event instanceof l) {
            a1 a1Var3 = ((l) event).f92601a;
            boolean z15 = !a1Var3.f92551b;
            f1 f1Var2 = f1.TAP;
            h32.u0 u0Var2 = h32.u0.USE_CASE_PIN;
            f30 f30Var2 = a1Var3.f92550a;
            h(bs1.c.p(new Pair("selected", String.valueOf(z15))), u0Var2, f1Var2, resultBuilder, f30Var2.getUid());
            f1 f1Var3 = z15 ? f1.SELECT : f1.UNSELECT;
            String uid = f30Var2.getUid();
            String str = a1Var3.f92552c;
            h(bs1.c.p(new Pair("use_case_id", str)), u0Var2, f1Var3, resultBuilder, uid);
            resultBuilder.d(new f0(f30Var2, str, ((t0) resultBuilder.f82219b).f92628b.f143086a.f67082b, !r1.f92629c));
        } else if (event instanceof n) {
            String str2 = ((n) event).f92605a;
            List list3 = ((t0) resultBuilder.f82219b).f92627a.f93634a;
            Iterator it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i14 = -1;
                    break;
                }
                i2 i2Var = (i2) it2.next();
                Object obj = i2Var.f93619a;
                z0 z0Var = obj instanceof z0 ? (z0) obj : null;
                if (Intrinsics.d(z0Var != null ? z0Var.f92658a : null, str2) && (i2Var.f93620b instanceof o82.k)) {
                    break;
                }
                i14++;
            }
            ListIterator listIterator = list3.listIterator(list3.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i13 = -1;
                    break;
                }
                Object obj2 = ((i2) listIterator.previous()).f93619a;
                z0 z0Var2 = obj2 instanceof z0 ? (z0) obj2 : null;
                if (Intrinsics.d(z0Var2 != null ? z0Var2.f92658a : null, str2)) {
                    i13 = listIterator.nextIndex();
                    break;
                }
            }
            if (i14 > -1) {
                bk.f.H(new o82.f0(i14, n1.f93676a), resultBuilder, lens);
                bk.f.H(new o82.f0(i14, h1.f93609a), resultBuilder, lens);
                if (i14 == i13) {
                    bk.f.H(new o82.f0(i13 + 1, o82.d1.f93561a), resultBuilder, lens);
                }
                t0 t0Var = (t0) resultBuilder.f82219b;
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                Intrinsics.checkNotNullParameter("enabled_autoscroll", "group");
                String str3 = (String) t0Var.f92631e.get("ap_nux_showmore_autoscroll_android");
                if (str3 != null && kotlin.text.z.i(str3, "enabled_autoscroll", true)) {
                    resultBuilder.h(new zx0.d(i14, 1));
                }
            }
            i(this, resultBuilder, f1.TAP, h32.u0.SHOW_MORE_BUTTON, bs1.c.p(new Pair("use_case_id", str2)), 4);
        } else if (event instanceof i) {
            i(this, resultBuilder, f1.TAP, h32.u0.NEXT_BUTTON, null, 12);
            i(this, resultBuilder, f1.NUX_STEP_END, null, null, 14);
            resultBuilder.a(e0.f92579a);
        } else if (event instanceof h) {
            i(this, resultBuilder, f1.TAP, h32.u0.BACK_BUTTON, null, 12);
        } else if (event instanceof m) {
            qy0.a aVar = ((m) event).f92603a;
            a0 yVar = aVar.f105347i ? x.f92653a : new y(aVar.f105342d - aVar.f105346h.size());
            boolean d2 = Intrinsics.d(((o82.y0) ((f) resultBuilder.f82218a).f92583a.f93524a.get(0)).f93757b, o82.t.f93712e);
            o82.u0 u0Var3 = (o82.u0) CollectionsKt.firstOrNull(((o82.y0) ((f) resultBuilder.f82218a).f92583a.f93524a.get(0)).f93756a);
            boolean d13 = true ^ Intrinsics.d(yVar, u0Var3 != null ? u0Var3.f93721a : null);
            if (d2 && d13) {
                o82.f0 event5 = new o82.f0(0, new o1(yVar));
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(lens, "lens");
                Intrinsics.checkNotNullParameter(event5, "event");
                Intrinsics.checkNotNullParameter(lens, "$lens");
                Intrinsics.checkNotNullParameter(event5, "$event");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                lens.a(event5, resultBuilder);
            }
            kotlin.collections.t0 M0 = CollectionsKt.M0(((f) resultBuilder.f82218a).f92583a.f93524a);
            ArrayList arrayList = new ArrayList();
            Iterator it3 = M0.iterator();
            while (true) {
                q5.x0 x0Var = (q5.x0) it3;
                if (!x0Var.hasNext()) {
                    break;
                }
                Object next = x0Var.next();
                if (g((o82.y0) ((IndexedValue) next).f80350b)) {
                    arrayList.add(next);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                IndexedValue indexedValue = (IndexedValue) it4.next();
                int i17 = indexedValue.f80349a;
                List list4 = ((o82.y0) indexedValue.f80350b).f93756a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it5 = list4.iterator();
                while (it5.hasNext()) {
                    l82.i0 i0Var4 = ((o82.u0) it5.next()).f93721a;
                    a1 a1Var4 = i0Var4 instanceof a1 ? (a1) i0Var4 : null;
                    if (a1Var4 != null) {
                        arrayList2.add(a1Var4);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it6 = arrayList2.iterator();
                while (true) {
                    boolean hasNext = it6.hasNext();
                    map = aVar.f105348j;
                    if (!hasNext) {
                        break;
                    }
                    Object next2 = it6.next();
                    Iterator it7 = it4;
                    a1 a1Var5 = (a1) next2;
                    Iterator it8 = it6;
                    boolean z16 = a1Var5.f92551b;
                    List list5 = (List) map.get(a1Var5.f92552c);
                    if (z16 != (list5 != null ? list5 : kotlin.collections.s0.f80394a).contains(a1Var5.f92550a.getUid())) {
                        arrayList3.add(next2);
                    }
                    it4 = it7;
                    it6 = it8;
                }
                Iterator it9 = it4;
                ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(arrayList3, 10));
                Iterator it10 = arrayList3.iterator();
                while (it10.hasNext()) {
                    a1 a1Var6 = (a1) it10.next();
                    List list6 = (List) map.get(a1Var6.f92552c);
                    List list7 = list6 != null ? list6 : kotlin.collections.s0.f80394a;
                    f30 pin = a1Var6.f92550a;
                    Iterator it11 = it10;
                    boolean contains = list7.contains(pin.getUid());
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    String useCaseId = a1Var6.f92552c;
                    Intrinsics.checkNotNullParameter(useCaseId, "useCaseId");
                    arrayList4.add(new a1(pin, useCaseId, contains));
                    it10 = it11;
                }
                Iterator it12 = arrayList4.iterator();
                while (it12.hasNext()) {
                    o82.f0 event6 = new o82.f0(i17, new p1((a1) it12.next()));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(lens, "lens");
                    Intrinsics.checkNotNullParameter(event6, "event");
                    Intrinsics.checkNotNullParameter(lens, "$lens");
                    Intrinsics.checkNotNullParameter(event6, "$event");
                    Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                    lens.a(event6, resultBuilder);
                }
                it4 = it9;
            }
            resultBuilder.f(new dx0.d(aVar, 11));
        } else if (event instanceof g) {
            resultBuilder.f(d.f92568l);
        }
        return resultBuilder.e();
    }

    public final void h(nx.d dVar, h32.u0 u0Var, f1 f1Var, l82.e eVar, String str) {
        eVar.a(new j0(new zy.e0(new zy.a(com.bumptech.glide.d.z0(((t0) eVar.f82219b).f92628b.f143086a, new l1(u0Var, 2)), f1Var, str, dVar, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM))));
    }
}
