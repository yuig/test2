package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r1 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f136490a;

    public r1(zy.k0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f136490a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1) && Intrinsics.d(this.f136490a, ((r1) obj).f136490a);
    }

    public final int hashCode() {
        return this.f136490a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsSER(wrapped="), this.f136490a, ")");
    }
}
