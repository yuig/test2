package dx0;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes5.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f56442a;

    public k(e0 nestedEffect) {
        Intrinsics.checkNotNullParameter(nestedEffect, "nestedEffect");
        this.f56442a = nestedEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f56442a, ((k) obj).f56442a);
    }

    public final int hashCode() {
        return this.f56442a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("ShopTheLookPinalyticsSideEffect(nestedEffect="), this.f56442a, ")");
    }
}
