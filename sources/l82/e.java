package l82;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public u50.o f82218a;

    /* renamed from: b, reason: collision with root package name */
    public i0 f82219b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f82220c;

    public e(u50.o initialDisplayState, i0 initialVMState, List initialSideEffects) {
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        Intrinsics.checkNotNullParameter(initialVMState, "initialVMState");
        Intrinsics.checkNotNullParameter(initialSideEffects, "initialSideEffects");
        this.f82218a = initialDisplayState;
        this.f82219b = initialVMState;
        this.f82220c = CollectionsKt.H0(initialSideEffects);
    }

    public final void a(h sideEffect) {
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        this.f82220c.add(sideEffect);
    }

    public final void b(List sideEffects) {
        Intrinsics.checkNotNullParameter(sideEffects, "sideEffects");
        this.f82220c.addAll(sideEffects);
    }

    public final void c(Function0 emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.f82220c.addAll((Collection) emitter.invoke());
    }

    public final void d(h... sideEffects) {
        Intrinsics.checkNotNullParameter(sideEffects, "sideEffects");
        for (h hVar : sideEffects) {
            this.f82220c.add(hVar);
        }
    }

    public final c0 e() {
        return new c0(this.f82218a, this.f82219b, CollectionsKt.F0(this.f82220c));
    }

    public final void f(Function1 update) {
        Intrinsics.checkNotNullParameter(update, "update");
        this.f82218a = (u50.o) update.invoke(this.f82218a);
    }

    public final void g(Function1 condition, Function1 update) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(update, "update");
        if (((Boolean) condition.invoke(this.f82218a)).booleanValue()) {
            f(update);
        }
    }

    public final void h(Function1 update) {
        Intrinsics.checkNotNullParameter(update, "update");
        this.f82219b = (i0) update.invoke(this.f82219b);
    }

    public e(u50.o oVar, i0 i0Var) {
        this(oVar, i0Var, q0.f80391a);
    }
}
