package com.pinterest.feature.unauth.sba;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 implements wt1.d {

    /* renamed from: a, reason: collision with root package name */
    public final y f48864a = y.f48879a;

    /* renamed from: b, reason: collision with root package name */
    public final v f48865b = v.f48877m;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f48866c;

    public r0(s0 s0Var) {
        this.f48866c = s0Var;
    }

    @Override // l82.i
    public final do2.i a() {
        return lb.l0.i0(this.f48865b.invoke(this.f48864a));
    }

    @Override // wt1.d
    public final u50.o b(l82.i0 i0Var, boolean z13) {
        e0 startState = (e0) i0Var;
        Intrinsics.checkNotNullParameter(startState, "startState");
        return (c0) this.f48865b.invoke(startState);
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f48866c.f48869e.e();
    }
}
