package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 implements c1 {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f124870a;

    public b1(al1.i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f124870a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && Intrinsics.d(this.f124870a, ((b1) obj).f124870a);
    }

    public final int hashCode() {
        return this.f124870a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationSideEffectRequest(request="), this.f124870a, ")");
    }
}
