package t80;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class c0 extends l82.d {
    @Override // l82.d
    public final l82.c0 c(i0 i0Var) {
        d dVar;
        u80.j jVar;
        d0 vmState = (d0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        if (oe.f.U0(vmState)) {
            u80.j[] elements = new u80.j[3];
            if (vmState.f116686c > 0) {
                u80.j jVar2 = t.f116740d;
                Intrinsics.checkNotNullParameter(jVar2, "<this>");
                jVar = t.a(jVar2, false);
            } else {
                jVar = null;
            }
            elements[0] = jVar;
            u80.j jVar3 = t.f116741e;
            Intrinsics.checkNotNullParameter(jVar3, "<this>");
            elements[1] = t.a(jVar3, false);
            u80.j jVar4 = t.f116742f;
            Intrinsics.checkNotNullParameter(jVar4, "<this>");
            elements[2] = t.a(jVar4, false);
            Intrinsics.checkNotNullParameter(elements, "elements");
            dVar = new d(kotlin.collections.c0.A(elements));
        } else {
            dVar = new d();
        }
        Intrinsics.checkNotNullParameter(vmState, "<this>");
        l0 l0Var = vmState.f116687d;
        l82.e d2 = l82.d.d(dVar, d0.b(vmState, false, l0.b(l0Var, com.bumptech.glide.d.z0(l0Var.f143086a, b0.f116681l)), 23));
        Intrinsics.checkNotNullParameter(d2, "<this>");
        d2.a(a.f116677a);
        return d2.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, i0 i0Var, l82.e resultBuilder) {
        Object obj;
        h event = (h) sVar;
        d priorDisplayState = (d) oVar;
        d0 priorVMState = (d0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof g) {
            resultBuilder.h(b0.f116679j);
        } else if (event instanceof f) {
            resultBuilder.h(b0.f116680k);
            resultBuilder.f(new r(1, priorVMState, event));
        } else {
            if (!(event instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            b bVar = c.Companion;
            int i13 = ((e) event).f116689a;
            bVar.getClass();
            Iterator<E> it = c.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((c) obj).ordinal() == i13) {
                    break;
                }
            }
            c cVar = (c) obj;
            if (oe.f.U0(priorVMState) && (cVar == c.Drafts || cVar == c.Remixes)) {
                z[] zVarArr = new z[1];
                zVarArr[0] = new x(cVar == c.Remixes);
                resultBuilder.d(zVarArr);
            } else {
                int i14 = cVar == null ? -1 : a0.f116678a[cVar.ordinal()];
                if (i14 == 1) {
                    resultBuilder.d(w.f116745a);
                } else if (i14 == 2) {
                    resultBuilder.d(y.f116747a);
                }
            }
            if (cVar != null) {
                d0 d0Var = (d0) resultBuilder.f82219b;
                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                resultBuilder.a(new v(cVar, d0Var.f116687d.f143086a));
            }
        }
        return resultBuilder.e();
    }
}
