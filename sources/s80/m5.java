package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m5 implements b6 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f111678a;

    public m5(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f111678a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5) && Intrinsics.d(this.f111678a, ((m5) obj).f111678a);
    }

    public final int hashCode() {
        return this.f111678a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f111678a, ")");
    }
}
