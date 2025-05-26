package m90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f86670a;

    public l0(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f86670a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f86670a, ((l0) obj).f86670a);
    }

    public final int hashCode() {
        return this.f86670a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f86670a, ")");
    }
}
