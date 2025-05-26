package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f120315a;

    public d(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120315a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f120315a, ((d) obj).f120315a);
    }

    public final int hashCode() {
        return this.f120315a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3UsersMeViewerResponse(__typename="), this.f120315a, ")");
    }
}
