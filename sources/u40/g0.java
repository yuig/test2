package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f120327a;

    public g0(d0 d0Var) {
        this.f120327a = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.d(this.f120327a, ((g0) obj).f120327a);
    }

    public final int hashCode() {
        d0 d0Var = this.f120327a;
        if (d0Var == null) {
            return 0;
        }
        return d0Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.f120327a + ")";
    }
}
