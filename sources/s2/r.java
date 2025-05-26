package s2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public l2.c f110677c;

    /* renamed from: d, reason: collision with root package name */
    public int f110678d;

    /* renamed from: e, reason: collision with root package name */
    public int f110679e;

    public r(l2.c cVar) {
        this.f110677c = cVar;
    }

    @Override // s2.b0
    public final void a(b0 b0Var) {
        synchronized (u.f110684a) {
            Intrinsics.g(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
            this.f110677c = ((r) b0Var).f110677c;
            this.f110678d = ((r) b0Var).f110678d;
            this.f110679e = ((r) b0Var).f110679e;
            Unit unit = Unit.f80348a;
        }
    }

    @Override // s2.b0
    public final b0 b() {
        return new r(this.f110677c);
    }
}
