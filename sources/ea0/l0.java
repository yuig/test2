package ea0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f57977a;

    public l0(k92.n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f57977a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f57977a, ((l0) obj).f57977a);
    }

    public final int hashCode() {
        return this.f57977a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("RemixToastSideEffectRequest(request="), this.f57977a, ")");
    }
}
