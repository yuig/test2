package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f130997a;

    public q0(zy.e0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f130997a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && Intrinsics.d(this.f130997a, ((q0) obj).f130997a);
    }

    public final int hashCode() {
        return this.f130997a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("PinalyticSideEffectRequest(wrapped="), this.f130997a, ")");
    }
}
