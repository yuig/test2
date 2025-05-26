package ny0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements p {

    /* renamed from: a, reason: collision with root package name */
    public final qy0.a f92603a;

    public m(qy0.a sharedState) {
        Intrinsics.checkNotNullParameter(sharedState, "sharedState");
        this.f92603a = sharedState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f92603a, ((m) obj).f92603a);
    }

    public final int hashCode() {
        return this.f92603a.hashCode();
    }

    public final String toString() {
        return "SharedStateLoaded(sharedState=" + this.f92603a + ")";
    }
}
