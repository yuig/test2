package x31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final u41.a f131615a;

    /* renamed from: b, reason: collision with root package name */
    public final int f131616b;

    public b(u41.a filters, int i13) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f131615a = filters;
        this.f131616b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f131615a, bVar.f131615a) && this.f131616b == bVar.f131616b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f131616b) + (this.f131615a.f120474a.hashCode() * 31);
    }

    public final String toString() {
        return "FilterBarComponentDisplayState(filters=" + this.f131615a + ", labelResId=" + this.f131616b + ")";
    }
}
