package ga1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final e82.w f64616a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f64617b;

    public b(e82.w network, Boolean bool) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.f64616a = network;
        this.f64617b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f64616a == bVar.f64616a && Intrinsics.d(this.f64617b, bVar.f64617b);
    }

    public final int hashCode() {
        int hashCode = this.f64616a.hashCode() * 31;
        Boolean bool = this.f64617b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "ActionButtonClick(network=" + this.f64616a + ", shouldBackfill=" + this.f64617b + ")";
    }
}
