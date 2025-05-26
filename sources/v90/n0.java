package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements c1 {

    /* renamed from: a, reason: collision with root package name */
    public final s90.z0 f124948a;

    public n0(s90.z0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f124948a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.d(this.f124948a, ((n0) obj).f124948a);
    }

    public final int hashCode() {
        return this.f124948a.hashCode();
    }

    public final String toString() {
        return "CutoutLegacyNavigationSideEffectRequest(request=" + this.f124948a + ")";
    }
}
