package w90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements z {

    /* renamed from: a, reason: collision with root package name */
    public final ta0.g f128578a;

    public t(ta0.g request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f128578a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f128578a, ((t) obj).f128578a);
    }

    public final int hashCode() {
        return this.f128578a.hashCode();
    }

    public final String toString() {
        return "AddPinToCollageSideEffectRequest(request=" + this.f128578a + ")";
    }
}
