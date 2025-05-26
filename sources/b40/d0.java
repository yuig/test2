package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements e0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f21704d;

    public d0(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f21704d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f21704d, ((d0) obj).f21704d);
    }

    public final int hashCode() {
        return this.f21704d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3GetNewsSummaryQuery(__typename="), this.f21704d, ")");
    }
}
