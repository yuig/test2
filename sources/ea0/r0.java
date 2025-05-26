package ea0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ra0.c f57999a;

    static {
        ra0.c cVar = ra0.c.f106905d;
    }

    public r0(ra0.c ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.f57999a = ids;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && Intrinsics.d(this.f57999a, ((r0) obj).f57999a);
    }

    public final int hashCode() {
        return this.f57999a.hashCode();
    }

    public final String toString() {
        return "UseTemplateClicked(ids=" + this.f57999a + ")";
    }
}
