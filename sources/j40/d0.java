package j40;

import kotlin.jvm.internal.Intrinsics;
import pc.t0;

/* loaded from: classes5.dex */
public final class d0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f74599a;

    public d0(b0 b0Var) {
        this.f74599a = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f74599a, ((d0) obj).f74599a);
    }

    public final int hashCode() {
        b0 b0Var = this.f74599a;
        if (b0Var == null) {
            return 0;
        }
        return b0Var.hashCode();
    }

    public final String toString() {
        return "Data(v3OrientationStatusQuery=" + this.f74599a + ")";
    }
}
