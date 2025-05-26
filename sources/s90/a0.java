package s90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f111962a;

    public a0(z0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f111962a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f111962a, ((a0) obj).f111962a);
    }

    public final int hashCode() {
        return this.f111962a.hashCode();
    }

    public final String toString() {
        return "CutoutLegacyNavigationSideEffectRequest(request=" + this.f111962a + ")";
    }
}
