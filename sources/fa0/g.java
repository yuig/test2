package fa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f61485a;

    public g(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f61485a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f61485a, ((g) obj).f61485a);
    }

    public final int hashCode() {
        return this.f61485a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f61485a, ")");
    }
}
