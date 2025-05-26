package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final e82.w f58033a;

    public a1(e82.w network) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.f58033a = network;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && this.f58033a == ((a1) obj).f58033a;
    }

    public final int hashCode() {
        return this.f58033a.hashCode();
    }

    public final String toString() {
        return "DisableAutoOrg(network=" + this.f58033a + ")";
    }
}
