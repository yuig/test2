package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final ta0.j0 f82460a;

    public q0(ta0.i0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f82460a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && Intrinsics.d(this.f82460a, ((q0) obj).f82460a);
    }

    public final int hashCode() {
        return this.f82460a.hashCode();
    }

    public final String toString() {
        return "WrappedCollageDuplicateRequest(request=" + this.f82460a + ")";
    }
}
