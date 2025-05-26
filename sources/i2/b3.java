package i2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b3 extends s2.b0 {

    /* renamed from: c, reason: collision with root package name */
    public float f71079c;

    public b3(float f13) {
        this.f71079c = f13;
    }

    @Override // s2.b0
    public final void a(s2.b0 b0Var) {
        Intrinsics.g(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f71079c = ((b3) b0Var).f71079c;
    }

    @Override // s2.b0
    public final s2.b0 b() {
        return new b3(this.f71079c);
    }
}
