package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x4 implements z40.j {

    /* renamed from: a, reason: collision with root package name */
    public final w4 f133672a;

    public x4(w4 w4Var) {
        this.f133672a = w4Var;
    }

    @Override // z40.j
    public final z40.i a() {
        return this.f133672a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4) && Intrinsics.d(this.f133672a, ((x4) obj).f133672a);
    }

    public final int hashCode() {
        w4 w4Var = this.f133672a;
        if (w4Var == null) {
            return 0;
        }
        return w4Var.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.f133672a + ")";
    }
}
