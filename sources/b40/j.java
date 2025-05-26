package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: d, reason: collision with root package name */
    public final String f21718d;

    public j(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f21718d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f21718d, ((j) obj).f21718d);
    }

    public final int hashCode() {
        return this.f21718d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3GetCurrentUserHandlerQuery(__typename="), this.f21718d, ")");
    }
}
