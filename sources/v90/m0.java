package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 implements c1 {

    /* renamed from: a, reason: collision with root package name */
    public final ta0.l f124944a;

    public m0(ta0.l request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f124944a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && Intrinsics.d(this.f124944a, ((m0) obj).f124944a);
    }

    public final int hashCode() {
        return this.f124944a.hashCode();
    }

    public final String toString() {
        return "CutoutAdditionToastSideEffectRequest(request=" + this.f124944a + ")";
    }
}
