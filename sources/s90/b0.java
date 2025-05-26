package s90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final sa0.f0 f111964a;

    public b0(sa0.e0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f111964a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f111964a, ((b0) obj).f111964a);
    }

    public final int hashCode() {
        return this.f111964a.hashCode();
    }

    public final String toString() {
        return "CutoutRepinPrepSideEffectRequest(request=" + this.f111964a + ")";
    }
}
