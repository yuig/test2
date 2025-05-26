package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h6 implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final g6 f132490a;

    public h6(g6 g6Var) {
        this.f132490a = g6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h6) && Intrinsics.d(this.f132490a, ((h6) obj).f132490a);
    }

    public final int hashCode() {
        g6 g6Var = this.f132490a;
        if (g6Var == null) {
            return 0;
        }
        return g6Var.hashCode();
    }

    public final String toString() {
        return "Data(v3CreateThreadMutation=" + this.f132490a + ")";
    }
}
