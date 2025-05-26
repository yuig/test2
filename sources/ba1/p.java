package ba1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final e82.w f22389a;

    public p(e82.w network) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.f22389a = network;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f22389a == ((p) obj).f22389a;
    }

    public final int hashCode() {
        return this.f22389a.hashCode();
    }

    public final String toString() {
        return "ReclaimButtonClick(network=" + this.f22389a + ")";
    }
}
