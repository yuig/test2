package il0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public final sk0.u f72530a;

    public g(sk0.u sideEffectRequest) {
        Intrinsics.checkNotNullParameter(sideEffectRequest, "sideEffectRequest");
        this.f72530a = sideEffectRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f72530a, ((g) obj).f72530a);
    }

    public final int hashCode() {
        return this.f72530a.hashCode();
    }

    public final String toString() {
        return "FloatingToolbarRequest(sideEffectRequest=" + this.f72530a + ")";
    }
}
