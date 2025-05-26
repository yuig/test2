package h90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements w {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f68307a;

    public v(al1.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f68307a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f68307a, ((v) obj).f68307a);
    }

    public final int hashCode() {
        return this.f68307a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationSideEffectRequest(request="), this.f68307a, ")");
    }
}
