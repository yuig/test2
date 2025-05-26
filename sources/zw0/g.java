package zw0;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes5.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f142907a;

    public g(e0 nestedEffect) {
        Intrinsics.checkNotNullParameter(nestedEffect, "nestedEffect");
        this.f142907a = nestedEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f142907a, ((g) obj).f142907a);
    }

    public final int hashCode() {
        return this.f142907a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("CompleteTheLookPinalyticsSideEffect(nestedEffect="), this.f142907a, ")");
    }
}
