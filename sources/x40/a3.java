package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public final z2 f131912a;

    public a3(z2 z2Var) {
        this.f131912a = z2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3) && Intrinsics.d(this.f131912a, ((a3) obj).f131912a);
    }

    public final int hashCode() {
        z2 z2Var = this.f131912a;
        if (z2Var == null) {
            return 0;
        }
        return z2Var.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.f131912a + ")";
    }
}
