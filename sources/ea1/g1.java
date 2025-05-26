package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final e82.w f58055a;

    public g1(e82.w network) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.f58055a = network;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && this.f58055a == ((g1) obj).f58055a;
    }

    public final int hashCode() {
        return this.f58055a.hashCode();
    }

    public final String toString() {
        return "PauseAutoPublish(network=" + this.f58055a + ")";
    }
}
