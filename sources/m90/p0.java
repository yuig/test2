package m90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f86684a;

    /* renamed from: b, reason: collision with root package name */
    public final za0.b f86685b;

    public p0(String query) {
        za0.b type = za0.b.All;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f86684a = query;
        this.f86685b = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.d(this.f86684a, p0Var.f86684a) && this.f86685b == p0Var.f86685b;
    }

    public final int hashCode() {
        return this.f86685b.hashCode() + (this.f86684a.hashCode() * 31);
    }

    public final String toString() {
        return "LaunchSearch(query=" + this.f86684a + ", type=" + this.f86685b + ")";
    }
}
