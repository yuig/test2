package cj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f27867a;

    public t0(al1.i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f27867a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && Intrinsics.d(this.f27867a, ((t0) obj).f27867a);
    }

    public final int hashCode() {
        return this.f27867a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationRequest(request="), this.f27867a, ")");
    }
}
