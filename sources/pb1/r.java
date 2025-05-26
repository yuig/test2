package pb1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f99479a;

    public r(k92.n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f99479a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f99479a, ((r) obj).f99479a);
    }

    public final int hashCode() {
        return this.f99479a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("WrappedToastSideEffectRequest(request="), this.f99479a, ")");
    }
}
