package i2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z2 extends s2.b0 {

    /* renamed from: c, reason: collision with root package name */
    public double f71425c;

    public z2(double d2) {
        this.f71425c = d2;
    }

    @Override // s2.b0
    public final void a(s2.b0 b0Var) {
        Intrinsics.g(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.f71425c = ((z2) b0Var).f71425c;
    }

    @Override // s2.b0
    public final s2.b0 b() {
        return new z2(this.f71425c);
    }
}
