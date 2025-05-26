package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h7 {

    /* renamed from: a, reason: collision with root package name */
    public final g7 f132491a;

    public h7(g7 g7Var) {
        this.f132491a = g7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7) && Intrinsics.d(this.f132491a, ((h7) obj).f132491a);
    }

    public final int hashCode() {
        g7 g7Var = this.f132491a;
        if (g7Var == null) {
            return 0;
        }
        return g7Var.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.f132491a + ")";
    }
}
