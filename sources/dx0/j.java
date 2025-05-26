package dx0;

import kotlin.jvm.internal.Intrinsics;
import o82.h0;

/* loaded from: classes5.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f56441a;

    public j(h0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f56441a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f56441a, ((j) obj).f56441a);
    }

    public final int hashCode() {
        return this.f56441a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("ListSideEffectRequest(request="), this.f56441a, ")");
    }
}
