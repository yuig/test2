package n70;

import com.pinterest.api.model.f30;
import df.j1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kh2.g3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o82.h1;
import o82.n1;
import o82.p1;
import o82.y0;

/* loaded from: classes5.dex */
public final class n0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.d f89630b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.d f89631c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.h0 f89632d;

    public n0(o82.i0 multiSectionStateTransformer, lt.j pinalyticsTransformer) {
        Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsTransformer, "pinalyticsTransformer");
        this.f89630b = multiSectionStateTransformer;
        this.f89631c = pinalyticsTransformer;
        this.f89632d = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: n70.j0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((a) obj).f89596b;
            }
        }, new kotlin.jvm.internal.d0() { // from class: n70.k0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((o0) obj).f89646l;
            }
        }, l0.f89623j);
    }

    public static ArrayList g(int i13, l82.e eVar) {
        List list = ((y0) ((a) eVar.f82218a).f89596b.f93524a.get(i13)).f93756a;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((o82.u0) it.next()).f93721a);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof o70.a) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static h32.i0 h(l82.e eVar, h32.u0 u0Var) {
        return u0Var != null ? h32.i0.a(((o0) eVar.f82219b).f89647m.f143086a, null, null, null, u0Var, 95) : ((o0) eVar.f82219b).f89647m.f143086a;
    }

    public static HashMap i(l82.e eVar) {
        HashMap hashMap = new HashMap();
        String str = ((o0) eVar.f82219b).f89635a;
        if (str != null) {
        }
        String str2 = ((o0) eVar.f82219b).f89636b;
        if (str2 != null) {
            hashMap.put("board_session_id", str2);
        }
        return hashMap;
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        o0 vmState = (o0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.c0 c13 = this.f89630b.c(vmState.f89646l);
        l82.c0 c14 = this.f89631c.c(vmState.f89647m);
        List list = c14.f82214c;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new g0((zy.k0) it.next()));
        }
        List list2 = c13.f82214c;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new h0((o82.h0) it2.next()));
        }
        return new l82.c0(new a(new LinkedHashMap(), (o82.a0) c13.f82212a, (zy.a0) c14.f82212a, kotlin.collections.q0.f80391a, null), o0.b(vmState, null, 0, (o82.j0) c13.f82213b, (zy.l0) c14.f82213b, 2047), CollectionsKt.l0(arrayList2, arrayList));
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        int i13;
        int i14 = 0;
        m event = (m) sVar;
        a priorDisplayState = (a) oVar;
        o0 priorVMState = (o0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        boolean z13 = event instanceof d;
        l82.h0 lens = this.f89632d;
        if (z13) {
            ((d) event).getClass();
            resultBuilder.b(kotlin.collections.e0.b(new y(false)));
            boolean U0 = j1.U0(priorVMState.f89639e);
            h1 h1Var = h1.f93609a;
            n1 n1Var = n1.f93676a;
            if (U0) {
                o82.g0[] events = {new o82.f0(2, n1Var), new o82.f0(2, h1Var)};
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(lens, "lens");
                Intrinsics.checkNotNullParameter(events, "events");
                Intrinsics.checkNotNullParameter(events, "$events");
                Intrinsics.checkNotNullParameter(lens, "$lens");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                int length = events.length;
                while (i14 < length) {
                    lens.a(events[i14], resultBuilder);
                    i14++;
                }
                resultBuilder.h(q.f89664u);
            } else if (j1.U0(priorVMState.f89638d)) {
                o82.g0[] events2 = {new o82.f0(1, n1Var), new o82.f0(1, h1Var)};
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(lens, "lens");
                Intrinsics.checkNotNullParameter(events2, "events");
                Intrinsics.checkNotNullParameter(events2, "$events");
                Intrinsics.checkNotNullParameter(lens, "$lens");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                int length2 = events2.length;
                while (i14 < length2) {
                    lens.a(events2[i14], resultBuilder);
                    i14++;
                }
                resultBuilder.h(q.f89665v);
            } else {
                o82.g0[] events3 = {new o82.f0(0, n1Var), new o82.f0(0, h1Var)};
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(lens, "lens");
                Intrinsics.checkNotNullParameter(events3, "events");
                Intrinsics.checkNotNullParameter(events3, "$events");
                Intrinsics.checkNotNullParameter(lens, "$lens");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                int length3 = events3.length;
                while (i14 < length3) {
                    lens.a(events3[i14], resultBuilder);
                    i14++;
                }
                resultBuilder.h(q.f89666w);
            }
        } else if (event instanceof f) {
            HashMap hashMap = new HashMap();
            f fVar = (f) event;
            boolean containsKey = priorDisplayState.f89595a.containsKey(fVar.f89608a.getUid());
            hashMap.put("reason", containsKey ? "PIN_DELETE" : "PIN_REPIN");
            f30 f30Var = fVar.f89608a;
            if (containsKey) {
                f30 f30Var2 = (f30) priorDisplayState.f89595a.get(f30Var.getUid());
                if (f30Var2 != null) {
                    l82.h e0Var = new e0(f30Var2);
                    i13 = 0;
                    resultBuilder.d(e0Var);
                } else {
                    i13 = 0;
                }
                resultBuilder.f(new m0(event, i13));
            } else {
                resultBuilder.d(new f0(f30Var, priorVMState.f89635a));
                resultBuilder.f(new m0(event, 1));
            }
            ArrayList g13 = g(priorVMState.f89645k, resultBuilder);
            ArrayList arrayList = new ArrayList();
            Iterator it = g13.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (Intrinsics.d(((o70.a) next).f93223a.getUid(), f30Var.getUid())) {
                    arrayList.add(next);
                }
            }
            ArrayList events4 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
            for (Iterator it2 = arrayList.iterator(); it2.hasNext(); it2 = it2) {
                events4.add(new o82.f0(priorVMState.f89645k, new p1(o70.a.b((o70.a) it2.next(), false, !r3.f93225c, 3))));
            }
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(events4, "events");
            Intrinsics.checkNotNullParameter(events4, "$events");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            Iterator it3 = events4.iterator();
            while (it3.hasNext()) {
                lens.a((u50.s) it3.next(), resultBuilder);
            }
        } else if (event instanceof i) {
            resultBuilder.f(new m0(event, 2));
            resultBuilder.d(new a0(h(resultBuilder, h32.u0.ONE_TAP_SAVE_BUTTON), i(resultBuilder)));
        } else if (event instanceof h) {
            resultBuilder.d(new b0(h(resultBuilder, h32.u0.ONE_TAP_SAVE_BUTTON), i(resultBuilder)));
        } else if (event instanceof b) {
            resultBuilder.f(q.f89667x);
        } else if (event instanceof j) {
            ArrayList g14 = g(priorVMState.f89645k, resultBuilder);
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = g14.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                if (Intrinsics.d(((o70.a) next2).f93223a.getUid(), ((j) event).f89618a)) {
                    arrayList2.add(next2);
                }
            }
            ArrayList events5 = new ArrayList(kotlin.collections.g0.q(arrayList2, 10));
            for (Iterator it5 = arrayList2.iterator(); it5.hasNext(); it5 = it5) {
                events5.add(new o82.f0(priorVMState.f89645k, new p1(o70.a.b((o70.a) it5.next(), true, false, 5))));
            }
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(events5, "events");
            Intrinsics.checkNotNullParameter(events5, "$events");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            Iterator it6 = events5.iterator();
            while (it6.hasNext()) {
                lens.a((u50.s) it6.next(), resultBuilder);
            }
        } else if (event instanceof l) {
            o82.g0 event2 = ((l) event).f89622a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(event2, "event");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(event2, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens.a(event2, resultBuilder);
        } else if (event instanceof e) {
            resultBuilder.d(new z(h(resultBuilder, h32.u0.BACK_BUTTON), i(resultBuilder)));
        } else if (event instanceof k) {
            l82.c0 e13 = this.f89631c.e(((k) event).f89620a, priorDisplayState.f89597c, priorVMState.f89647m);
            resultBuilder.f(new ns.f0(e13, 9));
            resultBuilder.h(new ns.f0(e13, 10));
            List list = e13.f82214c;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list, 10));
            Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                arrayList3.add(new g0((zy.k0) it7.next()));
            }
            resultBuilder.b(arrayList3);
        } else if (event instanceof g) {
            ArrayList g15 = g(priorVMState.f89645k, resultBuilder);
            ArrayList arrayList4 = new ArrayList();
            Iterator it8 = g15.iterator();
            while (it8.hasNext()) {
                Object next3 = it8.next();
                o70.a aVar = (o70.a) next3;
                Iterator it9 = it8;
                g gVar = (g) event;
                if (Intrinsics.d(aVar.f93223a.getUid(), gVar.f89611a) || Intrinsics.d(aVar.f93223a.z4(), gVar.f89612b)) {
                    arrayList4.add(next3);
                }
                it8 = it9;
            }
            resultBuilder.f(new hs.a(28, arrayList4, event));
            ArrayList events6 = new ArrayList(kotlin.collections.g0.q(arrayList4, 10));
            for (Iterator it10 = arrayList4.iterator(); it10.hasNext(); it10 = it10) {
                events6.add(new o82.f0(priorVMState.f89645k, new p1(o70.a.b((o70.a) it10.next(), false, !r3.f93225c, 3))));
            }
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(events6, "events");
            Intrinsics.checkNotNullParameter(events6, "$events");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            Iterator it11 = events6.iterator();
            while (it11.hasNext()) {
                lens.a((u50.s) it11.next(), resultBuilder);
            }
        } else if (event instanceof c) {
            ArrayList arrayList5 = ((c) event).f89605a;
            zd1.c0 c0Var = new zd1.c0(new ArrayList());
            g3.D2(c0Var, arrayList5, true, true);
            resultBuilder.h(new mz.c(c0Var, 13));
            List events7 = kotlin.collections.f0.j(new o82.b0(false), o82.d0.f93560a);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(events7, "events");
            Intrinsics.checkNotNullParameter(events7, "$events");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            Iterator it12 = events7.iterator();
            while (it12.hasNext()) {
                lens.a((u50.s) it12.next(), resultBuilder);
            }
        }
        return resultBuilder.e();
    }
}
