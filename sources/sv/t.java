package sv;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f115313a;

    public t(al1.f request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f115313a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f115313a, ((t) obj).f115313a);
    }

    public final int hashCode() {
        return this.f115313a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationSideEffectRequest(request="), this.f115313a, ")");
    }
}
