package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f21706a;

    public f0(e0 e0Var) {
        this.f21706a = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.f21706a, ((f0) obj).f21706a);
    }

    public final int hashCode() {
        e0 e0Var = this.f21706a;
        if (e0Var == null) {
            return 0;
        }
        return e0Var.hashCode();
    }

    public final String toString() {
        return "Data(v3GetNewsSummaryQuery=" + this.f21706a + ")";
    }
}
