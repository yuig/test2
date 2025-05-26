package ba1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final e82.w f22376a;

    public j0(e82.w network) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.f22376a = network;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.f22376a == ((j0) obj).f22376a;
    }

    public final int hashCode() {
        return this.f22376a.hashCode();
    }

    public final String toString() {
        return "LoadFeed(network=" + this.f22376a + ")";
    }
}
