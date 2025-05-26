package v21;

import kotlin.jvm.internal.Intrinsics;
import zy.k0;

/* loaded from: classes5.dex */
public final class y implements z {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f123907a;

    public y(k0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f123907a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f123907a, ((y) obj).f123907a);
    }

    public final int hashCode() {
        return this.f123907a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedLifecycleSideEffectRequest(effect="), this.f123907a, ")");
    }
}
