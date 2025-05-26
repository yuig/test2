package fa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f61487a;

    public h(al1.i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f61487a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f61487a, ((h) obj).f61487a);
    }

    public final int hashCode() {
        return this.f61487a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationSideEffectRequest(request="), this.f61487a, ")");
    }
}
