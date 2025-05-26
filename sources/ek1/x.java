package ek1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.z1 f59390a;

    public x(h32.z1 z1Var) {
        this.f59390a = z1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f59390a, ((x) obj).f59390a);
    }

    public final int hashCode() {
        h32.z1 z1Var = this.f59390a;
        if (z1Var == null) {
            return 0;
        }
        return z1Var.hashCode();
    }

    public final String toString() {
        return "OnMarkImpressionEnd(finalImpression=" + this.f59390a + ")";
    }
}
