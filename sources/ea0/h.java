package ea0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f57959a;

    public h(al1.i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f57959a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f57959a, ((h) obj).f57959a);
    }

    public final int hashCode() {
        return this.f57959a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationSideEffectRequest(request="), this.f57959a, ")");
    }
}
