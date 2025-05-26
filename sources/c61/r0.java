package c61;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f26638a;

    public r0(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f26638a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && Intrinsics.d(this.f26638a, ((r0) obj).f26638a);
    }

    public final int hashCode() {
        return this.f26638a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f26638a, ")");
    }
}
