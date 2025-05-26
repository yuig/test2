package dy0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final qy0.a f56581a;

    public i(qy0.a sharedState) {
        Intrinsics.checkNotNullParameter(sharedState, "sharedState");
        this.f56581a = sharedState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f56581a, ((i) obj).f56581a);
    }

    public final int hashCode() {
        return this.f56581a.hashCode();
    }

    public final String toString() {
        return "SharedStateLoaded(sharedState=" + this.f56581a + ")";
    }
}
