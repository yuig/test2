package sb1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f112266a;

    public q(k92.n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f112266a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f112266a, ((q) obj).f112266a);
    }

    public final int hashCode() {
        return this.f112266a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("WrappedToastSideEffectRequest(request="), this.f112266a, ")");
    }
}
