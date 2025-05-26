package ta0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f116886a;

    public i0(String collageId) {
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        this.f116886a = collageId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f116886a, ((i0) obj).f116886a);
    }

    public final int hashCode() {
        return this.f116886a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DuplicateFromId(collageId="), this.f116886a, ")");
    }
}
