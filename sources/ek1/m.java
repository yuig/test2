package ek1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m implements q {

    /* renamed from: a, reason: collision with root package name */
    public final h32.z1 f59274a;

    public m(h32.z1 z1Var) {
        this.f59274a = z1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f59274a, ((m) obj).f59274a);
    }

    public final int hashCode() {
        h32.z1 z1Var = this.f59274a;
        if (z1Var == null) {
            return 0;
        }
        return z1Var.hashCode();
    }

    public final String toString() {
        return "DisplayDevToolsPinImpressionEnded(impression=" + this.f59274a + ")";
    }
}
