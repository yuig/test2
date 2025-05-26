package bx1;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes4.dex */
public final class m implements q {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f24110a;

    public m(e0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f24110a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f24110a, ((m) obj).f24110a);
    }

    public final int hashCode() {
        return this.f24110a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f24110a, ")");
    }
}
