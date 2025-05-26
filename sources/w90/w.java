package w90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements z {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f128581a;

    public w(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f128581a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f128581a, ((w) obj).f128581a);
    }

    public final int hashCode() {
        return this.f128581a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f128581a, ")");
    }
}
