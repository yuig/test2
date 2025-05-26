package ca0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f27151a;

    public p0(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f27151a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && Intrinsics.d(this.f27151a, ((p0) obj).f27151a);
    }

    public final int hashCode() {
        return this.f27151a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f27151a, ")");
    }
}
