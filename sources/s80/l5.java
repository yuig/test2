package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l5 implements b6 {

    /* renamed from: a, reason: collision with root package name */
    public final t80.z f111662a;

    public l5(t80.z request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f111662a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5) && Intrinsics.d(this.f111662a, ((l5) obj).f111662a);
    }

    public final int hashCode() {
        return this.f111662a.hashCode();
    }

    public final String toString() {
        return "EmptyStateCarouselSideEffectRequest(request=" + this.f111662a + ")";
    }
}
