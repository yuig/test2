package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final zb0.k f82458a;

    public p0(zb0.j request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f82458a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && Intrinsics.d(this.f82458a, ((p0) obj).f82458a);
    }

    public final int hashCode() {
        return this.f82458a.hashCode();
    }

    public final String toString() {
        return "WrappedAlertSideEffectRequest(request=" + this.f82458a + ")";
    }
}
