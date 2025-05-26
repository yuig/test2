package i2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d3 extends s2.b0 {

    /* renamed from: c, reason: collision with root package name */
    public int f71099c;

    public d3(int i13) {
        this.f71099c = i13;
    }

    @Override // s2.b0
    public final void a(s2.b0 b0Var) {
        Intrinsics.g(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f71099c = ((d3) b0Var).f71099c;
    }

    @Override // s2.b0
    public final s2.b0 b() {
        return new d3(this.f71099c);
    }
}
