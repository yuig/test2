package v91;

import com.pinterest.api.model.vs;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import l82.i0;
import m60.x0;
import u50.k0;

/* loaded from: classes5.dex */
public final class t extends l82.d {
    @Override // l82.d
    public final c0 c(i0 i0Var) {
        u vmState = (u) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e d2 = l82.d.d(new a(false, null, null, false), vmState);
        d2.f(l.f124991k);
        d2.h(l.f124992l);
        d2.a(o.f125005a);
        return d2.e();
    }

    @Override // l82.d
    public final c0 f(u50.s sVar, u50.o oVar, i0 i0Var, l82.e resultBuilder) {
        vs p33;
        String g13;
        g event = (g) sVar;
        a priorDisplayState = (a) oVar;
        u priorVMState = (u) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof d) {
            wy0 wy0Var = ((d) event).f124979a;
            String str = ((u) resultBuilder.f82219b).f125010a;
            e82.w wVar = e82.w.INSTAGRAM;
            if (!Intrinsics.d(str, wVar.getApiParam())) {
                wVar = e82.w.NONE;
            }
            if (s.f125009a[wVar.ordinal()] == 1 && (p33 = wy0Var.p3()) != null && (g13 = p33.g()) != null) {
                resultBuilder.f(new d91.l(g13, 3));
            }
        } else if (event instanceof c) {
            resultBuilder.f(l.f124993m);
            resultBuilder.a(new p(new k92.n(new k92.c(new k0(x0.generic_error), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null)));
        } else if (event instanceof f) {
            resultBuilder.f(new u81.h(false, 11));
            resultBuilder.h(new u81.h(false, 12));
        } else if (event instanceof e) {
            resultBuilder.f(new u81.h(true, 11));
            resultBuilder.h(new u81.h(true, 12));
        } else {
            if (!(event instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            u uVar = (u) resultBuilder.f82219b;
            boolean z13 = uVar.f125011b;
            e82.w wVar2 = e82.w.INSTAGRAM;
            if (!Intrinsics.d(uVar.f125010a, wVar2.getApiParam())) {
                wVar2 = e82.w.NONE;
            }
            resultBuilder.a(new q(wVar2, z13));
        }
        return resultBuilder.e();
    }
}
