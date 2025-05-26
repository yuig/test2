package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i1 implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f120339a;

    public i1(t0 t0Var) {
        this.f120339a = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && Intrinsics.d(this.f120339a, ((i1) obj).f120339a);
    }

    public final int hashCode() {
        t0 t0Var = this.f120339a;
        if (t0Var == null) {
            return 0;
        }
        return t0Var.hashCode();
    }

    public final String toString() {
        return "Data(v3GetUserHandlerQuery=" + this.f120339a + ")";
    }
}
