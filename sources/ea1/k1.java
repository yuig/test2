package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final e82.w f58074a;

    public k1(e82.w network) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.f58074a = network;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k1) {
            return this.f58074a == ((k1) obj).f58074a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f58074a.hashCode() * 31);
    }

    public final String toString() {
        return "UnpauseAutoPublish(network=" + this.f58074a + ", isBackfillEnabled=false)";
    }
}
