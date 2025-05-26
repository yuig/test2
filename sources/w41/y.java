package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final x31.c f128098a;

    public y(x31.c filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f128098a = filters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f128098a, ((y) obj).f128098a);
    }

    @Override // w41.a0
    public final x31.c getFilters() {
        return this.f128098a;
    }

    public final int hashCode() {
        return this.f128098a.hashCode();
    }

    public final String toString() {
        return "HiddenFilters(filters=" + this.f128098a + ")";
    }
}
