package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f83889a;

    public o0(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f83889a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && Intrinsics.d(this.f83889a, ((o0) obj).f83889a);
    }

    public final int hashCode() {
        return this.f83889a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f83889a, ")");
    }
}
