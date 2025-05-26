package v91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f125006a;

    public p(k92.n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f125006a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f125006a, ((p) obj).f125006a);
    }

    public final int hashCode() {
        return this.f125006a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("ToastSideEffectRequest(request="), this.f125006a, ")");
    }
}
