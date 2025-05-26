package nt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f92180a;

    public t0(zy.e0 inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f92180a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && Intrinsics.d(this.f92180a, ((t0) obj).f92180a);
    }

    public final int hashCode() {
        return this.f92180a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsEffectRequest(inner="), this.f92180a, ")");
    }
}
