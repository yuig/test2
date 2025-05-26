package ck1;

import i1.y;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import l82.e;
import l82.i0;
import u50.b0;
import u50.o;
import u50.s;

/* loaded from: classes2.dex */
public final class c extends l82.d {
    @Override // l82.d
    public final c0 c(i0 i0Var) {
        d vmState = (d) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        return l82.d.d(new a(), vmState).e();
    }

    @Override // l82.d
    public final c0 f(s sVar, o oVar, i0 i0Var, e resultBuilder) {
        b event = (b) sVar;
        a priorDisplayState = (a) oVar;
        d priorVMState = (d) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if ((event instanceof b) && !((d) resultBuilder.f82219b).f27912e) {
            resultBuilder.f(new y(e0.b(new ak1.b(new b0(ni1.e0.f90644c), "FooterZonePadding - GRID_CARD_PADDING_RES")), 3));
        }
        return resultBuilder.e();
    }
}
