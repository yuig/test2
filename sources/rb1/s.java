package rb1;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes5.dex */
public final class s implements t {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f107094a;

    public s(e0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f107094a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f107094a, ((s) obj).f107094a);
    }

    public final int hashCode() {
        return this.f107094a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsSideEffectRequest(wrapped="), this.f107094a, ")");
    }
}
