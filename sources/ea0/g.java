package ea0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f57957a;

    public g(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f57957a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f57957a, ((g) obj).f57957a);
    }

    public final int hashCode() {
        return this.f57957a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f57957a, ")");
    }
}
