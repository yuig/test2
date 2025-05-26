package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 implements t0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f120424d;

    public s0(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120424d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && Intrinsics.d(this.f120424d, ((s0) obj).f120424d);
    }

    public final int hashCode() {
        return this.f120424d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3GetUserHandlerQuery(__typename="), this.f120424d, ")");
    }
}
