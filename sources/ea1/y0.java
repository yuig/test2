package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final zb0.k f58171a;

    public y0(zb0.j request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f58171a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && Intrinsics.d(this.f58171a, ((y0) obj).f58171a);
    }

    public final int hashCode() {
        return this.f58171a.hashCode();
    }

    public final String toString() {
        return "AlertSideEffectRequest(request=" + this.f58171a + ")";
    }
}
