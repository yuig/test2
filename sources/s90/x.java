package s90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final ta0.g f112040a;

    public x(ta0.g request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f112040a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f112040a, ((x) obj).f112040a);
    }

    public final int hashCode() {
        return this.f112040a.hashCode();
    }

    public final String toString() {
        return "AddCutoutToCollageSideEffectRequest(request=" + this.f112040a + ")";
    }
}
