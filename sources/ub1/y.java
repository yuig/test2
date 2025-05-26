package ub1;

import com.pinterest.api.model.wy0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import l82.i0;

/* loaded from: classes5.dex */
public final class y extends l82.d {
    @Override // l82.d
    public final c0 c(i0 i0Var) {
        z vmState = (z) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        return new c0(new a(false, false, false), vmState, e0.b(new q(true)));
    }

    @Override // l82.d
    public final c0 f(u50.s sVar, u50.o oVar, i0 i0Var, l82.e resultBuilder) {
        j event = (j) sVar;
        a priorDisplayState = (a) oVar;
        z priorVMState = (z) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof i) {
            wy0 wy0Var = ((i) event).f121721a;
            resultBuilder.f(new w(wy0Var));
            resultBuilder.h(new x(wy0Var));
        } else if (event instanceof b) {
            wy0.a aVar = ((z) resultBuilder.f82219b).f121748a;
            wy0.a aVar2 = wy0.a.ENABLED;
            if (aVar == aVar2) {
                resultBuilder.f(t.f121739j);
            } else {
                resultBuilder.a(new r(aVar2));
                resultBuilder.f(t.f121740k);
            }
        } else if (event instanceof g) {
            resultBuilder.a(new q(false));
        } else if (!(event instanceof h)) {
            if (event instanceof e) {
                resultBuilder.f(t.f121741l);
                resultBuilder.a(new r(((z) resultBuilder.f82219b).f121749b ? wy0.a.DELETED : wy0.a.DISABLED));
            } else if (event instanceof c) {
                resultBuilder.f(new u(resultBuilder));
            } else if (event instanceof d) {
                resultBuilder.h(new v(((d) event).f121716a));
            } else {
                if (!(event instanceof f)) {
                    throw new NoWhenBranchMatchedException();
                }
                resultBuilder.f(t.f121742m);
            }
        }
        return resultBuilder.e();
    }
}
