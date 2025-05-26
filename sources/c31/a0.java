package c31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f25569a;

    public a0(zy.k0 nestedEffect) {
        Intrinsics.checkNotNullParameter(nestedEffect, "nestedEffect");
        this.f25569a = nestedEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f25569a, ((a0) obj).f25569a);
    }

    public final int hashCode() {
        return this.f25569a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LifecyclePinalyticsSideEffectRequest(nestedEffect="), this.f25569a, ")");
    }
}
