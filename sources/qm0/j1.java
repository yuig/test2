package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f104287a;

    public j1(zy.k0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f104287a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && Intrinsics.d(this.f104287a, ((j1) obj).f104287a);
    }

    public final int hashCode() {
        return this.f104287a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f104287a, ")");
    }
}
