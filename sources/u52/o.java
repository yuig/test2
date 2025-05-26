package u52;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.ta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o extends l82.d {
    public static HashMap g(b1 b1Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("board_id", b1Var.f120662a);
        hashMap.put("template_id", b1Var.f120667f);
        return hashMap;
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        b1 vmState = (b1) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e d2 = l82.d.d(new x(d1.f120679a, u.f120737a, new c1(0, 0), q.f120727a), vmState);
        d2.a(new q0(kotlin.collections.q0.f80391a));
        if (!vmState.f120669h.isEmpty()) {
            d2.a(new z0(new p52.a(vmState.f120669h)));
        } else {
            d2.a(new p0(vmState.f120662a, vmState.f120664c));
        }
        return d2.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        String str;
        Object obj;
        o0 event = (o0) sVar;
        x priorDisplayState = (x) oVar;
        b1 priorVMState = (b1) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        int i13 = 10;
        if (event instanceof m0) {
            m0 m0Var = (m0) event;
            if (m0Var instanceof k0) {
                resultBuilder.h(new n(m0Var, 0));
            } else if (m0Var instanceof i0) {
                resultBuilder.h(new n(m0Var, 1));
            } else if (m0Var instanceof l0) {
                resultBuilder.h(new n(m0Var, 2));
            } else {
                boolean z13 = m0Var instanceof j0;
            }
            if ((!((b1) resultBuilder.f82219b).f120666e.isEmpty()) && (!((b1) resultBuilder.f82219b).f120670i.isEmpty())) {
                ta taVar = (ta) CollectionsKt.firstOrNull(((b1) resultBuilder.f82219b).f120666e);
                resultBuilder.h(new fk1.u(CollectionsKt.y0(((b1) resultBuilder.f82219b).f120670i, taVar != null ? kg.a.B(taVar) : 14), 11));
            }
            resultBuilder.g(new tk0.h0(9, resultBuilder), new tk0.h0(i13, resultBuilder));
        } else if (event instanceof d0) {
            d0 d0Var = (d0) event;
            if (d0Var instanceof z) {
                a1[] a1VarArr = new a1[2];
                String str2 = priorVMState.f120667f;
                List list = priorVMState.f120670i;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String uid = ((f30) it.next()).getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    arrayList.add(uid);
                }
                a1VarArr[0] = new w0(str2, arrayList);
                a1VarArr[1] = new t0(priorVMState.f120671j.f143086a, g(priorVMState));
                resultBuilder.d(a1VarArr);
            } else if (d0Var instanceof c0) {
                Iterator it2 = priorVMState.f120666e.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    str = priorVMState.f120667f;
                    if (!hasNext) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (Intrinsics.d(((ta) obj).getUid(), str)) {
                        break;
                    }
                }
                ta taVar2 = (ta) obj;
                if (taVar2 != null) {
                    List list2 = ((b1) resultBuilder.f82219b).f120670i;
                    a1[] a1VarArr2 = new a1[2];
                    int B = kg.a.B(taVar2);
                    List list3 = list2;
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        String uid2 = ((f30) it3.next()).getUid();
                        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                        arrayList2.add(uid2);
                    }
                    a1VarArr2[0] = new x0(B, priorVMState.f120662a, str, arrayList2);
                    a1VarArr2[1] = new u0(priorVMState.f120671j.f143086a, g(priorVMState));
                    resultBuilder.d(a1VarArr2);
                }
            } else if (d0Var instanceof b0) {
                resultBuilder.a(new z0(new p52.a(((b0) d0Var).f120661a)));
            } else if ((d0Var instanceof y) || (d0Var instanceof a0)) {
                boolean z14 = !Intrinsics.d(priorVMState.f120667f, priorVMState.f120668g);
                List list4 = priorVMState.f120670i;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list4, 10));
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((f30) it4.next()).getUid());
                }
                boolean d2 = true ^ Intrinsics.d(arrayList3, priorVMState.f120669h);
                if (z14 || d2) {
                    resultBuilder.f(f.f120688k);
                } else {
                    ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(list4, 10));
                    Iterator it5 = list4.iterator();
                    while (it5.hasNext()) {
                        String uid3 = ((f30) it5.next()).getUid();
                        Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                        arrayList4.add(uid3);
                    }
                    resultBuilder.a(new w0(priorVMState.f120667f, arrayList4));
                    if (d0Var instanceof a0) {
                        b1 b1Var = (b1) resultBuilder.f82219b;
                        resultBuilder.a(new s0(b1Var.f120671j.f143086a, g(b1Var)));
                    }
                }
            }
        } else if (event instanceof n0) {
            n0 n0Var = (n0) event;
            resultBuilder.h(new gw1.i(21, n0Var, resultBuilder));
            resultBuilder.f(new s12.a(n0Var, 10));
        } else {
            if (!(event instanceof h0)) {
                throw new NoWhenBranchMatchedException();
            }
            h0 h0Var = (h0) event;
            if (h0Var instanceof f0) {
                resultBuilder.f(f.f120689l);
                b1 b1Var2 = (b1) resultBuilder.f82219b;
                w0 w0Var = new w0(b1Var2.f120668g, b1Var2.f120669h);
                b1 b1Var3 = (b1) resultBuilder.f82219b;
                resultBuilder.d(w0Var, new s0(b1Var3.f120671j.f143086a, g(b1Var3)));
            } else if ((h0Var instanceof e0) || (h0Var instanceof g0)) {
                resultBuilder.f(f.f120690m);
            }
        }
        return resultBuilder.e();
    }
}
