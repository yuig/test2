package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements c1 {

    /* renamed from: a, reason: collision with root package name */
    public final ta0.g f124934a;

    public l0(ta0.g request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f124934a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f124934a, ((l0) obj).f124934a);
    }

    public final int hashCode() {
        return this.f124934a.hashCode();
    }

    public final String toString() {
        return "AddCutoutToCollageSideEffectRequest(request=" + this.f124934a + ")";
    }
}
