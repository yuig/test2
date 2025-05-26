package bk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m1 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f23268a;

    public m1(zy.k0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f23268a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1) && Intrinsics.d(this.f23268a, ((m1) obj).f23268a);
    }

    public final int hashCode() {
        return this.f23268a.hashCode();
    }

    public final zy.k0 j() {
        return this.f23268a;
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsSideEffectRequest(wrapped="), this.f23268a, ")");
    }
}
