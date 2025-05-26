package fa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ra0.c f61475a;

    static {
        ra0.c cVar = ra0.c.f106905d;
    }

    public b(ra0.c ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.f61475a = ids;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f61475a, ((b) obj).f61475a);
    }

    public final int hashCode() {
        return this.f61475a.hashCode();
    }

    public final String toString() {
        return "CheckRemixStatus(ids=" + this.f61475a + ")";
    }
}
