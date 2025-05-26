package w90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements z {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f128583a;

    public y(al1.i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f128583a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f128583a, ((y) obj).f128583a);
    }

    public final int hashCode() {
        return this.f128583a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationSideEffectRequest(request="), this.f128583a, ")");
    }
}
