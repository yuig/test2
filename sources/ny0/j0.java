package ny0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f92599a;

    public j0(zy.k0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f92599a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Intrinsics.d(this.f92599a, ((j0) obj).f92599a);
    }

    public final int hashCode() {
        return this.f92599a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingRequest(wrapped="), this.f92599a, ")");
    }
}
