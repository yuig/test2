package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final e82.w f58068a;

    public j1(e82.w network) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.f58068a = network;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && this.f58068a == ((j1) obj).f58068a;
    }

    public final int hashCode() {
        return this.f58068a.hashCode();
    }

    public final String toString() {
        return "UnclaimAccount(network=" + this.f58068a + ")";
    }
}
