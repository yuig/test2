package fa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f61531a;

    public r0(o82.h0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f61531a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && Intrinsics.d(this.f61531a, ((r0) obj).f61531a);
    }

    public final int hashCode() {
        return this.f61531a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("SectionSideEffectRequest(request="), this.f61531a, ")");
    }
}
