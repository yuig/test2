package sb1;

import kotlin.jvm.internal.Intrinsics;
import zy.f0;
import zy.k0;

/* loaded from: classes5.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f112265a;

    public p(f0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f112265a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f112265a, ((p) obj).f112265a);
    }

    public final int hashCode() {
        return this.f112265a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsSideEffect(wrapped="), this.f112265a, ")");
    }
}
