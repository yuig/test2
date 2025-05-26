package k51;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import l82.i0;

/* loaded from: classes5.dex */
public final class e extends l82.d {
    @Override // l82.d
    public final c0 c(i0 i0Var) {
        v vmState = (v) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        return new c0(new o(vmState.f78338a, vmState.f78339b, 4), vmState, q0.f80391a);
    }

    @Override // l82.d
    public final c0 f(u50.s sVar, u50.o oVar, i0 i0Var, l82.e resultBuilder) {
        b22.l lVar;
        s event = (s) sVar;
        o priorDisplayState = (o) oVar;
        v priorVMState = (v) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof q) {
            resultBuilder.f(c.f78315j);
            resultBuilder.a(new k(((o) resultBuilder.f82218a).f78329b));
            resultBuilder.a(new i(((v) resultBuilder.f82219b).f78340c.f143086a));
        } else if (event instanceof p) {
            resultBuilder.f(c.f78316k);
        } else {
            if (!(event instanceof r)) {
                throw new NoWhenBranchMatchedException();
            }
            r rVar = (r) event;
            k41.f fVar = rVar.f78333a;
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            int i13 = k41.c.f78303a[fVar.ordinal()];
            if (i13 == 1) {
                lVar = b22.l.WIDE;
            } else if (i13 == 2) {
                lVar = b22.l.DEFAULT;
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                lVar = b22.l.COMPACT;
            }
            resultBuilder.h(new d(lVar, 0));
            resultBuilder.f(new d(lVar, 1));
            resultBuilder.a(new l(lVar));
            resultBuilder.a(j.f78325a);
            resultBuilder.a(new h(((v) resultBuilder.f82219b).f78340c.f143086a, rVar.f78333a));
        }
        return resultBuilder.e();
    }
}
