package w21;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u1 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f127836a;

    public u1(zy.k0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f127836a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1) && Intrinsics.d(this.f127836a, ((u1) obj).f127836a);
    }

    public final int hashCode() {
        return this.f127836a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedLifecycleSideEffectRequest(effect="), this.f127836a, ")");
    }
}
