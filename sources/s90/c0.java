package s90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f111966a;

    public c0(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f111966a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.f111966a, ((c0) obj).f111966a);
    }

    public final int hashCode() {
        return this.f111966a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f111966a, ")");
    }
}
