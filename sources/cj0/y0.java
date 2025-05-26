package cj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f27881a;

    public y0(o82.h0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f27881a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && Intrinsics.d(this.f27881a, ((y0) obj).f27881a);
    }

    public final int hashCode() {
        return this.f27881a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("SectionRequest(request="), this.f27881a, ")");
    }
}
