package ui1;

import h32.s0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements q {

    /* renamed from: a, reason: collision with root package name */
    public final hk1.n f122298a;

    public k(hk1.n viewBasedConstructorArgs) {
        Intrinsics.checkNotNullParameter(viewBasedConstructorArgs, "viewBasedConstructorArgs");
        this.f122298a = viewBasedConstructorArgs;
        s0 s0Var = u0.Companion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f122298a, ((k) obj).f122298a);
    }

    public final int hashCode() {
        return this.f122298a.hashCode();
    }

    public final String toString() {
        return "Overflow(viewBasedConstructorArgs=" + this.f122298a + ")";
    }
}
