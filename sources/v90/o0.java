package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 implements c1 {

    /* renamed from: a, reason: collision with root package name */
    public final sa0.f0 f124950a;

    public o0(sa0.e0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f124950a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && Intrinsics.d(this.f124950a, ((o0) obj).f124950a);
    }

    public final int hashCode() {
        return this.f124950a.hashCode();
    }

    public final String toString() {
        return "CutoutRepinPrepSideEffectRequest(request=" + this.f124950a + ")";
    }
}
