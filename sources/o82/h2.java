package o82;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h2 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final m3 f93610b;

    /* renamed from: c, reason: collision with root package name */
    public final p f93611c;

    /* renamed from: d, reason: collision with root package name */
    public final i f93612d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f93613e;

    public h2(m3 viewTypeExtractor, p itemIdExtractor, i gridSpacer, boolean z13) {
        Intrinsics.checkNotNullParameter(viewTypeExtractor, "viewTypeExtractor");
        Intrinsics.checkNotNullParameter(itemIdExtractor, "itemIdExtractor");
        Intrinsics.checkNotNullParameter(gridSpacer, "gridSpacer");
        this.f93610b = viewTypeExtractor;
        this.f93611c = itemIdExtractor;
        this.f93612d = gridSpacer;
        this.f93613e = z13;
    }

    public static final ArrayList g(h2 h2Var, List list) {
        h2Var.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
        int i13 = 0;
        for (Object obj : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            l82.i0 i0Var = (l82.i0) obj;
            arrayList.add(new u0(i0Var, h2Var.f93610b.a(i13, i0Var), h2Var.f93611c.a(i13, i0Var), h2Var.f93612d.a(i13, i0Var)));
            i13 = i14;
        }
        return arrayList;
    }

    public static ArrayList h(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((u0) it.next()).f93721a);
        }
        return arrayList;
    }

    public static void i(l82.e eVar, Function1 function1) {
        i2 i2Var = (i2) eVar.f82219b;
        Intrinsics.checkNotNullParameter(i2Var, "<this>");
        if (Intrinsics.d(i2Var.f93620b, l.f93651a)) {
            eVar.f(function1);
            return;
        }
        m mVar = ((i2) eVar.f82219b).f93620b;
        Intrinsics.g(mVar, "null cannot be cast to non-null type com.pinterest.statebasedrecycler.HiddenState.Hidden<ItemVMState of com.pinterest.statebasedrecycler.SectionStateTransformer>");
        eVar.h(new g2(((k) mVar).f93642a, 2));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        i2 vmState = (i2) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        v vVar = v.f93728e;
        if (!this.f93613e) {
            return new l82.c0(new y0(null, vVar, true, 1), vmState, kotlin.collections.q0.f80391a);
        }
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        return new l82.c0(new y0(q0Var, t.f93712e, false), i2.b(vmState, null, new k(new y0(null, vVar, true, 1)), 1), q0Var);
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        y0 y0Var;
        boolean z13 = true;
        boolean z14 = true;
        int i13 = 2;
        q1 event = (q1) sVar;
        y0 priorDisplayState = (y0) oVar;
        i2 priorVMState = (i2) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        boolean z15 = event instanceof h1;
        v vVar = v.f93728e;
        l lVar = l.f93651a;
        if (z15) {
            if (priorDisplayState.f93758c) {
                Intrinsics.checkNotNullParameter(priorVMState, "<this>");
                if (Intrinsics.d(priorVMState.f93620b, lVar)) {
                    resultBuilder.f(f2.f93587m);
                    boolean d2 = Intrinsics.d(priorDisplayState.f93757b, vVar);
                    Object obj = priorVMState.f93619a;
                    if (d2) {
                        resultBuilder.d(new v1(obj), y1.f93761a);
                    } else {
                        resultBuilder.a(new x1(obj));
                    }
                }
            }
        } else if (event instanceof k1) {
            Intrinsics.checkNotNullParameter(priorVMState, "<this>");
            if (Intrinsics.d(priorVMState.f93620b, lVar)) {
                resultBuilder.f(f2.f93588n);
                resultBuilder.a(new b2(priorVMState.f93619a));
            }
        } else if (event instanceof m1) {
            i(resultBuilder, new gw1.i(28, this, event));
            Intrinsics.checkNotNullParameter(priorVMState, "<this>");
            if (Intrinsics.d(priorVMState.f93620b, lVar)) {
                resultBuilder.d(new c2(priorVMState.f93619a, ((m1) event).f93667a), z1.f93766a);
            }
            resultBuilder.a(new a2(0, h(((y0) resultBuilder.f82218a).f93756a)));
        } else if (event instanceof i1) {
            i(resultBuilder, new e2(this, event, priorDisplayState));
        } else if (event instanceof z0) {
            ArrayList h10 = h(priorDisplayState.f93756a);
            ArrayList H0 = CollectionsKt.H0(h10);
            z0 z0Var = (z0) event;
            H0.addAll(z0Var.f93764a);
            i(resultBuilder, new fn1.k(this, CollectionsKt.F0(H0), event, 15));
            resultBuilder.d(new c2(priorVMState.f93619a, z0Var.f93764a), new a2(h10.size(), h(((y0) resultBuilder.f82218a).f93756a)));
        } else {
            boolean z16 = event instanceof e1;
            m60.f0 f0Var = vb0.j.f125466a;
            if (z16) {
                int size = priorDisplayState.f93756a.size();
                ((e1) event).getClass();
                int g13 = ql2.s.g(0, 0, size);
                f0Var.R(g13 == 0, a.a.d("Invalid insertion position 0 into list with size ", size), tb0.p.PLATFORM, new Object[0]);
                i(resultBuilder, new w1.z0(this, priorDisplayState, g13, event, 8));
                resultBuilder.a(new a2(g13, h(((y0) resultBuilder.f82218a).f93756a)));
            } else {
                int i14 = 3;
                if (event instanceof p1) {
                    i(resultBuilder, new e2(this, priorDisplayState, event, i14));
                } else if (event instanceof o1) {
                    i(resultBuilder, new e2(this, priorDisplayState, event, 4));
                } else if (event instanceof l1) {
                    i(resultBuilder, new e2(this, priorDisplayState, event, 5));
                } else if (event instanceof j1) {
                    int size2 = priorDisplayState.f93756a.size();
                    j1 j1Var = (j1) event;
                    int i15 = j1Var.f93635a;
                    boolean z17 = i15 >= 0 && i15 < size2;
                    int i16 = j1Var.f93636b;
                    boolean z18 = i16 >= 0 && i16 < size2;
                    String f13 = a.a.f("Invalid move from position ", i15, " in list with size ", size2);
                    tb0.p pVar = tb0.p.PLATFORM;
                    f0Var.R(z17, f13, pVar, new Object[0]);
                    f0Var.R(z18, a.a.f("Invalid move to position ", i16, " in list with size ", size2), pVar, new Object[0]);
                    if (z17 && z18) {
                        i(resultBuilder, new e2(this, priorDisplayState, event, z14 ? 1 : 0));
                    }
                } else if (event instanceof a1) {
                    i(resultBuilder, new x91.j0(z13 ? 1 : 0, event));
                } else if (event instanceof c1) {
                    i(resultBuilder, new x91.j0(i13, event));
                    resultBuilder.a(new u1(((c1) event).f93548a));
                } else if (event instanceof f1) {
                    f1 f1Var = (f1) event;
                    if (kotlin.collections.f0.h(priorDisplayState.f93756a).f(f1Var.f93581a)) {
                        resultBuilder.a(new a2(f1Var.f93581a, f1Var.f93583c, f1Var.f93582b, h(priorDisplayState.f93756a)));
                    }
                } else if (event instanceof g1) {
                    g1 g1Var = (g1) event;
                    if (kotlin.collections.f0.h(priorDisplayState.f93756a).f(g1Var.f93599a)) {
                        List list = priorDisplayState.f93756a;
                        int i17 = g1Var.f93599a;
                        resultBuilder.a(new w1(i17, ((u0) list.get(i17)).f93721a, h(list)));
                    }
                } else if (event instanceof b1) {
                    resultBuilder.h(new x91.j0(i14, event));
                    b1 b1Var = (b1) event;
                    resultBuilder.a(new c2(b1Var.f93536a, h(priorDisplayState.f93756a)));
                    Intrinsics.checkNotNullParameter(priorVMState, "<this>");
                    if (Intrinsics.d(priorVMState.f93620b, lVar) && b1Var.f93537b && !Intrinsics.d(priorDisplayState.f93757b, vVar)) {
                        resultBuilder.f(f2.f93584j);
                        resultBuilder.a(new b2(b1Var.f93536a));
                    }
                } else if (event instanceof d1) {
                    Intrinsics.checkNotNullParameter(priorVMState, "<this>");
                    if (Intrinsics.d(priorVMState.f93620b, lVar)) {
                        resultBuilder.h(new g2(priorDisplayState, 0));
                        resultBuilder.f(f2.f93585k);
                    }
                } else if (event instanceof n1) {
                    Intrinsics.checkNotNullParameter(priorVMState, "<this>");
                    if (priorVMState.f93620b instanceof k) {
                        resultBuilder.h(f2.f93586l);
                        m mVar = priorVMState.f93620b;
                        k kVar = mVar instanceof k ? (k) mVar : null;
                        if (kVar != null && (y0Var = kVar.f93642a) != null) {
                            priorDisplayState = y0Var;
                        }
                        resultBuilder.f(new g2(priorDisplayState, 1));
                    }
                }
            }
        }
        return resultBuilder.e();
    }
}
