package um0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f122692a;

    public c0(zy.f0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f122692a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.f122692a, ((c0) obj).f122692a);
    }

    public final int hashCode() {
        return this.f122692a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("OrganizeLoggingRequest(request="), this.f122692a, ")");
    }
}
