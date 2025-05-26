package w90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements z {

    /* renamed from: a, reason: collision with root package name */
    public final ta0.l f128579a;

    public u(ta0.l request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f128579a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f128579a, ((u) obj).f128579a);
    }

    public final int hashCode() {
        return this.f128579a.hashCode();
    }

    public final String toString() {
        return "CutoutAdditionToastSideEffectRequest(request=" + this.f128579a + ")";
    }
}
