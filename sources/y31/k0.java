package y31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f136807a;

    public k0(zy.f0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f136807a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && Intrinsics.d(this.f136807a, ((k0) obj).f136807a);
    }

    public final int hashCode() {
        return this.f136807a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsSideEffect(effect="), this.f136807a, ")");
    }
}
