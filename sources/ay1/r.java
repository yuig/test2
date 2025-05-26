package ay1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r implements x {

    /* renamed from: a, reason: collision with root package name */
    public final String f20684a;

    public r(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f20684a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f20684a, ((r) obj).f20684a);
    }

    public final int hashCode() {
        return this.f20684a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("FetchAllPinStats(id="), this.f20684a, ")");
    }
}
