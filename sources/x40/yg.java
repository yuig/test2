package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yg {

    /* renamed from: a, reason: collision with root package name */
    public final xg f133752a;

    public yg(xg xgVar) {
        this.f133752a = xgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg) && Intrinsics.d(this.f133752a, ((yg) obj).f133752a);
    }

    public final int hashCode() {
        xg xgVar = this.f133752a;
        if (xgVar == null) {
            return 0;
        }
        return xgVar.hashCode();
    }

    public final String toString() {
        return "LinkUserWebsite(officialUser=" + this.f133752a + ")";
    }
}
