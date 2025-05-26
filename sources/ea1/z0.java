package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final e82.w f58173a;

    /* renamed from: b, reason: collision with root package name */
    public final mr1.c f58174b;

    public z0(e82.w network, mr1.c activityProvider) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        this.f58173a = network;
        this.f58174b = activityProvider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f58173a == z0Var.f58173a && Intrinsics.d(this.f58174b, z0Var.f58174b);
    }

    public final int hashCode() {
        return this.f58174b.hashCode() + (this.f58173a.hashCode() * 31);
    }

    public final String toString() {
        return "ClaimAccount(network=" + this.f58173a + ", activityProvider=" + this.f58174b + ")";
    }
}
