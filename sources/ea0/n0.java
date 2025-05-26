package ea0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f57981a;

    public n0(o82.h0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f57981a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.d(this.f57981a, ((n0) obj).f57981a);
    }

    public final int hashCode() {
        return this.f57981a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("SectionSideEffectRequest(request="), this.f57981a, ")");
    }
}
