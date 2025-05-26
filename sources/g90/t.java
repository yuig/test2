package g90;

import kotlin.jvm.internal.Intrinsics;
import zy.k0;

/* loaded from: classes5.dex */
public final class t implements v {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f64564a;

    public t(k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f64564a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f64564a, ((t) obj).f64564a);
    }

    public final int hashCode() {
        return this.f64564a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f64564a, ")");
    }
}
