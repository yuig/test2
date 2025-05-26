package ml0;

import com.pinterest.api.model.e8;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.i8;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.n3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o82.d1;
import o82.n1;
import o82.p1;
import o82.u0;
import o82.y0;

/* loaded from: classes5.dex */
public final class l0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f87470b;

    public l0(o82.i0 multiSectionStateTransformer, lt.j pinalyticsStateTransformer) {
        Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        this.f87470b = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: ml0.f0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f87439a;
            }
        }, new kotlin.jvm.internal.d0() { // from class: ml0.g0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((m0) obj).f87474b;
            }
        }, h0.f87456j);
        b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: ml0.j0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f87441c;
            }
        }, new kotlin.jvm.internal.d0() { // from class: ml0.k0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((m0) obj).f87475c;
            }
        }, h0.f87457k);
    }

    public static HashMap g(m0 m0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("board_id", m0Var.f87473a);
        f30 f30Var = m0Var.f87476d;
        String f39332b = f30Var != null ? f30Var.getF39332b() : null;
        if (f39332b == null) {
            f39332b = "";
        }
        hashMap.put("pin_id", f39332b);
        return hashMap;
    }

    public static ArrayList h(l82.e eVar) {
        List list = ((y0) ((b) eVar.f82218a).f87439a.f93524a.get(3)).f93756a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof u0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((t0) ((u0) it.next()).f93721a);
        }
        return arrayList2;
    }

    public static a i(l82.e eVar, e8 e8Var) {
        i8 i13;
        i8 i14;
        f30 f30Var = ((m0) eVar.f82219b).f87476d;
        Integer num = null;
        Integer valueOf = (e8Var == null || (i14 = e8Var.i()) == null) ? null : Integer.valueOf((int) i14.g().doubleValue());
        if (e8Var != null && (i13 = e8Var.i()) != null) {
            num = Integer.valueOf((int) i13.h().doubleValue());
        }
        return new a(f30Var, valueOf, num);
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        m0 vmState = (m0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e d2 = l82.d.d(new b(new o82.a0(), new a(null, null, null), new zy.a0()), vmState);
        com.google.firebase.messaging.a0 transformation = this.f87470b.e();
        Intrinsics.checkNotNullParameter(d2, "<this>");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        transformation.i(d2);
        d2.a(new a0(vmState.f87473a));
        return d2.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        j event = (j) sVar;
        b priorDisplayState = (b) oVar;
        m0 priorVMState = (m0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof g) {
            o82.g0[] g0VarArr = {((g) event).f87453a};
            l82.h0 h0Var = this.f87470b;
            l82.d0 transformation = h0Var.d(g0VarArr);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation, "transformation");
            transformation.i(resultBuilder);
            y0 y0Var = (y0) ((b) resultBuilder.f82218a).f87439a.f93524a.get(3);
            if (y0Var.f93756a.isEmpty() && (y0Var.f93757b instanceof o82.t)) {
                d1 d1Var = d1.f93561a;
                o82.f0 event2 = new o82.f0(2, d1Var);
                Intrinsics.checkNotNullParameter(event2, "event");
                o82.f0 event3 = new o82.f0(3, d1Var);
                Intrinsics.checkNotNullParameter(event3, "event");
                o82.f0 event4 = new o82.f0(4, n1.f93676a);
                Intrinsics.checkNotNullParameter(event4, "event");
                l82.d0 transformation2 = h0Var.d(event2, event3, event4);
                Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
                Intrinsics.checkNotNullParameter(transformation2, "transformation");
                transformation2.i(resultBuilder);
            } else if (((m0) resultBuilder.f82219b).f87476d == null) {
                resultBuilder.h(new i0(this, resultBuilder, i15));
                j(resultBuilder, h0.f87458l);
                resultBuilder.f(new i0(this, resultBuilder, i13));
            } else {
                j(resultBuilder, new xb0.a(resultBuilder, 22));
            }
        } else {
            if (event instanceof i) {
                i iVar = (i) event;
                f30 f30Var = ((m0) resultBuilder.f82219b).f87476d;
                if (!Intrinsics.d(f30Var != null ? f30Var.getF39332b() : null, iVar.f87460a.f87503a.getF39332b())) {
                    j(resultBuilder, new xb0.a(iVar, 21));
                    resultBuilder.h(new kl0.t(iVar, i13));
                    resultBuilder.f(new i0(this, resultBuilder, i14));
                    h32.u0 u0Var = h32.u0.PIN_CELL;
                    m0 m0Var = (m0) resultBuilder.f82219b;
                    resultBuilder.a(new d0(n3.y0(null, u0Var, m0Var.f87475c.f143086a, g(m0Var), 1)));
                }
            } else if (event instanceof c) {
                c cVar = (c) event;
                f30 f30Var2 = cVar.f87443b;
                if (f30Var2 == null) {
                    t0 t0Var = (t0) CollectionsKt.firstOrNull(h(resultBuilder));
                    f30Var2 = t0Var != null ? t0Var.f87503a : null;
                }
                e8 e8Var = cVar.f87443b != null ? cVar.f87442a : null;
                resultBuilder.h(new sk0.x(7, f30Var2, cVar));
                j(resultBuilder, new xb0.a(f30Var2, 20));
                resultBuilder.f(new sv.y(this, resultBuilder, e8Var, 24));
            } else if (event instanceof f) {
                f fVar = (f) event;
                m0 m0Var2 = (m0) resultBuilder.f82219b;
                f30 f30Var3 = m0Var2.f87476d;
                if (f30Var3 != null) {
                    e8 e8Var2 = m0Var2.f87478f;
                    if (!Intrinsics.d(e8Var2 != null ? e8Var2.k() : null, f30Var3.getF39332b()) || ((float) e8Var2.i().g().doubleValue()) != fVar.f87448a || ((float) e8Var2.i().h().doubleValue()) != fVar.f87449b) {
                        h32.u0 u0Var2 = h32.u0.DONE_BUTTON;
                        m0 m0Var3 = (m0) resultBuilder.f82219b;
                        resultBuilder.d(new y(((m0) resultBuilder.f82219b).f87473a, f30Var3, fVar.f87448a, fVar.f87449b, fVar.f87451d, fVar.f87450c, bs1.c.j2(new String[0], d70.g.board_header_image_set)), new d0(n3.y0(null, u0Var2, m0Var3.f87475c.f143086a, g(m0Var3), 1)));
                    }
                }
            } else if (event instanceof d) {
                h32.u0 u0Var3 = h32.u0.CANCEL_BUTTON;
                m0 m0Var4 = (m0) resultBuilder.f82219b;
                resultBuilder.d(z.f87521a, new d0(n3.y0(null, u0Var3, m0Var4.f87475c.f143086a, g(m0Var4), 1)));
            } else if (event instanceof e) {
                f1 f1Var = f1.DRAG;
                h32.u0 u0Var4 = h32.u0.BOARD_HEADER_IMAGE_PREVIEW;
                m0 m0Var5 = (m0) resultBuilder.f82219b;
                resultBuilder.a(new d0(n3.x0(f1Var, u0Var4, m0Var5.f87475c.f143086a, g(m0Var5))));
            } else if (event instanceof h) {
                f1 f1Var2 = f1.SCROLL;
                m0 m0Var6 = (m0) resultBuilder.f82219b;
                resultBuilder.a(new d0(n3.y0(f1Var2, null, m0Var6.f87475c.f143086a, g(m0Var6), 2)));
            }
        }
        return resultBuilder.e();
    }

    public final void j(l82.e eVar, Function2 function2) {
        ArrayList h10 = h(eVar);
        ArrayList events = new ArrayList(kotlin.collections.g0.q(h10, 10));
        Iterator it = h10.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            t0 t0Var = (t0) next;
            boolean booleanValue = ((Boolean) function2.invoke(Integer.valueOf(i13), t0Var.f87503a)).booleanValue();
            f30 pin = t0Var.f87503a;
            Intrinsics.checkNotNullParameter(pin, "pin");
            events.add(new o82.f0(3, new p1(new t0(pin, booleanValue))));
            i13 = i14;
        }
        l82.h0 h0Var = this.f87470b;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(events, "events");
        l82.e0 transformation = new l82.e0(events, h0Var);
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        transformation.i(eVar);
    }
}
