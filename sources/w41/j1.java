package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f128022a;

    public j1(o82.h0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f128022a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && Intrinsics.d(this.f128022a, ((j1) obj).f128022a);
    }

    public final int hashCode() {
        return this.f128022a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("PinCollectionEffectRequest(effect="), this.f128022a, ")");
    }
}
