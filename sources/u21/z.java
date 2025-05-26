package u21;

import kotlin.jvm.internal.Intrinsics;
import zy.k0;

/* loaded from: classes5.dex */
public final class z implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f120131a;

    public z(k0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f120131a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f120131a, ((z) obj).f120131a);
    }

    public final int hashCode() {
        return this.f120131a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedLifecycleSideEffectRequest(effect="), this.f120131a, ")");
    }
}
