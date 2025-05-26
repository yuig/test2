package ka0;

import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import l82.i0;
import p90.n0;

/* loaded from: classes5.dex */
public final class t extends l82.d {
    @Override // l82.d
    public final c0 c(i0 i0Var) {
        v vmState = (v) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        return l82.d.d(new a(1), vmState).e();
    }

    @Override // l82.d
    public final c0 f(u50.s sVar, u50.o oVar, i0 i0Var, l82.e resultBuilder) {
        d event = (d) sVar;
        a priorDisplayState = (a) oVar;
        v priorVMState = (v) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof c) {
            resultBuilder.f(new n0(event, 25));
        } else if (event instanceof b) {
            resultBuilder.d(new r());
        }
        return resultBuilder.e();
    }
}
