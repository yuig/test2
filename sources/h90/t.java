package h90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements w {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f68305a;

    public t(o82.h0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f68305a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f68305a, ((t) obj).f68305a);
    }

    public final int hashCode() {
        return this.f68305a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("ListSideEffectRequest(request="), this.f68305a, ")");
    }
}
