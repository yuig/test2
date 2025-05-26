package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f82469a;

    public u0(k92.n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f82469a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && Intrinsics.d(this.f82469a, ((u0) obj).f82469a);
    }

    public final int hashCode() {
        return this.f82469a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("WrappedToastSideEffectRequest(request="), this.f82469a, ")");
    }
}
