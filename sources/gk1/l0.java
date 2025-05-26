package gk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f65242a;

    public l0(zy.k0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f65242a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f65242a, ((l0) obj).f65242a);
    }

    public final int hashCode() {
        return this.f65242a.hashCode();
    }

    public final zy.k0 j() {
        return this.f65242a;
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsSideEffectRequest(effect="), this.f65242a, ")");
    }
}
