package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements t {

    /* renamed from: d, reason: collision with root package name */
    public final String f120423d;

    public s(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120423d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f120423d, ((s) obj).f120423d);
    }

    public final int hashCode() {
        return this.f120423d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3GetCurrentUserHandlerQuery(__typename="), this.f120423d, ")");
    }
}
