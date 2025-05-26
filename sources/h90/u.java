package h90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f68306a;

    public u(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f68306a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f68306a, ((u) obj).f68306a);
    }

    public final int hashCode() {
        return this.f68306a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f68306a, ")");
    }
}
