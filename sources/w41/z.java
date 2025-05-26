package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final x31.c f128099a;

    public z(x31.c filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f128099a = filters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f128099a, ((z) obj).f128099a);
    }

    @Override // w41.a0
    public final x31.c getFilters() {
        return this.f128099a;
    }

    public final int hashCode() {
        return this.f128099a.hashCode();
    }

    public final String toString() {
        return "ShownFilters(filters=" + this.f128099a + ")";
    }
}
