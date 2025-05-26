package ns;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f91973a;

    public z(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f91973a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f91973a, ((z) obj).f91973a);
    }

    public final int hashCode() {
        return this.f91973a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f91973a, ")");
    }
}
