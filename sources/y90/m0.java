package y90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f138203a;

    public m0(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f138203a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && Intrinsics.d(this.f138203a, ((m0) obj).f138203a);
    }

    public final int hashCode() {
        return this.f138203a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f138203a, ")");
    }
}
