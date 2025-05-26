package p90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f99178a;

    public c0(o82.h0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f99178a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.f99178a, ((c0) obj).f99178a);
    }

    public final int hashCode() {
        return this.f99178a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("ListSideEffectRequest(request="), this.f99178a, ")");
    }
}
