package x91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final zb0.k f134363a;

    public z(zb0.j request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f134363a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f134363a, ((z) obj).f134363a);
    }

    public final int hashCode() {
        return this.f134363a.hashCode();
    }

    public final String toString() {
        return "UnblockAlertRequest(request=" + this.f134363a + ")";
    }
}
