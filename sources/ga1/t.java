package ga1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements v {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f64653a;

    public t(k92.n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f64653a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f64653a, ((t) obj).f64653a);
    }

    public final int hashCode() {
        return this.f64653a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("ToastSideEffectRequest(request="), this.f64653a, ")");
    }
}
