package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k1 implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f132628a;

    public k1(i1 i1Var) {
        this.f132628a = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && Intrinsics.d(this.f132628a, ((k1) obj).f132628a);
    }

    public final int hashCode() {
        i1 i1Var = this.f132628a;
        if (i1Var == null) {
            return 0;
        }
        return i1Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.f132628a + ")";
    }
}
