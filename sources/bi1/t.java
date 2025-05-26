package bi1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements y {

    /* renamed from: a, reason: collision with root package name */
    public final String f22879a;

    public t(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f22879a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f22879a, ((t) obj).f22879a);
    }

    public final int hashCode() {
        return this.f22879a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PerformClickthrough(pinId="), this.f22879a, ")");
    }
}
