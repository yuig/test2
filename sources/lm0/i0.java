package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final sk0.u f83871a;

    public i0(sk0.u request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f83871a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f83871a, ((i0) obj).f83871a);
    }

    public final int hashCode() {
        return this.f83871a.hashCode();
    }

    public final String toString() {
        return "BoardToolsRequest(request=" + this.f83871a + ")";
    }
}
