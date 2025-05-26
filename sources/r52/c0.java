package r52;

import com.pinterest.api.model.iw;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import l82.e0;
import l82.f0;
import l82.h0;
import o82.i0;
import o82.m1;
import o82.p1;
import o82.u0;
import o82.y0;
import zy.l0;

/* loaded from: classes4.dex */
public final class c0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.d f106269b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f106270c;

    public c0(i0 listTransformer, lt.j pinalyticsTransformer) {
        Intrinsics.checkNotNullParameter(listTransformer, "listTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsTransformer, "pinalyticsTransformer");
        this.f106269b = pinalyticsTransformer;
        this.f106270c = b(listTransformer, new kotlin.jvm.internal.d0() { // from class: r52.x
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((g) obj).f106283a;
            }
        }, new kotlin.jvm.internal.d0() { // from class: r52.y
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((d0) obj).f106276c;
            }
        }, z.f106304i);
    }

    public static final ArrayList g(c0 c0Var, g gVar) {
        c0Var.getClass();
        List list = ((y0) gVar.f106283a.f93524a.get(0)).f93756a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof u0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((a) ((u0) next).f93721a).f106257b) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(g0.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((a) ((u0) it2.next()).f93721a).f106256a);
        }
        return arrayList3;
    }

    public static final f h(c0 c0Var, l82.e eVar) {
        Object obj;
        c0Var.getClass();
        d0 d0Var = (d0) eVar.f82219b;
        ArrayList i13 = i(eVar);
        List<String> list = d0Var.f106279f;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (String str : list) {
            Iterator it = i13.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((a) obj).f106256a.getUid(), str)) {
                    break;
                }
            }
            arrayList.add((a) obj);
        }
        ArrayList Q = CollectionsKt.Q(arrayList);
        List list2 = d0Var.f106279f;
        if (list2.size() == 0) {
            return e.f106281a;
        }
        int size = list2.size();
        int i14 = d0Var.f106278e;
        if (size == i14) {
            return new c(i14, Q);
        }
        return list2.size() < 5 ? new b(list2.size(), i14, Q) : new d(list2.size(), i14, Q);
    }

    public static ArrayList i(l82.e eVar) {
        List list = ((y0) ((g) eVar.f82218a).f106283a.f93524a.get(0)).f93756a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof u0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((a) ((u0) it.next()).f93721a);
        }
        return arrayList2;
    }

    public static HashMap j(d0 d0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("board_id", d0Var.f106274a);
        hashMap.put("template_id", d0Var.f106275b);
        return hashMap;
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        d0 vmState = (d0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e eVar = new l82.e(new g(new o82.a0(), e.f106281a, false), d0.b(vmState, null, (l0) this.f106269b.c(vmState.f106277d).f82213b, null, null, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL), q0.f80391a);
        com.google.firebase.messaging.a0 transformation = this.f106270c.e();
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        transformation.i(eVar);
        return eVar.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        Object obj;
        o event = (o) sVar;
        g priorDisplayState = (g) oVar;
        d0 priorVMState = (d0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        boolean z13 = event instanceof j;
        h0 h0Var = this.f106270c;
        if (z13) {
            j jVar = (j) event;
            f0 transformation = h0Var.c(jVar.f106288a);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation, "transformation");
            transformation.i(resultBuilder);
            o82.g0 g0Var = jVar.f106288a;
            if (g0Var instanceof o82.f0) {
                o82.f0 f0Var = (o82.f0) g0Var;
                if (f0Var.f93579a == 0 && (f0Var.f93580b instanceof m1)) {
                    ArrayList i13 = i(resultBuilder);
                    if (((d0) resultBuilder.f82219b).f106280g.isEmpty()) {
                        ArrayList events = new ArrayList(g0.q(i13, 10));
                        Iterator it = i13.iterator();
                        int i14 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                kotlin.collections.f0.p();
                                throw null;
                            }
                            events.add(new o82.f0(0, new p1(a.v((a) next, i14 < ((d0) resultBuilder.f82219b).f106278e))));
                            i14 = i15;
                        }
                        Intrinsics.checkNotNullParameter(events, "events");
                        e0 transformation2 = new e0(events, h0Var);
                        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                        Intrinsics.checkNotNullParameter(transformation2, "transformation");
                        transformation2.i(resultBuilder);
                        resultBuilder.h(new a0(this, resultBuilder, 0));
                        resultBuilder.h(new a0(this, resultBuilder, 3));
                    } else {
                        for (String str : ((d0) resultBuilder.f82219b).f106280g) {
                            Iterator it2 = i13.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it2.next();
                                if (Intrinsics.d(((a) obj).f106256a.getUid(), str)) {
                                    break;
                                }
                            }
                            a aVar = (a) obj;
                            if (aVar != null) {
                                l82.d0 transformation3 = h0Var.d(new o82.f0(0, new p1(a.v(aVar, true))));
                                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                                Intrinsics.checkNotNullParameter(transformation3, "transformation");
                                transformation3.i(resultBuilder);
                            }
                        }
                        resultBuilder.h(new tk0.h0(8, resultBuilder));
                    }
                    resultBuilder.f(new a0(this, resultBuilder, 1));
                }
            }
        } else if (event instanceof n) {
            n nVar = (n) event;
            List list = ((y0) ((g) resultBuilder.f82218a).f106283a.f93524a.get(0)).f93756a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof u0) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add((a) ((u0) it3.next()).f93721a);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                if (((a) next2).f106257b) {
                    arrayList3.add(next2);
                }
            }
            if (arrayList3.size() == priorVMState.f106278e) {
                a aVar2 = nVar.f106292a;
                if (!aVar2.f106257b && !priorVMState.f106279f.contains(aVar2.getUid())) {
                    resultBuilder.a(new u(priorVMState.f106278e));
                }
            }
            a v13 = a.v(nVar.f106292a, !r12.f106257b);
            f0 transformation4 = h0Var.c(new o82.f0(0, new p1(v13)));
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation4, "transformation");
            transformation4.i(resultBuilder);
            ArrayList H0 = CollectionsKt.H0(((d0) resultBuilder.f82219b).f106279f);
            if (v13.f106257b) {
                String uid = v13.f106256a.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                H0.add(uid);
            } else {
                H0.removeIf(new iw(10, new s12.a(v13, 6)));
            }
            resultBuilder.h(new fk1.u(H0, 10));
            resultBuilder.f(new a0(this, resultBuilder, 2));
        } else if (event instanceof m) {
            int size = priorVMState.f106279f.size();
            List list2 = priorVMState.f106279f;
            if (size < 5) {
                resultBuilder.a(new t(list2.size(), priorVMState.f106278e));
            } else {
                Pair pair = new Pair("ARG_TEMPLATE_PINS", list2);
                Intrinsics.checkNotNullParameter(pair, "pair");
                al1.o oVar2 = new al1.o();
                List value = list2;
                Intrinsics.checkNotNullParameter("ARG_TEMPLATE_PINS", "key");
                Intrinsics.checkNotNullParameter(value, "value");
                oVar2.f15498d.put("ARG_TEMPLATE_PINS", value);
                resultBuilder.d(new v(new al1.e("com.pinterest.EXTRA_BOARD_PREVIEW_PINS_RESULT_CODE", oVar2)), new r(priorVMState.f106277d.f143086a, j(priorVMState)));
            }
        } else {
            boolean z14 = event instanceof i;
            al1.b bVar = al1.b.f15477a;
            if (z14) {
                resultBuilder.d(new v(bVar), new q(priorVMState.f106277d.f143086a, j(priorVMState)));
            } else if (event instanceof h) {
                resultBuilder.f(b0.f106264j);
            } else {
                boolean z15 = event instanceof l;
                if (z15 || Intrinsics.d(event, k.f106289a)) {
                    boolean z16 = priorDisplayState.f106285c;
                    boolean d2 = Intrinsics.d(priorVMState.f106279f, priorVMState.f106280g);
                    if (z16 || d2) {
                        if (z15) {
                            resultBuilder.a(new q(priorVMState.f106277d.f143086a, j(priorVMState)));
                        }
                        resultBuilder.a(new v(bVar));
                    } else {
                        resultBuilder.f(b0.f106265k);
                    }
                }
            }
        }
        return resultBuilder.e();
    }
}
