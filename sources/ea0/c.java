package ea0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ra0.c f57948a;

    static {
        ra0.c cVar = ra0.c.f106905d;
    }

    public c(ra0.c ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.f57948a = ids;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f57948a, ((c) obj).f57948a);
    }

    public final int hashCode() {
        return this.f57948a.hashCode();
    }

    public final String toString() {
        return "FeaturedCollageClicked(ids=" + this.f57948a + ")";
    }
}
