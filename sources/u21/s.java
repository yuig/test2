package u21;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f120121a;

    public s(al1.f request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f120121a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f120121a, ((s) obj).f120121a);
    }

    public final int hashCode() {
        return this.f120121a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationSideEffectRequest(request="), this.f120121a, ")");
    }
}
