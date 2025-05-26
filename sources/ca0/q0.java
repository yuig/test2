package ca0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f27152a;

    public q0(al1.i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f27152a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && Intrinsics.d(this.f27152a, ((q0) obj).f27152a);
    }

    public final int hashCode() {
        return this.f27152a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationSideEffectRequest(request="), this.f27152a, ")");
    }
}
