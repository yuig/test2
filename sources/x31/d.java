package x31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final u41.b f131619a;

    public d(u41.b filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f131619a = filters;
    }

    public static d a(u41.b filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new d(filters);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f131619a, ((d) obj).f131619a);
    }

    public final int hashCode() {
        return this.f131619a.hashCode();
    }

    public final String toString() {
        return "FilterBarDisplayStyle(filters=" + this.f131619a + ")";
    }
}
