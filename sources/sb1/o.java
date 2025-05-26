package sb1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements r {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f112264a;

    public o(al1.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f112264a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f112264a, ((o) obj).f112264a);
    }

    public final int hashCode() {
        return this.f112264a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("WrappedNavigationSideEffectRequest(request="), this.f112264a, ")");
    }
}
