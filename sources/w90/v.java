package w90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements z {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f128580a;

    public v(o82.h0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f128580a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f128580a, ((v) obj).f128580a);
    }

    public final int hashCode() {
        return this.f128580a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("ListSideEffectRequest(request="), this.f128580a, ")");
    }
}
