package y90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f138214a;

    public o0(k92.n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f138214a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && Intrinsics.d(this.f138214a, ((o0) obj).f138214a);
    }

    public final int hashCode() {
        return this.f138214a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("ToastEffectRequest(request="), this.f138214a, ")");
    }
}
