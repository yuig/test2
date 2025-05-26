package ra0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f107004a;

    public s0(t0 direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f107004a = direction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        s0Var.getClass();
        return Float.compare(0.75f, 0.75f) == 0 && this.f107004a == s0Var.f107004a;
    }

    public final int hashCode() {
        return this.f107004a.hashCode() + (Float.hashCode(0.75f) * 31);
    }

    public final String toString() {
        return "Overlap(percentage=0.75, direction=" + this.f107004a + ")";
    }
}
