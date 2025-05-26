package ml0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f87446a;

    public d0(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f87446a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f87446a, ((d0) obj).f87446a);
    }

    public final int hashCode() {
        return this.f87446a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f87446a, ")");
    }
}
