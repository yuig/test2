package s90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final ta0.l f112045a;

    public z(ta0.l request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f112045a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f112045a, ((z) obj).f112045a);
    }

    public final int hashCode() {
        return this.f112045a.hashCode();
    }

    public final String toString() {
        return "CutoutAdditionToastSideEffectRequest(request=" + this.f112045a + ")";
    }
}
