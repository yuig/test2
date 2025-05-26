package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f21752a;

    public u0(s0 s0Var) {
        this.f21752a = s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && Intrinsics.d(this.f21752a, ((u0) obj).f21752a);
    }

    public final int hashCode() {
        s0 s0Var = this.f21752a;
        if (s0Var == null) {
            return 0;
        }
        return s0Var.hashCode();
    }

    public final String toString() {
        return "Data(v3UpdateObjectSubscriptionsForNotificationsGraphqlMutation=" + this.f21752a + ")";
    }
}
