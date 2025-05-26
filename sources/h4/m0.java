package h4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f67592a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f67593b;

    public m0(g0 g0Var, a0 a0Var) {
        this.f67592a = g0Var;
        this.f67593b = a0Var;
    }

    public final void a(f0 f0Var, f0 f0Var2) {
        if (Intrinsics.d((m0) this.f67592a.f67563b.get(), this)) {
            this.f67593b.c(f0Var, f0Var2);
        }
    }
}
