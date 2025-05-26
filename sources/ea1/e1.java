package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final e82.w f58047a;

    public e1(e82.w network) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.f58047a = network;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && this.f58047a == ((e1) obj).f58047a;
    }

    public final int hashCode() {
        return this.f58047a.hashCode();
    }

    public final String toString() {
        return "LoadFeed(network=" + this.f58047a + ")";
    }
}
