package x91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f134361a;

    public x(zy.e0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f134361a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f134361a, ((x) obj).f134361a);
    }

    public final int hashCode() {
        return this.f134361a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingRequest(request="), this.f134361a, ")");
    }
}
