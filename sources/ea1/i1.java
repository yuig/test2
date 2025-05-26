package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f58064a;

    public i1(k92.n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f58064a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && Intrinsics.d(this.f58064a, ((i1) obj).f58064a);
    }

    public final int hashCode() {
        return this.f58064a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("ToastSideEffectRequest(request="), this.f58064a, ")");
    }
}
