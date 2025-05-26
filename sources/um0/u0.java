package um0;

import c2.m4;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kh2.c3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f122768b;

    public u0(lt.j organizeToolsStateTransformer) {
        Intrinsics.checkNotNullParameter(organizeToolsStateTransformer, "organizeToolsStateTransformer");
        this.f122768b = b(organizeToolsStateTransformer, new kotlin.jvm.internal.d0() { // from class: um0.r0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((e) obj).f122696b;
            }
        }, new kotlin.jvm.internal.d0() { // from class: um0.s0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((w0) obj).f122773c;
            }
        }, t0.f122766i);
    }

    public static void h(u0 u0Var, l82.e resultBuilder) {
        Integer valueOf;
        jl0.d dVar;
        z zVar = ((e) resultBuilder.f82218a).f122695a;
        u0Var.getClass();
        w0 w0Var = (w0) resultBuilder.f82219b;
        a1 a1Var = w0Var.f122774d;
        ArrayList arrayList = a1Var.f122687d;
        ArrayList arrayList2 = a1Var.f122688e;
        if (zVar.isSelectAll()) {
            v7 v7Var = w0Var.f122776f;
            valueOf = v7Var != null ? v7Var.s1() : 0;
        } else {
            valueOf = Integer.valueOf(arrayList.size());
        }
        arrayList2.size();
        int intValue = valueOf.intValue();
        int i13 = intValue >= 0 ? intValue : 0;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        int i14 = v0.f122770a[zVar.ordinal()];
        if (i14 == 1) {
            dVar = jl0.d.VIEW;
        } else if (i14 == 2) {
            dVar = jl0.d.ORGANIZE;
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = jl0.d.ORGANIZE_SELECT_ALL_BACKEND_TOGGLED;
        }
        tk0.g event = new tk0.g(dVar, arrayList, arrayList2, i13);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        l82.h0 lens = u0Var.f122768b;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(event, "$event");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.a(event, resultBuilder);
    }

    public static void i(l82.e eVar, ArrayList arrayList, boolean z13) {
        a1 a1Var = ((w0) eVar.f82219b).f122774d;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String id3 = (String) it.next();
            Intrinsics.checkNotNullParameter(id3, "id");
            arrayList2.add(new b1(id3));
        }
        Set J0 = CollectionsKt.J0(arrayList2);
        Set set = a1Var.f122684a;
        eVar.h(new sk0.x(14, a1Var, z13 ? i1.i(set, J0) : i1.h(set, J0)));
        eVar.f(new tk0.h0(1, eVar));
    }

    public static c0 j(u0 u0Var, l82.e eVar, f1 eventType, String str) {
        u0Var.getClass();
        w0 w0Var = (w0) eVar.f82219b;
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        zy.l0 l0Var = w0Var.f122775e;
        HashMap hashMap = new HashMap();
        bs1.c.G1("board_id", w0Var.f122777g, hashMap);
        return new c0(new zy.f0(c3.u0(l0Var, null, null, eventType, null, null, str, hashMap)));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        w0 vmState = (w0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e resultBuilder = l82.d.d(new e(), vmState);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        l82.h0 lens = this.f122768b;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
        return resultBuilder.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        s42.b bVar;
        int i13;
        x event = (x) sVar;
        e priorDisplayState = (e) oVar;
        w0 priorVMState = (w0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        boolean z13 = event instanceof q;
        l82.h0 lens = this.f122768b;
        if (z13) {
            tk0.q qVar = ((q) event).f122753a;
            bk.f.H(qVar, resultBuilder, lens);
            if (qVar instanceof tk0.h) {
                g(resultBuilder, z.Normal);
            }
            e eVar = (e) resultBuilder.f82218a;
            if (eVar.f122702h) {
                int i14 = eVar.f122696b.f117957c.f117940b;
                zb0.a aVar = d.f122693a;
                int i15 = d70.f.delete_pins_warning_message;
                List formatArgs = kotlin.collections.e0.b(String.valueOf(i14));
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                u50.j0 subtitle = new u50.j0(i15, i14, formatArgs);
                zb0.a aVar2 = d.f122693a;
                u50.i0 title = aVar2.f141550a;
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                u50.i0 confirmButtonText = aVar2.f141552c;
                Intrinsics.checkNotNullParameter(confirmButtonText, "confirmButtonText");
                u50.i0 cancelButtonText = aVar2.f141553d;
                Intrinsics.checkNotNullParameter(cancelButtonText, "cancelButtonText");
                zb0.a config = new zb0.a(title, subtitle, confirmButtonText, cancelButtonText, aVar2.f141554e);
                int id3 = c.DeletionConfirmationAlert.getId();
                Intrinsics.checkNotNullParameter(config, "config");
                resultBuilder.a(new b0(new zb0.j(config, Integer.valueOf(id3))));
                bk.f.H(tk0.j.f117981a, resultBuilder, lens);
            }
        } else if (!(event instanceof p)) {
            Object obj = null;
            c cVar = null;
            if (event instanceof m) {
                zb0.f fVar = ((m) event).f122736a;
                if (fVar instanceof zb0.c) {
                    Integer h10 = fVar.h();
                    if (h10 != null) {
                        int intValue = h10.intValue();
                        c.Companion.getClass();
                        Iterator<E> it = c.getEntries().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((c) next).getId() == intValue) {
                                obj = next;
                                break;
                            }
                        }
                        cVar = (c) obj;
                    }
                    if (cVar == c.DeletionConfirmationAlert) {
                        int i16 = ((e) resultBuilder.f82218a).f122696b.f117957c.f117940b;
                        v7 v7Var = ((w0) resultBuilder.f82219b).f122776f;
                        if (v7Var != null) {
                            resultBuilder.h(new m4(v7Var, i16, 6));
                        }
                        tk0.i event2 = tk0.i.f117970a;
                        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                        Intrinsics.checkNotNullParameter(lens, "lens");
                        Intrinsics.checkNotNullParameter(event2, "event");
                        Intrinsics.checkNotNullParameter(lens, "$lens");
                        Intrinsics.checkNotNullParameter(event2, "$event");
                        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                        lens.a(event2, resultBuilder);
                    }
                }
            } else if (event instanceof n) {
                g(resultBuilder, z.Organize);
                h(this, resultBuilder);
            } else if (event instanceof o) {
                g(resultBuilder, z.Normal);
                h(this, resultBuilder);
            } else {
                if (event instanceof w) {
                    w wVar = (w) event;
                    if (wVar instanceof s) {
                        String id4 = ((s) wVar).f122763a;
                        w0 w0Var = (w0) resultBuilder.f82219b;
                        e eVar2 = (e) resultBuilder.f82218a;
                        a1 a1Var = w0Var.f122774d;
                        s42.b b13 = a1Var.b(id4);
                        int i17 = z0.f122783a;
                        Intrinsics.checkNotNullParameter(b13, "<this>");
                        int i18 = y0.f122782a[b13.ordinal()];
                        if (i18 == 1) {
                            bVar = s42.b.UNSELECTED;
                        } else {
                            if (i18 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar = s42.b.SELECTED;
                        }
                        int i19 = p0.f122752a[bVar.ordinal()];
                        int i23 = a1Var.f122686c;
                        if (i19 == 1) {
                            i13 = i23 + 1;
                        } else {
                            if (i19 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i13 = i23 - 1;
                            if (i13 < 0) {
                                i13 = 0;
                            }
                        }
                        Intrinsics.checkNotNullParameter(id4, "id");
                        b1 b1Var = new b1(id4);
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        s42.b bVar2 = s42.b.SELECTED;
                        boolean z14 = bVar == bVar2;
                        Set set = a1Var.f122684a;
                        LinkedHashSet selectedPins = z14 ? i1.j(set, b1Var) : i1.g(set, b1Var);
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        boolean z15 = bVar == bVar2;
                        Set pinsRemovedFromBulkSelection = a1Var.f122685b;
                        if (z15) {
                            pinsRemovedFromBulkSelection = i1.g(pinsRemovedFromBulkSelection, b1Var);
                        } else if (eVar2.f122701g) {
                            pinsRemovedFromBulkSelection = i1.j(pinsRemovedFromBulkSelection, b1Var);
                        }
                        Intrinsics.checkNotNullParameter(selectedPins, "selectedPins");
                        Intrinsics.checkNotNullParameter(pinsRemovedFromBulkSelection, "pinsRemovedFromBulkSelection");
                        resultBuilder.h(new kl0.t(new a1(selectedPins, pinsRemovedFromBulkSelection), 17));
                        resultBuilder.f(new r1.j0(i13, 20));
                        h(this, resultBuilder);
                    } else if (wVar instanceof r) {
                        r rVar = (r) wVar;
                        z zVar = ((e) resultBuilder.f82218a).f122695a.toggle();
                        g(resultBuilder, zVar);
                        List list = rVar.f122760a;
                        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            String uid = ((f30) it2.next()).getUid();
                            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                            arrayList.add(uid);
                        }
                        i(resultBuilder, arrayList, zVar == z.OrganizeSelectAll);
                        h(this, resultBuilder);
                        List events = rVar.f122761b;
                        if (!events.isEmpty()) {
                            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                            Intrinsics.checkNotNullParameter(lens, "lens");
                            Intrinsics.checkNotNullParameter(events, "events");
                            Intrinsics.checkNotNullParameter(events, "$events");
                            Intrinsics.checkNotNullParameter(lens, "$lens");
                            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                            Iterator it3 = events.iterator();
                            while (it3.hasNext()) {
                                lens.a((u50.s) it3.next(), resultBuilder);
                            }
                        }
                    } else if (wVar instanceof t) {
                        t tVar = (t) wVar;
                        if (((e) resultBuilder.f82218a).f122701g) {
                            List list2 = tVar.f122765a;
                            ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
                            Iterator it4 = list2.iterator();
                            while (it4.hasNext()) {
                                String uid2 = ((f30) it4.next()).getUid();
                                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                                arrayList2.add(uid2);
                            }
                            i(resultBuilder, arrayList2, true);
                            h(this, resultBuilder);
                        }
                    } else if (wVar instanceof u) {
                        resultBuilder.h(q0.f122754j);
                        resultBuilder.f(q0.f122755k);
                    } else {
                        if (!(wVar instanceof v)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        g(resultBuilder, z.Organize);
                        h(this, resultBuilder);
                        ArrayList events2 = CollectionsKt.m0(tk0.l.f117983a, ((v) wVar).f122769a);
                        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                        Intrinsics.checkNotNullParameter(lens, "lens");
                        Intrinsics.checkNotNullParameter(events2, "events");
                        Intrinsics.checkNotNullParameter(events2, "$events");
                        Intrinsics.checkNotNullParameter(lens, "$lens");
                        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                        Iterator it5 = events2.iterator();
                        while (it5.hasNext()) {
                            lens.a((u50.s) it5.next(), resultBuilder);
                        }
                    }
                } else if (event instanceof f) {
                    f fVar2 = (f) event;
                    v7 v7Var2 = ((w0) resultBuilder.f82219b).f122776f;
                    if (v7Var2 != null) {
                        resultBuilder.a(new f0(v7Var2, fVar2.f122704a, fVar2.f122705b));
                    }
                } else if (event instanceof j) {
                    j jVar = (j) event;
                    resultBuilder.a(new g0(jVar.f122718a, jVar.f122719b));
                } else if (event instanceof g) {
                    resultBuilder.h(q0.f122756l);
                    resultBuilder.a(j(this, resultBuilder, f1.PIN_REORDER, ((g) event).f122709a));
                } else if (event instanceof k) {
                    resultBuilder.h(q0.f122758n);
                    resultBuilder.a(j(this, resultBuilder, f1.SECTION_REORDER, ((k) event).f122724a));
                } else if (event instanceof h) {
                    resultBuilder.a(jk.v.b0());
                } else if (event instanceof l) {
                    resultBuilder.a(jk.v.b0());
                } else {
                    if (!(event instanceof i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    w0 w0Var2 = (w0) resultBuilder.f82219b;
                    if (w0Var2.f122771a || w0Var2.f122772b) {
                        String str = w0Var2.f122777g;
                        String str2 = kotlin.text.z.j(str) ^ true ? str : null;
                        if (str2 != null) {
                            resultBuilder.a(new a0(str2));
                        }
                    }
                    resultBuilder.h(q0.f122757m);
                }
            }
        }
        return resultBuilder.e();
    }

    public final void g(l82.e resultBuilder, z zVar) {
        resultBuilder.f(new kl0.t(zVar, 18));
        if (!zVar.isSelectAll()) {
            resultBuilder.h(q0.f122754j);
            resultBuilder.f(q0.f122755k);
        }
        if (zVar == z.Normal) {
            tk0.k event = tk0.k.f117982a;
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            l82.h0 lens = this.f122768b;
            Intrinsics.checkNotNullParameter(lens, "lens");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(lens, "$lens");
            Intrinsics.checkNotNullParameter(event, "$event");
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            lens.a(event, resultBuilder);
        }
    }
}
