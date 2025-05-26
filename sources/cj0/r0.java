package cj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f27864a;

    public r0(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f27864a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && Intrinsics.d(this.f27864a, ((r0) obj).f27864a);
    }

    public final int hashCode() {
        return this.f27864a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f27864a, ")");
    }
}
