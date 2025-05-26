package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final pm0.p f83867a;

    public g0(pm0.d0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f83867a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.d(this.f83867a, ((g0) obj).f83867a);
    }

    public final int hashCode() {
        return this.f83867a.hashCode();
    }

    public final String toString() {
        return "BoardLoadRequest(request=" + this.f83867a + ")";
    }
}
