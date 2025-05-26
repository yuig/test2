package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f82416a;

    public k0(o82.h0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f82416a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && Intrinsics.d(this.f82416a, ((k0) obj).f82416a);
    }

    public final int hashCode() {
        return this.f82416a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("ListSideEffectRequest(request="), this.f82416a, ")");
    }
}
