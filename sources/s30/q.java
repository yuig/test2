package s30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q implements r {

    /* renamed from: d, reason: collision with root package name */
    public final String f111051d;

    public q(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f111051d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f111051d, ((q) obj).f111051d);
    }

    public final int hashCode() {
        return this.f111051d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3AndroidCubesClustersQuery(__typename="), this.f111051d, ")");
    }
}
