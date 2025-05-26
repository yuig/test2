package s90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f111968a;

    public d0(al1.i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f111968a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f111968a, ((d0) obj).f111968a);
    }

    public final int hashCode() {
        return this.f111968a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationSideEffectRequest(request="), this.f111968a, ")");
    }
}
