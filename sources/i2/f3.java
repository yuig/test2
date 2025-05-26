package i2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f3 extends s2.b0 {

    /* renamed from: c, reason: collision with root package name */
    public long f71117c;

    public f3(long j13) {
        this.f71117c = j13;
    }

    @Override // s2.b0
    public final void a(s2.b0 b0Var) {
        Intrinsics.g(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f71117c = ((f3) b0Var).f71117c;
    }

    @Override // s2.b0
    public final s2.b0 b() {
        return new f3(this.f71117c);
    }
}
