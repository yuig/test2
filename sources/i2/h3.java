package i2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h3 extends s2.b0 {

    /* renamed from: c, reason: collision with root package name */
    public Object f71124c;

    public h3(Object obj) {
        this.f71124c = obj;
    }

    @Override // s2.b0
    public final void a(s2.b0 b0Var) {
        Intrinsics.g(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f71124c = ((h3) b0Var).f71124c;
    }

    @Override // s2.b0
    public final s2.b0 b() {
        return new h3(this.f71124c);
    }
}
