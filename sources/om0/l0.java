package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final ra0.s0 f96535a;

    public l0(ra0.s0 overlap) {
        Intrinsics.checkNotNullParameter(overlap, "overlap");
        this.f96535a = overlap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f96535a, ((l0) obj).f96535a);
    }

    public final int hashCode() {
        return this.f96535a.hashCode();
    }

    public final String toString() {
        return "PreviewImageStackStyle(overlap=" + this.f96535a + ")";
    }
}
