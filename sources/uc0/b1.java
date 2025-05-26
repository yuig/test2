package uc0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 extends m {

    /* renamed from: g, reason: collision with root package name */
    public final oc0.h f121762g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(oc0.h eventManager, t0 state, l82.a scope) {
        super(eventManager, state, scope);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f121762g = eventManager;
    }

    @Override // uc0.m
    public final Object h(k kVar, bl2.c cVar) {
        Object emit;
        z0 z0Var = (z0) kVar;
        return ((z0Var instanceof y0) && (emit = ((oc0.j) this.f121762g).f94042a.emit(((y0) z0Var).f121884a, cVar)) == cl2.a.COROUTINE_SUSPENDED) ? emit : Unit.f80348a;
    }
}
