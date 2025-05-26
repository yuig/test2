package g90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements v {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f64565a;

    public u(al1.f request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f64565a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f64565a, ((u) obj).f64565a);
    }

    public final int hashCode() {
        return this.f64565a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationSideEffectRequest(request="), this.f64565a, ")");
    }
}
