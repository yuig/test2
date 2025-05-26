package hp0;

import kotlin.jvm.internal.Intrinsics;
import zy.k0;

/* loaded from: classes5.dex */
public final class v implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f69885a;

    public v(zy.e0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f69885a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f69885a, ((v) obj).f69885a);
    }

    public final int hashCode() {
        return this.f69885a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f69885a, ")");
    }
}
