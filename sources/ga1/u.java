package ga1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements v {

    /* renamed from: a, reason: collision with root package name */
    public final e82.w f64654a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f64655b;

    /* renamed from: c, reason: collision with root package name */
    public final e82.u f64656c;

    public u(e82.w network, Boolean bool, e82.u uVar) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.f64654a = network;
        this.f64655b = bool;
        this.f64656c = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f64654a == uVar.f64654a && Intrinsics.d(this.f64655b, uVar.f64655b) && this.f64656c == uVar.f64656c;
    }

    public final int hashCode() {
        int hashCode = this.f64654a.hashCode() * 31;
        Boolean bool = this.f64655b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        e82.u uVar = this.f64656c;
        return hashCode2 + (uVar != null ? uVar.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateBackfill(network=" + this.f64654a + ", shouldBackfill=" + this.f64655b + ", backfillOption=" + this.f64656c + ")";
    }
}
