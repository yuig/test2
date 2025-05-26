package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f128033a;

    public k1(zy.k0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f128033a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && Intrinsics.d(this.f128033a, ((k1) obj).f128033a);
    }

    public final int hashCode() {
        return this.f128033a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("PinalyticsEffectRequest(effect="), this.f128033a, ")");
    }
}
