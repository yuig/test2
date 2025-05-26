package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ad implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final ic f131964a;

    public ad(ic icVar) {
        this.f131964a = icVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ad) && Intrinsics.d(this.f131964a, ((ad) obj).f131964a);
    }

    public final int hashCode() {
        ic icVar = this.f131964a;
        if (icVar == null) {
            return 0;
        }
        return icVar.hashCode();
    }

    public final String toString() {
        return "Data(v3GetUserContactRequestsByUserQuery=" + this.f131964a + ")";
    }
}
