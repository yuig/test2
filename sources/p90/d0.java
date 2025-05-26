package p90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f99182a;

    public d0(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f99182a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f99182a, ((d0) obj).f99182a);
    }

    public final int hashCode() {
        return this.f99182a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f99182a, ")");
    }
}
