package jx1;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes4.dex */
public final class n implements r {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f77692a;

    public n(e0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f77692a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f77692a, ((n) obj).f77692a);
    }

    public final int hashCode() {
        return this.f77692a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f77692a, ")");
    }
}
