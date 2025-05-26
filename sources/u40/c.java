package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements e {

    /* renamed from: d, reason: collision with root package name */
    public final String f120311d;

    public c(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120311d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f120311d, ((c) obj).f120311d);
    }

    public final int hashCode() {
        return this.f120311d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3EditSettingsHandlerResponse(__typename="), this.f120311d, ")");
    }
}
