package sa0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import ra0.l0;

/* loaded from: classes5.dex */
public final class r extends l82.d {
    @Override // l82.d
    public final l82.c0 c(i0 i0Var) {
        s vmState = (s) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e d2 = l82.d.d(new a(), vmState);
        d2.b(vmState.f112192e);
        return d2.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, i0 i0Var, l82.e resultBuilder) {
        f event = (f) sVar;
        a priorDisplayState = (a) oVar;
        s priorVMState = (s) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof b) {
            u62.k kVar = ((b) event).f112160a;
            if (!(kVar instanceof u62.i) && !Intrinsics.d(kVar, u62.j.f120844a)) {
                throw new NoWhenBranchMatchedException();
            }
            resultBuilder.a(new k(kVar));
        } else if (event instanceof d) {
            resultBuilder.f(new l0((d) event, 2));
        } else if (event instanceof e) {
            e eVar = (e) event;
            resultBuilder.f(new q(eVar, 0));
            resultBuilder.h(new q(eVar, 1));
        } else {
            if (!(event instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            resultBuilder.h(new l0((c) event, 1));
        }
        return resultBuilder.e();
    }
}
