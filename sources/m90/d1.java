package m90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d1 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f86645a;

    public d1(u50.i0 query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f86645a = query;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && Intrinsics.d(this.f86645a, ((d1) obj).f86645a);
    }

    public final int hashCode() {
        return this.f86645a.hashCode();
    }

    public final String toString() {
        return "Shown(query=" + this.f86645a + ")";
    }
}
