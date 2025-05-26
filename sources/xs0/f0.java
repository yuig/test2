package xs0;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.oc0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.settings.notifications.y0;
import h32.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l82.i0;
import m60.x0;
import ni1.n2;
import ni1.u0;
import ni1.z1;
import o82.m1;
import o82.p1;
import o82.q1;
import u50.k0;
import y01.h1;
import zy.j0;
import zy.l0;

/* loaded from: classes5.dex */
public final class f0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f135787b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.h0 f135788c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(es.h hVar, fs.c cVar, es.a aVar, jv.a aVar2, nx.b0 b0Var, ur.a aVar3) {
        this(hVar, cVar, aVar, aVar2, b0Var, aVar3, new n2(hVar, aVar, cVar, aVar2, b0Var, aVar3));
        this.f135787b = 0;
    }

    @Override // l82.d
    public final l82.c0 c(i0 i0Var) {
        int i13 = this.f135787b;
        l82.h0 lens = this.f135788c;
        switch (i13) {
            case 0:
                g0 vmState = (g0) i0Var;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                l82.e d2 = l82.d.d(new q(), vmState);
                d2.h(new d0(0, vmState));
                g0 g0Var = (g0) d2.f82219b;
                if (!rl2.g0.V(g0Var.f135807a, g0Var.f135811e) && g0Var.f135809c && g0Var.f135810d && g0Var.f135807a.E4().booleanValue()) {
                    d2.f(g.f135798s);
                } else {
                    Boolean D4 = ((g0) d2.f82219b).f135807a.D4();
                    Intrinsics.checkNotNullExpressionValue(D4, "getIsBlocked(...)");
                    if (D4.booleanValue()) {
                        d2.f(g.f135796q);
                    } else {
                        d2.f(g.f135797r);
                    }
                    d2.f(new tk0.h0(2, d2));
                }
                d2.f(new d0(1, vmState));
                l0 l0Var = ((g0) d2.f82219b).f135812f;
                d2.a(new a0(new j0(l0Var.f143086a, l0Var.f143087b)));
                com.google.firebase.messaging.a0 transformation = lens.e();
                Intrinsics.checkNotNullParameter(d2, "<this>");
                Intrinsics.checkNotNullParameter(transformation, "transformation");
                transformation.i(d2);
                return d2.e();
            case 1:
                kc1.u vmState2 = (kc1.u) i0Var;
                Intrinsics.checkNotNullParameter(vmState2, "vmState");
                Set set = vmState2.f79175a;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ic1.y) it.next()).f72099a);
                }
                Set J0 = CollectionsKt.J0(arrayList);
                Object kVar = J0.isEmpty() ? new kc1.k(false) : new kc1.l(J0, false);
                l82.e d13 = l82.d.d(new kc1.n(new kc1.k(false), c52.e.add_pronouns_message, null, new o82.a0()), vmState2);
                d13.f(new y0(kVar, 28));
                com.google.firebase.messaging.a0 transformation2 = lens.e();
                Intrinsics.checkNotNullParameter(d13, "<this>");
                Intrinsics.checkNotNullParameter(transformation2, "transformation");
                transformation2.i(d13);
                return d13.e();
            case 2:
                v72.z vmState3 = (v72.z) i0Var;
                Intrinsics.checkNotNullParameter(vmState3, "vmState");
                l82.e resultBuilder = l82.d.d(new v72.i(q0.f80391a, false, new u0(null, 0, null, 2097151)), vmState3);
                resultBuilder.d(new v72.s(vmState3.f124459a, vmState3.f124460b));
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(lens, "lens");
                Intrinsics.checkNotNullParameter(lens, "$lens");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                lens.b(resultBuilder);
                return resultBuilder.e();
            case 3:
                wc2.q vmState4 = (wc2.q) i0Var;
                Intrinsics.checkNotNullParameter(vmState4, "vmState");
                l82.e resultBuilder2 = l82.d.d(wc2.f.e(new wc2.f(null, 0, new u0(null, 0, null, 2097151)), vmState4.f129147a, vmState4.f129148b, null, 4), vmState4);
                Intrinsics.checkNotNullParameter(resultBuilder2, "<this>");
                Intrinsics.checkNotNullParameter(lens, "lens");
                Intrinsics.checkNotNullParameter(lens, "$lens");
                Intrinsics.checkNotNullParameter(resultBuilder2, "resultBuilder");
                lens.b(resultBuilder2);
                return resultBuilder2.e();
            default:
                ad2.t vmState5 = (ad2.t) i0Var;
                Intrinsics.checkNotNullParameter(vmState5, "vmState");
                l82.e resultBuilder3 = l82.d.d(new ad2.b(new o82.a0()), vmState5);
                Intrinsics.checkNotNullParameter(resultBuilder3, "<this>");
                Intrinsics.checkNotNullParameter(lens, "lens");
                Intrinsics.checkNotNullParameter(lens, "$lens");
                Intrinsics.checkNotNullParameter(resultBuilder3, "resultBuilder");
                lens.b(resultBuilder3);
                return resultBuilder3.e();
        }
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, i0 i0Var, l82.e resultBuilder) {
        int i13 = this.f135787b;
        l82.h0 lens = this.f135788c;
        switch (i13) {
            case 0:
                v event = (v) sVar;
                q priorDisplayState = (q) oVar;
                g0 priorVMState = (g0) i0Var;
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event instanceof r) {
                    Boolean D4 = priorVMState.f135807a.D4();
                    Intrinsics.checkNotNullExpressionValue(D4, "getIsBlocked(...)");
                    boolean booleanValue = D4.booleanValue();
                    l0 l0Var = priorVMState.f135812f;
                    f30 f30Var = priorVMState.f135807a;
                    if (booleanValue) {
                        c0[] c0VarArr = new c0[2];
                        l32.c cVar = l32.c.BLOCK_ONLY_THIS_PIN;
                        String z13 = dn.c.z(f30Var);
                        oc0 d63 = f30Var.d6();
                        String j13 = d63 != null ? d63.j() : null;
                        c0VarArr[0] = new y(f30Var, cVar, z13, b40.R(j13 != null ? j13 : ""));
                        c0VarArr[1] = new a0(new zy.e0(new zy.a(h32.i0.a(l0Var.f143086a, null, null, null, h32.u0.HOME_FEED_CONTROL_PANEL_ACTIVITY_ITEM, 95), f1.TOGGLE_ON, f30Var.getUid(), null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER)));
                        resultBuilder.d(c0VarArr);
                    } else {
                        resultBuilder.d(new w(f30Var, l32.c.BLOCK_ONLY_THIS_PIN), new a0(new zy.e0(new zy.a(h32.i0.a(l0Var.f143086a, null, null, null, h32.u0.HOME_FEED_CONTROL_PANEL_ACTIVITY_ITEM, 95), f1.TOGGLE_OFF, f30Var.getUid(), null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER))));
                    }
                } else if (event instanceof s) {
                    resultBuilder.a(new b0(new k92.n(new k92.c(new k0(x0.generic_error), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)));
                } else if (event instanceof t) {
                    l82.f0 transformation = lens.c(((t) event).f135841a);
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation, "transformation");
                    transformation.i(resultBuilder);
                } else {
                    boolean z14 = event instanceof u;
                }
                return resultBuilder.e();
            case 1:
                kc1.s event2 = (kc1.s) sVar;
                kc1.n priorDisplayState2 = (kc1.n) oVar;
                Intrinsics.checkNotNullParameter(event2, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState2, "priorDisplayState");
                Intrinsics.checkNotNullParameter((kc1.u) i0Var, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event2 instanceof kc1.o) {
                    resultBuilder.f(kc1.d.f79143j);
                } else if (event2 instanceof kc1.q) {
                    kc1.q qVar = (kc1.q) event2;
                    Set b13 = ((kc1.n) resultBuilder.f82218a).f79166a.b();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : b13) {
                        if (!Intrinsics.d((String) obj, qVar.f79172a)) {
                            arrayList.add(obj);
                        }
                    }
                    Set J0 = CollectionsKt.J0(arrayList);
                    Set set = ((kc1.u) resultBuilder.f82219b).f79175a;
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(set, 10));
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((ic1.y) it.next()).f72099a);
                    }
                    boolean z15 = !Intrinsics.d(J0, CollectionsKt.J0(arrayList2));
                    resultBuilder.h(new h1(1, J0));
                    resultBuilder.f(new kc1.e(J0, z15, 0));
                    l82.f0 transformation2 = lens.c(new o82.f0(0, new p1(new kc1.b(new ic1.y(qVar.f79172a), false))));
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation2, "transformation");
                    transformation2.i(resultBuilder);
                } else if (event2 instanceof kc1.r) {
                    kc1.r rVar = (kc1.r) event2;
                    LinkedHashSet I0 = CollectionsKt.I0(((kc1.n) resultBuilder.f82218a).f79166a.b());
                    if (I0.size() >= 2) {
                        resultBuilder.f(kc1.d.f79145l);
                    } else {
                        I0.add(rVar.f79173a);
                        Set set2 = ((kc1.u) resultBuilder.f82219b).f79175a;
                        ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(set2, 10));
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((ic1.y) it2.next()).f72099a);
                        }
                        resultBuilder.f(new kc1.e(I0, !Intrinsics.d(I0, CollectionsKt.J0(arrayList3)), 1));
                        resultBuilder.h(new h1(2, I0));
                        l82.f0 transformation3 = lens.c(new o82.f0(0, new p1(new kc1.b(new ic1.y(rVar.f79173a), true))));
                        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                        Intrinsics.checkNotNullParameter(transformation3, "transformation");
                        transformation3.i(resultBuilder);
                    }
                } else {
                    if (!(event2 instanceof kc1.p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l82.f0 transformation4 = lens.c(((kc1.p) event2).f79171a);
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(transformation4, "transformation");
                    transformation4.i(resultBuilder);
                    resultBuilder.g(kc1.d.f79144k, new tk0.h0(5, resultBuilder));
                }
                return resultBuilder.e();
            case 2:
                v72.p event3 = (v72.p) sVar;
                v72.i priorDisplayState3 = (v72.i) oVar;
                Intrinsics.checkNotNullParameter(event3, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState3, "priorDisplayState");
                Intrinsics.checkNotNullParameter((v72.z) i0Var, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event3 instanceof v72.m) {
                    resultBuilder.f(new v72.y(event3, 0));
                } else if (event3 instanceof v72.n) {
                    resultBuilder.f(v72.e.f124411m);
                } else if (event3 instanceof v72.j) {
                    v72.j jVar = (v72.j) event3;
                    resultBuilder.d(new v72.t(jVar.f124440a, jVar.f124441b), new v72.r(jVar.f124440a, ((v72.z) resultBuilder.f82219b).f124462d));
                } else if (event3 instanceof v72.l) {
                    v72.l lVar = (v72.l) event3;
                    resultBuilder.d(new v72.u(lVar.f124443a), new v72.q(lVar.f124443a));
                } else if (event3 instanceof v72.k) {
                    resultBuilder.f(new v72.y(event3, 1));
                } else if (event3 instanceof v72.o) {
                    z1 event4 = ((v72.o) event3).f124446a;
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(lens, "lens");
                    Intrinsics.checkNotNullParameter(event4, "event");
                    Intrinsics.checkNotNullParameter(lens, "$lens");
                    Intrinsics.checkNotNullParameter(event4, "$event");
                    Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                    lens.a(event4, resultBuilder);
                }
                return resultBuilder.e();
            case 3:
                wc2.j event5 = (wc2.j) sVar;
                wc2.f priorDisplayState4 = (wc2.f) oVar;
                Intrinsics.checkNotNullParameter(event5, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState4, "priorDisplayState");
                Intrinsics.checkNotNullParameter((wc2.q) i0Var, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event5 instanceof wc2.g) {
                    resultBuilder.d(new wc2.l(((wc2.g) event5).f129136a));
                } else if (event5 instanceof wc2.h) {
                    resultBuilder.f(new ha2.i(17, event5, priorDisplayState4));
                } else if (event5 instanceof wc2.i) {
                    z1 event6 = ((wc2.i) event5).f129138a;
                    Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                    Intrinsics.checkNotNullParameter(lens, "lens");
                    Intrinsics.checkNotNullParameter(event6, "event");
                    Intrinsics.checkNotNullParameter(lens, "$lens");
                    Intrinsics.checkNotNullParameter(event6, "$event");
                    Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                    lens.a(event6, resultBuilder);
                }
                return resultBuilder.e();
            default:
                ad2.f event7 = (ad2.f) sVar;
                ad2.b priorDisplayState5 = (ad2.b) oVar;
                ad2.t priorVMState2 = (ad2.t) i0Var;
                Intrinsics.checkNotNullParameter(event7, "event");
                Intrinsics.checkNotNullParameter(priorDisplayState5, "priorDisplayState");
                Intrinsics.checkNotNullParameter(priorVMState2, "priorVMState");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                if (event7 instanceof ad2.d) {
                    String str = ((ad2.d) event7).f2095a;
                    String str2 = str != null ? str : "";
                    List list = priorVMState2.f2115b;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : list) {
                        if (StringsKt.E(((ad2.j) obj2).f2101b, str2, true)) {
                            arrayList4.add(obj2);
                        }
                    }
                    resultBuilder.f(new ha2.i(19, this, arrayList4));
                    return resultBuilder.e();
                }
                if (event7 instanceof ad2.c) {
                    ad2.c cVar2 = (ad2.c) event7;
                    resultBuilder.d(new ad2.m(priorVMState2.f2114a, cVar2.f2093a, cVar2.f2094b), new ad2.o());
                    return resultBuilder.e();
                }
                if (!(event7 instanceof ad2.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                ad2.e eVar = (ad2.e) event7;
                o82.g0 g0Var = eVar.f2096a;
                if (g0Var instanceof o82.f0) {
                    q1 q1Var = ((o82.f0) g0Var).f93580b;
                    if (q1Var instanceof m1) {
                        resultBuilder.h(new x91.j0(4, q1Var));
                    }
                }
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(lens, "lens");
                o82.g0 event8 = eVar.f2096a;
                Intrinsics.checkNotNullParameter(event8, "event");
                Intrinsics.checkNotNullParameter(lens, "$lens");
                Intrinsics.checkNotNullParameter(event8, "$event");
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                lens.a(event8, resultBuilder);
                return resultBuilder.e();
        }
    }

    public f0(es.h adsCommonDisplay, fs.c saleDealAdDisplayUtils, es.a adFormats, jv.a adsPostClickHelper, nx.b0 pinAuxHelper, ur.a adsDependencies, l82.d pinRepTransformer) {
        this.f135787b = 0;
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(saleDealAdDisplayUtils, "saleDealAdDisplayUtils");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsPostClickHelper, "adsPostClickHelper");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(pinRepTransformer, "pinRepTransformer");
        this.f135788c = b(pinRepTransformer, g.f135794o, g.f135795p, e0.f135786i);
    }

    public f0(l82.d pinRepStateTransformer, int i13) {
        this.f135787b = i13;
        if (i13 == 2) {
            Intrinsics.checkNotNullParameter(pinRepStateTransformer, "pinRepStateTransformer");
            this.f135788c = b(pinRepStateTransformer, v72.e.f124409k, v72.e.f124410l, v72.x.f124456i);
        } else if (i13 == 3) {
            Intrinsics.checkNotNullParameter(pinRepStateTransformer, "pinRepStateTransformer");
            this.f135788c = b(pinRepStateTransformer, wc2.o.f129143j, wc2.o.f129144k, wc2.p.f129146i);
        } else if (i13 != 4) {
            Intrinsics.checkNotNullParameter(pinRepStateTransformer, "listTransformer");
            this.f135788c = b(pinRepStateTransformer, new kotlin.jvm.internal.d0() { // from class: kc1.f
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((n) obj).f79169d;
                }
            }, new kotlin.jvm.internal.d0() { // from class: kc1.g
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((u) obj).f79177c;
                }
            }, kc1.h.f79155i);
        } else {
            Intrinsics.checkNotNullParameter(pinRepStateTransformer, "multiSectionStateTransformer");
            this.f135788c = b(pinRepStateTransformer, new kotlin.jvm.internal.d0() { // from class: ad2.q
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((b) obj).f2092a;
                }
            }, new kotlin.jvm.internal.d0() { // from class: ad2.r
                @Override // kotlin.jvm.internal.d0, rl2.t
                public final Object get(Object obj) {
                    return ((t) obj).f2116c;
                }
            }, ad2.s.f2113i);
        }
    }
}
