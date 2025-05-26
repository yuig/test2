package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fi implements gi {

    /* renamed from: d, reason: collision with root package name */
    public final String f132419d;

    public fi(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132419d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fi) && Intrinsics.d(this.f132419d, ((fi) obj).f132419d);
    }

    public final int hashCode() {
        return this.f132419d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3ReportContactRequestsMutation(__typename="), this.f132419d, ")");
    }
}
