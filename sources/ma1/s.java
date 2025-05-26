package ma1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements v {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f86811a;

    public s(k92.n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f86811a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f86811a, ((s) obj).f86811a);
    }

    public final int hashCode() {
        return this.f86811a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("ToastSideEffectRequestWrapper(request="), this.f86811a, ")");
    }
}
