package n70;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f89613a;

    public g0(zy.k0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f89613a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.d(this.f89613a, ((g0) obj).f89613a);
    }

    public final int hashCode() {
        return this.f89613a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedLifecycleSideEffectRequest(effect="), this.f89613a, ")");
    }
}
