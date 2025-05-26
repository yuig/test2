package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f120410a;

    public o0(i0 i0Var) {
        this.f120410a = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && Intrinsics.d(this.f120410a, ((o0) obj).f120410a);
    }

    public final int hashCode() {
        i0 i0Var = this.f120410a;
        if (i0Var == null) {
            return 0;
        }
        return i0Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.f120410a + ")";
    }
}
