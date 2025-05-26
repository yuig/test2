package com.pinterest.feature.unauth.sba;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f48845b;

    public o0(o82.i0 multiSectionStateTransformer) {
        Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
        this.f48845b = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: com.pinterest.feature.unauth.sba.k0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((i) obj).f48831i;
            }
        }, new kotlin.jvm.internal.d0() { // from class: com.pinterest.feature.unauth.sba.l0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((p0) obj).f48857i;
            }
        }, n0.f48842i);
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        p0 vmState = (p0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e d2 = l82.d.d(new i("", "", "", "", "", "", "", "", new o82.a0()), vmState);
        com.google.firebase.messaging.a0 transformation = this.f48845b.e();
        Intrinsics.checkNotNullParameter(d2, "<this>");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        transformation.i(d2);
        return d2.e();
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        n event = (n) sVar;
        i priorDisplayState = (i) oVar;
        p0 priorVMState = (p0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (event instanceof j) {
            j jVar = (j) event;
            resultBuilder.a(new g0(jVar.f48834b, jVar.f48833a));
            return resultBuilder.e();
        }
        if (event instanceof k) {
            resultBuilder.a(f0.f48811a);
            return resultBuilder.e();
        }
        if (event instanceof l) {
            resultBuilder.a(h0.f48822a);
            return resultBuilder.e();
        }
        if (!(event instanceof m)) {
            throw new NoWhenBranchMatchedException();
        }
        l82.f0 transformation = this.f48845b.c(((m) event).f48839a);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        transformation.i(resultBuilder);
        return resultBuilder.e();
    }
}
