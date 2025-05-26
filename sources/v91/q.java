package v91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f125007a;

    /* renamed from: b, reason: collision with root package name */
    public final e82.w f125008b;

    public q(e82.w network, boolean z13) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.f125007a = z13;
        this.f125008b = network;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f125007a == qVar.f125007a && this.f125008b == qVar.f125008b;
    }

    public final int hashCode() {
        return this.f125008b.hashCode() + (Boolean.hashCode(this.f125007a) * 31);
    }

    public final String toString() {
        return "UpdateAutoOrgOptIn(isOptedIn=" + this.f125007a + ", network=" + this.f125008b + ")";
    }
}
