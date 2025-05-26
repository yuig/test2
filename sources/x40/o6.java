package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o6 implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final n6 f132941a;

    public o6(n6 n6Var) {
        this.f132941a = n6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6) && Intrinsics.d(this.f132941a, ((o6) obj).f132941a);
    }

    public final int hashCode() {
        n6 n6Var = this.f132941a;
        if (n6Var == null) {
            return 0;
        }
        return n6Var.hashCode();
    }

    public final String toString() {
        return "Data(v3DeclineContactRequestsMutation=" + this.f132941a + ")";
    }
}
