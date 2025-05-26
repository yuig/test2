package y90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final sa0.f0 f138171a;

    public f0(sa0.e0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f138171a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.f138171a, ((f0) obj).f138171a);
    }

    public final int hashCode() {
        return this.f138171a.hashCode();
    }

    public final String toString() {
        return "CutoutRepinPrepSideEffectRequest(request=" + this.f138171a + ")";
    }
}
