package ha0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f68389a;

    public k(String sourcePinId) {
        Intrinsics.checkNotNullParameter(sourcePinId, "sourcePinId");
        this.f68389a = sourcePinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f68389a, ((k) obj).f68389a);
    }

    public final int hashCode() {
        return this.f68389a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RemixSourceCollageRequestArgs(sourcePinId="), this.f68389a, ")");
    }
}
