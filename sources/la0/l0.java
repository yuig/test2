package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f82422a;

    public l0(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f82422a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f82422a, ((l0) obj).f82422a);
    }

    public final int hashCode() {
        return this.f82422a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f82422a, ")");
    }
}
