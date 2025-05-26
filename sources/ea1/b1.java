package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final e82.w f58036a;

    public b1(e82.w network) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.f58036a = network;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && this.f58036a == ((b1) obj).f58036a;
    }

    public final int hashCode() {
        return this.f58036a.hashCode();
    }

    public final String toString() {
        return "EnableAutoOrg(network=" + this.f58036a + ")";
    }
}
